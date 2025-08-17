<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Patient Admission</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow-lg">
        <div class="card-header bg-danger text-white">
            <h4>Patient Admission Form</h4>
        </div>
        <div class="card-body">
            <form action="patientAdmission" method="post">
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
                    <select class="form-control" name="gender">
                        <option>Male</option>
                        <option>Female</option>
                        <option>Other</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label class="form-label">Disease</label>
                    <input type="text" class="form-control" name="disease" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Doctor Assigned</label>
                    <input type="text" class="form-control" name="doctorAssigned" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Contact Number</label>
                    <input type="text" class="form-control" name="contact" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Admission Date</label>
                    <input type="date" class="form-control" name="admissionDate" required>
                </div>
                <button type="submit" class="btn btn-danger">Admit Patient</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
