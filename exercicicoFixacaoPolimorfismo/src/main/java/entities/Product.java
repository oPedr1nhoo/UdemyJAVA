package entities;

public  class Product {

    private String name;
    private Double price;

    public Product() {
    }
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.Double getPrice() {
        return price;
    }

    public void setPrice(java.lang.Double price) {
        this.price = price;
    }

   public String priceTag() {
      return name + " $ " + String.format("%.2f", price);
    }
}
