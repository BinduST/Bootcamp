package comparison;

public class Comparator {

    private RelationShip relationShip;

    public Comparator(RelationShip relationShip) {

        this.relationShip = relationShip;
    }

    public boolean compare(Length firstLength, Length otherLength) {
        return relationShip.check(firstLength, otherLength);
    }
}
