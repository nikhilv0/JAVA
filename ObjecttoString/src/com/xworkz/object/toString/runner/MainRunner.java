package com.xworkz.object.toString.runner;

import com.xworkz.object.toString.internal.*;

public class MainRunner {
    public static void main(String[] args) {

        Brother brother=new Brother("bro","da",21);
        System.out.println(brother);
        System.out.println(brother.hashCode());
        System.out.println("Original:"+System.identityHashCode(brother));
        Brother brother2= new Brother("bro","da",21);
        boolean bro=brother.equals(brother2);
        System.out.println("Comparing 1 properties are same:"+bro);
        System.out.println("____________________________________________________________________________________");

        Friend friend = new Friend("Kata appa", "katta", 100);
        System.out.println(friend);
        System.out.println(friend.hashCode());
        System.out.println("Original:" + System.identityHashCode(friend));
        Friend friend2 = new Friend("Kata appa", "katta", 100);
        boolean isSame = friend.equals(friend2);
        System.out.println("Comparing 2 properties are same: " + isSame);
        System.out.println("____________________________________________________________________________________");

        Dad dad = new Dad("Venkatesh", "D", 50);
        System.out.println(dad);
        System.out.println(dad.hashCode());
        System.out.println("Original:" + System.identityHashCode(dad));
        Dad dad2 = new Dad("Venkatesh", "D", 50);
        boolean isDadSame = dad.equals(dad2);
        System.out.println("Comparing 1 properties are same: " + isDadSame);
        System.out.println("____________________________________________________________________________________");

        Mom mom = new Mom("Padma", "V", 40);
        System.out.println(mom);
        System.out.println(mom.hashCode());
        System.out.println("Original:" + System.identityHashCode(mom));
        Mom mom2 = new Mom("adma", "V", 40);
        boolean isMomSame = mom.equals(mom2);
        System.out.println("Comparing 2 properties are same: " + isMomSame);
        System.out.println("____________________________________________________________________________________");

        AirConditioner ac = new AirConditioner("Samsung", "Split", 18000);
        System.out.println(ac);
        System.out.println(ac.hashCode());
        System.out.println("Original:"+System.identityHashCode(ac));
        AirConditioner ac2 = new AirConditioner("Samsung", "open", 20000);
        boolean isAirSame= ac.equals(ac2);
        System.out.println("Comparing 1 are same:" +isAirSame);
        System.out.println("____________________________________________________________________________________");

        AirFryer fryer = new AirFryer("Philips", "Black", 5);
        System.out.println(fryer);
        System.out.println(fryer.hashCode());
        System.out.println("Original:" + System.identityHashCode(fryer));
        AirFryer fryer1 = new AirFryer("Philips", "Black", 5);
        boolean fry = fryer.equals(fryer1);
        System.out.println("Comparing 1 properties are same: " + fry);
        System.out.println("____________________________________________________________________________________");

        AirPurifier purifier = new AirPurifier("Dyson", "Pure Cool Link", 400);
        System.out.println(purifier);
        System.out.println(purifier.hashCode());
        System.out.println("Original:" + System.identityHashCode(purifier));
        AirPurifier purifier2 = new AirPurifier("Dyson", "Pure Cool Link", 400);
        boolean purify = purifier.equals(purifier2);
        System.out.println("Comparing 1 properties are same: " + purify);
        System.out.println("____________________________________________________________________________________");

        Aria aria = new Aria("Blue", 25, 5.6);
        System.out.println(aria);
        System.out.println(aria.hashCode());
        System.out.println("Original:" + System.identityHashCode(aria));
        Aria aria2 = new Aria("Blue", 25, 5.6);
        boolean isAriaSame = aria.equals(aria2);
        System.out.println("Comparing 1 properties are same: " + isAriaSame);
        System.out.println("____________________________________________________________________________________");

        Ava ava = new Ava("Green", 22, 5.4);
        System.out.println(ava);
        System.out.println(ava.hashCode());
        System.out.println("Original:" + System.identityHashCode(ava));
        Ava ava2 = new Ava("Green", 22, 5.4);
        boolean isAvaSame = ava.equals(ava2);
        System.out.println("Comparing 1 properties are same: " + isAvaSame);
        System.out.println("____________________________________________________________________________________");

        BankAccount account = new BankAccount("1234567890", "Alice Johnson", 1500.75);
        System.out.println(account);
        System.out.println(account.hashCode());
        System.out.println("Original:" + System.identityHashCode(account));
        BankAccount account2 = new BankAccount("1234567890", "Alice Johnson", 1500.75);
        boolean isAccountSame = account.equals(account2);
        System.out.println("Comparing 1 properties are same: " + isAccountSame);
        System.out.println("____________________________________________________________________________________");

        Blender blender = new Blender("NutriBullet", "Silver", 600);
        System.out.println(blender);
        System.out.println(blender.hashCode());
        System.out.println("Original:" + System.identityHashCode(blender));
        Blender blender2 = new Blender("NutriBullet", "Silver", 600);
        boolean isBlenderSame = blender.equals(blender2);
        System.out.println("Comparing 1 properties are same: " + isBlenderSame);
        System.out.println("____________________________________________________________________________________");

        Book book = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        System.out.println(book);
        System.out.println(book.hashCode());
        System.out.println("Original:" + System.identityHashCode(book));
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        boolean isBookSame = book.equals(book2);
        System.out.println("Comparing 1 properties are same: " + isBookSame);
        System.out.println("____________________________________________________________________________________");

        BreadMaker breadMaker = new BreadMaker("Panasonic", "White", 2);
        System.out.println(breadMaker);
        System.out.println(breadMaker.hashCode());
        System.out.println("Original:" + System.identityHashCode(breadMaker));
        BreadMaker breadMaker2 = new BreadMaker("Panasonic", "White", 2);
        boolean isBreadSame = breadMaker.equals(breadMaker2);
        System.out.println("Comparing 1 properties are same: " + isBreadSame);
        System.out.println("____________________________________________________________________________________");

        Car car = new Car("Toyota", "Camry", 2022);
        System.out.println(car);
        System.out.println(car.hashCode());
        System.out.println("Original:" + System.identityHashCode(car));
        Car car2 = new Car("Toyota", "Camry", 2022);
        boolean isCarSame = car.equals(car2);
        System.out.println("Comparing 1 properties are same: " + isCarSame);
        System.out.println("____________________________________________________________________________________");

        CeilingFan Cfan = new CeilingFan("Havells", "Brown", 48);
        System.out.println(Cfan);
        System.out.println(Cfan.hashCode());
        System.out.println("Original:" + System.identityHashCode(Cfan));
        CeilingFan Cfan2 = new CeilingFan("Havells", "Brown", 48);
        boolean isCFanSame = Cfan.equals(Cfan2);
        System.out.println("Comparing 1 properties are same: " + isCFanSame);
        System.out.println("____________________________________________________________________________________");

        Chainsaw chainsaw = new Chainsaw("Stihl", "MS 250", 18);
        System.out.println(chainsaw);
        System.out.println(chainsaw.hashCode());
        System.out.println("Original:" + System.identityHashCode(chainsaw));
        Chainsaw chainsaw2 = new Chainsaw("Stihl", "MS 250", 18);
        boolean isChainsawSame = chainsaw.equals(chainsaw2);
        System.out.println("Comparing 1 properties are same: " + isChainsawSame);
        System.out.println("____________________________________________________________________________________");

        Chair chair = new Chair("Wood", "Black", 3.5);
        System.out.println(chair);
        System.out.println(chair.hashCode());
        System.out.println("Original:" + System.identityHashCode(chair));
        Chair chair2 = new Chair("Wood", "Black", 3.5);
        boolean isChairSame = chair.equals(chair2);
        System.out.println("Comparing 1 properties are same: " + isChairSame);
        System.out.println("____________________________________________________________________________________");

        Clock clock = new Clock("Casio", "Wall", true);
        System.out.println(clock);
        System.out.println(clock.hashCode());
        System.out.println("Original:" + System.identityHashCode(clock));
        Clock clock2 = new Clock("Casio", "Wall", true);
        boolean isClockSame = clock.equals(clock2);
        System.out.println("Comparing 1 properties are same: " + isClockSame);
        System.out.println("____________________________________________________________________________________");

        CoffeeGrinder grinder = new CoffeeGrinder("Breville", "Burr", 60);
        System.out.println(grinder);
        System.out.println(grinder.hashCode());
        System.out.println("Original:" + System.identityHashCode(grinder));
        CoffeeGrinder grinder2 = new CoffeeGrinder("Breville", "Burr", 60);
        boolean isGrinderSame = grinder.equals(grinder2);
        System.out.println("Comparing 1 properties are same: " + isGrinderSame);
        System.out.println("____________________________________________________________________________________");

        CoffeeMaker coffeeMaker = new CoffeeMaker("Keurig", "K-Elite", 12);
        System.out.println(coffeeMaker);
        System.out.println(coffeeMaker.hashCode());
        System.out.println("Original:" + System.identityHashCode(coffeeMaker));
        CoffeeMaker coffeeMaker2 = new CoffeeMaker("Keurig", "K-Elite", 12);
        boolean isCoffeeMakerSame = coffeeMaker.equals(coffeeMaker2);
        System.out.println("Comparing 1 properties are same: " + isCoffeeMakerSame);
        System.out.println("____________________________________________________________________________________");

        DeepFryer Dfry = new DeepFryer("T-fal", "Silver", 3);
        System.out.println(Dfry);
        System.out.println(Dfry.hashCode());
        System.out.println("Original:" + System.identityHashCode(Dfry));
        DeepFryer Dfry2 = new DeepFryer("T-fal", "Silver", 3);
        boolean isDfrySame = Dfry.equals(Dfry2);
        System.out.println("Comparing 1 properties are same: " + isDfrySame);
        System.out.println("____________________________________________________________________________________");

        Dehumidifier dehumidifier = new Dehumidifier("Frigidaire", "FFAD5033W1", 50);
        System.out.println(dehumidifier);
        System.out.println(dehumidifier.hashCode());
        System.out.println("Original:" + System.identityHashCode(dehumidifier));
        Dehumidifier dehumidifier2 = new Dehumidifier("Frigidaire", "FFAD5033W1", 50);
        boolean isDehumidifierSame = dehumidifier.equals(dehumidifier2);
        System.out.println("Comparing 1 properties are same: " + isDehumidifierSame);
        System.out.println("____________________________________________________________________________________");

        Dehydrator dehydrator = new Dehydrator("Excalibur", "Electric", 9);
        System.out.println(dehydrator);
        System.out.println(dehydrator.hashCode());
        System.out.println("Original:" + System.identityHashCode(dehydrator));
        Dehydrator dehydrator2 = new Dehydrator("Excalibur", "Electric", 9);
        boolean isdehydratorSame = dehydrator.equals(dehydrator2);
        System.out.println("Comparing 1 properties are same: " + isdehydratorSame);
        System.out.println("____________________________________________________________________________________");

        Dishwasher dishwasher = new Dishwasher("Bosch", "Stainless Steel", 14);
        System.out.println(dishwasher);
        System.out.println(dishwasher.hashCode());
        System.out.println("Original:" + System.identityHashCode(dishwasher));
        Dishwasher dishwasher2 = new Dishwasher("osch", "Stainless Steel", 14);
        boolean isDishwasherSame = dishwasher.equals(dishwasher2);
        System.out.println("Comparing 1 properties are same: " + isDishwasherSame);
        System.out.println("____________________________________________________________________________________");

        DoorLock doorLock = new DoorLock("Yale", "Smart", 9);
        System.out.println(doorLock);
        System.out.println(doorLock.hashCode());
        System.out.println("Original:" + System.identityHashCode(doorLock));
        DoorLock doorLock2 = new DoorLock("ale", "Smart", 9);
        boolean isDoorLockSame = doorLock.equals(doorLock2);
        System.out.println("Comparing 1 properties are same: " + isDoorLockSame);
        System.out.println("____________________________________________________________________________________");

        ElectricGrill grill = new ElectricGrill("George Foreman", "GRP1060B", 1500);
        System.out.println(grill);
        System.out.println(grill.hashCode());
        System.out.println("Original:" + System.identityHashCode(grill));
        ElectricGrill grill2 = new ElectricGrill("Foreman", "GRP1060B", 1500);
        boolean isGrillSame = grill.equals(grill2);
        System.out.println("Comparing 1 properties are same: " + isGrillSame);
        System.out.println("____________________________________________________________________________________");

        ElectricKettle Ekettle = new ElectricKettle("Hamilton Beach", "Stainless Steel", 1);
        System.out.println(Ekettle);
        System.out.println(Ekettle.hashCode());
        System.out.println("Original:" + System.identityHashCode(Ekettle));
        ElectricKettle Ekettle2 = new ElectricKettle("milton Beach", "Stainless Steel", 1);
        boolean isEkettleSame = Ekettle.equals(Ekettle2);
        System.out.println("Comparing 1 properties are same: " + isEkettleSame);
        System.out.println("____________________________________________________________________________________");

        ElectricSkillet skillet = new ElectricSkillet("Presto", "Black", 400);
        System.out.println(skillet);
        System.out.println(skillet.hashCode());
        System.out.println("Original:" + System.identityHashCode(skillet));
        ElectricSkillet skillet2 = new ElectricSkillet("resto", "Black", 400);
        boolean isSkilletSame = skillet.equals(skillet2);
        System.out.println("Comparing 1 properties are same: " + isSkilletSame);
        System.out.println("____________________________________________________________________________________");

        Elias elias = new Elias("Red", 28, 5.9);
        System.out.println(elias);
        System.out.println(elias.hashCode());
        System.out.println("Original:" + System.identityHashCode(elias));
        Elias elias2 = new Elias("bed", 28, 5.9);
        boolean isEliasSame = elias.equals(elias2);
        System.out.println("Comparing 1 properties are same: " + isEliasSame);
        System.out.println("____________________________________________________________________________________");

        EllipticalTrainer trainer = new EllipticalTrainer("NordicTrack", "Commercial 14.9", 20);
        System.out.println(trainer);
        System.out.println(trainer.hashCode());
        System.out.println("Original:" + System.identityHashCode(trainer));
        EllipticalTrainer trainer2 = new EllipticalTrainer("rdicTrack", "Commercial 14.9", 20);
        boolean isTrainerSame = trainer.equals(trainer2);
        System.out.println("Comparing 1 properties are same: " + isTrainerSame);
        System.out.println("____________________________________________________________________________________");

        Employee employee = new Employee("Jordan Smith", 101, 75000.00);
        System.out.println(employee);
        System.out.println(employee.hashCode());
        System.out.println("Original:" + System.identityHashCode(employee));
        Employee employee2 = new Employee("Ordan Smith", 101, 75000.00);
        boolean isEmployeeSame = employee.equals(employee2);
        System.out.println("Comparing 1 properties are same: " + isEmployeeSame);
        System.out.println("____________________________________________________________________________________");

        ExerciseBike bike = new ExerciseBike("Peloton", "Upright", 32);
        System.out.println(bike);
        System.out.println(bike.hashCode());
        System.out.println("Original:" + System.identityHashCode(bike));
        ExerciseBike bike2 = new ExerciseBike("eloton", "Upright", 32);
        boolean isBikeSame = bike.equals(bike2);
        System.out.println("Comparing 1 properties are same: " + isBikeSame);
        System.out.println("____________________________________________________________________________________");

        ExternalHardDrive hardDrive = new ExternalHardDrive("Seagate", "Portable", 2000);
        System.out.println(hardDrive);
        System.out.println(hardDrive.hashCode());
        System.out.println("Original:"+System.identityHashCode(hardDrive));
        ExternalHardDrive hardDrive2 = new ExternalHardDrive("Seagate", "Portable", 2000);
        boolean isHardDriveSame = hardDrive.equals(hardDrive2);
        System.out.println("Comparing 2 properties are same:"+isHardDriveSame);
        System.out.println("____________________________________________________________________________________");

        Fan fan1 = new Fan("Orient", "Pedestal", 3);
        System.out.println(fan1);
        System.out.println(fan1.hashCode());
        System.out.println("Original:"+System.identityHashCode(fan1));
        Fan fan2 = new Fan("Orient", "Pedestal", 3);
        boolean isFanSame = fan1.equals(fan2);
        System.out.println("Comparing 2 properties are same:"+isFanSame);
        System.out.println("____________________________________________________________________________________");

        FlashDrive flashDrive1 = new FlashDrive("SanDisk", "USB 3.0", 128);
        System.out.println(flashDrive1);
        System.out.println(flashDrive1.hashCode());
        System.out.println("Original:"+System.identityHashCode(flashDrive1));
        FlashDrive flashDrive2 = new FlashDrive("SanDisk", "USB 3.0", 128);
        boolean isFlashDriveSame = flashDrive1.equals(flashDrive2);
        System.out.println("Comparing 2 properties are same:"+isFlashDriveSame);
        System.out.println("____________________________________________________________________________________");

        Freezer freezer1 = new Freezer("Whirlpool", "Chest", 350);
        System.out.println(freezer1);
        System.out.println(freezer1.hashCode());
        System.out.println("Original:"+System.identityHashCode(freezer1));
        Freezer freezer2 = new Freezer("Whirlpool", "Chest", 350);
        boolean isFreezerSame = freezer1.equals(freezer2);
        System.out.println("Comparing 2 properties are same:"+isFreezerSame);
        System.out.println("____________________________________________________________________________________");

        GameConsole console1 = new GameConsole("Sony", "PlayStation 5", 825);
        System.out.println(console1);
        System.out.println(console1.hashCode());
        System.out.println("Original:"+System.identityHashCode(console1));
        GameConsole console2 = new GameConsole("Sony", "PlayStation 5", 825);
        boolean isConsoleSame = console1.equals(console2);
        System.out.println("Comparing 2 properties are same:"+isConsoleSame);
        System.out.println("____________________________________________________________________________________");

        Generator generator1 = new Generator("Honda", "Gasoline", 2200);
        System.out.println(generator1);
        System.out.println(generator1.hashCode());
        System.out.println("Original:"+System.identityHashCode(generator1));
        Generator generator2 = new Generator("Honda", "Gasoline", 2200);
        boolean isGeneratorSame = generator1.equals(generator2);
        System.out.println("Comparing 2 properties are same:"+isGeneratorSame);
        System.out.println("____________________________________________________________________________________");

        GPSDevice gps1 = new GPSDevice("Garmin", "2024.1", 12);
        System.out.println(gps1);
        System.out.println(gps1.hashCode());
        System.out.println("Original:"+System.identityHashCode(gps1));
        GPSDevice gps2 = new GPSDevice("Garmin", "2024.1", 12);
        boolean isGpsSame = gps1.equals(gps2);
        System.out.println("Comparing 2 properties are same:"+isGpsSame);
        System.out.println("____________________________________________________________________________________");

        HairDryer hairDryer1 = new HairDryer("Dyson", "Fuchsia", 3);
        System.out.println(hairDryer1);
        System.out.println(hairDryer1.hashCode());
        System.out.println("Original:"+System.identityHashCode(hairDryer1));
        HairDryer hairDryer2 = new HairDryer("Dyson", "Fuchsia", 3);
        boolean isHairDryerSame = hairDryer1.equals(hairDryer2);
        System.out.println("Comparing 2 properties are same:"+isHairDryerSame);
        System.out.println("____________________________________________________________________________________");

        Heater heater1 = new Heater("Lasko", "Ceramic", 1500);
        System.out.println(heater1);
        System.out.println(heater1.hashCode());
        System.out.println("Original:"+System.identityHashCode(heater1));
        Heater heater2 = new Heater("Lasko", "Ceramic", 1500);
        boolean isHeaterSame = heater1.equals(heater2);
        System.out.println("Comparing 2 properties are same:"+isHeaterSame);
        System.out.println("____________________________________________________________________________________");

        Humidifier humidifier1 = new Humidifier("Philips", "Cool Mist", 6);
        System.out.println(humidifier1);
        System.out.println(humidifier1.hashCode());
        System.out.println("Original:"+System.identityHashCode(humidifier1));
        Humidifier humidifier2 = new Humidifier("Philips", "Cool Mist", 6);
        boolean isHumidifierSame = humidifier1.equals(humidifier2);
        System.out.println("Comparing 2 properties are same:"+isHumidifierSame);
        System.out.println("____________________________________________________________________________________");

        IceCreamMaker iceCreamMaker1 = new IceCreamMaker("Cuisinart", "Electric", 2);
        System.out.println(iceCreamMaker1);
        System.out.println(iceCreamMaker1.hashCode());
        System.out.println("Original:"+System.identityHashCode(iceCreamMaker1));
        IceCreamMaker iceCreamMaker2 = new IceCreamMaker("Cuisinart", "Electric", 2);
        boolean isIceCreamMakerSame = iceCreamMaker1.equals(iceCreamMaker2);
        System.out.println("Comparing 2 properties are same:"+isIceCreamMakerSame);
        System.out.println("____________________________________________________________________________________");

        IceMaker iceMaker1 = new IceMaker("GE", "Opal 2.0", 24);
        System.out.println(iceMaker1);
        System.out.println(iceMaker1.hashCode());
        System.out.println("Original:"+System.identityHashCode(iceMaker1));
        IceMaker iceMaker2 = new IceMaker("GE", "Opal 2.0", 24);
        boolean isIceMakerSame = iceMaker1.equals(iceMaker2);
        System.out.println("Comparing 2 properties are same:"+isIceMakerSame);
        System.out.println("____________________________________________________________________________________");

        Iron iron1 = new Iron("Philips", "Steam", 2400);
        System.out.println(iron1);
        System.out.println(iron1.hashCode());
        System.out.println("Original:"+System.identityHashCode(iron1));
        Iron iron2 = new Iron("Philips", "Steam", 2400);
        boolean isIronSame = iron1.equals(iron2);
        System.out.println("Comparing 2 properties are same:"+isIronSame);
        System.out.println("____________________________________________________________________________________");

        Isla isla1 = new Isla("Lavender", 7, 1.22);
        System.out.println(isla1);
        System.out.println(isla1.hashCode());
        System.out.println("Original:"+System.identityHashCode(isla1));
        Isla isla2 = new Isla("Lavender", 7, 1.22);
        boolean isIslaSame = isla1.equals(isla2);
        System.out.println("Comparing 2 properties are same:"+isIslaSame);
        System.out.println("____________________________________________________________________________________");

        Jasper jasper1 = new Jasper("Forest Green", 10, 1.35);
        System.out.println(jasper1);
        System.out.println(jasper1.hashCode());
        System.out.println("Original:"+System.identityHashCode(jasper1));
        Jasper jasper2 = new Jasper("Forest Green", 10, 1.35);
        boolean isJasperSame = jasper1.equals(jasper2);
        System.out.println("Comparing 2 properties are same:"+isJasperSame);
        System.out.println("____________________________________________________________________________________");

        Juicer juicer1 = new Juicer("Breville", "Centrifugal", 850);
        System.out.println(juicer1);
        System.out.println(juicer1.hashCode());
        System.out.println("Original:"+System.identityHashCode(juicer1));
        Juicer juicer2 = new Juicer("Breville", "Centrifugal", 850);
        boolean isJuicerSame = juicer1.equals(juicer2);
        System.out.println("Comparing 2 properties are same:"+isJuicerSame);
        System.out.println("____________________________________________________________________________________");

        Kettle kettle1 = new Kettle("Hamilton Beach", "Red", 1500);
        System.out.println(kettle1);
        System.out.println(kettle1.hashCode());
        System.out.println("Original:"+System.identityHashCode(kettle1));
        Kettle kettle2 = new Kettle("Hamilton Beach", "Red", 1500);
        boolean isKettleSame = kettle1.equals(kettle2);
        System.out.println("Comparing 2 properties are same:"+isKettleSame);
        System.out.println("____________________________________________________________________________________");

        Keyboard keyboard1 = new Keyboard("Logitech", "QWERTY", true);
        System.out.println(keyboard1);
        System.out.println(keyboard1.hashCode());
        System.out.println("Original:"+System.identityHashCode(keyboard1));
        Keyboard keyboard2 = new Keyboard("Logitech", "QWERTY", true);
        boolean isKeyboardSame = keyboard1.equals(keyboard2);
        System.out.println("Comparing 2 properties are same:"+isKeyboardSame);
        System.out.println("____________________________________________________________________________________");

        Laptop laptop1 = new Laptop("Intel Core i7", "Dell", 16);
        System.out.println(laptop1);
        System.out.println(laptop1.hashCode());
        System.out.println("Original:"+System.identityHashCode(laptop1));
        Laptop laptop2 = new Laptop("Intel Core i7", "Dell", 16);
        boolean isLaptopSame = laptop1.equals(laptop2);
        System.out.println("Comparing 2 properties are same:"+isLaptopSame);
        System.out.println("____________________________________________________________________________________");

        LawnMower lawnMower1 = new LawnMower("Honda", "Gas-Powered", 21);
        System.out.println(lawnMower1);
        System.out.println(lawnMower1.hashCode());
        System.out.println("Original:"+System.identityHashCode(lawnMower1));
        LawnMower lawnMower2 = new LawnMower("onda", "Gas-Powered", 21);
        boolean isLawnMowerSame = lawnMower1.equals(lawnMower2);
        System.out.println("Comparing 2 properties are same:"+isLawnMowerSame);
        System.out.println("____________________________________________________________________________________");

        LeafBlower leafBlower1 = new LeafBlower("DeWalt", "Cordless", 125);
        System.out.println(leafBlower1);
        System.out.println(leafBlower1.hashCode());
        System.out.println("Original:"+System.identityHashCode(leafBlower1));
        LeafBlower leafBlower2 = new LeafBlower("Walt", "Cordless", 125);
        boolean isLeafBlowerSame = leafBlower1.equals(leafBlower2);
        System.out.println("Comparing 2 properties are same:"+isLeafBlowerSame);
        System.out.println("____________________________________________________________________________________");

        Leo leo1 = new Leo("Sky Blue", 9, 1.28);
        System.out.println(leo1);
        System.out.println(leo1.hashCode());
        System.out.println("Original:"+System.identityHashCode(leo1));
        Leo leo2 = new Leo("Blue", 9, 1.28);
        boolean isLeoSame = leo1.equals(leo2);
        System.out.println("Comparing 2 properties are same:"+isLeoSame);
        System.out.println("____________________________________________________________________________________");

        LightBulb lightBulb1 = new LightBulb("Philips", "Warm White", 60);
        System.out.println(lightBulb1);
        System.out.println(lightBulb1.hashCode());
        System.out.println("Original:"+System.identityHashCode(lightBulb1));
        LightBulb lightBulb2 = new LightBulb("hilips", "Warm White", 60);
        boolean isLightBulbSame = lightBulb1.equals(lightBulb2);
        System.out.println("Comparing 2 properties are same:"+isLightBulbSame);
        System.out.println("____________________________________________________________________________________");

        Maya maya1 = new Maya("Turquoise", 8, 1.25);
        System.out.println(maya1);
        System.out.println(maya1.hashCode());
        System.out.println("Original:"+System.identityHashCode(maya1));
        Maya maya2 = new Maya("urquoise", 8, 1.25);
        boolean isMayaSame = maya1.equals(maya2);
        System.out.println("Comparing 2 properties are same:"+isMayaSame);
        System.out.println("____________________________________________________________________________________");

        Microwave microwave1 = new Microwave("Panasonic", "Black", 1000);
        System.out.println(microwave1);
        System.out.println(microwave1.hashCode());
        System.out.println("Original:"+System.identityHashCode(microwave1));
        Microwave microwave2 = new Microwave("nasonic", "Black", 1000);
        boolean isMicrowaveSame = microwave1.equals(microwave2);
        System.out.println("Comparing 2 properties are same:"+isMicrowaveSame);
        System.out.println("____________________________________________________________________________________");

        Mixer mixer1 = new Mixer("KitchenAid", "Artisan", 10);
        System.out.println(mixer1);
        System.out.println(mixer1.hashCode());
        System.out.println("Original:"+System.identityHashCode(mixer1));
        Mixer mixer2 = new Mixer("tchenAid", "Artisan", 10);
        boolean isMixerSame = mixer1.equals(mixer2);
        System.out.println("Comparing 2 properties are same:"+isMixerSame);
        System.out.println("____________________________________________________________________________________");

        Monitor monitor1 = new Monitor("Dell", "1920x1080", 27);
        System.out.println(monitor1);
        System.out.println(monitor1.hashCode());
        System.out.println("Original:"+System.identityHashCode(monitor1));
        Monitor monitor2 = new Monitor("ell", "1920x1080", 27);
        boolean isMonitorSame = monitor1.equals(monitor2);
        System.out.println("Comparing 2 properties are same:"+isMonitorSame);
        System.out.println("____________________________________________________________________________________");

        Mouse mouse1 = new Mouse("Logitech", "Wireless", 1600);
        System.out.println(mouse1);
        System.out.println(mouse1.hashCode());
        System.out.println("Original:"+System.identityHashCode(mouse1));
        Mouse mouse2 = new Mouse("ogitech", "Wireless", 1600);
        boolean isMouseSame = mouse1.equals(mouse2);
        System.out.println("Comparing 2 properties are same:"+isMouseSame);
        System.out.println("____________________________________________________________________________________");

        Nora nora1 = new Nora("Peach", 6, 1.18);
        System.out.println(nora1);
        System.out.println(nora1.hashCode());
        System.out.println("Original:"+System.identityHashCode(nora1));
        Nora nora2 = new Nora("Peach", 6, 1.18);
        boolean isNoraSame = nora1.equals(nora2);
        System.out.println("Comparing 3 properties are same:"+isNoraSame);
        System.out.println("____________________________________________________________________________________");

        Oven oven1 = new Oven("Whirlpool", "Convection", 2000);
        System.out.println(oven1);
        System.out.println(oven1.hashCode());
        System.out.println("Original:"+System.identityHashCode(oven1));
        Oven oven2 = new Oven("Whirlpool", "Convection", 2000);
        boolean isOvenSame = oven1.equals(oven2);
        System.out.println("Comparing 3 properties are same:"+isOvenSame);
        System.out.println("____________________________________________________________________________________");

        Phone phone1 = new Phone("Samsung", "Galaxy S24", 999.99);
        System.out.println(phone1);
        System.out.println(phone1.hashCode());
        System.out.println("Original:"+System.identityHashCode(phone1));
        Phone phone2 = new Phone("Samsung", "Galaxy S24", 999.99);
        boolean isPhoneSame = phone1.equals(phone2);
        System.out.println("Comparing 3 properties are same:"+isPhoneSame);
        System.out.println("____________________________________________________________________________________");

        PopcornMaker popcornMaker1 = new PopcornMaker("Presto", "Hot Air", 4);
        System.out.println(popcornMaker1);
        System.out.println(popcornMaker1.hashCode());
        System.out.println("Original:"+System.identityHashCode(popcornMaker1));
        PopcornMaker popcornMaker2 = new PopcornMaker("Presto", "Hot Air", 4);
        boolean isPopcornMakerSame = popcornMaker1.equals(popcornMaker2);
        System.out.println("Comparing 3 properties are same:"+isPopcornMakerSame);
        System.out.println("____________________________________________________________________________________");

        PressureCooker pressureCooker1 = new PressureCooker("Instant Pot", "Silver", 15);
        System.out.println(pressureCooker1);
        System.out.println(pressureCooker1.hashCode());
        System.out.println("Original:"+System.identityHashCode(pressureCooker1));
        PressureCooker pressureCooker2 = new PressureCooker("Instant Pot", "Silver", 15);
        boolean isPressureCookerSame = pressureCooker1.equals(pressureCooker2);
        System.out.println("Comparing 3 properties are same:"+isPressureCookerSame);
        System.out.println("____________________________________________________________________________________");

        Projector projector1 = new Projector("Epson", "1080p", 3200);
        System.out.println(projector1);
        System.out.println(projector1.hashCode());
        System.out.println("Original:"+System.identityHashCode(projector1));
        Projector projector2 = new Projector("Epson", "1080p", 3200);
        boolean isProjectorSame = projector1.equals(projector2);
        System.out.println("Comparing 3 properties are same:"+isProjectorSame);
        System.out.println("____________________________________________________________________________________");

        Refrigerator refrigerator1 = new Refrigerator("LG", "French Door", 600);
        System.out.println(refrigerator1);
        System.out.println(refrigerator1.hashCode());
        System.out.println("Original:"+System.identityHashCode(refrigerator1));
        Refrigerator refrigerator2 = new Refrigerator("LG", "French Door", 600);
        boolean isRefrigeratorSame = refrigerator1.equals(refrigerator2);
        System.out.println("Comparing 3 properties are same:"+isRefrigeratorSame);
        System.out.println("____________________________________________________________________________________");

        RiceCooker riceCooker1 = new RiceCooker("Zojirushi", "Micom", 5);
        System.out.println(riceCooker1);
        System.out.println(riceCooker1.hashCode());
        System.out.println("Original:"+System.identityHashCode(riceCooker1));
        RiceCooker riceCooker2 = new RiceCooker("Zojirushi", "Micom", 5);
        boolean isRiceCookerSame = riceCooker1.equals(riceCooker2);
        System.out.println("Comparing 3 properties are same:"+isRiceCookerSame);
        System.out.println("____________________________________________________________________________________");

        Router router1 = new Router("Netgear", "Dual-Band", 4);
        System.out.println(router1);
        System.out.println(router1.hashCode());
        System.out.println("Original:"+System.identityHashCode(router1));
        Router router2 = new Router("Netgear", "Dual-Band", 4);
        boolean isRouterSame = router1.equals(router2);
        System.out.println("Comparing 3 properties are same:"+isRouterSame);
        System.out.println("____________________________________________________________________________________");

        Rowan rowan1 = new Rowan("Emerald Green", 11, 1.42);
        System.out.println(rowan1);
        System.out.println(rowan1.hashCode());
        System.out.println("Original:"+System.identityHashCode(rowan1));
        Rowan rowan2 = new Rowan("Emerald Green", 11, 1.42);
        boolean isRowanSame = rowan1.equals(rowan2);
        System.out.println("Comparing 3 properties are same:"+isRowanSame);
        System.out.println("____________________________________________________________________________________");

        SewingMachine sewingMachine1 = new SewingMachine("Singer", "Heavy Duty 4452", 10);
        System.out.println(sewingMachine1);
        System.out.println(sewingMachine1.hashCode());
        System.out.println("Original:"+System.identityHashCode(sewingMachine1));
        SewingMachine sewingMachine2 = new SewingMachine("Singer", "Heavy Duty 4452", 10);
        boolean isSewingMachineSame = sewingMachine1.equals(sewingMachine2);
        System.out.println("Comparing 3 properties are same:"+isSewingMachineSame);
        System.out.println("____________________________________________________________________________________");

        Scanner scanner1 = new Scanner("Canon", "Flatbed", 1200);
        System.out.println(scanner1);
        System.out.println(scanner1.hashCode());
        System.out.println("Original:"+System.identityHashCode(scanner1));
        Scanner scanner2 = new Scanner("Canon", "Flatbed", 1200);
        boolean isScannerSame = scanner1.equals(scanner2);
        System.out.println("Comparing 3 properties are same:"+isScannerSame);
        System.out.println("____________________________________________________________________________________");

        SecurityCamera securityCamera1 = new SecurityCamera("Arlo", "4K", 160);
        System.out.println(securityCamera1);
        System.out.println(securityCamera1.hashCode());
        System.out.println("Original:"+System.identityHashCode(securityCamera1));
        SecurityCamera securityCamera2 = new SecurityCamera("Arlo", "4K", 160);
        boolean isSecurityCameraSame = securityCamera1.equals(securityCamera2);
        System.out.println("Comparing 3 properties are same:"+isSecurityCameraSame);
        System.out.println("____________________________________________________________________________________");

        RowingMachine rowingMachine1 = new RowingMachine("Concept2", "Model D", 500);
        System.out.println(rowingMachine1);
        System.out.println(rowingMachine1.hashCode());
        System.out.println("Original:"+System.identityHashCode(rowingMachine1));
        RowingMachine rowingMachine2 = new RowingMachine("Concept2", "Model D", 500);
        boolean isRowingMachineSame = rowingMachine1.equals(rowingMachine2);
        System.out.println("Comparing 3 properties are same:"+isRowingMachineSame);
        System.out.println("____________________________________________________________________________________");

        Silas silas1 = new Silas("Midnight Blue", 10, 1.35);
        System.out.println(silas1);
        System.out.println(silas1.hashCode());
        System.out.println("Original:"+System.identityHashCode(silas1));
        Silas silas2 = new Silas("Midnight Blue", 10, 1.35);
        boolean isSilasSame = silas1.equals(silas2);
        System.out.println("Comparing 3 properties are same:"+isSilasSame);
        System.out.println("____________________________________________________________________________________");

        SlowCooker slowCooker1 = new SlowCooker("Crock-Pot", "Oval", 6);
        System.out.println(slowCooker1);
        System.out.println(slowCooker1.hashCode());
        System.out.println("Original:"+System.identityHashCode(slowCooker1));
        SlowCooker slowCooker2 = new SlowCooker("Crock-Pot", "Oval", 6);
        boolean isSlowCookerSame = slowCooker1.equals(slowCooker2);
        System.out.println("Comparing 3 properties are same:"+isSlowCookerSame);
        System.out.println("____________________________________________________________________________________");

        SmartLight smartLight1 = new SmartLight("Philips Hue", "Warm White", 800);
        System.out.println(smartLight1);
        System.out.println(smartLight1.hashCode());
        System.out.println("Original:"+System.identityHashCode(smartLight1));
        SmartLight smartLight2 = new SmartLight("Philips Hue", "Warm White", 800);
        boolean isSmartLightSame = smartLight1.equals(smartLight2);
        System.out.println("Comparing 3 properties are same:"+isSmartLightSame);
        System.out.println("____________________________________________________________________________________");

        Smartphone smartphone1 = new Smartphone("Apple", "iOS", 128);
        System.out.println(smartphone1);
        System.out.println(smartphone1.hashCode());
        System.out.println("Original:"+System.identityHashCode(smartphone1));
        Smartphone smartphone2 = new Smartphone("Apple", "iOS", 128);
        boolean isSmartphoneSame = smartphone1.equals(smartphone2);
        System.out.println("Comparing 3 properties are same:"+isSmartphoneSame);
        System.out.println("____________________________________________________________________________________");

        SmartPlug smartPlug1 = new SmartPlug("TP-Link", "Wi-Fi", 120);
        System.out.println(smartPlug1);
        System.out.println(smartPlug1.hashCode());
        System.out.println("Original:"+System.identityHashCode(smartPlug1));
        SmartPlug smartPlug2 = new SmartPlug("TP-Link", "Wi-Fi", 120);
        boolean isSmartPlugSame = smartPlug1.equals(smartPlug2);
        System.out.println("Comparing 3 properties are same:"+isSmartPlugSame);
        System.out.println("____________________________________________________________________________________");

        SmartWatch smartWatch1 = new SmartWatch("Samsung", "Tizen OS", 48);
        System.out.println(smartWatch1);
        System.out.println(smartWatch1.hashCode());
        System.out.println("Original:"+System.identityHashCode(smartWatch1));
        SmartWatch smartWatch2 = new SmartWatch("Samsung", "Tizen OS", 48);
        boolean isSmartWatchSame = smartWatch1.equals(smartWatch2);
        System.out.println("Comparing 3 properties are same:"+isSmartWatchSame);
        System.out.println("____________________________________________________________________________________");

        SmokeDetector smokeDetector1 = new SmokeDetector("Nest", "Ionization", 7);
        System.out.println(smokeDetector1);
        System.out.println(smokeDetector1.hashCode());
        System.out.println("Original:"+System.identityHashCode(smokeDetector1));
        SmokeDetector smokeDetector2 = new SmokeDetector("est", "Ionization", 7);
        boolean isSmokeDetectorSame = smokeDetector1.equals(smokeDetector2);
        System.out.println("Comparing 3 properties are same:"+isSmokeDetectorSame);
        System.out.println("____________________________________________________________________________________");

        SnowBlower snowBlower1 = new SnowBlower("Toro", "Power Max 824 OE", 24);
        System.out.println(snowBlower1);
        System.out.println(snowBlower1.hashCode());
        System.out.println("Original:"+System.identityHashCode(snowBlower1));
        SnowBlower snowBlower2 = new SnowBlower("oro", "Power Max 824 OE", 24);
        boolean isSnowBlowerSame = snowBlower1.equals(snowBlower2);
        System.out.println("Comparing 3 properties are same:"+isSnowBlowerSame);
        System.out.println("____________________________________________________________________________________");

        SpaceHeater spaceHeater1 = new SpaceHeater("Dyson", "Ceramic", 1500);
        System.out.println(spaceHeater1);
        System.out.println(spaceHeater1.hashCode());
        System.out.println("Original:"+System.identityHashCode(spaceHeater1));
        SpaceHeater spaceHeater2 = new SpaceHeater("yson", "Ceramic", 1500);
        boolean isSpaceHeaterSame = spaceHeater1.equals(spaceHeater2);
        System.out.println("Comparing 3 properties are same:"+isSpaceHeaterSame);
        System.out.println("____________________________________________________________________________________");

        Speaker speaker1 = new Speaker("Bose", "Bluetooth", 100);
        System.out.println(speaker1);
        System.out.println(speaker1.hashCode());
        System.out.println("Original:"+System.identityHashCode(speaker1));
        Speaker speaker2 = new Speaker("ose", "Bluetooth", 100);
        boolean isSpeakerSame = speaker1.equals(speaker2);
        System.out.println("Comparing 3 properties are same:"+isSpeakerSame);
        System.out.println("____________________________________________________________________________________");

        StandMixer standMixer1 = new StandMixer("KitchenAid", "Red", 5);
        System.out.println(standMixer1);
        System.out.println(standMixer1.hashCode());
        System.out.println("Original:"+System.identityHashCode(standMixer1));
        StandMixer standMixer2 = new StandMixer("itchenAid", "Red", 5);
        boolean isStandMixerSame = standMixer1.equals(standMixer2);
        System.out.println("Comparing 3 properties are same:"+isStandMixerSame);
        System.out.println("____________________________________________________________________________________");

        Student student1 = new Student("John Doe", 101, 88.5);
        System.out.println(student1);
        System.out.println(student1.hashCode());
        System.out.println("Original:"+System.identityHashCode(student1));
        Student student2 = new Student("ohn Doe", 101, 88.5);
        boolean isStudentSame = student1.equals(student2);
        System.out.println("Comparing 3 properties are same:"+isStudentSame);
        System.out.println("____________________________________________________________________________________");

        Table table1 = new Table("Rectangle", "Wood", 1.8);
        System.out.println(table1);
        System.out.println(table1.hashCode());
        System.out.println("Original:"+System.identityHashCode(table1));
        Table table2 = new Table("ctangle", "Wood", 1.8);
        boolean isTableSame = table1.equals(table2);
        System.out.println("Comparing 3 properties are same:"+isTableSame);
        System.out.println("____________________________________________________________________________________");

        Tablet tablet1 = new Tablet("Apple", "iPadOS", 10);
        System.out.println(tablet1);
        System.out.println(tablet1.hashCode());
        System.out.println("Original:"+System.identityHashCode(tablet1));
        Tablet tablet2 = new Tablet("pple", "iPadOS", 10);
        boolean isTabletSame = tablet1.equals(tablet2);
        System.out.println("Comparing 3 properties are same:"+isTabletSame);
        System.out.println("____________________________________________________________________________________");

        Television television1 = new Television("Samsung", "4K", 55);
        System.out.println(television1);
        System.out.println(television1.hashCode());
        System.out.println("Original:"+System.identityHashCode(television1));
        Television television2 = new Television("amsung", "4K", 55);
        boolean isTelevisionSame = television1.equals(television2);
        System.out.println("Comparing 3 properties are same:"+isTelevisionSame);
        System.out.println("____________________________________________________________________________________");

        Thermostat thermostat1 = new Thermostat("Nest", "Cooling", 72);
        System.out.println(thermostat1);
        System.out.println(thermostat1.hashCode());
        System.out.println("Original:"+System.identityHashCode(thermostat1));
        Thermostat thermostat2 = new Thermostat("est", "Cooling", 72);
        boolean isThermostatSame = thermostat1.equals(thermostat2);
        System.out.println("Comparing 3 properties are same:"+isThermostatSame);
        System.out.println("____________________________________________________________________________________");

        ToasterOven toasterOven1 = new ToasterOven("Breville", "Convection", 500);
        System.out.println(toasterOven1);
        System.out.println(toasterOven1.hashCode());
        System.out.println("Original:"+System.identityHashCode(toasterOven1));
        ToasterOven toasterOven2 = new ToasterOven("reville", "Convection", 500);
        boolean isToasterOvenSame = toasterOven1.equals(toasterOven2);
        System.out.println("Comparing 3 properties are same:"+isToasterOvenSame);
        System.out.println("____________________________________________________________________________________");

        Treadmill treadmill1 = new Treadmill("NordicTrack", "Commercial 1750", 12);
        System.out.println(treadmill1);
        System.out.println(treadmill1.hashCode());
        System.out.println("Original:"+System.identityHashCode(treadmill1));
        Treadmill treadmill2 = new Treadmill("rdicTrack", "Commercial 1750", 12);
        boolean isTreadmillSame = treadmill1.equals(treadmill2);
        System.out.println("Comparing 3 properties are same:"+isTreadmillSame);
        System.out.println("____________________________________________________________________________________");

        VacuumCleaner vacuumCleaner1 = new VacuumCleaner("Dyson", "V11 Torque Drive", 185);
        System.out.println(vacuumCleaner1);
        System.out.println(vacuumCleaner1.hashCode());
        System.out.println("Original:"+System.identityHashCode(vacuumCleaner1));
        VacuumCleaner vacuumCleaner2 = new VacuumCleaner("yson", "V11 Torque Drive", 185);
        boolean isVacuumCleanerSame = vacuumCleaner1.equals(vacuumCleaner2);
        System.out.println("Comparing 3 properties are same:"+isVacuumCleanerSame);
        System.out.println("____________________________________________________________________________________");

        WashingMachine washingMachine1 = new WashingMachine("OLG", "TurboWash 360", 8.0);
        System.out.println(washingMachine1);
        System.out.println(washingMachine1.hashCode());
        System.out.println("Original:"+System.identityHashCode(washingMachine1));
        WashingMachine washingMachine2 = new WashingMachine("LG", "TurboWash 360", 8.0);
        boolean isWashingMachineSame = washingMachine1.equals(washingMachine2);
        System.out.println("Comparing 3 properties are same:"+isWashingMachineSame);
        System.out.println("____________________________________________________________________________________");

        WaterHeater waterHeater1 = new WaterHeater("Rheem", "Tankless", 15);
        System.out.println(waterHeater1);
        System.out.println(waterHeater1.hashCode());
        System.out.println("Original:"+System.identityHashCode(waterHeater1));
        WaterHeater waterHeater2 = new WaterHeater("heem", "Tankless", 15);
        boolean isWaterHeaterSame = waterHeater1.equals(waterHeater2);
        System.out.println("Comparing 3 properties are same:"+isWaterHeaterSame);
        System.out.println("____________________________________________________________________________________");

        WaterPurifier waterPurifier1 = new WaterPurifier("Brita", "Activated Carbon", 3);
        System.out.println(waterPurifier1);
        System.out.println(waterPurifier1.hashCode());
        System.out.println("Original:"+System.identityHashCode(waterPurifier1));
        WaterPurifier waterPurifier2 = new WaterPurifier("rita", "Activated Carbon", 3);
        boolean isWaterPurifierSame = waterPurifier1.equals(waterPurifier2);
        System.out.println("Comparing 3 properties are same:"+isWaterPurifierSame);
        System.out.println("____________________________________________________________________________________");

        Webcam webcam1 = new Webcam("Logitech", "1080p", true);
        System.out.println(webcam1);
        System.out.println(webcam1.hashCode());
        System.out.println("Original:"+System.identityHashCode(webcam1));
        Webcam webcam2 = new Webcam("Logitech", "1080p", true);
        boolean isWebcamSame = webcam1.equals(webcam2);
        System.out.println("Comparing 3 properties are same:"+isWebcamSame);
        Webcam webcam3 = new Webcam("Logitech", "1080p", true);
        boolean isWebcamDiff = webcam1.equals(webcam3);
        System.out.println("Comparing 3 properties are same:"+isWebcamDiff);
        System.out.println("____________________________________________________________________________________");

    }
}
