<%@ page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>商品页面</h1>
    <s:form action="product_save" method="post" namespace="/" theme="simple">
        <table>
            <tr>
                <td>商品名称</td>
                <td><s:textfield name="pname"/></td>
            </tr>
            <tr>
                <td>商品价格</td>
                <td><s:textfield name="price"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="添加"></td>
            </tr>
        </table>
    </s:form>
</body>
</html>