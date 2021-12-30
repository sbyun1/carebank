<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/header.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/infodetail.css" />
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>
<script>
	function whenSubmit() {
		var comment = document.getElementById("comment_content").value.trim();

		if (comment == "" || comment == null) {
			alert("댓글 내용을 입력하세요.");
			return false;
		}

		return true;
	}
</script>
</head>
<%@ include file="../../header.jsp"%>
<body>
	<div class="body-content">
		<div class="content-left">
			<h1>${supple.supple_name }</h1>
			<hr>
			<div class="content-item">
				<p>
					<b>효능</b>
				</p>
				<ul>
					<c:forEach var="desc" items="${description }">
						<li>${desc }</li>
					</c:forEach>
				</ul>
			</div>
			<hr>
			<div class="menu-area">
				<a href="javascript: history.back();">목록으로 돌아가기</a>
			</div>
		</div>
		<div class="content-right">
			<div class="content-image">
				<c:choose>
					<c:when test="${supple.src ne null }">
						<img src="${supple.src }" alt="${supple.supple_name }">
					</c:when>
					<c:otherwise>
						<img alt="${supple.supple_name }"
							src="https://www.publicdomainpictures.net/pictures/280000/velka/not-found-image-15383864787lu.jpg">
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>
	<div class="comment-area">
		<p class="content-desc">
			<b>댓글</b>
		</p>
		<div class="comment-write">
			<form action="" method="post" onsubmit="return whenSubmit();">
				<textarea name="" id="comment_content" cols="30" rows="10"
					placeholder="내용을 입력하세요."></textarea>
				<input type="submit" value="작성">
			</form>
		</div>
		<div class="comment-list">
			<ul>
				<li>
					<ul class="comment-item">
						<li>닉네임</li>
						<li>댓글 내용...댓글 내용...댓글 내용...댓글 내용...</li>
						<li>2021-12-10</li>
						<li><a href="#">수정</a></li>
						<li><a href="#">삭제</a></li>
					</ul>
				</li>
				<li>
					<ul class="comment-item">
						<li>닉네임</li>
						<li>댓글 내용...댓글 내용...댓글 내용...댓글 내용...</li>
						<li>2021-12-10</li>
						<li><a href="#">수정</a></li>
						<li><a href="#">삭제</a></li>
					</ul>
				</li>
				<li>
					<ul class="comment-item">
						<li>닉네임</li>
						<li>댓글 내용...댓글 내용...댓글 내용...댓글 내용...</li>
						<li>2021-12-10</li>
						<li><a href="#">수정</a></li>
						<li><a href="#">삭제</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>