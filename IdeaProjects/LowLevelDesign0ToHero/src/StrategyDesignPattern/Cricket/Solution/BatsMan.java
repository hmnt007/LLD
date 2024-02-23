package StrategyDesignPattern.Cricket.Solution;

public class BatsMan extends Player{
    public BatsMan() {
        super(new FinisherBatsmanCapability());
    }
}
