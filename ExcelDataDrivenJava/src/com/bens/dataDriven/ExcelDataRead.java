package com.bens.dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFSheet sheet = null;
		String location = "D:/WorkSpace/Eclipse/ExcelDataDrivenJava/dataSheetMaven.xlsx";
		FileInputStream f = new FileInputStream(location);
		XSSFWorkbook wb = new XSSFWorkbook(f);
		
		if (wb.getSheetName(0).equals("Cred"))

		{
			System.out.println("Sheet found");
			sheet = wb.getSheetAt(0);
		} else {
			System.out.println("Sheet not found");
		}
		String username = sheet.getRow(0).getCell(1).getStringCellValue();
		String password = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("User name and password" + username + password);
		System.out.println("Executed successfully");
		
	}

}
