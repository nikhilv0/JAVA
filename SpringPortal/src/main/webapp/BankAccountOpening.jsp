<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bank Account Opening</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow-lg">
        <div class="card-header bg-info text-white">
            <h4>Bank Account Opening</h4>
        </div>
        <c:if test="${not empty message}">
            <div class="alert alert-success">${message}</div>
        </c:if>

        <c:if test="${not empty error}">
            <div class="alert alert-danger">${error}</div>
        </c:if>

        <ul>
            <c:forEach var="err" items="${errors}">
                <li>${err.defaultMessage}</li>
            </c:forEach>
        </ul>

        <div class="card-body">
            <form action="accountOpen" method="post">
                <div class="mb-3">
                    <label for="holderName" class="form-label">Account Holder Name</label>
                    <input type="text" class="form-control" id="holderName" name="holderName" required>
                </div>
                <div class="mb-3">
                    <label for="holderName" class="form-label">Date of Birth</label>
                    <input type="date" class="form-control"  id="dob" name="dob" required>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" name="email" required>
                </div>
                <div class="mb-3">
                    <label for="phone" class="form-label">Phone</label>
                    <input type="number" class="form-control" id="phone" name="phone" required>
                </div>
                <div class="mb-3">
                    <label for="accountType" class="form-label">Account Type</label>
                    <select class="form-control" id="accountType" name="accountType">
                        <option>SAVINGS</option>
                        <option>CURRENT</option>
                        <option>FIXED DEPOSIT</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="aadhaar" class="form-label">Aadhaar Number</label>
                    <input type="text" class="form-control" id="aadhaar" name="aadhaar" required>
                </div>
                <div class="mb-3">
                    <label for="phone" class="form-label">PAN Number</label>
                    <input type="text" class="form-control" id="pan" name="pan" required>
                </div>
                <button type="submit" class="btn btn-success">Open Account</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
