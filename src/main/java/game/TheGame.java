package game;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TheGame {
    @Given("I play the board game")
    public void i_play_the_board_game() {
        System.out.println("I play the board game");
    }
    @When("I move my miniature")
    public void i_move_my_miniature() {
        System.out.println("I move my miniature");
    }
    @Then("I win or I lose")
    public void i_win_or_i_lose() {
        System.out.println("I win or I lose");
    }

}
