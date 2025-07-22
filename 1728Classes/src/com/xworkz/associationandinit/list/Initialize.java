package com.xworkz.associationandinit.list;

import com.xworkz.associationandinit.dto.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Initialize {

    public List<Product> product(){
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

        return products;
    }
}
