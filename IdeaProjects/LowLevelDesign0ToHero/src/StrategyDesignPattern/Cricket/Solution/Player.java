package StrategyDesignPattern.Cricket.Solution;

public class Player {
    private CapabilityStrategy capabilityStrategy;

    public Player(CapabilityStrategy capabilityStrategy) {
        this.capabilityStrategy = capabilityStrategy;
    }

    public void capability(){
        this.capabilityStrategy.capability();
    }
}
