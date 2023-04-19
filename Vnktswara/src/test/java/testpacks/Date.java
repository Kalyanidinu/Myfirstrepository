package testpacks;

import java.io.Serializable;

import java.text.SimpleDateFormat;


import org.testng.annotations.Test;

public class Date {
	@Test
	public void test() throws Exception {
		/*
		 * ChromeOptions chromeOptions=new ChromeOptions();
		 * chromeOptions.addArguments("--remote-allow-origins=*"); WebDriver driver=new
		 * ChromeDriver(chromeOptions);
		 * driver.get("https://www.jquery-az.com/boots/demo.php?ex=10.0_3");
		 */
	//driver.findElement(By.xpath("//input[@id='dateofbirth']")).click();
	String targetdate="30-03-2023";
	SimpleDateFormat targetDateFormat=new SimpleDateFormat("dd-MM-yyyy");
	targetDateFormat.setLenient(false);
	Serializable formattedDateformatDate=targetDateFormat.parse(targetdate);
    System.out.println(formattedDateformatDate);
	}
}
