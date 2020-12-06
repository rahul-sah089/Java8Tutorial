package basics;

import java.util.*;
import java.util.function.Predicate;

public class ProductSum {
    public static void main(String[] args) {
        Map<String, Long> hm = new HashMap<String, Long>();

        List<Product> products = Arrays.asList(new Product(1, "Taco Bell", "BREAD", 1212L),
                new Product(1, "Taco Bell", "BREAD", 1212L),
                new Product(2, "Tuli Bell", "BREAD", 2212L),
                new Product(3, "Domino Cheese Pizza", "PIZZA", 2112L),
                new Product(4, "Zinger Burger", "BURGER", 1212L),
                new Product(1, "Baritos", "ROTI", 2212L));

        for (Product product : products) {
            if (!hm.containsKey(product.getType())) {
                hm.put(product.getType(), product.getPrice());
            } else {
                hm.put(product.getType(), hm.get(product.getType()) + product.getPrice());
            }
        }

        Set<String> values = hm.keySet();
        Iterator<String> itr = values.iterator();
        while (itr.hasNext()) {
            String w = itr.next();
            System.out.println("key =>" + w + " and value =>" + hm.get(w));
        }


    }

    static class Product {
        Integer id;
        String description;
        String type;
        Long price;

        public Integer getId() {
            return id;
        }

        public String getDescription() {
            return description;
        }

        public String getType() {
            return type;
        }

        public Long getPrice() {
            return price;
        }

        public Product(Integer id, String description, String type, Long price) {
            this.id = id;
            this.description = description;
            this.type = type;
            this.price = price;
        }
    }
}
