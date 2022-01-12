<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/admin.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>
<style>
</style>
</head>
<%@ include file="header.jsp"%>
<body>
	<div class="container">
		<div class="body-content">
			<%@ include file="side.jsp"%>
			<div class="content-admin-main">
				<div class="admin-main-description">
					<h1>Information : Meal</h1>
					<span>식단 정보를 관리합니다.</span>
				</div>
				<div class="main-content-info">
					<div class="content-desc">
						<div class="content-desc-title">
							<h1>${meal.meal_name }</h1>
						</div>
						<hr>
						<div class="content-desc-item">
							<h3>카테고리</h3>
							<span style="font-size: large">${meal.subcat_name }</span>
						</div>
						<hr>
						<div class="content-desc-item">
							<h3>레시피</h3>
							<pre>${meal.recipe }</pre>
						</div>
						<hr>
						<div class="content-desc-item">
							<h3>메인푸드</h3>
							<div class="content-sub-item">
								<c:forEach var="f" items="${food }">
									<b>${f.food }</b>
									<pre>${f.description }</pre>
								</c:forEach>
							</div>
						</div>
						<hr>
					</div>
					<div class="content-image-content">
						<c:choose>
							<c:when test="${meal.src ne null }">
								<img id="" src="${meal.src }" alt="${meal.meal_name }">
							</c:when>
							<c:otherwise>
								<img id="" alt="${meal.meal_name }"
									src="https://www.publicdomainpictures.net/pictures/280000/velka/not-found-image-15383864787lu.jpg">
							</c:otherwise>
						</c:choose>
					</div>
				</div>
				<div>
					<hr>
				</div>
				<div class="main-content-option">
					<div class="content-option-menu">
						<button onclick="history.back()">목록</button>
						<button>수정</button>
						<button>삭제</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>