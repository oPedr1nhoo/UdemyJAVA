package entities;

public abstract class TaxPayer {

    private String name;
    private Double anuallncome;

    public TaxPayer() {
    }
    public TaxPayer(String name, Double anuallncome) {
        this.name = name;
        this.anuallncome = anuallncome;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.Double getAnuallncome() {
        return anuallncome;
    }

    public void setAnuallncome(java.lang.Double anuallncome) {
        this.anuallncome = anuallncome;
    }

    public abstract double tax();
}
