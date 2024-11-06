package fileOpreation;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class workbook {

	public static void main(String[] args) throws IOException {
		//open the workBook
				XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Asus\\eclipse-workspace\\seleniumJavaProject\\src\\test\\java\\fileOpreation\\Sheet1.xlsx");

				//open the sheet
				XSSFSheet sheet = book.getSheet("Sheet1");
				
				//get row & column
				int rowCount = sheet.getLastRowNum();
				int columnCount = sheet.getRow(0).getLastCellNum();
				
				//printing the data
				for(int i=1;i<=rowCount;i++) {
					XSSFRow row = sheet.getRow(i);
					
					for(int j=0;j<columnCount;j++) {
						XSSFCell column = row.getCell(j);
						System.out.println(column.getStringCellValue());
					}
					System.out.println("");
				}
				book.close();
			}

	}


