package SemicolonStores;

public class SemicolonCartItems {
    private final SemicolonProducts product;
    private final int quantity;

    public SemicolonCartItems(SemicolonProducts product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public SemicolonProducts getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
