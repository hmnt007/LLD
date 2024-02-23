package StrategyDesignPattern.Cricket.Solution;

public class AllRounder extends Player{
    public AllRounder() {
        super(new FinisherBatsmanCapability());
    }
}
