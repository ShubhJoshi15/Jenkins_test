package eio.demo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\Quarkus\\employee.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        System.out.println("Data IS -> \n");

        for(Row row : sheet)
        {
            for(Cell cell : row)
            {
                System.out.print(cell.toString()+ " \t"+" \t ");
            }
            System.out.println();
        }
    }
}