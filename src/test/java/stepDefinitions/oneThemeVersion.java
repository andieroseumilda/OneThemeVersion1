package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class oneThemeVersion extends baseUtil {

    private baseUtil base;
    private loginLocator login;

    public oneThemeVersion(baseUtil base){
        this.base = base;
        login = new loginLocator(base);
    }

    @Given("^I am on the wordpress login page$")
    public void i_am_on_the_wordpress_login_page() {
        System.out.println("test only");
        base.driver.navigate().to("http://andietestwebsite.hwp.directwithhotels.com/wp-login.php?redirect_to=http%3A%2F%2Fandietestwebsite.hwp.directwithhotels.com%2Fwp-admin%2Fthemes.php&reauth=1");
    }

    @When("^i input my user credentials$")
    public void i_input_my_user_credentials(){
        login.getUsername("andielyne.umilda@directwithhotels.com");
        login.getPassword("andierose");
        login.clickLoginButton();
    }

    @Then("^i should see the home page$")
    public void i_should_see_the_home_page(){
        System.out.println("3rd step ");
    }

}
