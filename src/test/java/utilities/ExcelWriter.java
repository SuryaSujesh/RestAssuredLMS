package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public String path;

	FileInputStream Fis;
	FileOutputStream Fos;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	Row r;
	Cell c;

	 public ExcelWriter(String path) { this.path = path; } 

	
	public String setcelldata(String sheetname, int rownum, int cellnum, String data) throws IOException 
	{

		
		
		
		
		 Fis= new FileInputStream(path);
	
		 workbook = new XSSFWorkbook(Fis);
		// workbook = new XSSFWorkbook();
		 if(workbook.getSheetIndex(sheetname)==-1)
		  
		   workbook.createSheet(sheetname); 
		  
		  sheet=workbook.getSheet(sheetname);
		  //rownum=0;
		  
		  if(sheet.getRow(rownum)==null)
		  
		  sheet.createRow(rownum);
		  
		  sheet.getRow(rownum).createCell(cellnum).setCellValue(data);
	
			 
		  Fos = new FileOutputStream(path);
		  workbook.write(Fos); 
		  workbook.close(); 
		// Fis.close();
		 Fos.close(); 
		  
		  return data;
		  
		  
		 
	

	}

}
