package com.xworkz.interfaceclasses.runner;
import com.xworkz.interfaceclasses.task2interfaceclasses.*;
import com.xworkz.interfaceclasses.taskinterfaceclasses.*;

public class Task2Runner {
    public static void main(String[] args) {


        System.out.println("Arcade photoBooth");
        Camera camera = new ArcadePhotoBooth();
        camera.takePhoto();
        camera.recordVideo();
        camera.adjustSettings();
        ArcadeMachine arcadeMachine = new ArcadePhotoBooth();
        arcadeMachine.startGame();
        arcadeMachine.insertCoin();
        arcadeMachine.endGame();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("BookRobotCompanion");
        EBookReader eBookReader = new BookRobotCompanion();
        eBookReader.turnPage();
        eBookReader.openBook();
        eBookReader.adjustBrightness();
        ToyRobot toyRobot = new BookRobotCompanion();
        toyRobot.talk();
        toyRobot.walk();
        toyRobot.dance();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("CameraDroneCombo");
        Camera camera1 = new CameraDroneCombo();
        camera1.takePhoto();
        camera1.recordVideo();
        camera1.adjustSettings();
        DroneCamera droneCamera = new CameraDroneCombo();
        droneCamera.fly();
        droneCamera.returnHome();
        droneCamera.recordVideo();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("CNCLightCombo");
        CNC_Machine cncMachine = new CNCLightCombo();
        cncMachine.startMachine();
        cncMachine.calibrate();
        cncMachine.stopMachine();
        SmartLight smartLight = new CNCLightCombo();
        smartLight.turnOnLight();
        smartLight.turnOffLight();
        smartLight.changeColor();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("CNCMusicBot");
        CNC_Machine cncMachine1 = new CNCMusicBot();
        cncMachine1.startMachine();
        cncMachine1.calibrate();
        cncMachine1.stopMachine();
        Speaker speaker = new CNCMusicBot();
        speaker.playSound();
        speaker.increaseVolume();
        speaker.decreaseVolume();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("DroneEBookFlyer");
        EBookReader eBookReader1 = new DroneEBookFlyer();
        eBookReader1.openBook();
        eBookReader1.turnPage();
        eBookReader1.adjustBrightness();
        DroneCamera droneCamera1 = new DroneEBookFlyer();
        droneCamera1.fly();
        droneCamera1.returnHome();
        droneCamera1.recordVideo();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("DroneRobotHybrid");
        ToyRobot toyRobot1 = new DroneRobotHybrid();
        toyRobot1.talk();
        toyRobot1.walk();
        toyRobot1.dance();
        DroneCamera droneCamera2 = new DroneRobotHybrid();
        droneCamera2.fly();
        droneCamera2.returnHome();
        droneCamera2.recordVideo();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("LightArcadeCombo");
        SmartLight smartLight1 = new LightArcadeCombo();
        smartLight1.turnOnLight();
        smartLight1.turnOffLight();
        smartLight1.changeColor();
        ArcadeMachine arcadeMachine1 = new LightArcadeCombo();
        arcadeMachine1.startGame();
        arcadeMachine1.insertCoin();
        arcadeMachine1.endGame();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("LightSpeakerCombo");
        SmartLight smartLight2 = new LightSpeakerCombo();
        smartLight2.turnOnLight();
        smartLight2.turnOffLight();
        smartLight2.changeColor();
        Speaker speaker2= new LightSpeakerCombo();
        speaker2.playSound();
        speaker2.increaseVolume();
        speaker2.decreaseVolume();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("RobotReaderStation");
        EBookReader eBookReader2 = new RobotReaderStation();
        eBookReader2.openBook();
        eBookReader2.turnPage();
        eBookReader2.adjustBrightness();
        ToyRobot toyRobot2 = new RobotReaderStation();
        toyRobot2.talk();
        toyRobot2.walk();
        toyRobot2.dance();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("RobotTrainController");
        ElectricTrainSet electricTrainSet = new RobotTrainController();
        electricTrainSet.startTrain();
        electricTrainSet.switchTrack();
        electricTrainSet.startTrain();
        ToyRobot toyRobot3 = new RobotTrainController();
        toyRobot3.talk();
        toyRobot3.walk();
        toyRobot3.dance();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("RouterEBookHub");
        EBookReader eBookReader3 = new RouterEBookHub();
        eBookReader3.openBook();
        eBookReader3.turnPage();
        eBookReader3.adjustBrightness();
        Router router=new RouterEBookHub();
        router.resetRouter();
        router.connectToInternet();
        router.updateFirmware();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("RouterSpeakerStation");
        Speaker speaker3= new RouterSpeakerStation();
        speaker3.playSound();
        speaker3.increaseVolume();
        speaker3.decreaseVolume();
        Router router1=new RouterSpeakerStation();
        router1.resetRouter();
        router1.connectToInternet();
        router1.updateFirmware();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartArcadeDrone");
        DroneCamera droneCamera3 = new SmartArcadeDrone();
        droneCamera3.fly();
        droneCamera3.returnHome();
        droneCamera3.recordVideo();
        ArcadeMachine arcadeMachine2 = new SmartArcadeDrone();
        arcadeMachine2.startGame();
        arcadeMachine2.insertCoin();
        arcadeMachine2.endGame();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartCameraEBookReader");
        EBookReader eBookReader4 = new SmartCameraEBookReader();
        eBookReader4.openBook();
        eBookReader4.turnPage();
        eBookReader4.adjustBrightness();
        Camera camera2 = new SmartCameraEBookReader();
        camera2.takePhoto();
        camera2.recordVideo();
        camera2.adjustSettings();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartCNC_ToyRobot");
        CNC_Machine cncMachine2= new SmartCNC_ToyRobot();
        cncMachine2.startMachine();
        cncMachine2.calibrate();
        cncMachine2.stopMachine();
        ToyRobot toyRobot4 = new SmartCNC_ToyRobot();
        toyRobot4.talk();
        toyRobot4.walk();
        toyRobot4.dance();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartCNCArcade");
        CNC_Machine cncMachine3= new SmartCNCArcade();
        cncMachine3.startMachine();
        cncMachine3.calibrate();
        cncMachine3.stopMachine();
        ArcadeMachine arcadeMachine3 = new SmartCNCArcade();
        arcadeMachine3.startGame();
        arcadeMachine3.insertCoin();
        arcadeMachine3.endGame();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartRouterCamera");
        Router router2=new SmartRouterCamera();
        router2.resetRouter();
        router2.connectToInternet();
        router2.updateFirmware();
        Camera camera3 = new SmartRouterCamera();
        camera3.takePhoto();
        camera3.recordVideo();
        camera3.adjustSettings();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartRouterSpeaker");
        Router router3=new SmartRouterSpeaker();
        router3.resetRouter();
        router3.connectToInternet();
        router3.updateFirmware();
        Speaker speaker4= new SmartRouterSpeaker();
        speaker4.playSound();
        speaker4.increaseVolume();
        speaker4.decreaseVolume();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartSpeakerEBookReader");
        EBookReader eBookReader5 = new SmartSpeakerEBookReader();
        eBookReader5.openBook();
        eBookReader5.turnPage();
        eBookReader5.adjustBrightness();
        Speaker speaker5= new SmartSpeakerEBookReader();
        speaker5.playSound();
        speaker5.increaseVolume();
        speaker5.decreaseVolume();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartToyRobotDrone");
        DroneCamera droneCamera4 = new SmartToyRobotDrone();
        droneCamera4.fly();
        droneCamera4.returnHome();
        droneCamera4.recordVideo();
        ToyRobot toyRobot5= new SmartToyRobotDrone();
        toyRobot5.talk();
        toyRobot5.walk();
        toyRobot5.dance();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartTrainLight");
        ElectricTrainSet electricTrainSet1 = new SmartTrainLight();
        electricTrainSet1.startTrain();
        electricTrainSet1.switchTrack();
        electricTrainSet1.startTrain();
        SmartLight smartLight3= new SmartTrainLight();
        smartLight3.turnOnLight();
        smartLight3.turnOffLight();
        smartLight3.changeColor();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SmartTrainRouter");
        ElectricTrainSet electricTrainSet2 = new SmartTrainRouter();
        electricTrainSet2.startTrain();
        electricTrainSet2.switchTrack();
        electricTrainSet2.startTrain();
        Router router4=new SmartTrainRouter();
        router4.resetRouter();
        router4.connectToInternet();
        router4.updateFirmware();
        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("SpeakerArcadeConsole");
        Speaker speaker6= new SpeakerArcadeConsole();
        speaker6.playSound();
        speaker6.increaseVolume();
        speaker6.decreaseVolume();
        ArcadeMachine arcadeMachine4 = new SpeakerArcadeConsole();
        arcadeMachine4.startGame();
        arcadeMachine4.insertCoin();
        arcadeMachine4.endGame();
        System.out.println("----------------------------------------------------------------------------------------");

    }
}
