package com.too_codemen.app.calculation;

import com.aspose.cells.*;

import java.io.BufferedWriter;
import java.io.FileWriter;

//import org.apache.poi.ss.usermodel.Workbook;

public class XlsConvertor {



    public static void main(String[] args) throws Exception {
//        Workbook workbook = new Workbook("C:\\Users\\admin\\IdeaProjects\\project_for_hakaton\\Calculation\\input.xlsx");
//        workbook.save("Output.json");

        // загрузить файл XLSX с экземпляром Workbook
        Workbook workbook = new Workbook("F:\\AppDemo\\src\\main\\java\\com\\too_codemen\\app\\calculation\\test.xlsx");
// получить доступ к CellsCollection рабочего листа, содержащего данные для преобразования
        Cells cells = workbook.getWorksheets().get(0).getCells();
// создать и установить ExportRangeToJsonOptions для дополнительных параметров
        ExportRangeToJsonOptions exportOptions = new ExportRangeToJsonOptions();
// создать диапазон ячеек, содержащих данные для экспорта
        Range range = cells.createRange(0, 0, cells.getLastCell().getRow() + 1, cells.getLastCell().getColumn() + 1);
// экспортировать диапазон как данные JSON
        String jsonData = JsonUtility.exportRangeToJson(range, exportOptions);
// записать данные на диск в формате JSON
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.json"));
        writer.write(jsonData);
        writer.close();

    }

}
