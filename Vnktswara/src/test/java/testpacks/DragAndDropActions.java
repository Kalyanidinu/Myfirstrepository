package testpacks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropActions {
	@Test
	public void drag() {
	ChromeOptions chrome=new ChromeOptions();
	chrome.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(chrome);
	driver.get("https://seletech.in");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Practice")).click();
	driver.close();
	
	}
	
	
		@Test(priority = 1)
		public void drags() throws Exception {
		ChromeOptions chrome=new ChromeOptions();
		chrome.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chrome);
		driver.get("https://seletech.in");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Practice")).click();
		WebElement element=driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		Select select=new Select(element);
		select.selectByVisibleText("Option3");
		System.out.println("Dropdown text selected successfully:" +element);
		
		WebElement e1=driver.findElement(By.xpath("//button[@class='btn btn-danger dropdown-toggle']"));
		Select select2=new Select(e1);
		select2.selectByIndex(1);
		System.out.println("Dropdown selected successfully");
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(120,1));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		//driver.manage().timeouts().pageLoadTimeout(6, 1000);
		
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(6, driver, 1000);
		//driver.manage().window().setSize(new Dimension(1000, 1000));
		/*
		 * driver.findElement(By.linkText("Practice")).click();
		 * driver.findElement(By.linkText("Click Here")).click();
		 * 
		 * WebElement e1=driver.findElement(By.xpath(
		 * "//img[@ondragstart='drag(event)']/parent::div[@class='col']"));
		 * 
		 * WebElement e2=driver.findElement(By.xpath(
		 * "//div[@ondrop='drop(event)']/ancestor::div[@class='col'][1]")); Actions
		 * ac1=new Actions(driver); ac1.dragAndDrop(e1, e2).build().perform();
		 * TakesScreenshot screenshot=(TakesScreenshot)driver; File
		 * file=screenshot.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(file,
		 * new File("./Screenshots/Image1.png"));
		 * 
		 * 
		 * }
		 * 
		 * @Test(priority = 2) public void drag1() { ChromeOptions chrome=new
		 * ChromeOptions(); chrome.addArguments("--remote-allow-origins=*");
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new
		 * ChromeDriver(chrome); driver.get("https://seletech.in");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.linkText("Practice")).click();
		 * 
		 * 
		 */}
}