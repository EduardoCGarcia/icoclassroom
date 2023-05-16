package test;

import java.io.File;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;

public class Test {

    public static void main(String[] args) {
        try {
            ClassLoader classLoader = Test.class.getClassLoader();
            File archivo = new File(classLoader.getResource("workbooks/Libro1.xlsx").getFile());
            Workbook workbook = WorkbookFactory.create(archivo);
            Sheet hoja = workbook.getSheetAt(0);
            for (Row fila : hoja) {
                for (Cell celda : fila) {
                    String valor = celda.getStringCellValue();
                    System.out.print(valor + "\t");
                }
                System.out.println();
            }
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
