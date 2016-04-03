<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

        <div align="center" class=" col-xs-8 col-md-8">
<div align="center">
    <h1>New Book</h1><br>

        <form:form action="save" method="post" modelAttribute="book" class="form-horizontal">
            <div class="form-group">

                <label class="col-xs-4 col-md-4" for="book_name">Book Name: </label>
                <div class="col-xs-8 col-md-8">
                <form:input class="form-control" id="book_name" placeholder="Book Name" path="bookName"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-xs-4 col-md-4" for="writer_name">Writer Name: </label>
                <div class="col-xs-8 col-md-8">
                <form:input class="form-control" id="writer_name" placeholder="Writer Name" path="writer"/>
                    </div>
            </div>
            <div class="form-group">
                <label class="col-xs-4 col-md-4" for="publisher_name">Publisher Name: </label>
                <div class="col-xs-8 col-md-8">
                <form:input id="publisher_name" placeholder="Publisher Name" class="form-control" path="publisher"/>
                    </div>
            </div>
            <div class="form-group">
                <label class="col-xs-4 col-md-4" for="book_type">Book Type: </label>
                <div class="col-xs-8 col-md-8">
                <form:input id="book_type" placeholder="Book Type" class="form-control" path="type"/>
                    </div>
            </div>
            <div class="form-group">
                <label class="col-xs-4 col-md-4" class="col-xs-4 col-md-4" for="book_price">Price: </label>
                <div class="col-xs-8 col-md-8">
                <form:input id="book_price" placeholder="Price" class="form-control" path="price"/>
                    </div>
            </div>
            <%--<tr>
                <td colspan="2" align="center">
                    <input type="submit" class="btn btn-default" value="Save">
                </td>
            </tr>
--%>
            <button type="submit" class="btn btn-default">Submit</button>
        </form:form>

</div>

</div>
        </div>

    </div>

<!-- Latest compiled and minified JavaScript -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>

</body>
</html>
