import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testSameFeetAreEqual() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(1.0);

        assertTrue(f1.equals(f2));
    }

    @Test
    void testDifferentFeetAreNotEqual() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(2.0);

        assertFalse(f1.equals(f2));
    }

    @Test
    void testCompareWithNull() {
        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);

        assertFalse(f1.equals(null));
    }

    @Test
    void testFeetEqualsInch() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Inch inch = new QuantityMeasurementApp.Inch(12.0);

        assertTrue(feet.equals(inch));
    }

    @Test
    void testInchEqualsFeet() {
        QuantityMeasurementApp.Inch inch = new QuantityMeasurementApp.Inch(12.0);
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);

        assertTrue(inch.equals(feet));
    }

    @Test
    void testDifferentUnitsNotEqual() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Inch inch = new QuantityMeasurementApp.Inch(10.0);

        assertFalse(feet.equals(inch));
    }

    @Test
    void test12InchEquals1Feet() {
        QuantityMeasurementApp.Inch inch = new QuantityMeasurementApp.Inch(12);
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1);

        assertTrue(inch.equals(feet));
    }

    @Test
    void test24InchEquals2Feet() {
        QuantityMeasurementApp.Inch inch = new QuantityMeasurementApp.Inch(24);
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(2);

        assertTrue(inch.equals(feet));
    }

    @Test
    void testConversionAccuracy() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(2);
        assertEquals(24, feet.toInches());

        QuantityMeasurementApp.Inch inch = new QuantityMeasurementApp.Inch(24);
        assertEquals(2, inch.toFeet());
    }

    @Test
    void test3FeetEquals1Yard() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(3);
        QuantityMeasurementApp.Yard yard = new QuantityMeasurementApp.Yard(1);

        assertTrue(feet.equals(yard));
    }

    @Test
    void test1YardEquals36Inch() {
        QuantityMeasurementApp.Yard yard = new QuantityMeasurementApp.Yard(1);
        QuantityMeasurementApp.Inch inch = new QuantityMeasurementApp.Inch(36);

        assertTrue(yard.equals(inch));
    }

    @Test
    void testDifferentYardComparison() {
        QuantityMeasurementApp.Yard yard = new QuantityMeasurementApp.Yard(1);
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(2);

        assertFalse(yard.equals(feet));
    }

    @Test
    void test1InchEquals2_5Cm() {
        QuantityMeasurementApp.Inch inch = new QuantityMeasurementApp.Inch(1);
        QuantityMeasurementApp.Cm cm = new QuantityMeasurementApp.Cm(2.5);

        assertTrue(inch.equals(cm));
    }

    @Test
    void test2InchEquals5Cm() {
        QuantityMeasurementApp.Inch inch = new QuantityMeasurementApp.Inch(2);
        QuantityMeasurementApp.Cm cm = new QuantityMeasurementApp.Cm(5);

        assertTrue(inch.equals(cm));
    }

    @Test
    void testFeetToCm() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1);
        QuantityMeasurementApp.Cm cm = new QuantityMeasurementApp.Cm(30);

        assertTrue(feet.equals(cm));
    }
}