package Trello.Creative;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.Create_Board;
import POM.List;
import POM.Login_Page;


public class AppTest extends baseclass {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
		browserlaunch("Chrome");
		
	    geturl("https://trello.com/login");
		
		Login_Page L = new Login_Page(driver);
		
	    userinput(L.getMailid(), "Gowthamr2902@gmail.com");
	    clickelement(L.getLogin());
	    Thread.sleep(3000);
		userinput(L.getPassword(), "Alliswell@1");
		clickelement(L.getLoginsubmit());
		
		Create_Board C = new Create_Board(driver);
		
		implicitywait();
		clickelement(C.getCreate());
		clickelement(C.getBoard());
		userinput(C.getBoardname(), "Creative world");
		clickelement(C.getCreatebutton());
		
		
		List L1 = new List(driver);
		
		implicitywait();
		userinput(L1.getListA(), "List A");
		clickelement(L1.getAdd());
		userinput(L1.getListB(),"List B");
		clickelement(L1.getAdd1());
		clickelement(L1.getAddcard());
		userinput(L1.getCreatename(), "Create Future");
		clickelement(L1.getClickcreatename());
		
		implicitywait();
		
		Actions actions = new Actions(driver);

		actions.dragAndDrop(L1.getDrag(), L1.getDrop()).build().perform();

		Point point = L1.getDrop().getLocation();

		System.out.println(point.getX());

		System.out.println(point.getY());

		
		
		
	}
    
    
}
