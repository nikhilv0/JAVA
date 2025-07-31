<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform" xmlns="http://www.w3.org/1999/html">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>View Blood Stock</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    <style>
        body {
            background-color: white;
            color: black;
        }
        .form-container {
            max-width: 400px;
            margin: 50px auto;
            padding: 25px;
            border: 1px solid #000;
            border-radius: 8px;
            background-color: white;
        }
        .form-control:focus {
            border-color: black;
            box-shadow: none;
        }
        .btn-black {
            background-color: black;
            color: white;
        }
        .btn-black:hover {
            background-color: #333;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="home.jsp">Home</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="signUp.jsp">Sign Up</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="signIn.jsp">Sign In</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="donorRegistration.jsp">Donor Registration</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="bloodStock.jsp">Blood Stock</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="search.jsp"> Search </a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container mt-9">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-5">
                <div class="card shadow">
                    <div class="card-header bg-danger text-white">
                        <h4 class="text-center mb-4">View Stock</h4>
                    </div>
                    <div class="card-body">
                        <form action="updateStock" method="get">
                            <div class="mb-3">
                                <div style="color:green">${mess}</div>
                                <div style="color:red">${valid}</div>
                                <label for="bloodGroup" class="form-label">Enter Blood Group:</label>
                                <!--                                <input type="text" class="form-control" id="bloodGroup" name="bloodGroup" required/>-->
                                <select class="form-select" name="bloodGroup" id="bloodGroup" required>
                                    <option value="">-- Select Blood Group --</option>
                                    <option value="A+">A+</option>
                                    <option value="A-">A-</option>
                                    <option value="B+">B+</option>
                                    <option value="B-">B-</option>
                                    <option value="AB+">AB+</option>
                                    <option value="AB-">AB-</option>
                                    <option value="O+">O+</option>
                                    <option value="O-">O-</option>
                                </select>
                            </div>
                            <div class="d-grid">
                                <input type="submit" class="btn btn-danger" value="viewStock" name="action"></input>
                            </div>
                            <div class="text-center">
                                <a href="bloodStock.jsp">Blood Stock</a> |
                                <a href="home.jsp">Back to Home</a>
                            </div>
                        </form>
                        <ul class="list-group mt-3">
                            <c:forEach var="stock" items="${list}">
                                <li class="list-group-item">
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div>
                                            <strong>Id:</strong> ${stock.id}<br>
                                            <strong>Blood Group:</strong> ${stock.bloodGroup}<br>
                                            <strong>Quantity:</strong> ${stock.quantity} ml<br>
                                            <strong>Created At:</strong> ${stock.createdat}<br>
                                            <strong>Last Updated:</strong> ${stock.updatedat}
                                        </div>
                                        <div>
                                            <!-- modal -->
                                            <button type="button" class="btn btn-danger btn-sm" data-bs-toggle="modal"
                                                    data-bs-target="#updateModal${stock.id}">Update
                                            </button>
                                        </div>
                                        <div>
                                            <form  action="updateStock" method="post" style="margin: 0;" onsubmit="return validateOnDelete(${stock.id})">
                                                <input type="hidden" name="id" value="${stock.id}">
                                                <input type="submit" class="btn btn-danger btn-sm" value="Delete"
                                                       name="action">
                                            </form>
                                        </div>
                                    </div>
                                </li>

                                <!-- Modal -->
                                <div class="modal fade" id="updateModal${stock.id}" tabindex="-1"
                                     aria-labelledby="updateModalLabel${stock.id}" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <form action="updateStock" method="post">
                                            <div class="modal-content">
                                                <div class="modal-header">
                                                    <h5 class="modal-title" id="updateModalLabel${stock.id}">Update
                                                        Quantity for ID ${stock.id}</h5>
                                                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                                                            aria-label="Close"></button>
                                                </div>

                                                <div class="modal-body">
                                                    <input type="hidden" name="id" value="${stock.id}">
                                                    <div class="mb-3">
                                                        <label for="quantity${stock.id}" class="form-label">Quantity
                                                            (ml)</label>
                                                        <input type="number" class="form-control"
                                                               id="quantity${stock.id}" name="quantity"
                                                               value="${stock.quantity}" required>
                                                    </div>
                                                </div>

                                                <div class="modal-footer">
                                                    <button type="button" class="btn btn-secondary btn-sm"
                                                            data-bs-dismiss="modal">Cancel
                                                    </button>
                                                    <input type="submit" class="btn btn-danger btn-sm" name="action"
                                                           value="Save Changes"></input>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </c:forEach>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <script>
            function validateOnDelete(id){
                   return confirm("Are Sure to Delete id:"+id+"?");
            }
        </script>

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
                integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
                crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.min.js"
                integrity="sha384-7qAoOXltbVP82dhxHAUje59V5r2YsVfBafyUDxEdApLPmcdhBPg1DKg1ERo0BZlK"
                crossorigin="anonymous"></script>
</body>
</html>