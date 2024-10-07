<%@page import="com.app.vo.ProductVO"%>
<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ProductVO product = (ProductVO)request.getAttribute("product");
	%>
	<form action="update-ok.product" method="post">
		<input name="id" type="hidden" value="<%=product.getId() %>" />
		<div>
			<span>상품이름</span><input name="productName" type="text" value="<%=product.getProductName() %>" />
		</div>
		<div>
			<span>상품가격</span><input name="productPrice" type="text" value="<%=product.getProductPrice() %>" />
		</div>
		<div>
			<span>상품재고</span><input name="productStock" type="text" value="<%=product.getProductStock() %>" />
		</div>
		<button>상품 수정</button>
	</form>
</body>
</html>