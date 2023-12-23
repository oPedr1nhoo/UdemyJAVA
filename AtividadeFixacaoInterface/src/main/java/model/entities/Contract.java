package model.entities;

import java.util.Date;
import model.entities.Installment;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Contract {

    private Integer number;
    private LocalDate date;
    private Double totalValue;

    List<Installment>installments = new ArrayList < > ();


    public Contract() {
    }

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public java.lang.Integer getNumber() {
        return number;
    }

    public void setNumber(java.lang.Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public java.lang.Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(java.lang.Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void setInstallments(List<Installment> installments) {
        this.installments = installments;
    }

}
