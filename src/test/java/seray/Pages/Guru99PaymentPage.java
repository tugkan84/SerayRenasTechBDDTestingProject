package seray.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import seray.Utils.BrowserUtils;

public class Guru99PaymentPage extends BrowserUtils {
    private static final Logger logger = Logger.getLogger(Lab01.class);
    @FindBy(xpath = "//input[@name='card_nmuber']")
    private WebElement creditCard;
    @FindBy(xpath = "//select[@name='month']")
    private WebElement expirationMonth;
    @FindBy(xpath = "//select[@name='year']")
    private WebElement expirationYear;
    @FindBy(xpath = "//input[@name='cvv_code']")
    private WebElement cvvCode;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement payButton;


    public void setCreditCardNumber(String CCardNumber) {
        creditCard.sendKeys(CCardNumber);

    }

    public void setExpirationMonthNumber(String month) {
        expirationMonth.sendKeys(month);

    }

    public void setExpirationYear(String year) {
        expirationYear.sendKeys(year);

    }

    public void setCvvCodeNumber(String cvv) {
        cvvCode.sendKeys(cvv);
    }

    public void setPayButton() {
        payButton.click();
    }
}

