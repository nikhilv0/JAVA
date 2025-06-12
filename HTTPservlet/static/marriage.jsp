<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Portal</title>
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
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="jobapp.jsp">Job Application</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="birthcertificate.jsp">Birth Certificate</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="death.jsp">death Certificate</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="passport.jsp">Passport</a>
                </li>
<!--                <li class="nav-item">-->
<!--                    <a class="nav-link active" aria-current="page" href="#">Marriage Certificate</a>-->
<!--                </li>-->
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
        <h4 class="text-center mb-4">Marriage Certificate Application</h4>
        <form action="MarriageCertificate" method="post">

            <div class="mb-3">
                <label for="groomName" class="form-label">Groom Name</label>
                <input type="text" class="form-control" id="groomName" name="groomName" required>
            </div>

            <div class="mb-3">
                <label for="brideName" class="form-label">Bride Name</label>
                <input type="text" class="form-control" id="brideName" name="brideName" required>
            </div>

            <div class="mb-3">
                <label for="location" class="form-label">Location</label>
                <input type="text" class="form-control" id="location" name="location" required>
            </div>

            <div class="mb-3">
                <label for="address" class="form-label">Address</label>
                <textarea class="form-control" id="address" name="address" rows="2" required></textarea>
            </div>

            <div class="mb-3">
                <label for="religion" class="form-label">Religion</label>
                <input type="text" class="form-control" id="religion" name="religion" required>
            </div>

            <div class="mb-3">
                <label for="date" class="form-label">Marriage Date</label>
                <input type="date" class="form-control" id="date" name="date" required>
            </div>

            <div class="mb-3">
                <label for="witness1" class="form-label">Witness 1 Name</label>
                <input type="text" class="form-control" id="witness1" name="witness1" required>
            </div>

            <div class="mb-3">
                <label for="witness2" class="form-label">Witness 2 Name</label>
                <input type="text" class="form-control" id="witness2" name="witness2" required>
            </div>

            <div class="mb-3">
                <label for="officer" class="form-label">Officer Present</label>
                <input type="text" class="form-control" id="officer" name="officer" required>
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