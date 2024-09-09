import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazonAssessment2 {

    public static void main(String[] args) {
        // Example usage
        List<Integer> powerA = new ArrayList<>(List.of(9, 4, 2));
        List<Integer> powerB = new ArrayList<>(List.of(5, 12, 10));
        List<Integer> powerC = new ArrayList<>(List.of(11, 3, 13));

        int capableWinners = findCapableWinners(powerA, powerB, powerC);
        System.out.println("Number of players capable of defeating all others: " + capableWinners);
    }

    public static int findCapableWinners(List<Integer> powerA, List<Integer> powerB, List<Integer> powerC) {
        // Sort each list of power boosters
        List<Integer> sortedA = new ArrayList<>(powerA);
        List<Integer> sortedB = new ArrayList<>(powerB);
        List<Integer> sortedC = new ArrayList<>(powerC);
        
        Collections.sort(sortedA);
        Collections.sort(sortedB);
        Collections.sort(sortedC);

        int winnerCount = 0;

        // Check if player A can defeat both player B and player C
        if (canWinAgainstAll(sortedA, sortedB, sortedC)) {
            winnerCount++;
        }

        // Check if player B can defeat both player A and player C
        if (canWinAgainstAll(sortedB, sortedA, sortedC)) {
            winnerCount++;
        }

        // Check if player C can defeat both player A and player B
        if (canWinAgainstAll(sortedC, sortedA, sortedB)) {
            winnerCount++;
        }

        return winnerCount;
    }

    private static boolean canWinAgainstAll(List<Integer> currentPower, List<Integer> opponent1, List<Integer> opponent2) {
        // Sort the opponent powers for easy comparison
        Collections.sort(opponent1);
        Collections.sort(opponent2);

        int winsAgainstOpponent1 = 0;
        int winsAgainstOpponent2 = 0;

        // Compare the current player against both opponents
        for (int i = 0; i < currentPower.size(); i++) {
            if (currentPower.get(i) > opponent1.get(i)) {
                winsAgainstOpponent1++;
            }
            if (currentPower.get(i) > opponent2.get(i)) {
                winsAgainstOpponent2++;
            }
        }

        // The current player should win at least 2 out of 3 rounds against both opponents
        return (winsAgainstOpponent1 >= 2 && winsAgainstOpponent2 >= 2);
    }
}
