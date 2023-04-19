package testpacks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownsPractice {
	@Test
	public void dropdownsMethod() throws Exception {
		ChromeOptions chrome=new ChromeOptions();
		chrome.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chrome);
		driver.get("https://seletech.in");
		driver.findElement(By.linkText("Practice")).click();
		WebElement element=driver.findElement(By.name("dropdown-class-example"));
		Select eSelect=new Select(element);
		eSelect.selectByIndex(1);
		Thread.sleep(2000);
		eSelect.selectByIndex(1);
		List<WebElement> element2=eSelect.getOptions();

		System.out.println(element2);

		WebElement e2=driver.findElement(By.xpath("//select[@name='multiple-select-example']"));
		Select s1=new Select(e2);
		s1.selectByIndex(0);
		Thread.sleep(2000);
		s1.selectByVisibleText("Peach");
		driver.findElement(By.xpath("//input[@name='checkBoxOption1']/parent::label[@for='checkBoxOption1']")).click();
		WebElement e3=driver.findElement(By.xpath("//legend[text()='Switch To Alert Example']"));
		String xString1=e3.getText();
		System.out.println("Text:"+xString1);
		driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys("Text1");
		//Simple Alert
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		//driver.switchTo().alert().accept();
		Alert alert=driver.switchTo().alert();
		System.out.println("Simple alert:"+alert.getText());
		Thread.sleep(2000);
		alert.accept();
		WebElement e4=driver.findElement(By.xpath("//p[text()='Double click to resize this object.']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(e4);
		Thread.sleep(2000);
		String s2=e4.getText();
		System.out.println("Displayed Text:"+s2);
		
		Thread.sleep(2000);
		WebElement e5=driver.findElement(By.xpath(""));
		WebElement e6=driver.findElement(By.xpath("//div[@id='div1']/parent::div[@class='col']"));
		Actions actions2=new Actions(driver);
		actions2.dragAndDrop(e5, e6).perform();
		Thread.sleep(2000);
		
		



	}






}
