<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Payment Checkout</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container py-5">
    <h2 class="text-center mb-4">Checkout</h2>
    <div class="row justify-content-center">
        <div class="col-md-8">
            <form action="payment" >
                <!-- Billing Details -->
                <h5 class="mb-3">Billing Details</h5>
                <div class="row g-3">
                    <div class="col-sm-6">
                        <input type="text" class="form-control" placeholder="First name" name="name" required>
                    </div>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" placeholder="Last name" name="lastName" required>
                    </div>
                    <div class="col-12">
                        <input type="email" class="form-control" placeholder="Email" required>
                    </div>
                    <div class="col-12">
                        <input type="text" class="form-control" placeholder="Address" required>
                    </div>
                    <div class="col-md-6">
                        <select class="form-select" required>
                            <option value="">Country</option>
                            <option>India</option>
                            <option>USA</option>
                        </select>
                    </div>
                    <div class="col-md-6">
                        <input type="text" class="form-control" placeholder="ZIP Code" required>
                    </div>
                </div>

                <!-- Payment Method -->
                <h5 class="mt-4 mb-3">Select Payment Method</h5>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="payment" id="gpay" required>
                    <label class="form-check-label" for="gpay">Google Pay</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="payment" id="phonepe">
                    <label class="form-check-label" for="phonepe">PhonePe</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="payment" id="paytm">
                    <label class="form-check-label" for="paytm">Paytm</label>
                </div>

                <!-- UPI Input -->
                <div class="mt-3">
                    <label for="upi-id" class="form-label">Enter UPI ID</label>
                    <input type="text" class="form-control" id="upi-id" placeholder="example@upi">
                </div>

                <!-- QR Code Scan -->
                <div class="mt-4">
                    <label class="form-label">Scan to Pay via UPI</label><br>
                    <img src="QR.jpg" alt="QR Code" class="img-thumbnail" width="200">
                </div>

<!--                &lt;!&ndash; Card Option &ndash;&gt;-->
<!--                <h5 class="mt-5 mb-3">Or Pay via Card</h5>-->
<!--                <div class="row g-3">-->
<!--                    <div class="col-md-6">-->
<!--                        <input type="text" class="form-control" placeholder="Cardholder Name" required>-->
<!--                    </div>-->
<!--                    <div class="col-md-6">-->
<!--                        <input type="text" class="form-control" placeholder="Card Number" required>-->
<!--                    </div>-->
<!--                    <div class="col-md-4">-->
<!--                        <input type="text" class="form-control" placeholder="MM/YY" required>-->
<!--                    </div>-->
<!--                    <div class="col-md-4">-->
<!--                        <input type="text" class="form-control" placeholder="CVV" required>-->
<!--                    </div>-->
<!--                </div>-->

                <!-- Pay Button -->
                <button class="btn btn-success w-100 mt-4" type="submit">Proceed to Pay</button>
            </form>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
