package solution;

public class ShipsCounter {
    public int countShips(int[][] field) {
        if (field == null || field.length == 0) {
            return 0;
        }
        int counter = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                boolean rightSide = (j + 1 == field[i].length) || (field[i][j + 1] == 0);
                boolean lowerSide = (i + 1 == field.length) || (field[i + 1][j] == 0);
                if (field[i][j] == 1 && rightSide && lowerSide) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
