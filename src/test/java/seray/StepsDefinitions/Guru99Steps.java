package seray.StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import seray.Pages.Guru99HomePage;
import seray.Pages.Guru99PaymentPage;
import seray.Pages.Guru99PaymentSuccessfulPage;
import seray.Utils.BrowserUtils;
import seray.Utils.ConfigurationsReader;
import seray.Utils.Driver;

import java.util.Map;

public class Guru99Steps extends BrowserUtils {
    private static final Logger logger = Logger.getLogger(Guru99Steps.class);
    Guru99HomePage guru99HomePage = new Guru99HomePage();
    Guru99PaymentPage guru99PaymentPage = new Guru99PaymentPage();
    Guru99PaymentSuccessfulPage guru99PaymentSuccessfulPage = new Guru99PaymentSuccessfulPage();

    @Given("The user wants to go to Guru99Demo web page")
    public void the_user_wants_to_go_to_guru99demo_web_page() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("GatewayURl"));
    }

    @Then("The user wants to verify the header {string}")
    public void the_user_wants_to_verify_the_header(String string) {
        guru99HomePage.setElephantToyHeader(string);
    }

    @Then("The user wants to verify that the toy price is {string}")
    public void the_user_wants_to_verify_that_the_toy_price_is(String string) {
        guru99HomePage.setToyPrice(string);
    }

    @Then("The user wants to verify that Url contains {string}")
    public void the_user_wants_to_verify_that_url_contains(String string) {
        guru99HomePage.verifyURL(string);
    }

    @When("The user wants to buy elephant toys as {string}")
    public void the_user_wants_to_buy_elephant_toys_as(String string) {
        guru99HomePage.setQuantity(string);
    }

    @Then("The user wants to click pay now Button")
    public void the_user_wants_to_click_pay_now_button() {
        guru99HomePage.setBuyNow();
    }

    @When("The user wants to enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String, String> dataTable) {
        guru99PaymentPage.setCreditCardNumber(dataTable.get("CardNumber"));
        guru99PaymentPage.setExpirationMonthNumber(dataTable.get("ExpirationMonth"));
        guru99PaymentPage.setExpirationYear(dataTable.get("ExpirationYear"));
        guru99PaymentPage.setCvvCodeNumber(dataTable.get("CVVCode"));
    }

    @Then("The user wants to click on pay now button")
    public void the_user_wants_to_click_on_pay_now_button() {
        guru99PaymentPage.setPayButton();
    }

    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        guru99PaymentSuccessfulPage.setVerifyOrder(string);
    }

    @Then("The user wants to add new {string}")
    public void the_user_wants_to_add_new(String string) {
       guru99HomePage.setQuantityDropdown(string);
       guru99HomePage.setBuyNow();
    }


}
