package testUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFile {
static String data;

public static String fetchdatafromexcel(int row,int cell) throws EncryptedDocumentException, IOException {

String path="src"+File.separator+"test"+File.separator+"resources"+File.separator+"File"+File.separator+"Book1.xlsx";
FileInputStream file=new FileInputStream(path);
Cell c=	WorkbookFactory.create(file).getSheet("Sheet2").getRow(row).getCell(cell);
CellType type=c.getCellType();
if(type==CellType.STRING) {
 data=c.getStringCellValue();
}
else if(type==CellType.NUMERIC) {
    double pqr=c.getNumericCellValue();
	data=Double.toString(pqr);
}
else if(type==CellType.BLANK)	{
	System.out.println("blank");

}return data;
}

}
