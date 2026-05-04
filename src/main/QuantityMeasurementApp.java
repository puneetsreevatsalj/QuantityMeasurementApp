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

        public double toCm() {
            return toInches() * 2.5;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;

            if (obj instanceof Feet)
                return Double.compare(this.value, ((Feet) obj).value) == 0;

            if (obj instanceof Inch)
                return Double.compare(this.toInches(), ((Inch) obj).value) == 0;

            if (obj instanceof Cm)
                return Double.compare(this.toCm(), ((Cm) obj).value) == 0;

            return false;
        }
    }

    // 🔹 INCH
    static class Inch {
        private final double value;

        public Inch(double value) {
            this.value = value;
        }

        public double toCm() {
            return value * 2.5;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;

            if (obj instanceof Inch)
                return Double.compare(this.value, ((Inch) obj).value) == 0;

            if (obj instanceof Feet)
                return Double.compare(this.value, ((Feet) obj).toInches()) == 0;

            if (obj instanceof Cm)
                return Double.compare(this.toCm(), ((Cm) obj).value) == 0;

            return false;
        }
    }

    // 🔹 CM
    static class Cm {
        private final double value;

        public Cm(double value) {
            this.value = value;
        }

        public double toInches() {
            return value / 2.5;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;

            if (obj instanceof Cm)
                return Double.compare(this.value, ((Cm) obj).value) == 0;

            if (obj instanceof Inch)
                return Double.compare(this.toInches(), ((Inch) obj).value) == 0;

            if (obj instanceof Feet)
                return Double.compare(this.toInches(), ((Feet) obj).toInches()) == 0;

            return false;
        }
    }

    // 🔹 YARD (kept from UC4)
    static class Yard {
        private final double value;

        public Yard(double value) {
            this.value = value;
        }

        public double toInches() {
            return value * 36;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;

            if (obj instanceof Yard)
                return Double.compare(this.value, ((Yard) obj).value) == 0;

            if (obj instanceof Inch)
                return Double.compare(this.toInches(), ((Inch) obj).value) == 0;

            return false;
        }
    }
}