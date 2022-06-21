package calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Example {

    @Then("the error message should be {string}")
    public void the_error_message_should_be(String string) {
        System.out.println(string);
    }

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sayHi());
    }
    @When("I divide {int} by {int}")
    public void i_divide_by(Integer int1, Integer int2) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(int1,int2));
    }
    @Then("the result should be {int}")
    public void the_result_should_be(Integer int1) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.resultOfDivsion(int1));
    }
}