package comparison;

public class RelationShip {
    private final Length firstLength;
    private final Length secondLength;

    public RelationShip(Length firstLength, Length secondLength) {
        this.firstLength = firstLength;
        this.secondLength = secondLength;
    }

    public boolean check(Length comparingLength, Length otherLength) {
        return firstLength.equals(comparingLength) && secondLength.equals(otherLength);
    }
}
