<%-- 
    Document   : index
    Created on : 02-10-2015, 11:05:44
    Author     : Sindt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <script>
            function doAll() {
                $("#getPerson").click(function () {
                    $.ajax({
                        type: "GET",
                        url: "http://localhost:8080/RestPerson/api/person/" + $("#code").val()
                    }).done(function (person)
                    {
                        $("#fname").html(person.fname);
                        $("#lname").html(person.lname);
                        $("#phone").html(person.phone);
                    }).fail(function ()
                    {
                        alert("fail")
                    });
                });
            }

            $(document).ready(doAll);



        </script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h2>Personer</h2>
            <table class="table table-condensed">
                <thead>
                    <tr>
                        <th>Firstname</th>
                        <th>Lastname</th>
                        <th>Phone</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td id="fname"></td>
                        <td id="lname"></td>
                        <td id="phone"></td>
                    </tr>
                </tbody>
                <input id="code" type="text" placeholder="Enter">
                <button id="getPerson">Get Person</button>
            </table>
        </div>
    </body>
</html>
