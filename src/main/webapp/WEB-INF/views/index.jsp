<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>BookShelf :: Home Page</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="/css/bootstrap.min.css">

    <!-- Optional theme -->
    <link rel="stylesheet" href="/css/bootstrap-theme.min.css" >

</head>
<body>



    <div class="container">
        <div class="row">

            <div align="center" class=" col-xs-12 col-md-12">
                <h1>Books List</h1>
                <h2><a href="/new">Add Book</a></h2>
                <table class="table table-bordered table-hover .success">
                    <th>Book ID</th>
                    <th>Book Name</th>
                    <th>Writer</th>
                    <th>Publisher</th>
                    <th>Type</th>
                    <th>Price</th>

                    <c:forEach var="book" items="${booklist}" varStatus="status">
                        <tr>
                            <td>${book.bookId}</td>
                            <td>${book.bookName}</td>
                            <td>${book.writer}</td>
                            <td>${book.publisher}</td>
                            <td>${book.type}</td>
                            <td>${book.price}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>

        </div>
    </div>



<!-- Latest compiled and minified JavaScript -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>

</body>
</html>
