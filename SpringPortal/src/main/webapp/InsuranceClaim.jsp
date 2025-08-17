<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Insurance Claim Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow p-4">
        <h3 class="mb-4">Insurance Claim Form</h3>
        <form>
            <div class="mb-3">
                <label class="form-label">Policy Number</label>
                <input type="text" class="form-control" name="policyNumber" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Claim Type</label>
                <select class="form-control" name="claimType" required>
                    <option>Accident</option>
                    <option>Health</option>
                    <option>Travel</option>
                    <option>Other</option>
                </select>
            </div>
            <div class="mb-3">
                <label class="form-label">Date of Incident</label>
                <input type="date" class="form-control" name="incidentDate" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Description</label>
                <textarea class="form-control" rows="3" name="description" required></textarea>
            </div>
            <div class="mb-3">
                <label class="form-label">Estimated Amount</label>
                <input type="number" class="form-control" name="amount" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Contact Email</label>
                <input type="email" class="form-control" name="email" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Contact Number</label>
                <input type="text" class="form-control" name="phone" required>
            </div>
            <button type="submit" class="btn btn-primary">Submit Claim</button>
        </form>
    </div>
</div>
</body>
</html>
