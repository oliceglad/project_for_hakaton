package com.too_codemen.app.calculation.RealtyParser;

import com.too_codemen.app.calculation.ExcelImport;
import com.too_codemen.app.calculation.Transformation;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


import java.lang.reflect.Field;


public class realtyParser {



    static Transformation transformation = new Transformation();
    static ExcelImport excelImport = new ExcelImport();

//    static double rooms = excelImport.Rooms.get(0);
//    static String TFrooms;
//
//    static String segment = excelImport.Segment.get(1);
//
//    static String material = excelImport.Material.get(0);
//
//    static String balcony = excelImport.Balcony.get(0);



 //   static String repairState = excelImport.RepairState.get(0);

    static boolean rt = true;
//    static String Vrt = "="+ transformation.TFrooms(excelImport.Rooms.get(0));
    static String Vrt ="=" + Integer.toString(transformation.TFrooms(excelImport.Rooms.get(0)));

    static boolean n = true;
    static String Vn = "=" + transformation.Tsegment(excelImport.Segment.get(0));

//    static boolean o5 = true;
//    static String Vo5 = "=" + excelImport.SquareFlat.get(0).toString();
//
//    static boolean o6 = true;
//    static String Vo6 = "=85";

//    static boolean o3 = true;
//    static String Vo3 = "=15";
//
//    static boolean o4 = true;
//    static String Vo4 = "=15";

//    static boolean e0 = true;
//    static String Ve0 = "=7";
//
//    static boolean e1 = true;
//    static String Ve1 = "=7";

    static boolean et = true;
    static String Vet = "=" + excelImport.HouseFloor.toString();

    static boolean bt = true;
    static String Vbt = "=" + transformation.Tmaterial(excelImport.Material.get(0));

    static boolean b = true;
    static String Vb = "=" + transformation.Tbalcony(excelImport.Balcony.get(0));

    static boolean re = true;
    static String Vre = "=20,30,40";



//    static boolean ns = true; //константа, не трогать
//    static String Vns = "=300";















//    static boolean p = true; //const
//    static String Vp = "=100";

//    static boolean a = true; //const
//    static String Va = "=100";

    static boolean m1 = true;
    static String Vm1 = "="+excelImport.MetroDistance.get(0).toString();

    static boolean mt = true;
    static String Vmt = "=0";

//    static boolean n = true;
//    static String Vn = "=1";



//    static boolean r = true;
//    static String Vr = "=82";

//    static boolean c = true;
//    static String Vc = "=1";


    static String Address = "https://www.russianrealty.ru/%D0%9F%D1%80%D0%BE%D0%B4%D0%B0%D0%B6%D0%B0-%D0%BA%D0%B2%D0%B0%D1%80%D1%82%D0%B8%D1%80/?c=1&r=82&a=100&p=100&";


    static String CorCheck(String Address) throws IllegalAccessException {
        realtyParser realtyParser = new realtyParser();
        // Field[] field = realtyParser.getClass().getDeclaredFields();
        Field[] field = realtyParser.getClass().getDeclaredFields();


        for (int i = 0; i < field.length; i++) {
//            if (field[i].getName() == "Address") {
//                i++;
//
//            }
            if (field[i].getType() == field[1].getType()) {


                continue;

            } else if (field[i].getBoolean(field[i].getName()) == true) {
                Address = Address + field[i].getName() + field[i + 1].get("V" + field[i].getName()) + "&";
//                System.out.println(i);

            }

        }
        return Address;
    }

    public static void StartrealtyParser()

    {
        try {
            File file = new File("tempParsFile.txt");
            if(file.exists()) {
                file.delete();
                file.createNewFile();
                String address = CorCheck(Address);
                PrintWriter pw = new PrintWriter(file);
                pw.println(address);
                pw.close();
            }
            else{
                String address = CorCheck(Address);
                PrintWriter pw = new PrintWriter(file);
                pw.println(address);
                pw.close();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) throws IllegalAccessException{
//
//        try {
//            File file = new File("tempParsFile.txt");
//            if(file.exists()) {
//                file.delete();
//                file.createNewFile();
//                String address = CorCheck(Address);
//                PrintWriter pw = new PrintWriter(file);
//                pw.println(address);
//                pw.close();
//            }
//            else{
//                String address = CorCheck(Address);
//                PrintWriter pw = new PrintWriter(file);
//                pw.println(address);
//                pw.close();
//            }
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//
//    }

}
