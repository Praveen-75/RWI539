package oneToMany;

import javax.persistence.*;

@Entity
@Table(name = "ITEMS")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "item_id")
    private String itemId;

    @Column(name = "item_total")
    private double itemTotal;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Carts cart;

    //Hibernate requires no-args constructor
    public Items() {
    }

    public Items(String itemId, double total, int qty, Carts c) {
        this.itemId = itemId;
        this.itemTotal = total;
        this.quantity = qty;
        this.cart = c;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Carts getCart() {
        return cart;
    }

    public void setCart(Carts cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", itemId='" + itemId + '\'' +
                ", itemTotal=" + itemTotal +
                ", quantity=" + quantity +
                ", cart=" + cart +
                '}';
    }
}
