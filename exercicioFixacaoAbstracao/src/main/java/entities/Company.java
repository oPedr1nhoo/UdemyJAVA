package entities;

public class Company extends TaxPayer{

    private Integer numberOfEmployees;

        public Company() {
            super();
        }

        public Company(String name, Double anuallncome, Integer numberOfEmployees) {
            super(name, anuallncome);
            this.numberOfEmployees = numberOfEmployees;
        }

        public Integer getNumberOfEmployees() {
            return numberOfEmployees;
        }

        public void setNumberOfEmployees(Integer numberOfEmployees) {
            this.numberOfEmployees = numberOfEmployees;
        }

        @Override
        public double tax() {
            double tax = 0.0;
            if (numberOfEmployees > 10) {
                tax = getAnuallncome() * 0.14;
            } else {
                tax = getAnuallncome() * 0.16;
            }
            return tax;
        }

}
