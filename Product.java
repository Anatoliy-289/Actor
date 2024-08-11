import java.time.LocalDate;

public class Product extends Market {

    protected String product;
    protected double price;
    protected LocalDate releaseDate;
    protected String name;


    public Product(String product, double price, LocalDate releaseDate, String name) {
        this.product = product;
        this.price = price;
        this.releaseDate = releaseDate;
        this.name = name;
    }


    public Product getProduct(String name) {
        
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);                
                return product;
            
            }
        }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Product{" +
               "product='" + product + '\'' +
               ", price=" + price +
               ", releaseDate=" + releaseDate +
               ", name=" + name +
               '}';
    }

}
