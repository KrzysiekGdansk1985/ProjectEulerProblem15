import java.math.BigInteger;

/**
 * Lattice paths
 *
 * Problem 15
 * Starting in the top left corner of a 2×2 grid,
 * and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * How many such routes are there through a 20×20 grid?
 * */

public class EulerProblem15 {
    public static void main(String[] args){
        int dimensionOfTheSquareGrid = 20;
        long x = howManyRoutes(dimensionOfTheSquareGrid);
        System.out.println("There are " + x + " in a square grid " + dimensionOfTheSquareGrid + "x" + dimensionOfTheSquareGrid + ".");

    }

    /**
     * The method to calculate how many routes are there in a square grid
     * @param dimensionOfTheSquareGrid natural number
     * @return the number of routes
     */
    public static long howManyRoutes(int dimensionOfTheSquareGrid){
        long l = (silnia(2 * dimensionOfTheSquareGrid).divide(silnia(dimensionOfTheSquareGrid).multiply(silnia(dimensionOfTheSquareGrid)))).longValue();
        return l;
    }

    /**
     * The method to calculate the factorial
     * @param n natural number
     * @return factorial of n
     */
    public static BigInteger silnia(int n){
        if (n == 0 || n == 1){
            return BigInteger.valueOf(1);
        } else {
            BigInteger x = BigInteger.valueOf(1);
            for (int i = 2; i <= n; i++){
               x = x.multiply(BigInteger.valueOf(i));
            }
            return x;
        }
    }
}