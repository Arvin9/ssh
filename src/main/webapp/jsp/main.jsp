<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
    <meta charset="UTF-8">
    <title>主显示页面</title>
    <!-- 导入css文件 -->
    <jsp:include page="include/header.jsp"/>

    <!-- 导入js文件 -->
    <jsp:include page="include/footer.jsp"/>
</head>
<body>

<div class="easyui-layout" style="width:1424px;height:650px;">

    <jsp:include page="include/nav.jsp"/>


    <div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
        <div class="easyui-tabs" data-options="fit:true,border:false,plain:true">
            <div title="About" data-options="href:'login'" style="padding:10px"></div>
            <div title="DataGrid" style="padding:5px">
                <table class="easyui-datagrid"
                       data-options="url:'getUserInfo',method:'get',singleSelect:true,fit:true,fitColumns:true">
                    <thead>
                    <tr>
                        <th data-options="field:'id'" width="80">ID</th>
                        <th data-options="field:'name'" width="100">Name</th>
                        <th data-options="field:'password',align:'right'" width="80">password</th>
                        <th data-options="field:'createTime',align:'right'" width="80">createTime</th>
                    </tr>
                    </thead>
                </table>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(function(){

    });

</script>
</body>
</html>
