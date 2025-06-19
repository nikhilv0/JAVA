<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Donor Registration Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light p-4">

<div class="container mt-5">
    <div class="card shadow">
        <div class="card-header bg-danger text-white">
            <h4 class="mb-0">Donor Registration Form</h4>
        </div>
        <div class="card-body">
            ${result}
            <form action="Donorregister" method="post">


                <div class="mb-3">
                    <label for="name" class="form-label">Name</label>
                    <input type="text" class="form-control" name="name" id="name" value="${dto.name}" required>
                </div>


                <div class="mb-3">
                    <label for="age" class="form-label">Age</label>
                    <input type="number" class="form-control" name="age" id="age" value="${dto.age}" required>
                </div>

                <div class="mb-3">
                    <label class="form-label d-block">Gender</label>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" id="male" value="Male"  required>
                        <label class="form-check-label" for="male">Male</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" id="female" value="Female">
                        <label class="form-check-label" for="female">Female</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" id="other" value="Other">
                        <label class="form-check-label" for="other">Other</label>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="bloodGroup" class="form-label">Blood Group</label>
                    <select class="form-select" name="bloodGroup" id="bloodGroup"  required>
                        <option value="">-- Select Blood Group --</option>
                        <option value="A+">A+</option>
                        <option value="A-">A-</option>
                        <option value="B+">B+</option>
                        <option value="B-">B-</option>
                        <option value="AB+">AB+</option>
                        <option value="AB-">AB-</option>
                        <option value="O+">O+</option>
                        <option value="O-">O-</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label for="contact" class="form-label">Contact Number</label>
                    <input type="number" class="form-control" name="contact" id="contact" required>
                </div>

                <div class="mb-3">
                    <label for="address" class="form-label">Address</label>
                    <textarea class="form-control" name="address" id="address" rows="3" required></textarea>
                </div>

                <div class="mb-3">
                    <label for="lastDonation" class="form-label">Last Donation Date</label>
                    <input type="date" class="form-control" name="lastDonation" id="lastDonation" >
                </div>

                <button type="submit" class="btn btn-danger">Register</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
