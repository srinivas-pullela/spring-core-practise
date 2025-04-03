<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyDiary Application</title>
<link rel="stylesheet" href="<c:url value="/resources/styles/style.css"/>"/>
</head>
<body>
<!-- <img src="<c:url value="/resources/images/diary.jsp"/>"> -->
  <div class="container">
    <div class="header">
      <svg class="logo" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
        <path d="M4 19.5A2.5 2.5 0 0 1 6.5 17H20"></path>
        <path d="M6.5 2H20v20H6.5A2.5 2.5 0 0 1 4 19.5v-15A2.5 2.5 0 0 1 6.5 2z"></path>
      </svg>
      <h1>Login Here</h1>
      <p class="subtitle">Start your journey with MyDiary</p>
    </div>

    <form action="./authenticate" method="POST">
      <div class="form-group">
        <label for="name">Username</label>
        <div class="input-group">
          <svg class="input-icon" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
            <path d="M20 21v-2a4 4 0 0 0-4-4H8a4 4 0 0 0-4 4v2"></path>
            <circle cx="12" cy="7" r="4"></circle>
          </svg>
          <input type="text" id="name" name="username" placeholder="Enter your full name" required>
        </div>
      </div>

      <!-- <div class="form-group">
        <label for="email">Email Address</label>
        <div class="input-group">
          <svg class="input-icon" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
            <path d="M4 4h16c1.1 0 2 .9 2 2v12c0 1.1-.9 2-2 2H4c-1.1 0-2-.9-2-2V6c0-1.1.9-2 2-2z"></path>
            <polyline points="22,6 12,13 2,6"></polyline>
          </svg>
          <input type="email" id="email" placeholder="Enter your email" required>
        </div>
      </div>-->

      <div class="form-group">
        <label for="password">Password</label>
        <div class="input-group">
          <svg class="input-icon" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
            <rect x="3" y="11" width="18" height="11" rx="2" ry="2"></rect>
            <path d="M7 11V7a5 5 0 0 1 10 0v4"></path>
          </svg>
          <input type="password" id="password" name="password" placeholder="Choose a strong password" required>
        </div>
      </div>

      <!--  <div class="terms">
        <input type="checkbox" id="terms" required>
        <label for="terms">
          I agree to the <a href="#">Terms of Service</a> and <a href="#">Privacy Policy</a>
        </label>
      </div>-->

      <button type="submit">LOGIN</button>
    </form>

    <p class="login-link">
      New user? <a href="./register">Register </a>Now
    </p>
  </div>
</body>
</html>