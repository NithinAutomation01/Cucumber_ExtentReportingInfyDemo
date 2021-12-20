package stepdefinitions;
//*[text()='Mobiles']

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.page.Login;
import com.qa.factory.DriverFactory;
import com.qa.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmazonPageValidationStep {

	private Login login= new Login(DriverFactory.getDriver());


@Given("user is on Amazon Login Page")
public void user_is_on_amazon_login_page() {
 DriverFactory.getDriver().get("https://www.amazon.in/");
}

@Then("user Checks if the Gift Card tab is displayed")
public void user_checks_if_the_gift_card_tab_is_displayed() {
DriverFactory.getDriver().findElement(By.xpath("(//*[text()='Gift Cards'])[2]")).isDisplayed();
}

@Then("user clicks on the Gift Card tab")
public void user_clicks_on_the_gift_card_tab() {
	DriverFactory.getDriver().findElement(By.xpath("//*[text()='Mobiles']")).click();
}

@Then("User validates the Title of the Gift card page")
public void user_validates_the_title_of_the_gift_card_page() {
	System.out.println(DriverFactory.getDriver().getTitle());
}

@Then("user Checks if the Mobiles tab is displayed")
public void user_checks_if_the_mobiles_tab_is_displayed() {
	DriverFactory.getDriver().findElement(By.xpath("//*[text()='Mobiles']")).isDisplayed();
}

@Then("user clicks on the Mobiles tab")
public void user_clicks_on_the_mobiles_tab() {
	DriverFactory.getDriver().findElement(By.xpath("//*[text()='Mobiles']")).click();
}

@Then("User validates the Title of the Mobiles page")
public void user_validates_the_title_of_the_mobiles_page() {
	System.out.println(DriverFactory.getDriver().getTitle());
}

@Then("user Checks if the Customer Service is displayed")
public void user_checks_if_the_customer_service_is_displayed() {
DriverFactory.getDriver().findElement(By.xpath("//*[text()='Customer Service']")).isDisplayed();
}

@Then("user clicks on the Customer Service")
public void user_clicks_on_the_customer_service() {
	DriverFactory.getDriver().findElement(By.xpath("//*[text()='Customer Service']")).click();
}

@Then("User validates the Title of Customer Service page")
public void user_validates_the_title_of_customer_service_page() {
	System.out.println(DriverFactory.getDriver().getTitle());
   
}

@Then("user Checks if the Electronics tab is displayed")
public void user_checks_if_the_electronics_tab_is_displayed() {
	DriverFactory.getDriver().findElement(By.xpath("//*[text()='Electronics']")).isDisplayed();
}

@Then("user clicks on the Electronics")
public void user_clicks_on_the_electronics() {
	DriverFactory.getDriver().findElement(By.xpath("//*[text()='Electronics']")).click();
}

@Then("User validates the Title of Electronics page")
public void user_validates_the_title_of_electronics_page() {
	System.out.println(DriverFactory.getDriver().getTitle());
}

@Then("user Checks if the Best Sellers displayed")
public void user_checks_if_the_best_sellers_displayed() {
	DriverFactory.getDriver().findElement(By.xpath("(//*[text()='Best Sellers'])[1]")).isDisplayed();
}

@Then("user clicks on the Best Seller")
public void user_clicks_on_the_best_seller() {
DriverFactory.getDriver().findElement(By.xpath("(//*[text()='Best Sellers'])[1]")).click();

}

@Then("User validates the Title of Best Seller page")
public void user_validates_the_title_of_best_seller_page() {
	System.out.println(DriverFactory.getDriver().getTitle());
}

@Then("user Checks if the Fashion tab displayed")
public void user_checks_if_the_fashion_tab_displayed() {
	DriverFactory.getDriver().findElement(By.xpath("//*[text()='Fashion']")).isDisplayed();
}

@Then("user clicks on the Fashion tab")
public void user_clicks_on_the_fashion_tab() {
	DriverFactory.getDriver().findElement(By.xpath("//*[text()='Fashion']")).click();

}

@Then("User validates the Title of Fashion Deal page")
public void user_validates_the_title_of_fashion_deal_page() {
	System.out.println(DriverFactory.getDriver().getTitle());
}

@Then("user Checks if the Home and Kitchen is displayed")
public void user_checks_if_the_home_and_kitchen_is_displayed() {
	DriverFactory.getDriver().findElement(By.xpath("(//*[text()='Home & Kitchen'])[2]")).isDisplayed();
}

@Then("user clicks on the Home and Kitchen")
public void user_clicks_on_the_home_and_kitchen() {
	DriverFactory.getDriver().findElement(By.xpath("(//*[text()='Home & Kitchen'])[2]")).click();
 
}

@Then("User validates the Title of Kitchen page")
public void user_validates_the_title_of_kitchen_page() {
	System.out.println(DriverFactory.getDriver().getTitle());
}


@Then("user Checks if the Reach Customer is displayed")
public void user_checks_if_the_reach_customer_is_displayed() {
	DriverFactory.getDriver().findElement(By.xpath("(//*[text()='Home & Kitchen'])[224]")).isDisplayed();

}

@Then("user clicks on the Reach Customer")
public void user_clicks_on_the_reach_customer() {
	DriverFactory.getDriver().findElement(By.xpath("(//*[text()='Home & Kitchen'])[224]")).click();
    throw new io.cucumber.java.PendingException();
}

@Then("User validates the Title of Reach Customer")
public void user_validates_the_title_of_reach_customer() {
	System.out.println(DriverFactory.getDriver().getTitle());

}

@Then("user Checks if the Logo is displayed")
public void user_checks_if_the_logo_is_displayed() {
	DriverFactory.getDriver().findElement(By.xpath("(//*[@id='nav-logo-sprites'])")).isDisplayed();

}

@Then("user clicks on the logo")
public void user_clicks_on_the_logo() {
	DriverFactory.getDriver().findElement(By.xpath("(//*[@id='nav-lnkdsogo-s'])")).click();

}

@Then("user Inputs {string} into the Search box")
public void user_inputs_into_the_search_box(String string) {
	DriverFactory.getDriver().findElement(By.xpath("(//*[@id='twotabsearchtextbox'])")).sendKeys(string,Keys.ENTER);

}

@Then("user Then enters the data")
public void user_then_enters_the_data() {
	System.out.println("Data has been keyed in");
}

@Then("User validates the Keyed value gets a responsive screen")
public void user_validates_the_keyed_value_gets_a_responsive_screen() {
	System.out.println(DriverFactory.getDriver().getTitle());
}

	
}
