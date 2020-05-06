package com.capgemini.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
public static WebDriver driver;
public static WebDriver openBrowser(String browserName){
	if(browserName.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "E:\\jee-2019-09\\chromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver", "E:\\jee-2019-09\\chromeDriver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/login/password?referer=https%3A%2F%2Fwww.myntra.com%2F&mobile=&show=false");
	
	return driver;
}

public String getExcelData(String path, String sheetname, int row, int cell)
		throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return data;
}

 public static void closeBrowser() {
	 driver.quit();
 }
}
