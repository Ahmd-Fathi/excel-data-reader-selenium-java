package Utils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class separateSheetUtil {

    private File separatedSheet;
    private Sheet currentSheet;
    private Map<String, Integer> columns;

    public  separateSheetUtil(File file){
        separatedSheet= file;
        columns=new HashMap<>();



    }


public void SwitchToSheet(String name) throws IOException {

    try (var workbook=WorkbookFactory.create(separatedSheet)){

currentSheet=workbook.getSheet(name);
currentSheet.getRow(0).forEach(cell -> {

    columns.put(cell.getStringCellValue(),cell.getColumnIndex());
});

    }catch (Exception e)
    {
        e.printStackTrace();
    }

}



}
