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
}