public class QuantityMeasurementApp {

    // 🔹 BASE CLASS (COMMON LOGIC)
    static abstract class Quantity {
        protected final double value;

        public Quantity(double value) {
            this.value = value;
        }

        abstract double toInches();

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Quantity)) return false;

            Quantity other = (Quantity) obj;
            return Double.compare(this.toInches(), other.toInches()) == 0;
        }
    }

    // 🔹 FEET
    static class Feet extends Quantity {
        public Feet(double value) {
            super(value);
        }

        @Override
        double toInches() {
            return value * 12;
        }
    }

    // 🔹 INCH
    static class Inch extends Quantity {
        public Inch(double value) {
            super(value);
        }

        @Override
        double toInches() {
            return value;
        }
    }

    // 🔹 CM
    static class Cm extends Quantity {
        public Cm(double value) {
            super(value);
        }

        @Override
        double toInches() {
            return value / 2.5;
        }
    }

    // 🔹 YARD
    static class Yard extends Quantity {
        public Yard(double value) {
            super(value);
        }

        @Override
        double toInches() {
            return value * 36;
        }
    }

    // 🔹 ADDITION (2 or more units)
    public static Inch add(Quantity... quantities) {
        double total = 0;

        for (Quantity q : quantities) {
            total += q.toInches();
        }

        return new Inch(total);
    }
}