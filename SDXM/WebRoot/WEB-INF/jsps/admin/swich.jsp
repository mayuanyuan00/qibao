<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/ckeditor/ckeditor.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展开合闭按钮</title>

<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/images/favicon.ico" />
<link href="${pageContext.request.contextPath}/css/css.css"
	type="text/css" rel="stylesheet" />
<style>
#footer {
	font-size: 12px;
}

.footer_pad {
	padding: 7px 19px 5px 19px;
}
</style>
<script language="javascript">
	function switchSysBar() {
		if (parent.document.getElementById('attachucp').cols == "194,12,*") {
			document.getElementById('leftbar').style.display = "";
			parent.document.getElementById('attachucp').cols = "0,12,*";
		} else {
			parent.document.getElementById('attachucp').cols = "194,12,*";
			document.getElementById('leftbar').style.display = "none"
		}
	}
	function load() {
		if (parent.document.getElementById('attachucp').cols == "0,12,*") {
			document.getElementById('leftbar').style.display = "";
		}
	}
</script>
</head>
<body marginwidth="0" marginheight="0" onLoad="load()" topmargin="0"
	leftmargin="0" onselectstart="return false" oncontextmenu=return(false)
	style="overflow-x: hidden;">
	<center>
		<table height="100%" cellspacing="0" cellpadding="0" border="0"
			width="100%">
			<tbody>
				<tr>
					<td bgcolor="#ededb1" width="1"></td>
					<td id="leftbar"
						style="display: none; background: url(${pageContext.request.contextPath}/images/main/switchbg.jpg) repeat-y #d2d2d0 0px 0">
						<a onClick="switchSysBar()" href="javascript:void(0);"> <img
							src="${pageContext.request.contextPath}/images/main/pic24.jpg" width="12" height="72" border="0"
							alt="隐藏左侧菜单"></a>
					</td>
					<td id="rightbar"
						style="background: url(${pageContext.request.contextPath}/images/main/switchbg.jpg) repeat-y #f2f0f5 0px 0">
						<a onClick="switchSysBar()" href="javascript:void(0);"> <img
							src="${pageContext.request.contextPath}/images/main/pic23.jpg" width="12" height="72" border="0"
							alt="隐藏左侧菜单"></a>
					</td>
				</tr>
			</tbody>
		</table>
	</center>
</body>
</html>