<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Travel Booking Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow p-4">
        <h3 class="mb-4">Travel Booking Form</h3>
        <form>
            <div class="mb-3">
                <label class="form-label">Full Name</label>
                <input type="text" class="form-control" name="fullName" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Destination</label>
                <input type="text" class="form-control" name="destination" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Travel Date</label>
                <input type="date" class="form-control" name="travelDate" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Return Date</label>
                <input type="date" class="form-control" name="returnDate">
            </div>
            <div class="mb-3">
                <label class="form-label">No. of Passengers</label>
                <input type="number" class="form-control" name="passengers" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Email Address</label>
                <input type="email" class="form-control" name="email" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Contact Number</label>
                <input type="text" class="form-control" name="phone" required>
            </div>
            <button type="submit" class="btn btn-warning">Book Now</button>
        </form>
    </div>
</div>
</body>
</html>
