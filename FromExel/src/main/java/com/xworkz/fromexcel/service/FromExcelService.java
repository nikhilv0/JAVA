package com.xworkz.fromexcel.service;

import java.util.List;

public interface FromExcelService {

    String validateExcel(List<Object> list);

    String sendOtpToMAil(String mail);
}
