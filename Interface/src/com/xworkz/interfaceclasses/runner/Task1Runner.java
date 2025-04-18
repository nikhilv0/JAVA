package com.xworkz.interfaceclasses.runner;

import com.xworkz.interfaceclasses.taskinterfaceclasses.*;
import com.xworkz.interfaceclasses.taskinterfaceimpliments.*;


public class Task1Runner {
    private static Router router;
    private static SmartThermostat smartThermostat;

    public static void main(String[] args) {

        System.out.println("Car");
        Car car = new CarImpl();
        car.startEngine();
        car.stopEngine();
        car.resetSystem();
        car.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("BatteryCharger");
        BatteryCharger batteryCharger = new BatteryChargerImpl();
        batteryCharger.startCharging();
        batteryCharger.stopCharging();
        batteryCharger.checkBatteryStatus();
        batteryCharger.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("ElectricKettle");
        ElectricKettle electricKettle = new ElectricKettleImpl();
        electricKettle.boilWater();
        electricKettle.turnOffAutomatically();
        electricKettle.keepWarm();
        electricKettle.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SolarPanelSystem");
        SolarPanelSystem solarPanelSystem = new SolarPanelSystemImpl();
        solarPanelSystem.generatePower();
        solarPanelSystem.storeEnergy();
        solarPanelSystem.trackSunlight();
        solarPanelSystem.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmokeDetector");
        SmokeDetector smokeDetector = new SmokeDetectorImpl();
        smokeDetector.detectSmoke();
        smokeDetector.soundAlarm();
        smokeDetector.testSystem();
        smokeDetector.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("CarbonMonoxideAlarm");
        CarbonMonoxideAlarm carbonMonoxideAlarm = new CarbonMonoxideAlarmImpl();
        carbonMonoxideAlarm.detectGas();
        carbonMonoxideAlarm.alert();
        carbonMonoxideAlarm.resetAlarm();
        carbonMonoxideAlarm.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("MotionSensor");
        MotionSensor motionSensor = new MotionSensorImpl();
        motionSensor.detectMovement();
        motionSensor.sendSignal();
        motionSensor.calibrateSensor();
        motionSensor.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("AutomaticSoapDispenser");
        AutomaticSoapDispenser dispenser = new AutomaticSoapDispenserImpl();
        dispenser.dispenseSoap();
        dispenser.refillSoap();
        dispenser.cleanNozzle();
        dispenser.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("ElectricToothbrush");
        ElectricToothbrush toothbrush = new ElectricToothbrushImpl();
        toothbrush.startBrushing();
        toothbrush.stopBrushing();
        toothbrush.changeMode();
        toothbrush.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("DigitalThermometer");
        DigitalThermometer thermometer = new DigitalThermometerImpl();
        thermometer.measureTemperature();
        thermometer.displayReading();
        thermometer.resetDevice();
        thermometer.display();
        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("FitnessTracker");
        FitnessTracker fitnessTracker = new FitnessTrackerImpl();
        fitnessTracker.countSteps();
        fitnessTracker.monitorHeartRate();
        fitnessTracker.syncData();
        fitnessTracker.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("BarcodeScanner");
        BarcodeScanner barcodeScanner = new BarcodeScannerImpl();
        barcodeScanner.scanCode();
        barcodeScanner.transmitData();
        barcodeScanner.resetScanner();
        barcodeScanner.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("ElectricScooter");
        ElectricScooter electricScooter = new ElectricScooterImpl();
        electricScooter.accelerate();
        electricScooter.applyBrake();
        electricScooter.chargeBattery();
        electricScooter.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("ElectricWheelchair");
        ElectricWheelchair electricWheelchair = new ElectricWheelchairImpl();
        electricWheelchair.moveForward();
        electricWheelchair.turnLeft();
        electricWheelchair.adjustSpeed();
        electricWheelchair.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("PowerInverter");
        PowerInverter powerInverter = new PowerInverterImpl();
        powerInverter.convertPower();
        powerInverter.switchMode();
        powerInverter.displayStatus();
        powerInverter.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Bike");
        Bike bike = new BikeImpl();
        bike.startEngine();
        bike.stopEngine();
        bike.resetSystem();
        bike.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Bus");
        Bus bus = new BusImpl();
        bus.startEngine();
        bus.stopEngine();
        bus.resetSystem();
        bus.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Truck");
        Truck truck = new TruckImpl();
        truck.startEngine();
        truck.stopEngine();
        truck.resetSystem();
        truck.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Train");
        Train train = new TrainImpl();
        train.startEngine();
        train.stopEngine();
        train.resetSystem();
        train.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Airplane");
        Airplane airplane = new AirplaneImpl();
        airplane.startEngine();
        airplane.stopEngine();
        airplane.resetSystem();
        airplane.display();
        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("Helicopter");
        Helicopter helicopter = new HelicopterImpl();
        helicopter.startEngine();
        helicopter.stopEngine();
        helicopter.resetSystem();
        helicopter.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Ship");
        Ship ship = new ShipImpl();
        ship.startEngine();
        ship.stopEngine();
        ship.resetSystem();
        ship.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Scooter");
        Scooter scooter = new ScooterImpl();
        scooter.startEngine();
        scooter.stopEngine();
        scooter.resetSystem();
        scooter.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Tram");
        Tram tram = new TramImpl();
        tram.startEngine();
        tram.stopEngine();
        tram.resetSystem();
        tram.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("WashingMachine");
        WashingMachine washingMachine = new WashingMachineImpl();
        washingMachine.startCycle();
        washingMachine.stopCycle();
        washingMachine.drainWater();
        washingMachine.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Refrigerator");
        Refrigerator refrigerator = new RefrigeratorImpl();
        refrigerator.coolItems();
        refrigerator.defrost();
        refrigerator.checkTemperature();
        refrigerator.defrost();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Microwave");
        Microwave microwave = new MicrowaveImpl();
        microwave.startHeating();
        microwave.stopHeating();
        microwave.setTimer();
        microwave.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("AirConditioner");
        AirConditioner airConditioner = new AirConditionerImpl();
        airConditioner.turnOn();
        airConditioner.turnOff();
        airConditioner.setTemperature();
        airConditioner.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Television");
        Television television = new TelevisionImpl();
        television.powerOn();
        television.powerOff();
        television.changeChannel();
        television.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Dishwasher");
        Dishwasher dishwasher = new DishwasherImpl();
        dishwasher.startWashing();
        dishwasher.stopWashing();
        dishwasher.dryDishes();
        dishwasher.display();
        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("VacuumCleaner");
        VacuumCleaner vacuumCleaner = new VacuumCleanerImpl();
        vacuumCleaner.startCleaning();
        vacuumCleaner.stopCleaning();
        vacuumCleaner.emptyDustBag();
        vacuumCleaner.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("WaterHeater");
        WaterHeater waterHeater = new WaterHeaterImpl();
        waterHeater.heatWater();
        waterHeater.turnOffHeater();
        waterHeater.setTemperature();
        waterHeater.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("CeilingFan");
        CeilingFan ceilingFan = new CeilingFanImpl();
        ceilingFan.turnOnFan();
        ceilingFan.turnOffFan();
        ceilingFan.adjustSpeed();
        ceilingFan.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("CoffeeMaker");
        CoffeeMaker coffeeMaker = new CoffeeMakerImpl();
        coffeeMaker.brewCoffee();
        coffeeMaker.cleanMachine();
        coffeeMaker.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartPhone");
        SmartPhone smartPhone = new SmartPhoneImpl();
        smartPhone.makeCall();
        smartPhone.sendText();
        smartPhone.openApp();
        scooter.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Tablet");
        Tablet tablet = new TabletImpl();
        tablet.draw();
        tablet.browseWeb();
        tablet.watchVideo();
        tablet.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Laptop");
        Laptop laptop = new LaptopImpl();
        laptop.compileCode();
        laptop.runApplication();
        laptop.shutDown();
        laptop.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("DesktopComputer");
        DesktopComputer desktopComputer = new DesktopComputerImpl();
        desktopComputer.powerOn();
        desktopComputer.runDiagnostics();
        desktopComputer.powerOff();
        dispenser.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartWatch");
        SmartWatch smartWatch = new SmartWatchImpl();
        smartWatch.showTime();
        smartWatch.trackSteps();
        smartWatch.displayNotification();
        smartWatch.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Printer");
        Printer printer = new PrinterImpl();
        printer.printDocument();
        printer.scanDocument();
        printer.cancelJob();
        printer.display();
        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("Router");
        Router router = new RouterImpl();
        router.connectToInternet();
        router.resetRouter();
        router.updateFirmware();
        router.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Camera");
        Camera camera = new CameraImpl();
        camera.takePhoto();
        camera.recordVideo();
        camera.adjustSettings();
        camera.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Speaker");
        Speaker speaker = new SpeakerImpl();
        speaker.playSound();
        speaker.increaseVolume();
        speaker.decreaseVolume();
        speaker.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("EBookReader");
        EBookReader eBookReader = new EBookReaderImpl();
        eBookReader.openBook();
        eBookReader.turnPage();
        eBookReader.adjustBrightness();
        eBookReader.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("CNC_Machine");
        CNC_Machine cncMachine = new CNC_MachineImpl();
        cncMachine.startMachine();
        cncMachine.stopMachine();
        cncMachine.calibrate();
        cncMachine.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("ArcadeMachine");
        ArcadeMachine arcadeMachine = new ArcadeMachineImpl();
        arcadeMachine.insertCoin();
        arcadeMachine.startGame();
        arcadeMachine.endGame();
        arcadeMachine.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("ToyRobot");
        ToyRobot toyRobot = new ToyRobotImpl();
        toyRobot.walk();
        toyRobot.talk();
        toyRobot.dance();
        toyRobot.dance();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("DroneCamera");
        DroneCamera droneCamera = new DroneCameraImpl();
        droneCamera.fly();
        droneCamera.recordVideo();
        droneCamera.returnHome();
        droneCamera.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("ElectricTrainSet");
        ElectricTrainSet trainSet = new ElectricTrainSetImpl();
        trainSet.startTrain();
        trainSet.stopTrain();
        trainSet.switchTrack();
        trainSet.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartLight");
        SmartLight smartLight = new SmartLightImpl();
        smartLight.turnOnLight();
        smartLight.turnOffLight();
        smartLight.changeColor();
        smartLight.display();
        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("SmartDoorLock");
        SmartDoorLock smartDoorLock = new SmartDoorLockImpl();
        smartDoorLock.lockDoor();
        smartDoorLock.unlockDoor();
        smartDoorLock.checkStatus();
        smartDoorLock.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartThermostat");
        SmartThermostat smartThermostat = new SmartThermostatImpl();
        smartThermostat.setTemperature();
        smartThermostat.turnOnHeating();
        smartThermostat.turnOffCooling();
        smartThermostat.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartCamera");
        SmartCamera smartCamera = new SmartCameraImpl();
        smartCamera.recordVideo();
        smartCamera.detectMotion();
        smartCamera.sendAlert();
        smartCamera.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartSpeaker");
        SmartSpeaker smartSpeaker = new SmartSpeakerImpl();
        smartSpeaker.playMusic();
        smartSpeaker.increaseVolume();
        smartSpeaker.askAssistant();
        smartSpeaker.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartDoorbell");
        SmartDoorbell smartDoorbell = new SmartDoorbellImpl();
        smartDoorbell.ringBell();
        smartDoorbell.streamVideo();
        smartDoorbell.talkToVisitor();
        smartDoorbell.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartMirror");
        SmartMirror smartMirror = new SmartMirrorImpl();
        smartMirror.displayTime();
        smartMirror.showWeather();
        smartMirror.adjustBrightness();
        smartMirror.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartGarageOpener");
        SmartGarageOpener smartGarageOpener = new SmartGarageOpenerImpl();
        smartGarageOpener.openGarage();
        smartGarageOpener.closeGarage();
        smartGarageOpener.checkGarageStatus();
        smartGarageOpener.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Blender");
        Blender blender = new BlenderImpl();
        blender.startBlending();
        blender.stopBlending();
        blender.pulseBlend();
        blender.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("FoodProcessor");
        FoodProcessor foodProcessor = new FoodProcessorImpl();
        foodProcessor.chop();
        foodProcessor.grind();
        foodProcessor.slice();
        foodProcessor.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("AirPurifier");
        AirPurifier airPurifier = new AirPurifierImpl();
        airPurifier.purifyAir();
        airPurifier.changeFilter();
        airPurifier.adjustFanSpeed();
        airPurifier.display();
        System.out.println("----------------------------------------------------------------------------------------");


        System.out.println("Humidifier");
        Humidifier humidifier = new HumidifierImpl();
        humidifier.releaseMist();
        humidifier.setHumidityLevel();
        humidifier.turnOff();
        humidifier.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Dehumidifier");
        Dehumidifier dehumidifier = new DehumidifierImpl();
        dehumidifier.removeMoisture();
        dehumidifier.setDryLevel();
        dehumidifier.emptyTank();
        dehumidifier.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("InductionCooktop");
        InductionCooktop inductionCooktop = new InductionCooktopImpl();
        inductionCooktop.turnOnCooktop();
        inductionCooktop.setHeatLevel();
        inductionCooktop.turnOffCooktop();
        inductionCooktop.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("RiceCooker");
        RiceCooker riceCooker = new RiceCookerImpl();
        riceCooker.startCooking();
        riceCooker.keepWarm();
        riceCooker.stopCooking();
        riceCooker.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SlowCooker");
        SlowCooker slowCooker = new SlowCookerImpl();
        slowCooker.cookSlow();
        slowCooker.setTimer();
        slowCooker.turnOff();
        slowCooker.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Juicer");
        Juicer juicer = new JuicerImpl();
        juicer.extractJuice();
        juicer.cleanJuicer();
        juicer.stopJuicer();
        juicer.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("WaterFilter");
        WaterFilter waterFilter = new WaterFilterImpl();
        waterFilter.filterWater();
        waterFilter.replaceCartridge();
        waterFilter.resetIndicator();
        waterFilter.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("ElectricGrill");
        ElectricGrill electricGrill = new ElectricGrillImpl();
        electricGrill.preheat();
        electricGrill.grillFood();
        electricGrill.turnOffGrill();
        electricGrill.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("IceMaker");
        IceMaker iceMaker = new IceMakerImpl();
        iceMaker.startIceMaking();
        iceMaker.stopIceMaking();
        iceMaker.checkIceLevel();
        iceMaker.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartCurtains");
        SmartCurtains smartCurtains = new SmartCurtainsImpl();
        smartCurtains.openCurtains();
        smartCurtains.closeCurtains();
        smartCurtains.setSchedule();
        smartCurtains.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("PetFeeder");
        PetFeeder petFeeder = new PetFeederImpl();
        petFeeder.dispenseFood();
        petFeeder.setFeedingSchedule();
        petFeeder.checkFoodLevel();
        petFeeder.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartScale");
        SmartScale smartScale = new SmartScaleImpl();
        smartScale.measureWeight();
        smartScale.syncWithApp();
        smartScale.resetScale();
        smartScale.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartPlug");
        SmartPlug smartPlug = new SmartPlugImpl();
        smartPlug.turnOn();
        smartPlug.turnOff();
        smartPlug.monitorPowerUsage();
        smartPlug.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartSprinkler");
        SmartSprinkler smartSprinkler = new SmartSprinklerImpl();
        smartSprinkler.startSprinkling();
        smartSprinkler.stopSprinkling();
        smartSprinkler.scheduleWatering();
        smartSprinkler.display();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartVacuum");
        SmartVacuum smartVacuum = new SmartVacuumImpl();
        smartVacuum.startCleaning();
        smartVacuum.returnToDock();
        smartVacuum.emptyDustBin();
        smartVacuum.display();
        System.out.println("----------------------------------------------------------------------------------------");


































































    }
}
