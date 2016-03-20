<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>

<!-- css -->
<link rel="stylesheet" href="${path}/js/lib/bootstrap-3.3.4-dist/css/bootstrap.min.css">
<link rel="stylesheet/less" href="${path}/css/main/main.less" type="text/css" >
<%-- <link rel="stylesheet" href="${path}/css/main//main.css" type="text/css" > --%>

<!-- jslib -->
<script type="text/javascript" src="${path}/js/lib/jquery/jquery-2.1.3.js"></script>
<script type="text/javascript" src="${path}/js/lib/bootstrap-3.3.4-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${path}/js/lib/less/less.js"></script>
<script type="text/javascript" src="${path}/js/utils/util.js"></script>

<script>
	var URL_ROOT = "/spring.mvc.one/";
	$(document).ready(function(){
		$("#test").click(function(){
			console.log("js:test");
		});
		
		$("#testGetJson").click(function(){
			var url = URL_ROOT + "getData/get";
			var params = {
					"name": "weieyuan"
			};
			CAjax.getJson(url, params, function(data){
				console.log("ok");
				console.log(data);
			}, function(data){
				
			});
		});
		
		$("#testPostJson").click(function(){
			var url = URL_ROOT + "getData/post";
			var params = {
					name: "weieyuan",
					addr: "huawei",
					age: 26
			};
			CAjax.postJson(url, params, function(data){
				console.log(data);
			}, function(data){
				
			});
			
		});
		
		$("#testPostJson4Object").click(function(){
			var url = URL_ROOT + "getData/post/object";
			var params = {
					name: "weieyuan",
					addr: "huawei",
					age: 21
			};
			CAjax.postJson(url, params, function(data){
				console.log(data);
			}, function(data){
				
			});
			
		});
		
	});
</script>

<title>NB Example</title>
</head>
<body>
	
	<div class="navigation">
		<nav class="">
			<ul class="ul">
				<li>学习计划</li>
				<li>查看历史学习记录</li>
				<li>工作计划</li>
				<li>查看历史工作记录</li>
			</ul>
		</nav>
	</div>
		<button id="test">test</button>
		<button id="testGetJson">testGetJson</button>
		<button id="testPostJson">testPostJson</button>
		<button id="testPostJson4Object">testPostJson4Object</button>
	<div>
	</div>
</body>
</html>