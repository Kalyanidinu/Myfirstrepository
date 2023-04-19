package testpacks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestTwoSample {

	@Test
	public void testMethod1() throws Exception {

		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chrome);
		driver.get("https://seletech.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arakotakalyani92@gmail.com");
		WebElement e1 = driver.findElement(By.xpath("//label[contains(text(),'Email')]"));
		String xString = e1.getText();
		System.out.println(xString);

		driver.findElement(By.id("continue")).click();
		WebElement e2 = driver.findElement(By.linkText("Forgot Password"));
		String s1 = e2.getText();
		System.out.println(s1);

		driver.findElement(By.name("password")).sendKeys("8106537416");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("nav-orders")).click();
		/*
		 * WebElement
		 * element1=driver.findElement(By.xpath("//span[@class='a-dropdown-container']")
		 * ); Select select=new Select(element1);
		 * select.selectByVisibleText("past 3 months")
		 */;

		WebElement e = driver.findElement(By.xpath("//span[@class='a-button-inner']/parent::span[@class='a-button a-button-dropdown']"));
		Select select = new Select(e);
		select.selectByValue("last 30 days");

		/**
		 * WebElement e=driver.findElement(By.xpath("//*[@id=\"a-autoid-1\"]/span/i]"));
		 * e.click(); Thread.sleep(2000); Select eSelect=new Select(e);
		 * eSelect.selectByValue("last 30 days"
		 *//* ); */

	}
}
