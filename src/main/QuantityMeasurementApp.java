public class QuantityMeasurementApp {

    // 🔹 BASE: convert everything to inches
    interface Unit {
        double toInches();
    }

    // 🔹 FEET
    static class Feet implements Unit {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        public double toInches() {
            return value * 12;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Unit)) return false;
            return Double.compare(this.toInches(), ((Unit) obj).toInches()) == 0;
        }
    }

    // 🔹 INCH
    static class Inch implements Unit {
        private final double value;

        public Inch(double value) {
            this.value = value;
        }

        public double toInches() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Unit)) return false;
            return Double.compare(this.toInches(), ((Unit) obj).toInches()) == 0;
        }
    }

    // 🔹 CM
    static class Cm implements Unit {
        private final double value;

        public Cm(double value) {
            this.value = value;
        }

        public double toInches() {
            return value / 2.5;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Unit)) return false;
            return Double.compare(this.toInches(), ((Unit) obj).toInches()) == 0;
        }
    }

    // 🔹 YARD
    static class Yard implements Unit {
        private final double value;

        public Yard(double value) {
            this.value = value;
        }

        public double toInches() {
            return value * 36;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Unit)) return false;
            return Double.compare(this.toInches(), ((Unit) obj).toInches()) == 0;
        }
    }

    // 🔹 ADDITION METHOD
    public static Inch add(Unit u1, Unit u2) {
        double totalInches = u1.toInches() + u2.toInches();
        return new Inch(totalInches);
    }
}