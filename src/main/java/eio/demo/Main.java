package eio.demo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args)  {
        try {
           // if(args.length>0) {
               // String FileName = args[0];
                String Name = "../ICD_Data.xlsx";
               // String FilePath = args[1];
               // String FinalFileName = FilePath.concat("").concat(FileName);
                //System.out.println("File Name with path is :-"+FinalFileName);
                //System.out.println();

               // File file = new File(FinalFileName);
                FileInputStream fis = new FileInputStream(Name);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                Sheet sheet = workbook.getSheetAt(0);

                System.out.println("Data IS -> \n");

                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + " \t" + " \t ");
                    }
                    System.out.println();
                }
            //}


            System.out.println("Hello Shubham....");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}