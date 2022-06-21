package story;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AStory {
    @Given("I walk in the woods")
    public void i_walk_in_the_woods() {
        System.out.println("I walk in the woods");
    }
    @When("I come across a path")
    public void i_come_across_a_path() {
        System.out.println("I come across a path");
    }
    @Then("I choose either left or right")
    public void i_choose_either_left_or_right() {
        System.out.println("I choose either left or right");
    }
}
