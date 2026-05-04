public class QuantityMeasurementApp {

    // 🔹 FEET
    static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        public double toInches() {
            return value * 12;
        }

        public double toYard() {
            return value / 3;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;

            if (obj instanceof Feet) {
                return Double.compare(this.value, ((Feet) obj).value) == 0;
            }

            if (obj instanceof Inch) {
                return Double.compare(this.toInches(), ((Inch) obj).value) == 0;
            }

            if (obj instanceof Yard) {
                return Double.compare(this.toYard(), ((Yard) obj).value) == 0;
            }

            return false;
        }
    }

    // 🔹 INCH
    static class Inch {
        private final double value;

        public Inch(double value) {
            this.value = value;
        }

        public double toFeet() {
            return value / 12;
        }

        public double toYard() {
            return value / 36;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;

            if (obj instanceof Inch) {
                return Double.compare(this.value, ((Inch) obj).value) == 0;
            }

            if (obj instanceof Feet) {
                return Double.compare(this.value, ((Feet) obj).toInches()) == 0;
            }

            if (obj instanceof Yard) {
                return Double.compare(this.toYard(), ((Yard) obj).value) == 0;
            }

            return false;
        }
    }

    // 🔹 YARD
    static class Yard {
        private final double value;

        public Yard(double value) {
            this.value = value;
        }

        public double toFeet() {
            return value * 3;
        }

        public double toInches() {
            return value * 36;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;

            if (obj instanceof Yard) {
                return Double.compare(this.value, ((Yard) obj).value) == 0;
            }

            if (obj instanceof Feet) {
                return Double.compare(this.toFeet(), ((Feet) obj).value) == 0;
            }

            if (obj instanceof Inch) {
                return Double.compare(this.toInches(), ((Inch) obj).value) == 0;
            }

            return false;
        }
    }
}