<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Event Registration Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow-lg p-4">
        <h2 class="mb-4 text-center">Event Registration Form</h2>
        <form action="submitEventRegistration" method="post">
            <div class="mb-3">
                <label class="form-label">Full Name</label>
                <input type="text" class="form-control" name="fullName" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Email</label>
                <input type="email" class="form-control" name="email" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Phone Number</label>
                <input type="tel" class="form-control" name="phone" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Event Name</label>
                <input type="text" class="form-control" name="eventName" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Event Date</label>
                <input type="date" class="form-control" name="eventDate" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Ticket Type</label>
                <select class="form-select" name="ticketType" required>
                    <option value="">Select</option>
                    <option>Standard</option>
                    <option>VIP</option>
                    <option>Student</option>
                </select>
            </div>
            <div class="mb-3">
                <label class="form-label">Special Requests</label>
                <textarea class="form-control" name="specialRequests" rows="3"></textarea>
            </div>
            <button type="submit" class="btn btn-success w-100">Register</button>
        </form>
    </div>
</div>
</body>
</html>
