<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>College Admission Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow p-4">
        <h3 class="mb-4">College Admission Form</h3>
        <form>
            <div class="mb-3">
                <label for="studentName" class="form-label">Student Name</label>
                <input type="text" id="studentName" class="form-control" name="studentName" required>
            </div>
            <div class="mb-3">
                <label for="dob" class="form-label">Date of Birth</label>
                <input type="date" class="form-control" id="dob" name="dob" required>
            </div>
            <div class="mb-3">
                <label for="course" class="form-label">Course Applied</label>
                <input type="text" class="form-control" id="course" name="course" required>
            </div>
            <div class="mb-3">
                <label for="qualification" class="form-label">Previous Qualification</label>
                <input type="text" class="form-control" id="qualification" name="qualification" required>
            </div>
            <div class="mb-3">
                <label for="parentName" class="form-label">Parent's Name</label>
                <input type="number" class="form-control" id="parentName" name="parentName" required>
            </div>
            <div class="mb-3">
                <label for="parentContact" class="form-label">Parent Contact</label>
                <input type="text" class="form-control" id="parentContact" name="parentContact" required>
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email Address</label>
                <input type="email" class="form-control" id="email" name="email" required>
            </div>
            <button type="submit" class="btn btn-info">Apply</button>
        </form>
    </div>
</div>
</body>
</html>
