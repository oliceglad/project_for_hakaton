package com.too_codemen.app.calculation;

import com.too_codemen.app.calculation.RealtyParser.realtyParser;

public class CalculationMain {
    public static void main(String[] args) {

        ExcelImport excelImport = new ExcelImport();
        realtyParser realtyParser = new realtyParser();


        excelImport.startExcellImport();
        realtyParser.StartrealtyParser();



    }
}
