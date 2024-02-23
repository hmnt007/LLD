package StrategyDesignPattern.Cricket.Problem;

public class Bowler extends Player{
    @Override
    public void capabilities(){
        System.out.println("The player has special capability of " + Enums.OFF_BREAK_BOWLING);
    }
}
