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



public class AllPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@aria-label='Open Menu']")
	WebElement ClkAllIcon;
	@FindBy(xpath="(//div[@id='hmenu-content']/descendant::li/child::a[text()='New Releases'])[1]")
	WebElement ClkNewReleases;
	@FindBy(xpath ="//div[@id='hmenu-content']/descendant::li/div[text()='digital content and devices']/following::div[text()='Echo & Alexa']")
	WebElement clkEcho;
	@FindBy(xpath ="//div[@class='celwidget c-f']/descendant::div/a[text()='Home & Kitchen']")
	WebElement ClkOnHomeKitchenTab;
	@FindBy(xpath="//div[@class='celwidget c-f']/descendant::a[text()='Furniture']")
	WebElement ClkFurnitureBtn;
	@FindBy(xpath = "//div[@class='a-section _p13n-zg-banner-list-page-header_style_zgListPageBanner__3k1EE']")
	WebElement GetTxtOfAmazonHotNewReleases;
	@FindBy(xpath = "//div[@class='_p13n-zg-nav-tree-all_style_zg-browse-group__88fbz']/descendant::div[@class='_p13n-zg-nav-tree-all_style_zg-browse-group__88fbz'  and @role='group']")
	WebElement GetAlOptions;
	@FindBy(linkText = "Gift Cards")
	WebElement ClkGiftCard;
	@FindBy(xpath = "//div[@id='nav-progressive-subnav']/descendant::a[@aria-label='Birthday']")
	WebElement GiftCardForBday;
	@FindBy(xpath = "//div[@class='a-section a-spacing-small']/descendant::span[text()='Recipient']/following::ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium']/descendant::span[text()='Brother']")
	WebElement BirtdayGiftBro;
	@FindBy(xpath = "//*[@id=\"p_89/Amazon Pay\"]/span/a/span")
	WebElement AmzPay;
	@FindBy(xpath = "//span[@class='rush-component s-latency-cf-section']/child::div[@class='s-main-slot s-result-list s-search-results sg-row']/child::div")
	List<WebElement> ItemsPrintOnUi;
	@FindBy(xpath = "//div[@class='a-section a-spacing-none']/descendant::div[@class='a-section a-spacing-none']/following::ul")
	List<WebElement> AllOpts;
	@FindBy(xpath = "//div[@class='nav-sprite']/child::div[@class='nav-fill']")
	List<WebElement> HeaderLabels;
	@FindBy(xpath="//select[@class='a-native-dropdown a-declarative']")
	
	WebElement selectDrp;
	
	public  AllPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void clkOnAllIcon() {
		ClkAllIcon.click();
	}
	
	public void clkOnNewRlsIcon() throws Exception {
	ClkNewReleases.click();
	TakesScreenshot tks=(TakesScreenshot)driver;
	File fl=tks.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(fl, new File("C:\\Users\\arako\\eclipse-workspace\\Vnktswara\\newrelease.png"));
	System.out.println("Amazon hot rew releases screenshot taken successfully");
	
	}
	
	public void clkOnEchoAAlexa() {
		clkEcho.click();
	}
	public void clkOnHAK() {
		ClkOnHomeKitchenTab.click();
	}
	public void clkFurniture() {
		ClkFurnitureBtn.click();
	}
	public String getAmazonHotreleases() {
		 
		return GetTxtOfAmazonHotNewReleases.getText();
		
		}
	public void getAmazonsCountOPtions() throws Exception {
		
		TakesScreenshot tscr=(TakesScreenshot)driver;
		File files=tscr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(files, new File("C:\\Users\\arako\\eclipse-workspace\\Vnktswara\\FurnitureOptions.jpg"));
		GetAlOptions.getText();
		}
	
	public void clickOnGiftCard() throws Exception {
		
		ClkGiftCard.click();
		TakesScreenshot tk1=(TakesScreenshot)driver;
		File f1=tk1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("C:\\Users\\arako\\eclipse-workspace\\Vnktswara\\GiftCards.jpg"));
	}
	
	public void giftCardForBirthday() {
		GiftCardForBday.click();
	}
	
	public void birthdayBro() {
		BirtdayGiftBro.click();
	
	}
	
	public void amazonPayment() throws Exception {
		AmzPay.click();
		TakesScreenshot tScrn=(TakesScreenshot)driver;
		File f2=tScrn.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f2, new File("C:\\Users\\arako\\eclipse-workspace\\Vnktswara\\AmazonPay.jpg"));
	}
	
	
	  public void listOfItemsPrint()
	  
	  { 
		  for(int i=1;i<ItemsPrintOnUi.size();i++) {
			 String str1=ItemsPrintOnUi.get(i).getText();
			 System.out.println(str1);
		  }
		
		   
	  }
	  
	  public void alBrandOptions() {
		  for(int j=1;j<AllOpts.size();j++) {
			  String str2=AllOpts.get(j).getText();
			  
			  System.out.println(str2);
			  
		  }
		  System.out.println("Total count of: " + AllOpts.size());
	  }
	  
	  public void getHeaderOpt() {
		  for(int k=1;k<HeaderLabels.size();k++) {
		String str3=HeaderLabels.get(k).getText();
		System.out.println(str3);
		
		  }
		  
		  System.out.println(HeaderLabels.size());
	  }
	  
	  public void getDrpdwnOpt() {
			Select select=new Select(selectDrp);
			select.selectByVisibleText("Avg. Customer Review");
			


	  }
	  
	 

}
