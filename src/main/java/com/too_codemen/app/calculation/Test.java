package com.too_codemen.app.calculation;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ExcelImport excelImport = new ExcelImport();
        excelImport.startExcellImport();
        String segment = ExcelImport.Segment.get(0);
        System.out.println(segment);

    }
}
