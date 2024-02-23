import StrategyDesignPattern.Cricket.Problem.AllRoundPlayer;
import StrategyDesignPattern.Cricket.Problem.BatsManPlayer;
import StrategyDesignPattern.Cricket.Problem.Bowler;
import StrategyDesignPattern.Cricket.Problem.Player;
import StrategyDesignPattern.Cricket.Solution.AllRounder;
import StrategyDesignPattern.Cricket.Solution.BatsMan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Problem Statement");
        Player allRoundPlayer = new AllRoundPlayer();
        Player bowler = new Bowler();
        Player batsManPlayer = new BatsManPlayer();

        bowler.capabilities();
        allRoundPlayer.capabilities();
        batsManPlayer.capabilities();

        System.out.println("Solution Statement");
        StrategyDesignPattern.Cricket.Solution.Player allRounderS = new AllRounder();
        StrategyDesignPattern.Cricket.Solution.Player bowlerS = new StrategyDesignPattern.Cricket.Solution.Bowler();
        StrategyDesignPattern.Cricket.Solution.Player batsManS = new BatsMan();

        bowlerS.capability();
        allRounderS.capability();
        batsManS.capability();
    }
}