<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="">Home</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <!--                <li class="nav-item">-->
                <!--                    <a class="nav-link active" aria-current="page" href="#">Home</a>-->
                <!--                </li>-->
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
                    <a class="nav-link active" aria-current="page" href="viewBloodStock.jsp">View BloodStock</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="search.jsp"> Search </a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="text-center">
    <a href="signUp.jsp">Don't have an account? Sign Up</a> |
    <a href="signIn.jsp">Do have an account? Sign In</a>
</div>
<!--<h1>${dto.userId}</h1>-->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.min.js" integrity="sha384-7qAoOXltbVP82dhxHAUje59V5r2YsVfBafyUDxEdApLPmcdhBPg1DKg1ERo0BZlK" crossorigin="anonymous"></script>
</body>
</html>