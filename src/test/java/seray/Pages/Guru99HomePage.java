package seray.Pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import seray.Utils.BrowserUtils;
import seray.Utils.Driver;

public class Guru99HomePage extends BrowserUtils {
    private static final Logger logger = Logger.getLogger(Guru99HomePage.class);

    @FindBy(xpath = "//h2[.='Mother Elephant With Babies Soft Toy']")
    private WebElement ElephantToyHeader;

    @FindBy(xpath = "//h3[.='Price: $20']")
    private WebElement ToyPrice;

    @FindBy(xpath = "//select[@name='quantity']")
    private WebElement quantityDropdown;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNowButton;

//    @FindBy(xpath = "//select[@style='font-size: 1.2em;color:#FFF;']")
//    private WebElement quantity;
//
//    @FindBy(xpath = "//input[@class='button special']")
//    private WebElement buy;


    public void setElephantToyHeader(String expectedMessage) {

        Assert.assertEquals(ElephantToyHeader.getText(), expectedMessage);
    }

    public void setToyPrice(String expectedMessage) {

        Assert.assertEquals(ToyPrice.getText(), expectedMessage);
        logger.info("Toy price is verified");
    }

    public void verifyURL(String string) {
        boolean verifiedURL = false;
        if (Driver.getDriver().getCurrentUrl().contains(string)) {
            verifiedURL = true;
        }
        Assert.assertTrue(verifiedURL);
    }

    public void setQuantityDropdown(String name) {
        Select select = new Select(quantityDropdown);
        select.selectByValue(name);
    }

    public void setBuyNow() {
        BrowserUtils.staticWait(2);
        buyNowButton.click();
    }

    public void setQuantity(String strr) {
        Select select = new Select(quantityDropdown);
        select.selectByValue(strr);
    }

    public void setBuy() {
        staticWait(2);
        buyNowButton.click();

    }
}

