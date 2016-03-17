
/*
    Job:-
        Calculate the probability to get a face after flipping coins
 */
package chance;

public class Chance {
    public double getChanceToGetTail(double noOfCoins) {
        double chances = Math.pow(noOfCoins,2);
        if (noOfCoins == 1.0)
            return 0.5;
        return 1.0 / chances;
    }

    public double getChanceToNotGetTail(double noOfCoins) {
        return (1 - getChanceToGetTail(noOfCoins));
    }
}
