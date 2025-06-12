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
<!--                <li class="nav-item">-->
<!--                    <a class="nav-link active" aria-current="page" href="#">Passport</a>-->
<!--                </li>-->
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
        <h4 class="text-center mb-4">Passport Application</h4>
        <form action="PassportApplication" method="post">

            <div class="mb-3">
                <label for="applicantName" class="form-label">Applicant Name</label>
                <input type="text" class="form-control" id="applicantName" name="applicantName" required>
            </div>

            <div class="mb-3">
                <label for="aadhaarNo" class="form-label">Aadhaar Number</label>
                <input type="text" class="form-control" id="aadhaarNo" name="aadhaarNo" required>
            </div>

            <div class="mb-3">
                <label for="panNo" class="form-label">PAN Number</label>
                <input type="text" class="form-control" id="panNo" name="panNo" required>
            </div>

            <div class="mb-3">
                <label for="address" class="form-label">Address</label>
                <textarea class="form-control" id="address" name="address" rows="2" required></textarea>
            </div>

            <div class="mb-3">
                <label for="country" class="form-label">Country</label>
                <input type="text" class="form-control" id="country" name="country" value="India" required>
            </div>

            <div class="mb-3">
                <label for="state" class="form-label">State</label>
                <input type="text" class="form-control" id="state" name="state" required>
            </div>

            <div class="mb-3">
                <label for="city" class="form-label">City</label>
                <input type="text" class="form-control" id="city" name="city" required>
            </div>

            <div class="mb-3">
                <label for="pincode" class="form-label">Pin Code</label>
                <input type="text" class="form-control" id="pincode" name="pincode" required>
            </div>

            <div class="mb-3">
                <label for="passportType" class="form-label">Passport Type</label>
                <select class="form-select" id="passportType" name="passportType" required>
                    <option value="">-- Select Type --</option>
                    <option value="Normal">Normal</option>
                    <option value="Tatkal">Tatkal</option>
                    <option value="Diplomatic">Diplomatic</option>
                    <option value="Official">Official</option>
                </select>
            </div>

            <div class="mb-3">
                <label for="paymentRef" class="form-label">Payment Reference Number</label>
                <input type="text" class="form-control" id="paymentRef" name="paymentRef" required>
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