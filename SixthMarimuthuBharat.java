import java.util.*;

public class SixthMarimuthuBharat implements Player {

    private static String name = "SixthMarimuthuBharat";

    public String move(String[] myMoves, String[] opponentMoves, int myScore, int opponentScore) {
        if (myMoves.length == 0) {
            return getRandomMove();
        }

        String opponentLastMove = opponentMoves[opponentMoves.length - 1];

        if (opponentLastMove.equals("r")) {
            return "p";
        } else if (opponentLastMove.equals("p")) {
            return "s";
        } else if (opponentLastMove.equals("s")) {
            return "r";
        }

        return getRandomMove();
    }

    private String getRandomMove() {
        Random rand = new Random();
        int randomChoice = rand.nextInt(3);
        if (randomChoice == 0) {
            return "r";
        } else if (randomChoice == 1) {
            return "p";
        } else {
            return "s";
        }
    }

    public String getName() {
        return name;
    }
}