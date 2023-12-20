package Model.entities;

import Model.entities.Shape;
import Model.enums.Color;
public class Rectangle extends Shape  {


    private Double width;
    private Double heigh;

    public Rectangle() {
    }

    public Rectangle(Double width, Double heigh, Color color) {
        super(color);
        this.width = width;
        this.heigh = heigh;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeigh() {
        return heigh;
    }

    public void setHeigh(Double heigh) {
        this.heigh = heigh;
    }

    @Override
    public Double area() {
        return width * heigh;
    }
}
