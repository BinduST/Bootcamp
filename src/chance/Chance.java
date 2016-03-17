
/*
    Job:-
        Calculate the probability to get any face after flipping
 */
package chance;

public class Chance {
    public double getChanceToGetTail() {
        return 0.5;
    }

    public double getChanceToNotGetTail() {
        return (1-getChanceToGetTail());
    }
}
