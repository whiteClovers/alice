<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"  %>

<c:set var="ctx" value="${pageContext.request.contextPath==\"/\"?\"\":pageContext.request.contextPath}" />
<c:set var="ctxImage" value="${ctx}" />
<c:set var="ctxResource" value="${ctx}" />

<% 
	response.setHeader("Pragma","No-cache"); 
	response.setDateHeader("Expires", 0); 
	response.setHeader("Cache-Control","No-cache"); 
	

	request.setAttribute("basePath", request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()) ; 
	request.setAttribute("requestURI", request.getRequestURI()) ;
%>