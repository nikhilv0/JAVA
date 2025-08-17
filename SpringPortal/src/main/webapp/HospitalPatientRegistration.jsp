<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Patient Registration</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow p-4">
        <h3 class="mb-4">Patient Registration Form</h3>
        <form>
            <div class="mb-3">
                <label class="form-label">Patient Name</label>
                <input type="text" class="form-control" name="patientName" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Age</label>
                <input type="number" class="form-control" name="age" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Gender</label>
                <select class="form-control" name="gender" required>
                    <option>Male</option>
                    <option>Female</option>
                    <option>Other</option>
                </select>
            </div>
            <div class="mb-3">
                <label class="form-label">Contact Number</label>
                <input type="text" class="form-control" name="phone" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Email Address</label>
                <input type="email" class="form-control" name="email" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Medical History</label>
                <textarea class="form-control" rows="3" name="medicalHistory"></textarea>
            </div>
            <div class="mb-3">
                <label class="form-label">Emergency Contact</label>
                <input type="text" class="form-control" name="emergencyContact" required>
            </div>
            <button type="submit" class="btn btn-danger">Register</button>
        </form>
    </div>
</div>
</body>
</html>
