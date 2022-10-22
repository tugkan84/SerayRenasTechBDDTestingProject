package seray.Pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import seray.Utils.BrowserUtils;

public class Guru99PaymentSuccessfulPage extends BrowserUtils {
    private static final Logger logger = Logger.getLogger(Lab01.class);
    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement orderVerifyMessage;

    public void setVerifyOrder(String String) {
        Assert.assertEquals("Payment successfull!",orderVerifyMessage.getText());

    }
}
