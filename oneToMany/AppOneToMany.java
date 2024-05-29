package oneToMany;

import java.util.HashSet;
import java.util.Set;

public class AppOneToMany {
    public static void main(String[] args) {
        SaveDataOneToMany saveDataOneToMany = new SaveDataOneToMany();
        Carts cart = new Carts();
        cart.setName("Redmi Mobile");

        Items items1 = new Items("I1", 100, 10, cart);
        Items items2 = new Items("I2", 210, 17, cart);
        Set<Items> itemsSet = new HashSet<>();
        itemsSet.add(items1);
        itemsSet.add(items2);

        cart.setItems(itemsSet);

        cart.setTotal(items1.getItemTotal() + items2.getItemTotal());

        saveDataOneToMany.saveCart(cart);
        saveDataOneToMany.saveItems(items1);
        saveDataOneToMany.saveItems(items2);

        System.out.println("Cart1 ID=" + cart.getId());
        System.out.println("item1 ID=" + items1.getId() + ", Foreign Key Cart ID=" + items1.getCart().getId());
        System.out.println("item2 ID=" + items2.getId() + ", Foreign Key Cart ID=" + items1.getCart().getId());
    }
}
