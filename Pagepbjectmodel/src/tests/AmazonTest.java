package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.AllPage;
import pages.BuyPage;
import pages.HomePage;
import pages.LoginPage;



public class AmazonTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
ChromeOptions chrome=new ChromeOptions();
chrome.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(chrome);
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
LoginPage lp=new LoginPage(driver);
lp.clickOnSignInBtn();
lp.fillUsername("8106537416");
lp.userNxt();
lp.fillPwd("8106537416");
lp.pwdNxt();
HomePage hp=new HomePage(driver);
hp.searchItemintextField("interior decoration items");
hp.searchMagnifiedIcon();
hp.searchMagnifiedIcon();
hp.clkFeatured();
hp.selectNewArr();
/*
 * hp.enterPrice("300"); hp.enterMaxPrice("600"); hp.goNxt();
 */
System.out.println(hp.getTxt() + ":" +hp.getNxtText());
hp.ordersAndReturns();
hp.allItemslistInReturnAOrders();

BuyPage bp=new BuyPage(driver);
bp.clickOnbuyAgainBtn();
System.out.println("Item name is:"+bp.item() + "\nItem price is:"+bp.itemPrize());
bp.clickOnShippedTab();
bp.clickOnViewOrdersLink();

System.out.println(bp.getReqText());
bp.clickOnCancelledTab();
System.out.println("Cancelled Orders tab: " +bp.getCancelledTextForTab());
bp.clkOnMyAccTab();
bp.clkPaymentOptions();
System.out.println(bp.getPaymentOpt());
System.out.println("Screenshot saved successfully for: " +bp.getPaymentOpt());
	
AllPage ap=new AllPage(driver);
ap.clkOnAllIcon();
ap.clkOnNewRlsIcon();

//ap.clkOnAllIcon();
//ap.clkOnEchoAAlexa();

ap.clkOnHAK();
ap.clkFurniture();
System.out.println(ap.getAmazonHotreleases());
ap.getAmazonsCountOPtions();
ap.clickOnGiftCard();
System.out.println("Screenshot has taken for GiftCard page succefully");
ap.giftCardForBirthday();
ap.birthdayBro();
	}

	
	}


