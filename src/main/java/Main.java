import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Main {
    public static void main(String[] args) {

        ReadExcel test = new ReadExcel();
        test.setInputFile("C:\\Java\\XLS_Test2.xls");
        try {
            test.read();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
