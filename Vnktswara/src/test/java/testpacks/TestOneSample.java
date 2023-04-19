package testpacks;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestOneSample {
	@Test
	public void firstMeth() throws Exception {
		ChromeOptions cOptions=new ChromeOptions();
		cOptions.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(cOptions);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arakotakalyani92@gmail.com");
		WebElement e1=driver.findElement(By.xpath("//label[contains(text(),'Email')]"));
		String xString=e1.getText();
		System.out.println(xString);

		driver.findElement(By.id("continue")).click();
		WebElement e2=driver.findElement(By.linkText("Forgot Password"));
		String s1=e2.getText();
		System.out.println(s1);

		driver.findElement(By.name("password")).sendKeys("8106537416");
		driver.findElement(By.id("signInSubmit")).click();

		/*@Test
		public void method2() {
		ChromeOptions cOption=new ChromeOptions();
		cOption.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(cOption);
		driver.get("https://www.amazon.in");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("arakotakalyani92@gmail.com");
		WebElement e1=driver.findElement(By.xpath("//label[contains(text(),'Email')]"));
		String xString=e1.getText();
		System.out.println(xString);

		driver.findElement(By.id("continue")).click();
		WebElement e2=driver.findElement(By.linkText("Forgot Password"));
		String s1=e2.getText();
		System.out.println(s1);

		driver.findElement(By.name("password")).sendKeys("8106537416");
		driver.findElement(By.id("signInSubmit")).click();*/
		driver.findElement(By.xpath("//a[@id=\"nav-orders\"]")).click();
		WebElement ee=driver.findElement(By.xpath("//span[@class=\"a-dropdown-container\"]"));
		ee.click();
		driver.findElement(By.xpath("//input[@aria-label=\"Search all orders\"]")).sendKeys("Pressure Cooker"); 
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		//Select s=new Select(e3);
		//s.selectByIndex(4);
		//driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();

		
		
		 //Actions actions=new Actions(driver);
				/*
		* int height=200; int width=500; actions.moveByOffset(height, width);
		* driver.findElement(By.
		* xpath("//a[text()='View or edit your browsing history']")).click();
		* 
		*/
		/*
		 * int x=driver.manage().window().getPosition().getX(); int
		 * y=driver.manage().window().getPosition().getY(); System.out.println(x+""+y);
		 * Point point=new Point(400,400); driver.manage().window().setPosition();
		 */














	}	

}
