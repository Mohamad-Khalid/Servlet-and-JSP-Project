<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        h1{
            text-align: center;
        }
        a{
            text-align: center;
            display: inline-block;
            width: 49%;
            font-size: 30px;
            line-height: 50px;
        }
        .t1{
            background-color: bisque;
        }
        .t2{
            background-color: coral;
        }

    </style>
</head>
<body>
<h1><%= "Hello Servlet and JSP" %></h1>
<br/>
<a class="t1" href="task1.html" target="_blank">Task 1</a>
<a class="t2" href="task2.html" target="_blank">Task 2</a>
</body>
</html>