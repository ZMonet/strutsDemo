<%--
  Created by IntelliJ IDEA.
  User: 23351
  Date: 2018/7/23
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
  <div class="container">

    <form class="form-signin" action="login" method="post">
      <h2 class="form-signin-heading">Please sign in</h2>
      <input class="inpu-block-level" name="userName" type="text">
      <input class="inpu-block-level" name="password" placeholder="Password" type="password">
      <label class="check-box">
        <input value="remember-me" type="checkbox">Remember me
      </label>
      <button class="btn btn-large btn-primary" type="submit">Sign in</button>
    </form>


  </div>
  </body>
</html>
