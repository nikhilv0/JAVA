<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>Employee Feedback Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow p-4">
        <h3 class="mb-4">Employee Feedback Form</h3>
        <form>
            <div class="mb-3">
                <label for="employeeId" class="form-label">Employee ID</label>
                <input type="text" id="employeeId" class="form-control" name="employeeId" required>
            </div>
            <div class="mb-3">
                <label for="department" class="form-label">Department</label>
                <input type="text" id="department" class="form-control" name="department" required>
            </div>
            <div class="mb-3">
                <label for="feedbackType" class="form-label">Feedback Type</label>
                <select id="feedbackType" class="form-control" name="feedbackType" required>
                    <option>Work Environment</option>
                    <option>Management</option>
                    <option>Salary</option>
                    <option>Other</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="rating" class="form-label">Rating (1-5)</label>
                <input type="number" id="rating" min="1" max="5" class="form-control" name="rating" required>
            </div>
            <div class="mb-3">
                <label for="comments" class="form-label">Feedback Comments</label>
                <textarea id="comments" class="form-control" rows="3" name="comments" required></textarea>
            </div>
            <div class="mb-3">
                <label for="employeeName" class="form-label">Employee Name</label>
                <input type="text" id="employeeName" class="form-control" name="employeeName" required>
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Contact Email</label>
                <input type="email" id="email" class="form-control" name="email" required>
            </div>
            <button type="submit" class="btn btn-success">Submit Feedback</button>
        </form>
    </div>
</div>
</body>
</html>
