package entities;

public class Individual extends TaxPayer {

        private Double healthExpenditures;

        public Individual() {
            super();
        }

        public Individual(String name, Double anuallncome, Double healthExpenditures) {
            super(name, anuallncome);
            this.healthExpenditures = healthExpenditures;
        }

        public Double getHealthExpenditures() {
            return healthExpenditures;
        }

        public void setHealthExpenditures(Double healthExpenditures) {
            this.healthExpenditures = healthExpenditures;
        }

        @Override
        public double tax() {
            double tax = 0.0;
            if (getAnuallncome() < 20000.00) {
                tax = getAnuallncome() * 0.15 - healthExpenditures * 0.5;
            } else {
                tax = getAnuallncome() * 0.25 - healthExpenditures * 0.5;
            }
            return tax;
        }
}
