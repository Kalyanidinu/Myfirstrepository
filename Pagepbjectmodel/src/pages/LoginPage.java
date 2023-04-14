package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
		@FindBy(linkText = "Sign in")
		private WebElement loginButtonElement;
		@FindBy(name="email")
		private WebElement userName;
		@FindBy(id="continue")
		private WebElement UserNext;
		@FindBy(name="password")
		private WebElement password;
		@FindBy(id="signInSubmit")
		private WebElement signInBtn;
		
		
		
		public LoginPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}	
			public void clickOnSignInBtn() {
				loginButtonElement.click();
			}
			
			public void fillUsername(String x) {
				
				userName.sendKeys(x);
			}
			public void userNxt() {
				UserNext.click();
			}
			
			public void fillPwd(String y) {
				password.sendKeys(y);
			}
			public void pwdNxt() {
				signInBtn.click();
			}
			
		}



		


		


		
	


