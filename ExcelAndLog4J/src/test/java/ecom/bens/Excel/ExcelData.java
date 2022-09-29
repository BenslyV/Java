package ecom.bens.Excel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {
	@Test
	public void excelmethod() throws Exception {

		XSSFSheet sheet = null;
		String location = "D:/WorkSpace/Eclipse/ExcelDataDrivenJava/dataSheetMaven.xlsx";
		FileInputStream f = new FileInputStream(location);
		XSSFWorkbook wb = new XSSFWorkbook(f);
		if (wb.getSheetName(0).equals("Cred")) {
			System.out.println("Sheet found");
			sheet = wb.getSheetAt(0);
		} else {
			System.out.println("Sheet not found");
		}
		XSSFCell user_val = sheet.getRow(0).getCell(1);
		String username = user_val.toString();
		XSSFCell pass_val = sheet.getRow(1).getCell(1);
		String password = pass_val.toString();
		System.out.println("User name and password" + username + password);
	}
}
