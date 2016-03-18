package comparison;

import org.junit.Assert;
import org.junit.Test;

public class RelationShipTest {
    @Test
    public void shouldGiveTrueWhenLengthsAreEqual() {
        RelationShip relationShip = new RelationShip(new Length(1), new Length(2));
        Assert.assertEquals(true, relationShip.check(new Length(1), new Length(2)));

    }

    @Test
    public void shouldGiveFalseWhenLengthsAreNotEqual() {
        RelationShip relationShip = new RelationShip(new Length(1), new Length(2));
        Assert.assertEquals(false, relationShip.check(new Length(4), new Length(2)));

    }

//    @Test
//    public void shouldGiveTrueWhenLengthsAreMultiplesOfRelationShipLength() {
//        RelationShip relationShip = new RelationShip(new Length(1), new Length(2));
//        Assert.assertEquals(true,relationShip.check(new Length(2),new Length(4)));
//
//    }
}