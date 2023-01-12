package stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.Collections;
import java.util.List;

public class stepDefination {

    @Given("^Chrome browser is installed in system$")
    public void chrome_browser_is_installed_in_system() throws Throwable {
        System.out.println("Inside Background given");
    }

    @When("^Click browser will open the browser$")
    public void click_browser_will_open_the_browser() throws Throwable {
        System.out.println("Inside Background when");
    }

    @Then("^check all browser link is displayed$")
    public void check_all_browser_link_is_displayed() throws Throwable {
        System.out.println("Inside Background then");
    }



    @Given("^User is on NetBanking Login Page$")
    public void user_is_on_netbanking_login_page()
    {

    System.out.println("Given I navigate  to login page");
    }

    @When("^User login with valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_with_valid_username_something_and_password_something(String strArg1, String strArg2) throws Throwable
    {
        System.out.println(strArg1);
        System.out.println(strArg2);


    }

    @When("^User Signup with following details$")
    public void user_signup_with_following_details(DataTable arg) throws Throwable
    {
        List<List<String>> obj = arg.asLists();

        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));





    }

    @When("^User log in with username (.+) and password (.+)$")
    public void user_log_in_with_username_and_password(String username, String password) throws Throwable {

        System.out.println(username);
        System.out.println(password);



    }
    @Then("^user should be navigate into NetBank Home Page$")
    public void user_navigate_home_page()
    {
        System.out.println("Then I enter in home page");


    }
    @And("^All Credit card display \"([^\"]*)\"$")
    public void all_credit_card_display_something(String strArg1) throws Throwable
    {
        System.out.println("CC display"+strArg1);


    }

    @But("^No promotion message display$")
    public void no_promotion_message_should_display()
    {

        System.out.println("But i do not see any promotion message ");

    }





}
