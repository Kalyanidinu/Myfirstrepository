package testpacks;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	@Test
	public void dropdownsMethod() throws Exception {
		ChromeOptions chrome=new ChromeOptions();
		chrome.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(chrome);
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Droppable")).click();
		
		TakesScreenshot tk=(TakesScreenshot)driver;
		File f=tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\arako\\eclipse-workspace\\Vnktswara\\dragdropscr.jpg"));
		
		List<WebElement> list=driver.findElements(By.xpath("//aside[@class='widget']/descendant::ul[1]"));
		for(int i=1;i<list.size();i++)
		{
			String str=list.get(i).getText();
			System.out.println(str);
			
		}
		System.out.println(list.size());
		
		
		
		driver.findElement(By.xpath("//div[@class='widget-area']/descendant::li/child::a[text()='Selectmenu']")).click();
		WebElement e1=driver.findElement(By.xpath("//*[@id='speed']"));
		Select eSelect=new Select(e1);
		eSelect.selectByIndex(2);
		
		
		
		
		
		/*
		 * WebElement element=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		 * String xString=element.getText();
		 * 
		 * System.out.println("The text is:"+xString);
		 * 
		 */
		
		
		/*
		 * WebElement
		 * src=driver.findElement(By.xpath("//div[contains(@class,'ui-widget-content')]"
		 * )); WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		 * Actions actions=new Actions(driver);
		 * actions.dragAndDrop(src,target).perform();
		 */
		 
		
}	 
/*
 * @Test(priority = 1) public void methodOfDrpdwn() { ChromeOptions chrome=new
 * ChromeOptions(); chrome.addArguments("--remote-allow-origins=*");
 * WebDriverManager.chromedriver().setup(); WebDriver driver=new
 * ChromeDriver(chrome); driver.get("https://jqueryui.com/");
 * driver.manage().window().maximize(); driver.findElement(By.xpath(
 * "//div[@class='widget-area']/descendant::li/child::a[text()='Selectmenu']")).
 * click();
 * 
 * }
 */
		
	}
