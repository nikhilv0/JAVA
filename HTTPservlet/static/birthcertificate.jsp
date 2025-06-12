<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Birth Certificate</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">

    <style>
        body {
          background-color: #fff;
          color: #000;
          font-family: Arial, sans-serif;
        }
        .form-container {
          max-width: 500px;
          margin: 50px auto;
          border: 1px solid #000;
          padding: 25px;
          border-radius: 8px;
        }
        label {
          font-weight: 500;
        }
        .btn-dark {
          width: 100%;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Portal</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
<!--        <a class="navbar-brand" href="#">Birth Certificate</a>-->
<!--        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">-->
<!--            <span class="navbar-toggler-icon"></span>-->
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="jobapp.jsp">Job Application</a>
                </li>
<!--                <li class="nav-item">-->
<!--                    <a class="nav-link active" aria-current="page" href="#">Birth Certificate</a>-->
<!--                </li>-->
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="death.jsp">death Certificate</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="passport.jsp">Passport</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="marriage.jsp">Marriage Certificate</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="driving.jsp">Driving Licence</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<div class="container">
    <div class="form-container">
        <h4 class="text-center mb-4">Birth Certificate Application</h4>
        <form action="BirthCertificate" method="post">

            <div class="mb-3">
                <label for="birthId" class="form-label">Birth ID</label>
                <input type="text" class="form-control" id="birthId" name="birthId" required>
            </div>

            <div class="mb-3">
                <label for="hospitalName" class="form-label">Hospital Name</label>
                <select class="form-select" id="hospitalName" name="hospitalName" required>
                    <option value="">-- Select Hospital --</option>
                    <option value="City Hospital">City Hospital</option>
                    <option value="Green Valley Hospital">Green Valley Hospital</option>
                    <option value="Sunrise Medical Center">Sunrise Medical Center</option>
                    <option value="General Hospital">General Hospital</option>
                </select>
            </div>

            <div class="mb-3">
                <label for="fatherName" class="form-label">Father's Name</label>
                <input type="text" class="form-control" id="fatherName" name="fatherName" required>
            </div>

            <div class="mb-3">
                <label for="motherName" class="form-label">Mother's Name</label>
                <input type="text" class="form-control" id="motherName" name="motherName" required>
            </div>

            <div class="mb-3">
                <label for="birthDateTime" class="form-label">Date and Time of Birth</label>
                <input type="datetime-local" class="form-control" id="birthDateTime" name="birthDateTime" required>
            </div>

            <div class="mb-3">
                <label for="doctorName" class="form-label">Doctor's Name</label>
                <input type="text" class="form-control" id="doctorName" name="doctorName" required>
            </div>

            <div class="mb-3">
                <label for="nurseName" class="form-label">Nurse's Name</label>
                <input type="text" class="form-control" id="nurseName" name="nurseName" required>
            </div>

            <div class="mb-3">
                <label for="hospitalType" class="form-label">Hospital Type</label>
                <select class="form-select" id="hospitalType" name="hospitalType" required>
                    <option value="">-- Select Type --</option>
                    <option value="Government">Government</option>
                    <option value="Private">Private</option>
                    <option value="Charitable">Charitable</option>
                </select>
            </div>

            <button type="submit" class="btn btn-dark">Submit</button>

        </form>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js" integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
</body>
</html>