package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.baseUtil;

public class loginLocator extends baseUtil {

    private baseUtil base;
    private WebDriverWait wait;

    public loginLocator(baseUtil base) {
        this.base = base;
        PageFactory.initElements(base.driver, this);
        this.wait = new WebDriverWait(base.driver, 1000);
    }

    //Element
    @FindBy(css = "#user_login")
    private WebElement username;

    @FindBy(css = "#user_pass")
    private WebElement password;

    @FindBy(css = "#wp-submit")
    private WebElement loginButton;

    //Methods
    public void getUsername(String passUsername){
         wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(passUsername);
    }

    public void getPassword(String passPassword){
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(passPassword);
    }

    public void clickLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}

