<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Product Discount Calculator
</h1>
<br/>
<form action="/calculator" method="post">
    <label>Product description</label>
    <input type="text" name="desc" placeholder="Nhập mô tả" value="Tên sp">
    <label>Price</label>
    <input type="number" name="price" placeholder="Giá">
    <label>Discount(%)</label>
    <input type="number" name="discount" placeholder="discount">
    <input type="submit" value="submit">
</form>
</body>
</html>