package Trello.Creative;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class baseclass {
	 static Properties p;

	
	static WebDriver driver;
	public static WebDriver browserlaunch(String value) {
		//launch browser - browserlaunch
		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Creative\\driver\\chromedriver.exe");


			// incognito
			ChromeOptions option=new ChromeOptions();
			option.addArguments("incognito");

			driver =new ChromeDriver();

		} else if (value.equalsIgnoreCase("gecko")){
			System.setProperty(value, value);
		}else {
			System.out.println("invalid browser");
		}
		driver.manage().window().maximize();
		return driver;

	}



	//geturl-geturl

	public static void geturl(String value) {
		driver.get(value);
	}



	//selectmethod-selectfromdrop

	public static void selectfromdrop(WebElement element,String value,String select) {

		Select sc=new Select(element);
		if (value.equalsIgnoreCase("index")) {
			int a = Integer.parseInt(select);
			sc.selectByIndex(a);
		} else if(value.equalsIgnoreCase("text")){
			sc.selectByValue(select);
		}else if(value.equalsIgnoreCase("text")) {
			sc.selectByVisibleText(select);
		}else {
			System.out.println("invalid");
		}
	}

	public static void deselect(WebElement element,String value,String select) {
		Select sc=new Select(element);
		if (value.equalsIgnoreCase("index")) {
			Integer.parseInt(select);
			sc.deselectByIndex(0);
		} else if (value.equalsIgnoreCase("text")) {
			sc.deselectByValue(select);
		}else if (value.equalsIgnoreCase("text")) {
			sc.deselectByVisibleText(select);
		}else{
			System.out.println("invalid");
		}
	}





	//sendkey-userinput

	public static void userinput(WebElement element,String value) {
		element.sendKeys(value);

	}
	//click-clickelement

	public static void clickelement(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}



	//is selected
	public static void selected(WebElement element) {
		boolean b = element.isSelected();
		System.out.println(b);

	}
	//is displayed
	public static void displayed(WebElement element) {
		boolean a = element.isDisplayed();
		System.out.println(a);
	}
	//is eneable
	public static void enabled(WebElement element) {
		boolean c = element.isEnabled();
		System.out.println(c);
	}
	//get attribute

	public static void getattribute(WebElement element,String value) {
		String s = element.getAttribute(value);
		System.out.println(s);
	}

	//implicitywait

	public static void implicitywait() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	// get title

	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	//navigateto


	public static void navigateto(String value) {
		driver.navigate().to(value);
	}

	//back

	public static void back() {
		driver.navigate().back();
	}

	//forward
	public static void forward() {
		driver.navigate().forward();
	}

	//refresh

	public static void refresh() {
		driver.navigate().refresh();
	}
	//close

	public static void close() {
		driver.close();
	}

	//quit

	public static void quit() {
		driver.quit();
	}
	// day 2 start

	//enter
	public static void keyenter() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER );
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void mutipleclick() {

	}

	//movetoelement

	public static void movetoelement(WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	//drag and drop
	public static void draganddrop(WebElement element,WebElement drag,WebElement drop) {
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
	}
	// alert ok
	public static void simplealert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	//   alert cancel   
	public static void cancelalert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	//textbox alert

	public static void textboxalert(WebElement element,String value) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);
	}

	//get text alert

	public static void gettextalert(WebElement element,String value) {
		Alert a = driver.switchTo().alert();
		a.getText();
	}
	// frame with index
	public static void frame(WebElement element) {
		WebDriver frame = driver.switchTo().frame(0);

	}
	// frame with parent


	public static void parentframe() {
		driver.switchTo().parentFrame();
	}

	//deafultconent

	public static void defaultcontent() {
		driver.switchTo().defaultContent();
	}
	//window handel

	public static void windowhandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	//windowhandeles	


	public static void windowhandeles() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String sc : windowHandles) {
			String title = driver.switchTo().window(sc).getTitle();
			System.out.println(title); 	

		}
	}

	//javascript scroll

	public static void scrollintoview(WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	//javascript sendkeys

	public static void scriptuserinput(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='';",element );

	}

	//javascript click

	public static void scriptclickelement(WebElement element) {

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);

	}

	

	




	public static void filereader() throws IOException {
		File f=new File("path");	
		FileInputStream fs=new FileInputStream(f);
	 p=new Properties();
		p.load(fs);
		

	}
	
	
//	public static void testdatareader(String value,int row,int cell) throws Throwable {
//		File f=new File("path");
//		 
//		FileInputStream fi =new FileInputStream(f);
//	Workbook wb= new XSSFWorkbook(fi);
//	Sheet sheet = wb.getSheet(value);
//	Row row1 = sheet.getRow(cell);
//	Cell cell1 = row1.getCell(cell);
//	CellType cellType = cell1.getCellType();
//
//	if (cellType.equals(CellType.STRING)) {
//	String stringCellValue = cell1.getStringCellValue();
//		
//	} else if (cellType.equals(CellType.NUMERIC)) {
//		double numericCellValue = cell1.getNumericCellValue();
//		int a= (int)numericCellValue ;
//	} 

//}


public static void physicalnumoftestdata(String value,int row,int cell) throws Throwable {

	File f=new File("path");
	FileInputStream fi=new FileInputStream(f);
	
//	Workbook wb=new XSSFWorkbook(fi);
//	Sheet sheet = wb.getSheet(value);
//	
//	 int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//	
//	for (int i = 0; i <physicalNumberOfRows ; i++) {
//		Row row2 = sheet.getRow(i);
//		int physicalNumberOfCells = row2.getPhysicalNumberOfCells();
//		
//		
//		for (int j = 0; j <physicalNumberOfCells ; j++) {
//			Cell cell2 = row2.getCell(j);
//			CellType cellType = cell2.getCellType();
//			
//			if (cellType.equals(CellType.STRING)) {
//				String stringCellValue2 = cell2.getStringCellValue();
//				System.out.println(stringCellValue2);
//			} else if (cellType.equals(CellType.NUMERIC)) {
//				double numericCellValue = cell2.getNumericCellValue();
//				int a= (int)numericCellValue;
//			}		
//			
//		}
//		
			
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//}
