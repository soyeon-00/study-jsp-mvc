<%@page import="java.util.List"%>
<%@page import="com.app.vo.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
</head>
<body>
   안녕! 여기는 상품목록 페이지!
   <table border="1">
      <tr>
         <th>상품 번호</th>
         <th>상품 이름</th>
         <th>상품 가격</th>
         <th>상품 재고</th>
      </tr>
      
   <% 
      List<ProductVO> products = (List<ProductVO>)request.getAttribute("products");
      for(ProductVO product : products){
   %>
   
      <tr>
         <td><%=product.getId() %></td>
         <td><a href="read.product?id=<%=product.getId() %>"><%=product.getProductName() %></td>
         <td><%=product.getProductPrice() %></td>
         <td><%=product.getProductStock() %></td>
      </tr>
   <%
      }
   %>
   </table>

</body>
</html>