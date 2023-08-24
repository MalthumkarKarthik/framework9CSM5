package genariclibarary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
		private Workbook workbook;
	public void excelInit(String excelPath)
	{
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		try {
			workbook= WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException |IOException e) {
			e.printStackTrace();
	
	}
	}

	public Map<String,String>getData(){
		Map<String,String> map=new HashMap<String, String>();
		DataFormatter df=new DataFormatter();
		
		Sheet, TextParagraph<S,P,? extends TextRun>> sheet=workbook.getSheet(sheetName);
		
		for(int i=0;i<sheet.getLastRowNum();i++) {
			if(df.formatCellValue(sheet.getRow(i).getCell(1)).equals(expectedText)) {
				for(int j=i;j<=sheet.getLastRowNum();j++)
				{
					map.put(df.formatCellValue(sheet.getRow(j).getCell(2)),df.formatCellValue(sheet.getRow(j).getCell(3));
					if(df.formatCellValue(sheet.getRow(j).getCell(2)).equals("####"));
					break;
				}
				break;
			}
			
		}
		return map;
		
		
	public void writeToExcel(String sheetName,Object expectedTest)
	{
		DataFormatter df= new DataFormatter();
		Sheet sheet =workbook.getSheet(sheetName);
		for(int i=0;i<=sheet.getLastRowNum(i);i++)
		{
			if(df.formatCellValue(sheet.getRow(i).getCell(1)).equals(expectedTest)) {
				Call call=sheet.getRow(i).createCell(4);
				cell.setCellValue(status);
				break;
			}
	
	}



