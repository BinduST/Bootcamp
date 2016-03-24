/*
    Job:-
        Add upto 12 balls
 */

package Wizard;

import java.util.ArrayList;
import java.util.List;

public class Bag {

    private int limit;
    private Rules rules;


    List bag = new ArrayList();

    private int greenAllowed = 3;
    private int redAllowed = 0;
    private double yellowAllowed = 0;

    public Bag(int limit, Rules rules) {
        this.limit = limit;
        this.rules = rules;
    }

    public boolean add(Ball ball) throws InvalidEntryException {
        if (bag.size() < limit) {
            checkValidation(ball);
            bag.add(ball);
            return true;
        }
        throw new InvalidEntryException("Bag is Full");
    }

    private void checkValidation(Ball ball) throws InvalidEntryException {
        if (ball.isOfColor(Color.BLUE)) {
            yellowAllowed += 0.4;
            return;
        }
        if (ball.isOfColor(Color.GREEN) && greenAllowed > 0) {
            greenAllowed--;
            redAllowed += 2;
            yellowAllowed += 0.4;
            return;
        }
        if (ball.isOfColor(Color.RED) && redAllowed > 0) {
            redAllowed--;
            yellowAllowed += 0.4;
            return;
        }

        if (ball.isOfColor(Color.YELLOW) && yellowAllowed >= 1) {
            yellowAllowed += 0.4;
            yellowAllowed--;
            return;
        }
        throw new InvalidEntryException("Not allowed");
    }

//    public String getSummary(Formatter formatter) {
//        ArrayList<Pair> counts = new ArrayList<>();
//        counts.add(new Pair("Bag", bag.size()));
//
//        return formatter.format(counts);
//    }
//
//    private HashMap CountBalls() {
//        Color[] ballColors = Color.values();
//        HashMap<Color, Integer> counts = new HashMap<>();
//        for (Color color : ballColors) {
//            if(!counts.containsKey(color))
//                counts.put(color,0);
//            int value = counts.get(color);
//            value++;
//        }
//        return null;
//    }
}