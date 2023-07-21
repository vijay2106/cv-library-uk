package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utilities.Utility;
/**
 * 2.ResultPage
 *   Locators - resultText
 *   Method - verifyTheResults(String expected)
 */
public class ResultPage extends Utility {
    @FindBy(tagName = "h1")
    WebElement resultText;


    public String getTheResults() {
        return getTextFromElement(resultText);
    }
}
