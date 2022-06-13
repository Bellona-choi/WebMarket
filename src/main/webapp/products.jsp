<%@page import="com.survivalcoding.data.ProductRepository"%>
<%@page import="com.survivalcoding.domain.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="repository" class="com.survivalcoding.data.ProductRepository" scope="session"></jsp:useBean>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
</head>
<body>
    <%
    // ProductRepository repository = new ProductRepository();
    List<Product> products = repository.getAllProducts();
    out.print(products);
    %>
</body>
</html>