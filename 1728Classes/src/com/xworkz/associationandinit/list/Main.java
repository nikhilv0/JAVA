package com.xworkz.associationandinit.list;

import com.xworkz.associationandinit.dto.Company;
import com.xworkz.associationandinit.dto.Product;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Fan", 2000, "Ceiling"),
                new Product(2, "Chair", 1500, "Furniture"),
                new Product(3, "Table", 2500, "Furniture"),
                new Product(4, "Laptop", 55000, "Electronics"),
                new Product(5, "Mobile", 18000, "Electronics"),
                new Product(6, "Monitor", 7500, "Electronics"),
                new Product(7, "Keyboard", 1200, "Electronics"),
                new Product(8, "Mouse", 800, "Electronics"),
                new Product(9, "Speaker", 1500, "Electronics"),
                new Product(10, "Headphones", 2000, "Electronics"),

                new Product(11, "Microwave", 8500, "Appliances"),
                new Product(12, "Toaster", 3000, "Appliances"),
                new Product(13, "Fridge", 22000, "Appliances"),
                new Product(14, "AC", 32000, "Appliances"),
                new Product(15, "TV", 28000, "Electronics"),
                new Product(16, "Blender", 1800, "Appliances"),
                new Product(17, "Iron", 1500, "Appliances"),
                new Product(18, "Kettle", 1200, "Appliances"),
                new Product(19, "Washing Machine", 25000, "Appliances"),
                new Product(20, "Geyser", 6000, "Appliances"),

                new Product(21, "Sofa", 20000, "Furniture"),
                new Product(22, "Bed", 30000, "Furniture"),
                new Product(23, "Mattress", 10000, "Furniture"),
                new Product(24, "Bookshelf", 4000, "Furniture"),
                new Product(25, "Wardrobe", 15000, "Furniture"),
                new Product(26, "Dining Table", 18000, "Furniture"),
                new Product(27, "Stool", 900, "Furniture"),
                new Product(28, "TV Stand", 2500, "Furniture"),
                new Product(29, "Desk", 3500, "Furniture"),
                new Product(30, "Bean Bag", 2500, "Furniture"),

                new Product(31, "T-Shirt", 500, "Clothing"),
                new Product(32, "Jeans", 1200, "Clothing"),
                new Product(33, "Jacket", 3000, "Clothing"),
                new Product(34, "Shoes", 2500, "Footwear"),
                new Product(35, "Sandals", 900, "Footwear"),
                new Product(36, "Cap", 400, "Clothing"),
                new Product(37, "Socks", 150, "Clothing"),
                new Product(38, "Watch", 2000, "Accessories"),
                new Product(39, "Backpack", 1500, "Accessories"),
                new Product(40, "Wallet", 700, "Accessories"),

                new Product(41, "Curtains", 1200, "Home Decor"),
                new Product(42, "Lamp", 1100, "Home Decor"),
                new Product(43, "Clock", 800, "Home Decor"),
                new Product(44, "Mirror", 1700, "Home Decor"),
                new Product(45, "Painting", 3000, "Home Decor"),
                new Product(46, "Plant Pot", 350, "Home Decor"),
                new Product(47, "Wall Art", 2200, "Home Decor"),
                new Product(48, "Rug", 2500, "Home Decor"),
                new Product(49, "Cushion", 450, "Home Decor"),
                new Product(50, "Bedsheet", 900, "Home Decor"),

                new Product(51, "Face Wash", 300, "Personal Care"),
                new Product(52, "Shampoo", 400, "Personal Care"),
                new Product(53, "Conditioner", 450, "Personal Care"),
                new Product(54, "Toothpaste", 100, "Personal Care"),
                new Product(55, "Toothbrush", 80, "Personal Care"),
                new Product(56, "Soap", 60, "Personal Care"),
                new Product(57, "Lotion", 350, "Personal Care"),
                new Product(58, "Deodorant", 200, "Personal Care"),
                new Product(59, "Perfume", 1500, "Personal Care"),
                new Product(60, "Hair Oil", 250, "Personal Care"),

                new Product(61, "Notebook", 70, "Stationery"),
                new Product(62, "Pen", 20, "Stationery"),
                new Product(63, "Pencil", 10, "Stationery"),
                new Product(64, "Marker", 50, "Stationery")
        );

        Company company1 = new Company(1, "Infosys", "Bengaluru", "IT", );
//        Company company2 = new Company(2, "TCS", "Mumbai", "IT");
//        Company company3 = new Company(3, "Wipro", "Bengaluru", "IT");
//        Company company4 = new Company(4, "Tech Mahindra", "Pune", "IT");
//        Company company5 = new Company(5, "Capgemini", "Hyderabad", "IT");
//        Company company6 = new Company(6, "HCL", "Noida", "IT");
//        Company company7 = new Company(7, "Mindtree", "Bengaluru", "IT");
//        Company company8 = new Company(8, "Accenture", "Mumbai", "Consulting");
//        Company company9 = new Company(9, "IBM", "Bengaluru", "Technology");
//        Company company10 = new Company(10, "Amazon", "Hyderabad", "E-Commerce");
//
//        Company company11 = new Company(11, "Flipkart", "Bengaluru", "E-Commerce");
//        Company company12 = new Company(12, "Google", "Hyderabad", "Technology");
//        Company company13 = new Company(13, "Microsoft", "Hyderabad", "Technology");
//        Company company14 = new Company(14, "Oracle", "Bengaluru", "Technology");
//        Company company15 = new Company(15, "Zoho", "Chennai", "Software");
//        Company company16 = new Company(16, "Freshworks", "Chennai", "Software");
//        Company company17 = new Company(17, "Dell", "Hyderabad", "Hardware");
//        Company company18 = new Company(18, "HP", "Bengaluru", "Hardware");
//        Company company19 = new Company(19, "Intel", "Noida", "Hardware");
//        Company company20 = new Company(20, "Nvidia", "Bengaluru", "Hardware");
//
//        Company company21 = new Company(21, "Paytm", "Noida", "Fintech");
//        Company company22 = new Company(22, "PhonePe", "Bengaluru", "Fintech");
//        Company company23 = new Company(23, "Razorpay", "Bengaluru", "Fintech");
//        Company company24 = new Company(24, "CRED", "Bengaluru", "Fintech");
//        Company company25 = new Company(25, "Byju's", "Bengaluru", "EdTech");
//        Company company26 = new Company(26, "Unacademy", "Bengaluru", "EdTech");
//        Company company27 = new Company(27, "Vedantu", "Bengaluru", "EdTech");
//        Company company28 = new Company(28, "WhiteHat Jr", "Mumbai", "EdTech");
//        Company company29 = new Company(29, "Meesho", "Bengaluru", "E-Commerce");
//        Company company30 = new Company(30, "Swiggy", "Bengaluru", "Food Delivery");
//
//        Company company31 = new Company(31, "Zomato", "Gurgaon", "Food Delivery");
//        Company company32 = new Company(32, "Ola", "Bengaluru", "Transport");
//        Company company33 = new Company(33, "Uber", "Hyderabad", "Transport");
//        Company company34 = new Company(34, "RedBus", "Bengaluru", "Transport");
//        Company company35 = new Company(35, "Makemytrip", "Gurgaon", "Travel");
//        Company company36 = new Company(36, "Goibibo", "Gurgaon", "Travel");
//        Company company37 = new Company(37, "Yatra", "Gurgaon", "Travel");
//        Company company38 = new Company(38, "Ixigo", "Gurgaon", "Travel");
//        Company company39 = new Company(39, "Snapdeal", "New Delhi", "E-Commerce");
//        Company company40 = new Company(40, "ShopClues", "Gurgaon", "E-Commerce");
//
//        Company company41 = new Company(41, "Pepperfry", "Mumbai", "Furniture");
//        Company company42 = new Company(42, "Urban Ladder", "Bengaluru", "Furniture");
//        Company company43 = new Company(43, "Livspace", "Bengaluru", "Interior Design");
//        Company company44 = new Company(44, "Lenskart", "Faridabad", "Eyewear");
//        Company company45 = new Company(45, "Nykaa", "Mumbai", "Beauty");
//        Company company46 = new Company(46, "Purplle", "Mumbai", "Beauty");
//        Company company47 = new Company(47, "BigBasket", "Bengaluru", "Grocery");
//        Company company48 = new Company(48, "Grofers", "Gurgaon", "Grocery");
//        Company company49 = new Company(49, "1mg", "Gurgaon", "Healthcare");
//        Company company50 = new Company(50, "PharmEasy", "Mumbai", "Healthcare");
//
//        Company company51 = new Company(51, "NetMeds", "Chennai", "Healthcare");
//        Company company52 = new Company(52, "Tata Digital", "Mumbai", "Digital");
//        Company company53 = new Company(53, "Reliance Jio", "Mumbai", "Telecom");
//        Company company54 = new Company(54, "Airtel", "New Delhi", "Telecom");
//        Company company55 = new Company(55, "Vi", "Mumbai", "Telecom");
//        Company company56 = new Company(56, "BSNL", "New Delhi", "Telecom");
//        Company company57 = new Company(57, "Indigo", "Gurgaon", "Aviation");
//        Company company58 = new Company(58, "SpiceJet", "Gurgaon", "Aviation");
//        Company company59 = new Company(59, "Air India", "New Delhi", "Aviation");
//        Company company60 = new Company(60, "Vistara", "Gurgaon", "Aviation");
//
//        Company company61 = new Company(61, "Zoomcar", "Bengaluru", "Transport");
//        Company company62 = new Company(62, "BluSmart", "Gurgaon", "Transport");
//        Company company63 = new Company(63, "InMobi", "Bengaluru", "AdTech");
//        Company company64 = new Company(64, "CureFit", "Bengaluru", "Fitness");
//        Company company65 = new Company(65, "DailyHunt", "Bengaluru", "Media");
//        Company company66 = new Company(66, "ShareChat", "Bengaluru", "Social Media");
//        Company company67 = new Company(67, "Chingari", "Bhopal", "Social Media");
    }
}
