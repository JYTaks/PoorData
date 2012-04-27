<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<!-- head -->
	<tiles:insertAttribute name="head" />
	<title>PoorData</title>
</head>

<body onContextMenu="return true;">
<form name="f" id="f">
<div id="wrap">
	<!-- layer -->
	<tiles:insertAttribute name="mainLayer" />

	<!-- top -->
	<tiles:insertAttribute name="top" />
	 	
	<!-- login -->
	<tiles:insertAttribute name="login" />
	
	<!-- banner -->
	<tiles:insertAttribute name="banner" />	
	<div style="clear: both;"></div>
	
	<div id="conts">
		<!-- news -->
		<tiles:insertAttribute name="news" />
		
		<!-- visit -->
		<tiles:insertAttribute name="visitor" />	
		<div style="clear: both;"></div>
		
		<!-- knowledge -->
		<tiles:insertAttribute name="knowledge" />
		
		<!-- faq -->
		<tiles:insertAttribute name="faq" />
	</div>
	<div style="clear: both;"></div>
	
	<!-- foot -->
	<tiles:insertAttribute name="foot" />
</div>
</form>
</body>

</html>