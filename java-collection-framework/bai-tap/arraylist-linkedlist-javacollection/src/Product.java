public class Product implements Comparable<Product>{
    private int id;
    private String name;
    private double price;

    public void Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public int compareTo(Product product) {
        return this.getName().compareTo(product.getName());
    }

    @Override
    public String toString() {
        return
                "id = " + id +
                ", name = '" + name + '\'' +
                ", price = " + price + "\n";
    }
}
