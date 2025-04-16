package com.xworkz.interfaceclasses.taskinterfaceimpliments;

import com.xworkz.interfaceclasses.taskinterfaceclasses.BarcodeScanner;

public class BarcodeScannerImpl implements BarcodeScanner {
    @Override
    public void scanCode() {
        System.out.println("Scanning barcode.");
    }

    @Override
    public void transmitData() {
        System.out.println("Transmitting barcode data.");
    }

    @Override
    public void resetScanner() {
        System.out.println("Resetting barcode scanner.");
    }
}
