package StrategyDesignPattern.Cricket.Solution;

import StrategyDesignPattern.Cricket.Problem.Enums;

public class OffBreakBowlingCapability implements CapabilityStrategy{

    @Override
    public void capability() {
        System.out.println("This is the strength of player" + Enums.OFF_BREAK_BOWLING);
    }
}
