<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
<s:form action="signIn" method="post" namespace="/">
    用户名：<input type="text" name="name">

    密码：<input type="text" name="password">

    <input type="submit">
</s:form>

</body>
</html>
