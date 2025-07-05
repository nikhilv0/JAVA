<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!--<!doctype html>-->
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Blood Bank</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <form class="d-flex" role="search" action="donorregister" method="get">
            <input class="form-control me-2" type="search" name="id" placeholder="Search"  aria-label="Search"/>
            <button class="btn btn-outline-success" type="submit">Search</button>
        </form>
        <div><h4 style="color: red;">${message}</h4></div>
    </div>

</nav>

<br>
<table class ="table table-bordered table-striped ">
    <thead class="thead-dark" >
    <tr>
        <th><h6>Name</h6></th>
        <th><h6>Age</h6></th>
        <th><h6>Gender</h6></th>
        <th><h6>Blood Group</h6></th>
        <th><h6>Contact</h6></th>
        <th><h6>Address</h6></th>
        <th><h6>Last Donation Date</h6></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${id.name}</td>
        <td>${id.age}</td>
        <td>${id.gender}</td>
        <td>${id.bloodGroup}</td>
        <td>${id.contact}</td>
        <td>${id.address}</td>
        <td>${id.lastDonationDate}</td>
    </tr>
    </tbody>
</table>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js" integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D" crossorigin="anonymous"></script>

</body>
</html>