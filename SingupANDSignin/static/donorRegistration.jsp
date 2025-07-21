<!DOCTYPE html>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>Donor Registration Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!doctype html>
    <html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Blood Bank</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
    </head>
    <body>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
            <a class="navbar-brand" href="home.jsp">Home</a>
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
<!--                    <li class="nav-item">-->
<!--                       <a class="nav-link active" aria-current="page" href="donorRegistration.jsp">Donor Registration</a>&ndash;&gt;&ndash;&gt;-->
<!--                    </li>-->
                    <li class="nav-item">
                        <a class="nav-link" href="search.jsp"> Search </a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</head>
<body class="bg-light p-4">

<div class="container mt-5">
    <div class="card shadow">
        <div class="card-header bg-danger text-white">
            <h4 class="mb-0">Donor Registration Form</h4>
        </div>
        <div class="card-body">
            ${result}
            <form action="donorregister" method="post">


                <div class="mb-3">
                    <label for="name" class="form-label">Name</label>
                    <input type="text" class="form-control" name="name" id="name" style="color-red"  value="${dto.name}" required>
                </div>


                <div class="mb-3">
                    <label for="age" class="form-label">Age</label>
                    <input type="number" class="form-control" name="age" id="age" value="${dto.age}" required>
                </div>

                <div class="mb-3">
                    <label class="form-label d-block">Gender</label>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" id="male"  value="Male" required >
                        <c:if test="${dto.gender == 'Male'}"></c:if>
                        <label class="form-check-label" for="male">Male</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" id="female" value="Female">
                        <label class="form-check-label" for="female">Female</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" id="other" value="Other">
                        <label class="form-check-label" for="other">Other</label>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="bloodGroup" class="form-label">Blood Group</label>
                    <select class="form-select" name="bloodGroup" id="bloodGroup"  required>
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

                <div class="mb-3">
                    <label for="contact" class="form-label">Contact Number</label>
                    <input type="number" class="form-control" name="contact" id="contact" value="${dto.contact}" required>
                </div>

                <div class="mb-3">
                    <label for="address" class="form-label">Address</label>
                    <textarea class="form-control" name="address" id="address" rows="3" vocab="${dto.address}" required></textarea>
                </div>

                <div class="mb-3">
                    <label for="lastDonation" class="form-label">Last Donation Date</label>
                    <input type="date" class="form-control" name="lastDonation" id="lastDonation" required >
                </div>

                <button type="submit" class="btn btn-danger">Register</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
