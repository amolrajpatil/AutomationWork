package com.pom.Pagefactory.Datadriven.TestNG.BaseClass.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	static Workbook wbf;
	static String filepath;
	static FileInputStream file;
	public static String testData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException	//parametrization
	{
		filepath="C:\\BasicJavaWork\\TestNG Framework\\Automation My Work2\\testdata\\ProjectData.xlsx";
		file = new FileInputStream(filepath);
		wbf = WorkbookFactory.create(file);
		String TestValue = wbf.getSheet("Sheet1").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return TestValue;
	}
	public static boolean testData2(int rowIndex,int cellIndex)
	{
		boolean Testvalue2 = wbf.getSheet("Sheet1").getRow(rowIndex).getCell(cellIndex).getBooleanCellValue();
		return Testvalue2;
	}
	
	public static void screenshots(WebDriver driver, int ssid) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\BasicJavaWork\\TestNG Framework\\Automation My Work2\\screenshots\\"+ssid+".jpg");
		FileHandler.copy(src, dest);}
}