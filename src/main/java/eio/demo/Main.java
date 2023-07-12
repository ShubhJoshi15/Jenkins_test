package eio.demo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        // Temporary comment for another logic

//        try {
//           // if(args.length>0) {
//               // String FileName = args[0];
//                String Name = "../ICD_Data.xlsx";
//               // String FilePath = args[1];
//               // String FinalFileName = FilePath.concat("").concat(FileName);
//                //System.out.println("File Name with path is :-"+FinalFileName);
//                //System.out.println();
//
//               // File file = new File(FinalFileName);
//                FileInputStream fis = new FileInputStream(Name);
//                XSSFWorkbook workbook = new XSSFWorkbook(fis);
//                Sheet sheet = workbook.getSheetAt(0);
//
//                System.out.println("Data IS -> \n");
//
//                for (Row row : sheet) {
//                    for (Cell cell : row) {
//                        System.out.print(cell.toString() + " \t" + " \t ");
//                    }
//                    System.out.println();
//                }
//            //}
//
//
//            System.out.println("Hello Shubham....");
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//        }


//        try {
//
//            String folderPath = "../";
//            File folder = new File(folderPath);
//            File[] listOfFiles = folder.listFiles();
//
//            for(File f : listOfFiles)
//            {
//                if(f.exists())
//                {
//                    if(f.getName().endsWith(".xlsx")){
//                    System.out.println("File present -> "+f.getName());}
//                }
//                else {
//                    System.out.println("File not present reassign with new name");
//                    listOfFiles = new File(f.getName().substring(3)).listFiles();
//                }
//            }
//
//            for (File file : listOfFiles) {
//                if (file.isFile() && file.getName().endsWith(".xlsx")) {
//                        System.out.println("The Excel file is : ->"+file.getName()+"\n");
//                        FileInputStream fis = new FileInputStream(file);
//                        Workbook workbook = new XSSFWorkbook(fis);
//                        Sheet sheet = workbook.getSheetAt(0);
//                        for (Row row : sheet) {
//                            for (Cell cell : row) {
//                                System.out.print(cell.toString() + " \t" + " \t ");
//                            }
//                        System.out.println();
//                    }
//                }
//                System.out.println();
//            }
//            }catch (IOException e)
//            {
//            e.printStackTrace();
//            }

        System.out.println("Hello Shubham....");
        try {
            for(String fileArg : args)
            {
                //fileList.add(fileArg);
                String fileName = fileArg;
                File f = new File(fileName);

                if (f.exists()) {
                    System.out.println("Exists");
                }
                else {
                    System.out.println("File not exist reassign with different file name ");
                    String filePath = "../";
                    fileName = filePath.concat("").concat(fileName);

                }
                FileInputStream fis = new FileInputStream(fileName);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                Sheet sheet = workbook.getSheetAt(0);

                System.out.println("Data IS -> \n");

                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + " \t" + " \t ");
                    }
                    System.out.println();
                }
            }



        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}