<!DOCTYPE html>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Donor Registration Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Blood Bank</title>
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
                    <a class="nav-link active" aria-current="page" href="home.jsp">Home</a>
                </li>
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
                        <h4 class="text-center mb-4">Update Stock</h4>
                    </div>
                    <div class="card-body">
                        <form action="updateStock" method="post">
                            <div class="mb-3">
                                <div style="color:green">${mess}</div>
                                <div style="color:red">${valid}</div>
                                <label for="bloodGroup" class="form-label">Blood Group:</label>
                                <input type="text" class="form-control" id="bloodGroup" name="bloodGroup"
                                       value="${dto.bloodGroup}" required/>
                            </div>
                            <div class="mb-3">
                                <label for="Quantity" class="form-label">New Quantity (units):</label>
                                <input type="text" class="form-control" id="Quantity" name="Quantity"
                                       value="${dto.quantity}" required/>
                            </div>
                            <div class="d-grid">
                                <input type="submit" class="btn btn-danger" value="submit" name="action"></input>
                            </div>
                            <div class="text-center">

                                <a href="home.jsp">Back to Home</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
                integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
                crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.min.js"
                integrity="sha384-7qAoOXltbVP82dhxHAUje59V5r2YsVfBafyUDxEdApLPmcdhBPg1DKg1ERo0BZlK"
                crossorigin="anonymous"></script>

</body>
</html>