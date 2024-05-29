package manyTomany;

import java.util.HashSet;
import java.util.Set;

public class AppManyToMany {
    public static void main(String[] args) {
        SaveDataManyToMany saveDataManyToMany = new SaveDataManyToMany();
        Item item = new Item();
        item.setDescription("iPhone");
        item.setPrice(1000);
        Item item2 = new Item();
        item2.setDescription("nokia");
        item2.setPrice(200);
        Cart cart = new Cart();

        cart.setTotal(item.getPrice() + item2.getPrice());
        Set<Item> items = new HashSet<>();
        items.add(item);
        items.add(item2);
        cart.setItems(items);

        saveDataManyToMany.saveCart(cart);
        System.out.println("Before committing transaction");
        System.out.println("Cart ID=" + cart.getId());
        System.out.println("Item1 ID=" + item.getId());
        System.out.println("Item2 ID=" + item2.getId());
    }
}
