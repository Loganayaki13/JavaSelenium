package fileOpreation;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writing {

	public static void main(String[] args) throws IOException {
		
		
		//open work book
				XSSFWorkbook book = new XSSFWorkbook();
				
				//sheet creating
				XSSFSheet sheet = book.createSheet("Sheet1");
				
				//data -> Name, Age, Email
				Object[][] data = {
						
					{"Name", "Age", "Email"},
					{"John Doe",30,"john@test.com"},
					{"Jane Doe",28,"john@test.com"},
					{"Bob Smith",35,"jacky@example.com"},
					{"Swapnil",37,"swapnil@example.com"}
							
				};
				
				//adding data into sheet
				//row
				int rowcount = 0;	
				for(Object[]row :data) {
					XSSFRow rows = sheet.createRow(rowcount++);
					
					// column
					int columncount = 0;
					for(Object col : row) {
						XSSFCell cell = rows.createCell(columncount++);
						
						
						//writing and checking data
						if(col instanceof String) {
							cell.setCellValue((String)col);
						}
						else if (col instanceof Integer) {
							cell.setCellValue((Integer)col);
						}
					}
				}
				
				//creating file
				try {
					FileOutputStream fos = new FileOutputStream("C:\\Users\\Asus\\eclipse-workspace\\seleniumJavaProject\\src\\test\\java\\fileOpreation\\Sheet1.xlsx");
					book.write(fos);
				} catch (Exception e) {
					System.out.println("Exception: "+e);
				}
				book.close();
			}
}
