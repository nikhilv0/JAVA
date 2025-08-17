<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vehicle Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow-lg">
        <div class="card-header bg-dark text-white">
            <h4>Vehicle Registration</h4>
        </div>
        <div class="card-body">
            <form action="vehicleRegister" method="post">
                <div class="mb-3">
                    <label class="form-label">Owner Name</label>
                    <input type="text" class="form-control" name="ownerName" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Vehicle Type</label>
                    <select class="form-control" name="vehicleType">
                        <option>Car</option>
                        <option>Bike</option>
                        <option>Truck</option>
                        <option>Bus</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label class="form-label">Vehicle Model</label>
                    <input type="text" class="form-control" name="vehicleModel" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Registration Number</label>
                    <input type="text" class="form-control" name="registrationNumber" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Engine Number</label>
                    <input type="text" class="form-control" name="engineNumber" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Chassis Number</label>
                    <input type="text" class="form-control" name="chassisNumber" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Purchase Date</label>
                    <input type="date" class="form-control" name="purchaseDate" required>
                </div>
                <button type="submit" class="btn btn-warning">Register Vehicle</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
