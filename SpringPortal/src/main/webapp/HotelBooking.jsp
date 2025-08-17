<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hotel Booking</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light">
<div class="container mt-5">
    <h2 class="mb-4 text-center">Hotel Booking</h2>
    <form action="hotelBooking" method="post" class="p-4 bg-white shadow rounded">
        <div class="mb-3">
            <label class="form-label">Guest Name</label>
            <input type="text" class="form-control" name="guestName" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Hotel Name</label>
            <input type="text" class="form-control" name="hotelName" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Room Type</label>
            <input type="text" class="form-control" name="roomType" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Check-in Date</label>
            <input type="date" class="form-control" name="checkIn" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Check-out Date</label>
            <input type="date" class="form-control" name="checkOut" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Number of Guests</label>
            <input type="number" class="form-control" name="numGuests" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Contact Email</label>
            <input type="email" class="form-control" name="email" required>
        </div>
        <button type="submit" class="btn btn-success w-100">Book Now</button>
    </form>
</div>
</body>
</html>
