package com.BaseClass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddactinBaseClass {
	public static WebDriver driver;
	Actions a;
	 Alert Al;
	 Robot r;
	
	public WebDriver launchBrsr() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops =new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(ops);
		 return driver;
	}
	
	public void openUrl(String url) {
		driver.get(url);
	}
	
	public void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public void sendValue(String value, WebElement element) {
		element.sendKeys(value);
		
	}
	
	public void btnClick(WebElement element) {
	element.click();
	}
	
	public void quitBrowser() {
		driver.quit();
	} 
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	
	public String getAttributeValue(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		return attribute;
	}
	
	public void closeBrsr() {
			driver.close();
	}
	public Actions dragAndDropAct(WebElement source, WebElement target) {
		Actions dragAndDrop = a.dragAndDrop(source, target);
		return dragAndDrop;
	}
	public Actions mouseAct(WebElement target) {
		Actions moveToElement = a.moveToElement(target);
		return moveToElement;
	}
	
	public Actions rClick(WebElement target) {
		Actions contextClick = a.contextClick(target);
		return contextClick;
	}
	public Actions dbleClick(WebElement target) {
		Actions dbleClick = a.doubleClick(target);
		return dbleClick;
	}
	
	public void acceptAlert() {
		Al.accept();
	}
	public void dismissAlert() {
		Al.dismiss();
	}
	
	public void navigateTo(String url) {
		 driver.navigate().to(url);
	}
	public void keyPressDown() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public void keyEnter() {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void keyPressUp() {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	
	}
	
	public void selectByIndex(WebElement WebElement, int index) {
		Select s = new Select(WebElement);
		s.selectByIndex(index);	
		
	}
	
	/*public String getDataFromExcel(String loc, String sName, int rNo, int cNo) throws IOException {
		String value = null;
		File xlloc = new File(loc);
		FileInputStream fIn = new FileInputStream(xlloc);
		@SuppressWarnings("resource")
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet(sName);
		Row r = s.getRow(rNo);
		Cell c = r.getCell(cNo);
		CellType type = c.getCellType();
		
		switch (type) {
		case STRING:
			 value = c.getStringCellValue();
			break;
			
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(c)){
				Date dt = c.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
				value = sdf.format(dt);
			}else {
				double d = c.getNumericCellValue();
				long l =(long)d;
			    value = String.valueOf(l);
			    break;
			}
			
			
		default:
			break;
		}
		return value; 
	}*/
	
	
	
	
}
	


