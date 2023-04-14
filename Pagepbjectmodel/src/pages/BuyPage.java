package pages;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.io.FileUtils;
public class BuyPage {
	
	public WebDriver driver;
	@FindBy(linkText = "Buy Again")
	WebElement ClkOnBuyAgainBtn;
	@FindBy(xpath="(//span[text()='CHIVENIDO Water Bottle Pump 5 Gallon']/parent::span[@class='a-truncate a-size-base a-text-normal'])[1]")
	WebElement ItemName;
	@FindBy(xpath ="(//div[@class='a-section _YnV5L_price_2Lej_'])[1]")
	WebElement ItemPrize;
	@FindBy(linkText ="Not Yet Shipped")
	WebElement clickOnShippedTab;
	@FindBy(linkText = "View all orders")
	WebElement clickOnViewOrdersLink;
	@FindBy(xpath="//div[@id='ordersContainer']/child::div[@class='a-row a-spacing-extra-large a-spacing-top-large']")
	WebElement getRequiredText;
	 /* 
	 * @FindBy(linkText = "View all orders") WebElement ViewOrdersText;
	 */
	@FindBy(linkText = "Cancelled Orders")
	WebElement ClickOnCancelledOrders;
	@FindBy(xpath = "//div[@id='ordersContainer']/child::div[@class='a-row a-spacing-extra-large a-spacing-top-large']")
	WebElement GetCancelledOrderText;
	@FindBy(xpath="//a[@title='Return to Your Account']/child::span")
	WebElement ClickonMyAccTab;
	@FindBy(xpath="(//div[@class='a-box-inner'])[5]")
	WebElement ClkOnPaymentOptions;
	@FindBy(xpath="//div[@class='a-row a-spacing-top-large']/span")
	WebElement getPaymentOptionsTxt;
	
	public BuyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnbuyAgainBtn() {
		ClkOnBuyAgainBtn.click();
	}
	public String item() {
		return ItemName.getText();
	}
	public String itemPrize() {
		return ItemPrize.getText();
	}
	
	public void clickOnShippedTab() {
		clickOnShippedTab.click();
	}
	
	public void clickOnViewOrdersLink() {
		clickOnViewOrdersLink.click();
		driver.switchTo().defaultContent();
		
	}
	
	public String getReqText() {
		return getRequiredText.getText();
		
	}
	
	/*
	 * public String getViewOrdersTxt() { return ViewOrdersText.getText(); }
	 */
	
	public void clickOnCancelledTab() {
		ClickOnCancelledOrders.click();
	}
	
	public String getCancelledTextForTab() {
		return GetCancelledOrderText.getText();
	}
	
	public void clkOnMyAccTab() {
		ClickonMyAccTab.click();
	}
	
	public void clkPaymentOptions() {
		ClkOnPaymentOptions.click();
	}
	
	public String getPaymentOpt() throws Exception {
		TakesScreenshot tScr=(TakesScreenshot)driver;
		File source=tScr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\arako\\eclipse-workspace\\Vnktswara\\Screenshots.Image2.png"));
		return getPaymentOptionsTxt.getText();
		}
	
	

}
