package com.sri.spring.mydiary.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sri.spring.mydiary.business.EntryBusinessInterface;
import com.sri.spring.mydiary.business.UserBusinessInterface;
import com.sri.spring.mydiary.entities.User;
import com.sri.spring.mydiary.entities.Entry;

@Controller
public class HomeController 
{
	@Autowired
	private UserBusinessInterface userBusinessInterface;
	
	//Generate setter and getter methods for userBusinessInterface
	public UserBusinessInterface getUserBusinessInterface() 
	{
		return userBusinessInterface;
	}
	public void setUserBusinessInterface(UserBusinessInterface userBusinessInterface) 
	{
		this.userBusinessInterface = userBusinessInterface;
	}
	
	@Autowired
	private EntryBusinessInterface entryBusinessInterface;
	
	public EntryBusinessInterface getEntryBusinessInterface() 
	{
		return entryBusinessInterface;
	}
	public void setEntryBusinessInterface(EntryBusinessInterface entryBusinessInterface) 
	{
		this.entryBusinessInterface = entryBusinessInterface;
	}
	
	@Autowired
	private HttpSession httpSession;
	
	public HttpSession getHttpSession() 
	{
		return httpSession;
	}
	public void setHttpSession(HttpSession httpSession) 
	{
		this.httpSession = httpSession;
	}
	
	@RequestMapping("login")
	public ModelAndView homePage()
	{
		ModelAndView model = new ModelAndView("login");
		return model;
	}
	
	@RequestMapping("/register")
	public ModelAndView registerPage()
	{
		ModelAndView model = new ModelAndView("register");
		return model;
	}
	
	@RequestMapping(value="/saveuser",method = RequestMethod.POST )
	public ModelAndView saveuser(@ModelAttribute("user") User user)
	{
		//save the registered user details
		ModelAndView model = new ModelAndView("registersuccess");
		userBusinessInterface.save(user);
		return model;
	}
	
	@RequestMapping(value="/authenticate",method = RequestMethod.POST )
	public ModelAndView authenticateuser(@ModelAttribute("user") User user)
	{
		ModelAndView model = new ModelAndView("login");
		User user1 = userBusinessInterface.findByUsername(user.getUsername());
		
		if(user1 != null && user.getPassword().equals(user1.getPassword()))
		{
			model.setViewName("userhomepage");
			model.addObject("user", user1);
			
			httpSession.setAttribute("user", user1);
			List<Entry> entries=null;
			try 
			{
				entries = entryBusinessInterface.findByUserId(user1.getId());
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			model.addObject("entrieslist", entries);
		}
		return model;
	}
	
	@RequestMapping("/addentry")
	public ModelAndView addentry()
	{
		ModelAndView model =  new ModelAndView("addentryform");
		return model;
	}
	
	@RequestMapping("/saveentry")
	public ModelAndView saveentry(@ModelAttribute("entry") Entry entry)
	{
		ModelAndView model =  new ModelAndView("userhomepage");
		entryBusinessInterface.save(entry);
		
		User user1 = (User) httpSession.getAttribute("user"); 
		
		List<Entry> entries=null;
		try 
		{
			entries = entryBusinessInterface.findByUserId(user1.getId());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		model.addObject("entrieslist", entries);
		return model;
	}
	
	@RequestMapping("/viewentrypage")
	public ModelAndView viewentry(@RequestParam("id") int id)
	{
		ModelAndView model =  new ModelAndView("viewentry");
		Entry entry = entryBusinessInterface.findById(id);
		model.addObject("entry", entry);
		return model;
	}
	
	@RequestMapping("/userhomepage")
	public ModelAndView userhomepage()
	{
		ModelAndView model = new ModelAndView("userhomepage");
		User user1 = (User) httpSession.getAttribute("user");
		List<Entry> entries=null;
		try 
		{
			entries = entryBusinessInterface.findByUserId(user1.getId());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		model.addObject("entrieslist", entries);
		return model;
	}
	
	@RequestMapping("/updateentry")
	public ModelAndView updateentry(@RequestParam("id") int id)
	{
		ModelAndView model =  new ModelAndView("updateentrypage");
		Entry entry = entryBusinessInterface.findById(id);
		model.addObject("entry", entry);
		User user1 = (User) httpSession.getAttribute("user"); 
		if(user1==null)
		{
			model.setViewName("login");
		}
		return model;
	}
	
	@RequestMapping("/processentryupdate")
	public ModelAndView processentryupdate(@ModelAttribute("entry") Entry entry)
	{
		ModelAndView model =  new ModelAndView("userhomepage");
		entryBusinessInterface.update(entry);
		
		User user1 = (User) httpSession.getAttribute("user"); 
		
		List<Entry> entries=null;
		try 
		{
			entries = entryBusinessInterface.findByUserId(user1.getId());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		model.addObject("entrieslist", entries);
		return model;
	}
	
	@RequestMapping("/deleteentry")
	public ModelAndView deleteentry(@RequestParam("id") int id)
	{
		ModelAndView model =  new ModelAndView("userhomepage");
		User user1 = (User) httpSession.getAttribute("user"); 
		Entry entry = entryBusinessInterface.findById(id);
		if(user1==null)
		{
			model.setViewName("login");
		}
		else
		{
			entryBusinessInterface.delete(entry);
		}
		
		List<Entry> entries=null;
		try 
		{
			entries = entryBusinessInterface.findByUserId(user1.getId());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		model.addObject("entrieslist", entries);
		return model;
	}
	
	@RequestMapping("/signout")
	public ModelAndView signout()
	{
		ModelAndView model = new ModelAndView("login");
		httpSession.invalidate();
		return model;
	}
}
