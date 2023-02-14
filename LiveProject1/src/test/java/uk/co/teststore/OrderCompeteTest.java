package uk.co.teststore;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BasePage;
import pageObjects.Homepage;
import pageObjects.ShopHomepage;

public class OrderCompeteTest extends BasePage {

	public OrderCompeteTest() throws IOException {
		super();
	}
	
	@BeforeTest
	public void setup() throws IOException {
		((BasePage) driver).getDriver();
		driver.get(getUrl());
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
	
	}
	
	@Test
	public void e2eTest() {
		Homepage home = new Homepage(driver);
		home.getTestStoreLink().click();
		
		ShopHomepage shopHome = new ShopHomepage(driver);
		shopHome.getProdOne().click();
	}

}
