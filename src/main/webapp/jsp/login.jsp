<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
    <meta charset="UTF-8">
    <title>登陆页面</title>
    <!-- 导入css文件 -->
    <jsp:include page="include/header.jsp"/>

    <!-- 导入js文件 -->
    <jsp:include page="include/footer.jsp"/>
</head>
<body class="easyui-layout">
    <div id="login_panel" class="easyui-panel" title="Login"  style="width:400px;padding:20px 60px 20px 60px">
        <s:form action="signIn" method="post" namespace="/">
            <table cellpadding="5">
                <tr>
                    <td>用户名:</td>
                    <td><input class="easyui-validatebox textbox" data-options="required:true,validType:'length[3,10]'" name="name"></td>
                </tr>
                <tr>
                    <td>密&nbsp;码:</td>
                    <td><input class="easyui-validatebox textbox" data-options="required:true,validType:'length[3,10]'" name="password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit">
                    </td>
                </tr>

            </table>
        </s:form>
    </div>

    <script type="text/javascript">
        $(function(){
            $('#login_panel').panel({
                left:300,
                top:100
            });
        });

    </script>
</body>
</html>
