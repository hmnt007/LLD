package StrategyDesignPattern.Cricket.Problem;

public class AllRoundPlayer extends Player{
//    code duplication here
    @Override
    public void capabilities(){
        System.out.println("The player has special capability of " + Enums.FINISHER_BATSMAN);
    }
}
