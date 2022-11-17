package com.too_codemen.app.calculation;

public class Transformation {

ExcelImport excelImport = new ExcelImport();



 public static int TFrooms(int rooms){
     if (rooms > 4){
         rooms = 4;
     }

     return rooms;
 }

 public static String Tsegment(String segment){
     if (segment == "Новостройка"){
         segment = "1";
     }
     else if(segment == "Современное жилье"){
         segment = "1";
     }
     else if(segment == "Старый жилой фонд") {
         segment = "0";
     }
     return segment;
 }

 public static String Tmaterial(String material){
     if (material == "кирпич"){
         material = "10";
     }
     else if(material == "панельный"){
         material = "20";
     }
     else if(material == "монолитный"){
         material = "30";
     }

     return material;
 }

 public static String Tbalcony(String balcony){
     if (balcony == "Да"){
        balcony = "20";
     }
     else if (balcony == "Нет"){
         balcony = "10";
     }
     return balcony;
 }

 public static String TrepairState(String repairState){
     if (repairState == "Муниципальный ремонт"){
         repairState = "30";
     }
     else if(repairState == "Без отделки"){
         repairState = "40";
     }
     else if(repairState == "Современный ремонт"){
         repairState = "20";
     }
     return repairState;
 }

}
