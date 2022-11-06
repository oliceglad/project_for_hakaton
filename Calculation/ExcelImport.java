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


    public static void main(String[] args) {

        ArrayList<Integer> FlatFloor = new ArrayList<>();
        ArrayList<Double> SquareFlat = new ArrayList<>();
        ArrayList<Double> SquareKitchen = new ArrayList<>();
        ArrayList<String> Balcony = new ArrayList<>();
        ArrayList<Integer> MetroDistance = new ArrayList<>();
        ArrayList<String> RepairState = new ArrayList<>();
        ArrayList<RichTextString> Headers1 = new ArrayList<>();
        ArrayList<RichTextString> Headers2 = new ArrayList<>();
        ArrayList<RichTextString> Headers3 = new ArrayList<>();
        ArrayList<RichTextString> Headers4 = new ArrayList<>();
        ArrayList<Integer> Debugger = new ArrayList<>();


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
                            if (Row.getRowNum() == 1) {
                                Headers2.add(Cell.getRichStringCellValue());
                            } else {

                                if (Cell.getColumnIndex() == 5) {

                                    System.out.println(Row.getRowNum());
                                    //Debugger.add((int) Cell.getNumericCellValue());


                                    //Cell.removeCellComment();

                                    FlatFloor.add((int) Cell.getNumericCellValue());


                                } else if (Cell.getColumnIndex() == 6) {
                                    SquareFlat.add((double) Cell.getNumericCellValue());
                                } else if (Cell.getColumnIndex() == 7) {
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
                }
                in.close();

                System.out.println("Excel file is read successfully \n");
                System.out.println(FlatFloor);
                System.out.println(SquareFlat);
                System.out.println(Balcony);
                System.out.println(MetroDistance);
                System.out.println(RepairState);
                System.out.println(Balcony.contains("Да"));


            } catch (IOException ex) {
                Logger.getLogger(ExcelImport.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


}
