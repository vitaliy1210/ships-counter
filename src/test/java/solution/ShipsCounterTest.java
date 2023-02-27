package solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ShipsCounterTest {
    private static ShipsCounter shipsCounter;

    @BeforeAll
    public static void beforeAll() {
        shipsCounter = new ShipsCounter();
    }

    @Test
    public void checkDifferentShipsExample() {
        int[][] field = {
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 1}};
        int expected = 9;
        int actual = shipsCounter.countShips(field);
        Assertions.assertEquals(expected, actual,
                "Method should return correct amount of ships.");
    }

    @Test
    public void checkNullValue() {
        int expected = 0;
        int actual = shipsCounter.countShips(null);
        Assertions.assertEquals(expected, actual,
                "Method should return zero.");
    }

    @Test
    public void checkEmptyValue() {
        int expected = 0;
        int actual = shipsCounter.countShips(new int[][] {});
        Assertions.assertEquals(expected, actual,
                "Method should return zero.");
    }

    @Test
    public void checkSingleSideSquareShipsOnDifferentSides() {
        int[][] field = {
                {0, 1, 0, 0},
                {0, 0, 0, 1},
                {0, 0, 1, 0},
                {1, 0, 0, 0}
        };
        int expected = 4;
        int actual = shipsCounter.countShips(field);
        Assertions.assertEquals(expected, actual,
                "Method should return correct amount of ships.");
    }

    @Test
    public void checkSquareShips() {
        int[][] field = {
                {0, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 1, 1},
                {1, 1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0}
        };
        int expected = 3;
        int actual = shipsCounter.countShips(field);
        Assertions.assertEquals(expected, actual,
                "Method should return correct amount of ships.");
    }

    @Test
    public void checkHorizontalShipOnTopAndBottom() {
        int[][] field = {
                {0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0}
        };
        int expected = 2;
        int actual = shipsCounter.countShips(field);
        Assertions.assertEquals(expected, actual,
                "Method should return correct amount of ships.");
    }

    @Test
    public void checkVerticalShipLeftAndRight() {
        int[][] field = {
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0}
        };
        int expected = 2;
        int actual = shipsCounter.countShips(field);
        Assertions.assertEquals(expected, actual,
                "Method should return correct amount of ships.");
    }
}
