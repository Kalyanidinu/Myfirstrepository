package pages;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@aria-label='Open Menu']")
	WebElement ClkAllIcon;
	@FindBy(xpath="(//div[@id='hmenu-content']/descendant::li/child::a[text()='New Releases'])[1]")
	WebElement ClkNewReleases;
	@FindBy(xpath ="//div[@id='hmenu-content']/descendant::li/div[text()='digital content and devices']/following::div[text()='Echo & Alexa']")
	WebElement clkEcho;
	
	
	
	
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
	

}
