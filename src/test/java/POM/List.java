package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class List {
	
@FindBy(name = "name")
 private WebElement ListA;

public WebElement getListA() {
	return ListA;
}



public void setListA(WebElement listA) {
	ListA = listA;
}



public WebElement getAdd() {
	return add;
}



public void setAdd(WebElement add) {
	this.add = add;
}



public WebElement getListB() {
	return ListB;
}



public void setListB(WebElement listB) {
	ListB = listB;
}



public WebElement getAdd1() {
	return add1;
}



public void setAdd1(WebElement add1) {
	this.add1 = add1;
}



public WebElement getAddcard() {
	return addcard;
}



public void setAddcard(WebElement addcard) {
	this.addcard = addcard;
}



public WebElement getCreatename() {
	return Createname;
}



public void setCreatename(WebElement createname) {
	Createname = createname;
}



@FindBy(xpath = "//input[@class='nch-button nch-button--primary mod-list-add-button js-save-edit']")
private WebElement add;

@FindBy(xpath = "//input[@class='list-name-input']")
private WebElement ListB;

@FindBy(xpath = "//input[@class='nch-button nch-button--primary mod-list-add-button js-save-edit']")
private WebElement add1;

@FindBy(xpath = "//a[@class='open-card-composer js-open-card-composer']")
private WebElement addcard;

@FindBy(xpath = "//textarea[@class='list-card-composer-textarea js-card-title']")
private WebElement Createname;
	
@FindBy(xpath = "(//input[@type='submit'])[1]")
private WebElement clickcreatename;

@FindBy(xpath = "//div[@class='list-card-details js-card-details']")
private WebElement drag;

@FindBy(xpath = "//h2[text()='List B']//parent::div[@class='list-header js-list-header u-clearfix is-menu-shown']//following-sibling::div[@class='card-composer-container js-card-composer-container']")
private WebElement drop;


public void setDrag(WebElement drag) {
	this.drag = drag;
}



public void setDrop(WebElement drop) {
	this.drop = drop;
}



public WebElement getDrag() {
	return drag;
}



public WebElement getDrop() {
	return drop;
}



 
	public WebElement getClickcreatename() {
	return clickcreatename;
}



public void setClickcreatename(WebElement clickcreatename) {
	this.clickcreatename = clickcreatename;
}



	public List(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}}

