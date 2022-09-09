package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Board {
	@FindBy(xpath = "(//button[@type='button'])[6]")
	private WebElement Create;
	
	public WebElement getCreate() {
		return Create;
	}

	public void setCreate(WebElement create) {
		Create = create;
	}

	public WebElement getBoard() {
		return Board;
	}

	public void setBoard(WebElement board) {
		Board = board;
	}

	public WebElement getBoardname() {
		return Boardname;
	}

	public void setBoardname(WebElement boardname) {
		Boardname = boardname;
	}

	public WebElement getCreatebutton() {
		return Createbutton;
	}

	public void setCreatebutton(WebElement createbutton) {
		Createbutton = createbutton;
	}

	@FindBy(xpath = "(//button[@class='R2Zt2qKgQJtkYY'])[1]")
	private WebElement Board ;
	
	@FindBy(xpath = "//input[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']")
	private WebElement Boardname;
	
	@FindBy(xpath = "//button[@class='G2lWjDVJsvar3H Ts+YceGnvTbKoG HPCwi137Em5EYI JIXQq8gDYY04N6']")
	private WebElement Createbutton;

	public Create_Board(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
}
