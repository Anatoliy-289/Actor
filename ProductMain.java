package impl;

import java.time.LocalDate;

import impl.Product;

public class ProductMain {
    
    public static void main(String[] args) {
        
        Product coffee = new Product("Coffee", 250, LocalDate.of(2024, 7, 1), "John");

        Product milk = new Product("Milk", 50, LocalDate.of(2024, 8, 5), "Kevin");
        
        Product bread = new Product("Cake", 20, LocalDate.of(2024, 8, 8), "Ostin");

        Product fruit = new Product("Banana", 80, LocalDate.of(2024, 7, 31), "Bradley");
        
        Product vegetable = new Product("Potato", 35, LocalDate.of(2024, 8, 2), "Robert");
        
        Product eggs = new Product("Eggs", 110, LocalDate.of(2024, 8, 8), "Adrian");

        Product nuts = new Product("nuts", 45, LocalDate.of(2024, 7, 25), "Aaron");

        Product fish = new Product("fish", 150, LocalDate.of(2024, 8, 8), "James");


        Market market = new Market();


        System.out.println(market.getProducts());

    
        market.addProducts(List.of(coffee, milk, bread, fruit, vegetable, eggs, nuts, fish));


        System.out.println(market.getProducts());
        
    }

}