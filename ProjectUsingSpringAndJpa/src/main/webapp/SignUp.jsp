<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .error-message {
            color: red;
            font-size: 0.9rem;
        }
    </style>
</head>
<body class="bg-light">

<div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="card shadow-lg p-4 rounded-4" style="max-width: 500px; width: 100%;">
        <h2 class="text-center mb-4">Sign Up</h2>

        <div class="mt-3">
            <p class="text-success">${message}</p>
            <p class="text-danger">${error}</p>
        </div>

        <form id="signUpForm" action="signUp" method="post" novalidate>
            <!-- Full Name -->
            <div class="mb-3">
                <label for="name" class="form-label">Full Name</label>
                <input type="text" class="form-control" id="name" name="fullName" value="${signUpDTO.fullName}" placeholder="Enter your full name" required>
                <small id="nameError" class="error-message"></small>
            </div>

            <!-- Email -->
            <div class="mb-3">
                <label for="email" class="form-label">Email address</label>
                <input type="email" class="form-control" id="email" name="email" value="${signUpDTO.email}" placeholder="Enter your email" required>
                <small id="emailError" class="error-message"></small>
            </div>

            <!-- Phone -->
            <div class="mb-3">
                <label for="phone" class="form-label">Phone Number</label>
                <input type="number" class="form-control" id="phone" name="phone" value="${signUpDTO.phone}" placeholder="Enter your phone number" required>
                <small id="phoneError" class="error-message"></small>
            </div>

            <!-- Gender -->
            <div class="mb-3">
                <label class="form-label d-block">Gender</label>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="gender" id="male" value="MALE" required>
                    <label class="form-check-label" for="male">Male</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="gender" id="female" value="FEMALE">
                    <label class="form-check-label" for="female">Female</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="gender" id="other" value="OTHER">
                    <label class="form-check-label" for="other">Other</label>
                </div>
                <small id="genderError" class="error-message"></small>
            </div>

            <!-- Age -->
            <div class="mb-3">
                <label for="age" class="form-label">Age</label>
                <input type="number" class="form-control" id="age" name="age" value="${signUpDTO.age}" placeholder="Enter your age" min="18" required>
                <small id="ageError" class="error-message"></small>
            </div>

            <!-- Address -->
            <div class="mb-3">
                <label for="address" class="form-label">Address</label>
                <textarea class="form-control" id="address" name="address" rows="2" placeholder="Enter your address">${signUpDTO.address}</textarea>
                <small id="addressError" class="error-message"></small>
            </div>

            <!-- Password -->
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" id="password" name="password" value="${signUpDTO.password}" placeholder="Enter password" required>
                <small id="passwordError" class="error-message"></small>
            </div>

            <!-- Confirm Password -->
            <div class="mb-3">
                <label for="confirmPassword" class="form-label">Confirm Password</label>
                <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" value="${signUpDTO.confirmPassword}" placeholder="Confirm password" required>
                <small id="confirmPasswordError" class="error-message"></small>
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-primary">Sign Up</button>
            </div>
        </form>
    </div>
</div>

<script>
    const form = document.getElementById("signUpForm");

    const validators = {
        name: (value) => value.length >= 3 ? "" : "Name must be at least 3 characters long!",
        email: (value) => /^(?=.*[0-9])[a-zA-Z0-9._%+-]+@gmail\.com$/.test(value) ? "" : "Enter a valid Gmail address with at least one number.",
        phone: (value) => value.length === 10 && !isNaN(value) ? "" : "Phone number must be exactly 10 digits.",
        age: (value) => value >= 18 && value <= 70 ? "" : "Age must be between 18 and 70.",
        address: (value) => value.length >= 5 ? "" : "Address must be at least 5 characters long.",
        password: (value) => /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/.test(value)
                            ? "" : "Password must include uppercase, lowercase, number, special char & be 8+ chars.",
        confirmPassword: (value) => value === document.getElementById("password").value
                                    ? "" : "Passwords do not match.",
        gender: () => document.querySelector('input[name="gender"]:checked') ? "" : "Please select your gender."
    };

    // Add real-time validation
    Object.keys(validators).forEach(field => {
        const input = document.getElementById(field);
        if (input) {
            input.addEventListener("input", () => validateField(field));
        }
    });

    // Validate single field
    function validateField(field) {
        const value = (document.getElementById(field)?.value || "").trim();
        const error = validators[field](value);
        document.getElementById(field + "Error").textContent = error;
        return !error;
    }

    // Validate gender separately (radio buttons)
    document.querySelectorAll('input[name="gender"]').forEach(radio => {
        radio.addEventListener("change", () => validateField("gender"));
    });

    // On submit
    form.addEventListener("submit", function (event) {
        let isValid = true;
        for (const field in validators) {
            if (!validateField(field)) {
                isValid = false;
            }
        }
        if (!isValid) {
            event.preventDefault();
        }
    });
</script>
</body>
</html>
