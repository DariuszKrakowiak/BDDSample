package checkout;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout {
    @Given("^the price of a \"(.*?)\" is (\\d+)PLN$")
    public void the_price_of_a_is_PLN(String apple, int price) {
        price = 10;
        apple = " apple";
        System.out.println("the price of a" + apple + " is " + price +
                "PLN");
    }

    @When("^I checkout (\\d+) \"(.*?)\"$")
    public void i_checkout(int amount, String apple) {
        amount = 1;
        apple = "apple";
        System.out.println("I checkout " + amount + " " + apple);
    }

    @Then("^the total price should be (\\d+)PLN$")
    public void the_total_price_should_be_PLN(int price) {
        price = 10;
        System.out.println("The total price should be " + price);
    }
}
