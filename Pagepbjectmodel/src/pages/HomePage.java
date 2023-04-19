package pages;

import java.io.File;

import java.util.List;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
public WebDriver driver;
@FindBy(xpath ="//input[@aria-label='Search Amazon.in']")
WebElement searchItem;
@FindBy(id="nav-search-submit-button")
WebElement serachMagIcon;
@FindBy(xpath = "//span[@class='a-button-inner']/child::span[@class='a-button-text a-declarative']")
WebElement ClkFeaturedDrpdwn;
@FindBy(xpath = "//select[@class='a-native-dropdown a-declarative']")
WebElement SelectNewArrivals;
@FindBy(xpath = "//span[text()='1-48 of over 40,000 results for']")
WebElement GetText;
@FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']/child::span[text()='\"interior decoration items\"']")
WebElement nxtCancatinateTxt;
@FindBy(xpath="//a[@id='nav-orders']")
WebElement clickOnReturnsAOrders;
@FindBy(xpath="(//div[@class='a-carousel-row-inner'])[1]/descendant::ol[@role='list']")
List<WebElement> allitemsList;
/*
 * @FindBy(id="low-price") WebElement selectPrice;
 * 
 * @FindBy(name="high-price") WebElement maxPrice;
 * 
 * @FindBy(xpath ="//input[@class='a-button-input']") WebElement goNext;
 */

public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

public void searchItemintextField(String a) {
	searchItem.sendKeys(a);
}

public void searchMagnifiedIcon() {
	serachMagIcon.click();
}

public void clkFeatured() {
	ClkFeaturedDrpdwn.click();
}

public void selectNewArr() {
	Select s=new Select(SelectNewArrivals);
	s.selectByVisibleText("Newest Arrivals");
	System.out.println("Dropdown value selected successfully.");
	//ssSelectNewArrivals.click();
}
public String getTxt() {
	return GetText.getText();
}
public String getNxtText() {
	return nxtCancatinateTxt.getText();
}
public void ordersAndReturns() {
clickOnReturnsAOrders.click();
}

public void allItemslistInReturnAOrders() throws Exception {
	for(WebElement allitems:allitemsList ) {
System.out.println(allitems);
	

	}
TakesScreenshot src=(TakesScreenshot)driver;
File file=src.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file, new File("C:\\Users\\arako\\eclipse-workspace\\Vnktswara\\image3.png"));

	
	
}



/*
 * public void enterPrice(String f) { selectPrice.sendKeys(f); } public void
 * enterMaxPrice(String g) { maxPrice.sendKeys(g); }
 * 
 * public void goNxt() { goNext.click(); }
 */
}