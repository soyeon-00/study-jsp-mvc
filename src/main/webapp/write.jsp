<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록 페이지</title>
</head>
<body>
	<form action="write-ok.product" method="post">
		<input name="productName" placeholder="상품명" />
		<input name="productPrice" placeholder="상품가격" />
		<input name="productStock" placeholder="상품재고" />
		<button>상품 등록</button>
	</form>

</body>
</html>