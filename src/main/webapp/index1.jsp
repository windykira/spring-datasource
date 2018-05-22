<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/21
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript">
    /*alert(window.parent.document.getElementById("pcotent"));*/
    function load(url){
        window.parent.document.getElementById("iframe_content").src=url;
    }
</script>
<body>
<h1>index1</h1>
<a href="a.jsp" target="iframe_content">A</a>
<a href="b.jsp" target="iframe_content">B</a>
</body>
</html>
