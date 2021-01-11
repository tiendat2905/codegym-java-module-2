import java.io.Serializable;

public class Product implements Serializable {
    private int id = 0 ;
    private String productName;
    private String manufacturer;
    private double price;


    public Product() {
    }

    public Product(int id, String productName, String manufacturer, double price) {
        this.id = id;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "id = " + id +
                        ", name = '" + productName + '\'' +
                        ", manufacturer = " + manufacturer + '\'' +
                        ", price = " + price + "\n";
    }
}
