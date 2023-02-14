package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormPersInfo {

	public WebDriver driver;
	
	By signInBtn = By.linkText("Sign in");
	By genderMr = By.cssSelector("[class] .radio-inline:nth-of-type(1)");
	By genderMs = By.cssSelector("[class] .radio-inline:nth-of-type(2)");
	By firstName = By.cssSelector("[name='firstname']");
	By lastName = By.cssSelector("[name='lastname']");
	By email = By.cssSelector("form#customer-form > section input[name='email']");
	By password = By.cssSelector("form#customer-form > section input[name='password']");
	By brithdate = By.cssSelector("[name='birthday']");
	By offersAlert = By.cssSelector("[name='optin']");
	By newsletter = By.cssSelector("[name='newsletter']");
	By terms = By.cssSelector("[name='psgdpr']");
	By continueBtn = By.cssSelector("form#customer-form  button[name='continue']");
	By contactUs = By.linkText("Contact us");
	By details = By.linkText("show details expand_more");
	By promoCode = By.linkText("Have a promo code?");
	By totalPrice = By.cssSelector(".cart-total .value");
	By closePromo = By.linkText("Close");
	By addPromoBtn = By.cssSelector("[action='http\\:\\/\\/teststore\\.automationtesting\\.co\\.uk\\/cart'] span");
	By promoField = By.cssSelector("input[name='discount_name']");
	By backToHomepage = By.cssSelector("[alt='teststore logo']");
	

	public OrderFormPersInfo(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSignInBtn() {
		return driver.findElement(signInBtn);
	}
	
	public WebElement getGenderMr() {
		return driver.findElement(genderMr);
	}
	public WebElement getGenderMs() {
		return driver.findElement(genderMs);
	}
	public WebElement getFirstName() {
		return driver.findElement(firstName);
	}
	public WebElement getLastName() {
		return driver.findElement(lastName);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getBrithdate() {
		return driver.findElement(brithdate);
	}
	public WebElement getOffersAlert() {
		return driver.findElement(offersAlert);
	}
	public WebElement getNewsletter() {
		return driver.findElement(newsletter);
	}
	public WebElement getTerms() {
		return driver.findElement(terms);
	}
	public WebElement getContinueBtn() {
		return driver.findElement(continueBtn);
	}
	public WebElement getContactUs() {
		return driver.findElement(contactUs);
	}
	public WebElement getDetails() {
		return driver.findElement(details);
	}
	public WebElement getPromoCode() {
		return driver.findElement(promoCode);
	}
	public WebElement getTotalPrice() {
		return driver.findElement(totalPrice);
	}
	public WebElement getClosePromo() {
		return driver.findElement(closePromo);
	}
	public WebElement getAddPromoBtn() {
		return driver.findElement(addPromoBtn);
	}	
	public WebElement getPromoField() {
		return driver.findElement(promoField);
	}
	public WebElement getBackToHomepage() {
		return driver.findElement(backToHomepage);
	}
	
	
	
	
	
	
}
