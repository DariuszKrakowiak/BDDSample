package testBDD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestBDD {
    int addNumber;
    int subtractNumber;
    int multiplyNumber;
    int divideNumber;

    int addSecondNumber;
    int subtractSecondNumber;
    int multiplySecondNumber;
    int divideSecondNumber;


    @Given("For Add - The User is able to enter a number")
    public void for_add_the_user_is_able_to_enter_a_number() {
        addNumber = 5;
        addSecondNumber = 10;
        System.out.println("GIVEN: "+ addNumber);
        System.out.println("GIVEN: " + addSecondNumber);
    }

    @Given("For subtract - The User is able to enter a number")
    public void for_subtract_the_user_is_able_to_enter_a_number() {
        subtractNumber = 7;
        subtractSecondNumber = 8;
        System.out.println("GIVEN: " + subtractNumber);
        System.out.println("GIVEN: " + subtractSecondNumber);
    }

    @Given("For multiply - The User is able to enter a number")
    public void for_multiply_the_user_is_able_to_enter_a_number() {
        multiplyNumber = 7;
        multiplySecondNumber = 10;
        System.out.println("GIVEN: " + multiplyNumber);
        System.out.println("GIVEN: " + multiplySecondNumber);

    }

    @Given("For divide - The User is able to enter a number")
    public void for_divide_the_user_is_able_to_enter_a_number() {
        divideNumber = 6;
        divideSecondNumber = 8;
        System.out.println("GIVEN: " + divideNumber);
        System.out.println("GIVEN: " + divideSecondNumber);
    }

    @When("For Add - I show the provided number")
    public void for_add_i_show_the_provided_number() {
        int number = this.addNumber;
        System.out.println("WHEN: " + number);
    }

    @When("For subtract - I show the provided number")
    public void for_subtract_i_show_the_provided_number() {
        int number = this.subtractNumber;
        System.out.println("WHEN: " + number);
    }

    @When("For multiply - I show the provided number")
    public void for_multiply_i_show_the_provided_number() {
        int number = this.multiplyNumber;
        System.out.println("WHEN: " + number);
    }

    @When("For divide - I show the provided number")
    public void for_divide_i_show_the_provided_number() {
        int number = this.divideNumber;
        System.out.println("WHEN: " + number);
    }

    @Then("I am able to add the numbers")
    public void i_am_able_to_add_the_numbers() {
        int number = this.addNumber;
        int secondNumber = this.addSecondNumber;
        System.out.println("THEN: " + (number+secondNumber));
    }



    @Then("I am able to subtract the numbers")
    public void i_am_able_to_subtract_the_numbers() {
        int number = this.subtractNumber;
        int secondNumber = this.subtractSecondNumber;
        System.out.println("THEN: " + (number-secondNumber));
    }

    @Then("I am able to multiply the numbers")
    public void i_am_able_to_multiply_the_numbers() {
        int number = this.multiplyNumber;
        int secondNumber = this.multiplySecondNumber;
        System.out.println("THEN: " + (number*secondNumber));
    }

    @Then("I am able to divide the numbers")
    public void i_am_able_to_divide_the_numbers() {
        int number = this.divideNumber;
        int secondNumber = this.divideSecondNumber;
        System.out.println("THEN: " + (number/secondNumber));
    }
}