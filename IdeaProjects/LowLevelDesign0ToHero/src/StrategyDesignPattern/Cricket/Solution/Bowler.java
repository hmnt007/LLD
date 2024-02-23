package StrategyDesignPattern.Cricket.Solution;

public class Bowler extends Player{
    public Bowler() {
        super(new OffBreakBowlingCapability());
    }
}
