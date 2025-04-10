package com.xworkz.object.toString.runner;

import com.xworkz.object.toString.internal.*;

public class MainRunner {
    public static void main(String[] args) {

        Brother brother=new Brother("bro","da",21);
        System.out.println(brother);
        System.out.println(brother.hashCode());
        System.out.println("Original:"+System.identityHashCode(brother));
        System.out.println("____________________________________________________________________________________");

        Friend friend=new Friend("Kata appa","katta",100);
        System.out.println(friend);
        System.out.println(friend.hashCode());
        System.out.println("Original:"+System.identityHashCode(friend));
        System.out.println("____________________________________________________________________________________");

        Dad dad=new Dad("Venkatesh","D",50);
        System.out.println(dad);
        System.out.println(dad.hashCode());
        System.out.println("Original:"+System.identityHashCode(dad));
        System.out.println("____________________________________________________________________________________");

        Mom mom=new Mom("Padma","V",40);
        System.out.println(mom);
        System.out.println(mom.hashCode());
        System.out.println("Original:"+System.identityHashCode(mom));
        System.out.println("____________________________________________________________________________________");

        AirConditioner ac = new AirConditioner("Samsung", "Split", 18000);
        System.out.println(ac);
        System.out.println(ac.hashCode());
        System.out.println("Original:"+System.identityHashCode(ac));
        System.out.println("____________________________________________________________________________________");

        AirFryer fryer = new AirFryer("Philips", "Black", 5);
        System.out.println(fryer);
        System.out.println(fryer.hashCode());
        System.out.println("Original:"+System.identityHashCode(friend));
        System.out.println("____________________________________________________________________________________");

        AirPurifier purifier = new AirPurifier("Dyson", "Pure Cool Link", 400);
        System.out.println(purifier);
        System.out.println(purifier.hashCode());
        System.out.println("Original:"+System.identityHashCode(purifier));
        System.out.println("____________________________________________________________________________________");

        Aria aria = new Aria("Blue", 25, 5.6);
        System.out.println(aria);
        System.out.println(aria.hashCode());
        System.out.println("Original:"+System.identityHashCode(aria));
        System.out.println("____________________________________________________________________________________");

        Ava ava = new Ava("Green", 22, 5.4);
        System.out.println(ava);
        System.out.println(ava.hashCode());
        System.out.println("Original:"+System.identityHashCode(ava));
        System.out.println("____________________________________________________________________________________");

        BankAccount account = new BankAccount("1234567890", "Alice Johnson", 1500.75);
        System.out.println(account);
        System.out.println(account.hashCode());
        System.out.println("Original:"+System.identityHashCode(account));
        System.out.println("____________________________________________________________________________________");

        Blender blender = new Blender("NutriBullet", "Silver", 600);
        System.out.println(blender);
        System.out.println(blender.hashCode());
        System.out.println("Original:"+System.identityHashCode(blender));
        System.out.println("____________________________________________________________________________________");

        Book book = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        System.out.println(book);
        System.out.println(book.hashCode());
        System.out.println("Original:"+System.identityHashCode(book));
        System.out.println("____________________________________________________________________________________");

        BreadMaker breadMaker = new BreadMaker("Panasonic", "White", 2);
        System.out.println(breadMaker);
        System.out.println(breadMaker.hashCode());
        System.out.println("Original:"+System.identityHashCode(breadMaker));
        System.out.println("____________________________________________________________________________________");

        Car car = new Car("Toyota", "Camry", 2022);
        System.out.println(car);
        System.out.println(car.hashCode());
        System.out.println("Original:"+System.identityHashCode(car));
        System.out.println("____________________________________________________________________________________");

        CeilingFan fan = new CeilingFan("Havells", "Brown", 48);
        System.out.println(fan);
        System.out.println(fan.hashCode());
        System.out.println("Original:"+System.identityHashCode(fan));
        System.out.println("____________________________________________________________________________________");

        Chainsaw chainsaw = new Chainsaw("Stihl", "MS 250", 18);
        System.out.println(chainsaw);
        System.out.println(chainsaw.hashCode());
        System.out.println("Original:"+System.identityHashCode(chainsaw));
        System.out.println("____________________________________________________________________________________");

        Chair chair = new Chair("Wood", "Black", 3.5);
        System.out.println(chair);
        System.out.println(chair.hashCode());
        System.out.println("Original:"+System.identityHashCode(chair));
        System.out.println("____________________________________________________________________________________");

        Clock clock = new Clock("Casio", "Wall", true);
        System.out.println(clock);
        System.out.println("____________________________________________________________________________________");

        CoffeeGrinder grinder = new CoffeeGrinder("Breville", "Burr", 60);
        System.out.println(grinder);
        System.out.println(grinder.hashCode());
        System.out.println("Original:"+System.identityHashCode(grinder));
        System.out.println("____________________________________________________________________________________");

        CoffeeMaker coffeeMaker = new CoffeeMaker("Keurig", "K-Elite", 12);
        System.out.println(coffeeMaker);
        System.out.println(coffeeMaker.hashCode());
        System.out.println("Original:"+System.identityHashCode(coffeeMaker));
        System.out.println("____________________________________________________________________________________");

        DeepFryer fry = new DeepFryer("T-fal", "Silver", 3);
        System.out.println(fry);
        System.out.println(fry.hashCode());
        System.out.println("Original:"+System.identityHashCode(fry));
        System.out.println("____________________________________________________________________________________");

        Dehumidifier dehumidifier = new Dehumidifier("Frigidaire", "FFAD5033W1", 50);
        System.out.println(dehumidifier);
        System.out.println(dehumidifier.hashCode());
        System.out.println("Original:"+System.identityHashCode(dehumidifier));
        System.out.println("____________________________________________________________________________________");

        Dishwasher dishwasher = new Dishwasher("Bosch", "Stainless Steel", 14);
        System.out.println(dishwasher);
        System.out.println(dishwasher.hashCode());
        System.out.println("Original:"+System.identityHashCode(dishwasher));
        System.out.println("____________________________________________________________________________________");

        DoorLock doorLock = new DoorLock("Yale", "Smart", 9);
        System.out.println(doorLock);
        System.out.println(doorLock.hashCode());
        System.out.println("Original:"+System.identityHashCode(doorLock));
        System.out.println("____________________________________________________________________________________");

        ElectricGrill grill = new ElectricGrill("George Foreman", "GRP1060B", 1500);
        System.out.println(grill);
        System.out.println(grill.hashCode());
        System.out.println("Original:"+System.identityHashCode(grill));
        System.out.println("____________________________________________________________________________________");

        ElectricKettle Ekettle = new ElectricKettle("Hamilton Beach", "Stainless Steel", 1);
        System.out.println(Ekettle);
        System.out.println(Ekettle.hashCode());
        System.out.println("Original:"+System.identityHashCode(Ekettle));
        System.out.println("____________________________________________________________________________________");

        ElectricSkillet skillet = new ElectricSkillet("Presto", "Black", 400);
        System.out.println(skillet);
        System.out.println(skillet.hashCode());
        System.out.println("Original:"+System.identityHashCode(skillet));
        System.out.println("____________________________________________________________________________________");

        Elias elias = new Elias("Red", 28, 5.9);
        System.out.println(elias);
        System.out.println(elias.hashCode());
        System.out.println("Original:"+System.identityHashCode(elias));
        System.out.println("____________________________________________________________________________________");

        EllipticalTrainer trainer = new EllipticalTrainer("NordicTrack", "Commercial 14.9", 20);
        System.out.println(trainer);
        System.out.println(trainer.hashCode());
        System.out.println("Original:"+System.identityHashCode(trainer));
        System.out.println("____________________________________________________________________________________");

        Employee employee = new Employee("Jordan Smith", 101, 75000.00);
        System.out.println(employee);
        System.out.println(employee.hashCode());
        System.out.println("Original:"+System.identityHashCode(employee));
        System.out.println("____________________________________________________________________________________");

        ExerciseBike bike = new ExerciseBike("Peloton", "Upright", 32);
        System.out.println(bike);
        System.out.println(bike.hashCode());
        System.out.println("Original:"+System.identityHashCode(bike));
        System.out.println("____________________________________________________________________________________");

        ExternalHardDrive hardDrive = new ExternalHardDrive("Seagate", "Portable", 2000);
        System.out.println(hardDrive);
        System.out.println(hardDrive.hashCode());
        System.out.println("Original:"+System.identityHashCode(hardDrive));
        System.out.println("____________________________________________________________________________________");

        Fan fa = new Fan("Orient", "Pedestal", 3);
        System.out.println(fa);
        System.out.println(fa.hashCode());
        System.out.println("Original:"+System.identityHashCode(fa));
        System.out.println("____________________________________________________________________________________");

        FlashDrive flashDrive = new FlashDrive("SanDisk", "USB 3.0", 128);
        System.out.println(flashDrive);
        System.out.println(flashDrive.hashCode());
        System.out.println("Original:"+System.identityHashCode(flashDrive));
        System.out.println("____________________________________________________________________________________");

        FlashDrive flash = new FlashDrive("SanDisk", "USB 3.0", 128);
        System.out.println(flash);
        System.out.println(flash.hashCode());
        System.out.println("Original:"+System.identityHashCode(flash));
        System.out.println("____________________________________________________________________________________");

        Freezer freezer = new Freezer("Whirlpool", "Chest", 350);
        System.out.println(freezer);
        System.out.println(freezer.hashCode());
        System.out.println("Original:"+System.identityHashCode(freezer));
        System.out.println("____________________________________________________________________________________");

        GameConsole console = new GameConsole("Sony", "PlayStation 5", 825);
        System.out.println(console);
        System.out.println(console.hashCode());
        System.out.println("Original:"+System.identityHashCode(console));
        System.out.println("____________________________________________________________________________________");

        Generator generator = new Generator("Honda", "Gasoline", 2200);
        System.out.println(generator);
        System.out.println(generator.hashCode());
        System.out.println("Original:"+System.identityHashCode(generator));
        System.out.println("____________________________________________________________________________________");

        GPSDevice gps = new GPSDevice("Garmin", "2024.1", 12);
        System.out.println(gps);
        System.out.println(gps.hashCode());
        System.out.println("Original:"+System.identityHashCode(gps));
        System.out.println("____________________________________________________________________________________");

        HairDryer hairDryer = new HairDryer("Dyson", "Fuchsia", 3);
        System.out.println(hairDryer);
        System.out.println(hairDryer.hashCode());
        System.out.println("Original:"+System.identityHashCode(hairDryer));
        System.out.println("____________________________________________________________________________________");

        Heater heater = new Heater("Lasko", "Ceramic", 1500);
        System.out.println(heater);
        System.out.println(heater.hashCode());
        System.out.println("Original:"+System.identityHashCode(heater));
        System.out.println("____________________________________________________________________________________");

        Humidifier humidifier = new Humidifier("Philips", "Cool Mist", 6);
        System.out.println(humidifier);
        System.out.println(humidifier.hashCode());
        System.out.println("Original:"+System.identityHashCode(humidifier));
        System.out.println("____________________________________________________________________________________");

        IceCreamMaker iceCreamMaker = new IceCreamMaker("Cuisinart", "Electric", 2);
        System.out.println(iceCreamMaker);
        System.out.println(iceCreamMaker.hashCode());
        System.out.println("Original:"+System.identityHashCode(iceCreamMaker));
        System.out.println("____________________________________________________________________________________");

        IceMaker iceMaker = new IceMaker("GE", "Opal 2.0", 24);
        System.out.println(iceMaker);
        System.out.println(iceMaker.hashCode());
        System.out.println("Original:"+System.identityHashCode(iceMaker));
        System.out.println("____________________________________________________________________________________");

        Iron iron = new Iron("Philips", "Steam", 2400);
        System.out.println(iron);
        System.out.println(iron.hashCode());
        System.out.println("Original:"+System.identityHashCode(iron));
        System.out.println("____________________________________________________________________________________");

        Isla isla = new Isla("Lavender", 7, 1.22);
        System.out.println(isla);
        System.out.println(isla.hashCode());
        System.out.println("Original:"+System.identityHashCode(isla));
        System.out.println("____________________________________________________________________________________");

        Jasper jasper = new Jasper("Forest Green", 10, 1.35);
        System.out.println(jasper);
        System.out.println(jasper.hashCode());
        System.out.println("Original:"+System.identityHashCode(jasper));
        System.out.println("____________________________________________________________________________________");

        Juicer juicer = new Juicer("Breville", "Centrifugal", 850);
        System.out.println(juicer);
        System.out.println(juicer.hashCode());
        System.out.println("Original:"+System.identityHashCode(juicer));
        System.out.println("____________________________________________________________________________________");

        Kettle kettle = new Kettle("Hamilton Beach", "Red", 1_500);
        System.out.println(kettle);
        System.out.println(kettle.hashCode());
        System.out.println("Original:"+System.identityHashCode(kettle));
        System.out.println("____________________________________________________________________________________");

        Keyboard keyboard = new Keyboard("Logitech", "QWERTY", true);
        System.out.println(keyboard);
        System.out.println(keyboard.hashCode());
        System.out.println("Original:"+System.identityHashCode(keyboard));
        System.out.println("____________________________________________________________________________________");

        Laptop laptop = new Laptop("Intel Core i7", "Dell", 16);
        System.out.println(laptop);
        System.out.println(laptop.hashCode());
        System.out.println("Original:"+System.identityHashCode(laptop));
        System.out.println("____________________________________________________________________________________");

        LawnMower lawnMower = new LawnMower("Honda", "Gas-Powered", 21);
        System.out.println(lawnMower);
        System.out.println(lawnMower.hashCode());
        System.out.println("Original:"+System.identityHashCode(lawnMower));
        System.out.println("____________________________________________________________________________________");

        LeafBlower leafBlower = new LeafBlower("DeWalt", "Cordless", 125);
        System.out.println(leafBlower);
        System.out.println(leafBlower.hashCode());
        System.out.println("Original:"+System.identityHashCode(leafBlower));
        System.out.println("____________________________________________________________________________________");

        Leo leo = new Leo("Sky Blue", 9, 1.28);
        System.out.println(leo);
        System.out.println(leo.hashCode());
        System.out.println("Original:"+System.identityHashCode(leo));
        System.out.println("____________________________________________________________________________________");

        LightBulb lightBulb = new LightBulb("Philips", "Warm White", 60);
        System.out.println(lightBulb);
        System.out.println(lightBulb.hashCode());
        System.out.println("Original:"+System.identityHashCode(lightBulb));
        System.out.println("____________________________________________________________________________________");

        Maya maya = new Maya("Turquoise", 8, 1.25);
        System.out.println(maya);
        System.out.println(maya.hashCode());
        System.out.println("Original:"+System.identityHashCode(maya));
        System.out.println("____________________________________________________________________________________");

        Microwave microwave = new Microwave("Panasonic", "Black", 1000);
        System.out.println(microwave);
        System.out.println(microwave.hashCode());
        System.out.println("Original:"+System.identityHashCode(microwave));
        System.out.println("____________________________________________________________________________________");

        Mixer mixer = new Mixer("KitchenAid", "Artisan", 10);
        System.out.println(mixer);
        System.out.println("____________________________________________________________________________________");

        Monitor monitor = new Monitor("Dell", "1920x1080", 27);
        System.out.println(monitor);
        System.out.println(monitor.hashCode());
        System.out.println("Original:"+System.identityHashCode(monitor));
        System.out.println("____________________________________________________________________________________");

        Mouse mouse = new Mouse("Logitech", "Wireless", 1600);
        System.out.println(mouse);
        System.out.println(mouse.hashCode());
        System.out.println("Original:"+System.identityHashCode(maya));
        System.out.println("____________________________________________________________________________________");

        Nora nora = new Nora("Peach", 6, 1.18);
        System.out.println(nora);
        System.out.println(nora.hashCode());
        System.out.println("Original:"+System.identityHashCode(nora));
        System.out.println("____________________________________________________________________________________");

        Oven oven = new Oven("Whirlpool", "Convection", 2000);
        System.out.println(oven);
        System.out.println(oven.hashCode());
        System.out.println("Original:"+System.identityHashCode(oven));
        System.out.println("____________________________________________________________________________________");

        Phone phone = new Phone("Samsung", "Galaxy S24", 999.99);
        System.out.println(phone);
        System.out.println(phone.hashCode());
        System.out.println("Original:"+System.identityHashCode(phone));
        System.out.println("____________________________________________________________________________________");

        PopcornMaker popcornMaker = new PopcornMaker("Presto", "Hot Air", 4);
        System.out.println(popcornMaker);
        System.out.println(popcornMaker.hashCode());
        System.out.println("Original:"+System.identityHashCode(popcornMaker));
        System.out.println("____________________________________________________________________________________");

        PressureCooker pressureCooker = new PressureCooker("Instant Pot", "Silver", 15);
        System.out.println(pressureCooker);
        System.out.println(pressureCooker.hashCode());
        System.out.println("Original:"+System.identityHashCode(pressureCooker));
        System.out.println("____________________________________________________________________________________");

        Projector projector = new Projector("Epson", "1080p", 3200);
        System.out.println(projector);
        System.out.println(projector.hashCode());
        System.out.println("Original:"+System.identityHashCode(projector));
        System.out.println("____________________________________________________________________________________");

        Refrigerator refrigerator = new Refrigerator("LG", "French Door", 600);
        System.out.println(refrigerator);
        System.out.println(refrigerator.hashCode());
        System.out.println("Original:"+System.identityHashCode(refrigerator));
        System.out.println("____________________________________________________________________________________");

        RiceCooker riceCooker = new RiceCooker("Zojirushi", "Micom", 5);
        System.out.println(riceCooker);
        System.out.println(riceCooker.hashCode());
        System.out.println("Original:"+System.identityHashCode(riceCooker));
        System.out.println("____________________________________________________________________________________");

        Router router = new Router("Netgear", "Dual-Band", 4);
        System.out.println(router);
        System.out.println(router.hashCode());
        System.out.println("Original:"+System.identityHashCode(router));
        System.out.println("____________________________________________________________________________________");

        Rowan rowan = new Rowan("Emerald Green", 11, 1.42);
        System.out.println(rowan);
        System.out.println(rowan.hashCode());
        System.out.println("Original:"+System.identityHashCode(rowan));
        System.out.println("____________________________________________________________________________________");

        SewingMachine sewingMachine = new SewingMachine("Singer", "Heavy Duty 4452", 10);
        System.out.println(sewingMachine);
        System.out.println(sewingMachine.hashCode());
        System.out.println("Original:"+System.identityHashCode(sewingMachine));
        System.out.println("____________________________________________________________________________________");

        Scanner scanner = new Scanner("Canon", "Flatbed", 1200);
        System.out.println(scanner);
        System.out.println(scanner.hashCode());
        System.out.println("Original:"+System.identityHashCode(scanner));
        System.out.println("____________________________________________________________________________________");

        SecurityCamera securityCamera = new SecurityCamera("Arlo", "4K", 160);
        System.out.println(securityCamera);
        System.out.println(securityCamera.hashCode());
        System.out.println("Original:"+System.identityHashCode(securityCamera));
        System.out.println("____________________________________________________________________________________");

        RowingMachine rowingMachine = new RowingMachine("Concept2", "Model D", 500);
        System.out.println(rowingMachine);
        System.out.println(rowingMachine.hashCode());
        System.out.println("Original:"+System.identityHashCode(rowingMachine));
        System.out.println("____________________________________________________________________________________");

        Silas silas = new Silas("Midnight Blue", 10, 1.35);
        System.out.println(silas);
        System.out.println(silas.hashCode());
        System.out.println("Original:"+System.identityHashCode(silas));
        System.out.println("____________________________________________________________________________________");

        SlowCooker slowCooker = new SlowCooker("Crock-Pot", "Oval", 6);
        System.out.println(slowCooker);
        System.out.println(slowCooker.hashCode());
        System.out.println("Original:"+System.identityHashCode(slowCooker));
        System.out.println("____________________________________________________________________________________");

        SmartLight smartLight = new SmartLight("Philips Hue", "Warm White", 800);
        System.out.println(smartLight);
        System.out.println(smartLight.hashCode());
        System.out.println("Original:"+System.identityHashCode(smartLight));
        System.out.println("____________________________________________________________________________________");

        Smartphone smartphone = new Smartphone("Apple", "iOS", 128);
        System.out.println(smartphone);
        System.out.println(smartphone.hashCode());
        System.out.println("Original:"+System.identityHashCode(smartphone));
        System.out.println("____________________________________________________________________________________");

        SmartPlug smartPlug = new SmartPlug("TP-Link", "Wi-Fi", 120);
        System.out.println(smartPlug);
        System.out.println(smartPlug.hashCode());
        System.out.println("Original:"+System.identityHashCode(smartPlug));
        System.out.println("____________________________________________________________________________________");

        SmartWatch smartWatch = new SmartWatch("Samsung", "Tizen OS", 48);
        System.out.println(smartWatch);
        System.out.println(smartWatch.hashCode());
        System.out.println("Original:"+System.identityHashCode(smartWatch));
        System.out.println("____________________________________________________________________________________");

        SmokeDetector smokeDetector = new SmokeDetector("Nest", "Ionization", 7);
        System.out.println(smokeDetector);
        System.out.println(smokeDetector.hashCode());
        System.out.println("Original:"+System.identityHashCode(smokeDetector));
        System.out.println("____________________________________________________________________________________");

        SnowBlower snowBlower = new SnowBlower("Toro", "Power Max 824 OE", 24);
        System.out.println(sewingMachine);
        System.out.println(snowBlower.hashCode());
        System.out.println("Original:"+System.identityHashCode(snowBlower));
        System.out.println("____________________________________________________________________________________");

        SpaceHeater spaceHeater = new SpaceHeater("Dyson", "Ceramic", 1500);
        System.out.println(spaceHeater);
        System.out.println(spaceHeater.hashCode());
        System.out.println("Original:"+System.identityHashCode(spaceHeater));
        System.out.println("____________________________________________________________________________________");

        Speaker speaker = new Speaker("Bose", "Bluetooth", 100);
        System.out.println(speaker);
        System.out.println(speaker.hashCode());
        System.out.println("Original:"+System.identityHashCode(speaker));
        System.out.println("____________________________________________________________________________________");

        StandMixer standMixer = new StandMixer("KitchenAid", "Red", 5);
        System.out.println(standMixer);
        System.out.println(standMixer.hashCode());
        System.out.println("Original:"+System.identityHashCode(standMixer));
        System.out.println("____________________________________________________________________________________");

        Student student = new Student("John Doe", 101, 88.5);
        System.out.println(student);
        System.out.println(student.hashCode());
        System.out.println("Original:"+System.identityHashCode(student));
        System.out.println("____________________________________________________________________________________");

        Table table = new Table("Rectangle", "Wood", 1.8);
        System.out.println(table);
        System.out.println(table.hashCode());
        System.out.println("Original:"+System.identityHashCode(table));
        System.out.println("____________________________________________________________________________________");

        Tablet tablet = new Tablet("Apple", "iPadOS", 10);
        System.out.println(tablet);
        System.out.println(tablet.hashCode());
        System.out.println("Original:"+System.identityHashCode(tablet));
        System.out.println("____________________________________________________________________________________");

        Television television = new Television("Samsung", "4K", 55);
        System.out.println(television);
        System.out.println(television.hashCode());
        System.out.println("Original:"+System.identityHashCode(television));
        System.out.println("____________________________________________________________________________________");

        Thermostat thermostat = new Thermostat("Nest", "Cooling", 72);
        System.out.println(thermostat);
        System.out.println(thermostat.hashCode());
        System.out.println("Original:"+System.identityHashCode(thermostat));
        System.out.println("____________________________________________________________________________________");

        ToasterOven toasterOven = new ToasterOven("Breville", "Convection", 500);
        System.out.println(toasterOven);
        System.out.println(toasterOven.hashCode());
        System.out.println("Original:"+System.identityHashCode(toasterOven));
        System.out.println("____________________________________________________________________________________");

        Treadmill treadmill = new Treadmill("NordicTrack", "Commercial 1750", 12);
        System.out.println(treadmill);
        System.out.println(treadmill.hashCode());
        System.out.println("Original:"+System.identityHashCode(treadmill));
        System.out.println("____________________________________________________________________________________");

        VacuumCleaner vacuumCleaner = new VacuumCleaner("Dyson", "V11 Torque Drive", 185);
        System.out.println(vacuumCleaner);
        System.out.println(vacuumCleaner.hashCode());
        System.out.println("Original:"+System.identityHashCode(vacuumCleaner));
        System.out.println("____________________________________________________________________________________");

        WashingMachine washingMachine = new WashingMachine("LG", "TurboWash 360", 8.0);
        System.out.println(washingMachine);
        System.out.println(washingMachine.hashCode());
        System.out.println("Original:"+System.identityHashCode(washingMachine));
        System.out.println("____________________________________________________________________________________");

        WaterHeater waterHeater = new WaterHeater("Rheem", "Tankless", 15);
        System.out.println(waterHeater);
        System.out.println(waterHeater.hashCode());
        System.out.println("Original:"+System.identityHashCode(waterHeater));
        System.out.println("____________________________________________________________________________________");

        WaterPurifier waterPurifier = new WaterPurifier("Brita", "Activated Carbon", 3);
        System.out.println(waterPurifier);
        System.out.println(waterPurifier.hashCode());
        System.out.println("Original:"+System.identityHashCode(waterPurifier));
        System.out.println("____________________________________________________________________________________");

        Webcam webcam = new Webcam("Logitech", "1080p", true);
        System.out.println(webcam);
        System.out.println(webcam.hashCode());
        System.out.println("Original:"+System.identityHashCode(webcam));
        System.out.println("____________________________________________________________________________________");

    }
}
