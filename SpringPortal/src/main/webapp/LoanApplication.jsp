<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Loan Application</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light">
<div class="container mt-5">
    <h2 class="mb-4 text-center">Loan Application Form</h2>
    <form action="loanApply" method="post" class="p-4 bg-white shadow rounded">
        <div class="mb-3">
            <label class="form-label">Applicant Name</label>
            <input type="text" class="form-control" name="applicantName" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Loan Type</label>
            <input type="text" class="form-control" name="loanType" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Loan Amount</label>
            <input type="number" class="form-control" name="loanAmount" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Annual Income</label>
            <input type="number" class="form-control" name="annualIncome" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Employment Status</label>
            <input type="text" class="form-control" name="employmentStatus" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Address</label>
            <input type="text" class="form-control" name="address" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Contact Number</label>
            <input type="text" class="form-control" name="contactNumber" required>
        </div>
        <button type="submit" class="btn btn-primary w-100">Apply Loan</button>
    </form>
</div>
</body>
</html>
