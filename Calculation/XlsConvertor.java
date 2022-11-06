import  com.aspose.cells.Workbook;

public class XlsConvertor {



    public static void main(String[] args) throws Exception {
        Workbook workbook = new Workbook("C:\\Users\\admin\\IdeaProjects\\project_for_hakaton\\Calculation\\input.xlsx");
        workbook.save("Output.json");

    //workbook.save("Output.json");
    }

}
