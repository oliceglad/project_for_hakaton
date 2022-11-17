package com.too_codemen.app.calculation;

import com.sun.net.httpserver.Headers;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExcelImport {


    public static ArrayList<String> Address = new ArrayList<>();
    public static ArrayList<Integer> Rooms = new ArrayList<>();
    public static ArrayList<String> Segment = new ArrayList<>();
    public static ArrayList<Integer> HouseFloor = new ArrayList<>();
    public static ArrayList<String> Material = new ArrayList<>();
    public static ArrayList<Integer> FlatFloor = new ArrayList<>();
    public static ArrayList<Double> SquareFlat = new ArrayList<>();
    public static ArrayList<Double> SquareKitchen = new ArrayList<>();
    public static ArrayList<String> Balcony = new ArrayList<>();
    public static ArrayList<Integer> MetroDistance = new ArrayList<>();
    public static ArrayList<String> RepairState = new ArrayList<>();


    public static ArrayList<RichTextString> Headers1 = new ArrayList<>();
    public static ArrayList<RichTextString> Headers2 = new ArrayList<>();
    public static ArrayList<RichTextString> Headers3 = new ArrayList<>();
    public static ArrayList<RichTextString> Headers4 = new ArrayList<>();
    public static ArrayList<Integer> Debugger = new ArrayList<>();

    public static void startExcellImport()

     {


        JFileChooser OpenFileChooser = new JFileChooser();
        OpenFileChooser.setApproveButtonText("Open file");
        OpenFileChooser.removeChoosableFileFilter(OpenFileChooser.getFileFilter());
        FileNameExtensionFilter Filter = new FileNameExtensionFilter("Excel File (.xlsx)", "xlsx");
        OpenFileChooser.setFileFilter(Filter);

        if (OpenFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File InputFile = OpenFileChooser.getSelectedFile();
            try (FileInputStream in = new FileInputStream(InputFile)) {


                XSSFWorkbook ImportedFile = new XSSFWorkbook(in);
                XSSFSheet sheet1 = ImportedFile.getSheetAt(0);

                Iterator<Row> RowIterator = sheet1.iterator();
                while (RowIterator.hasNext()) {
                    Row Row = RowIterator.next();
                    Iterator<Cell> CellIterator = Row.cellIterator();
                    while (CellIterator.hasNext()) {
                        Cell Cell = CellIterator.next();

                        if (Row.getRowNum() == 0) {
                            Headers1.add(Cell.getRichStringCellValue());
                        } else {
//                            if (Row.getRowNum() == 1) {
////                                Headers2.add(Cell.getRichStringCellValue());
//                            }

                            if (Cell.getColumnIndex() == 0) {


                                //Debugger.add((int) Cell.getNumericCellValue());


                                //Cell.removeCellComment();

                                Address.add((String) Cell.getStringCellValue());


                            }  else if (Cell.getColumnIndex() == 1) {
                                if (Cell.getCellType().toString() == "STRING"){
                                    Cell.setCellValue(0);
                                }
                                System.out.println(Cell.getNumericCellValue());
                                Rooms.add((int) Cell.getNumericCellValue());
                            } else if (Cell.getColumnIndex() == 2) {
                                Segment.add((String) Cell.getStringCellValue());
                            } else if (Cell.getColumnIndex() == 3) {
                                HouseFloor.add((int) Cell.getNumericCellValue());
                            } else if (Cell.getColumnIndex() == 4) {
                                Material.add((String) Cell.getStringCellValue());
                            }else if (Cell.getColumnIndex() == 5) {
                                FlatFloor.add((int) Cell.getNumericCellValue());
                            }  else if (Cell.getColumnIndex() == 6) {
                               SquareFlat.add((double) Cell.getNumericCellValue());
                            }else if (Cell.getColumnIndex() == 7) {
                                SquareKitchen.add((double) Cell.getNumericCellValue());

                            } else if (Cell.getColumnIndex() == 8) {
                                Balcony.add((String) Cell.getStringCellValue());
                            } else if (Cell.getColumnIndex() == 9) {
                                MetroDistance.add((int) Cell.getNumericCellValue());
                            } else if (Cell.getColumnIndex() == 10) {
                                RepairState.add((String) Cell.getStringCellValue());
                            }


                        }
                    }
                }
                in.close();

                System.out.println("Excel file is read successfully \n");
                System.out.println(Rooms);



            } catch (IOException ex) {
                Logger.getLogger(ExcelImport.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


}
