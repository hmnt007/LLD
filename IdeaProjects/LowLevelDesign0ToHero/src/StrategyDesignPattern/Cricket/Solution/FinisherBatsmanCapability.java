package StrategyDesignPattern.Cricket.Solution;

import StrategyDesignPattern.Cricket.Problem.Enums;

public class FinisherBatsmanCapability implements CapabilityStrategy{
    @Override
    public void capability() {
        System.out.println("The player has special capability of " + Enums.FINISHER_BATSMAN);
    }
}
