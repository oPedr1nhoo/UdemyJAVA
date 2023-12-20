package entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

        public OutsourcedEmployee() {
            super();
        }



    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public java.lang.Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(java.lang.Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
        public double payment(){
            return super.payment() + additionalCharge * 1.1;
        }
}
