package SemicolonStores;

public class SemicolonCheckOut {
    public static void main(String[] args) {
        SemicolonProducts product1 = new SemicolonProducts("Rice", 550.00);
        SemicolonProducts product2 = new SemicolonProducts("Parfait", 2100.00);
        SemicolonProducts product3 = new SemicolonProducts("Groceries", 1500.00);

        SemicolonCheckoutSystem checkout = new SemicolonCheckoutSystem();

        checkout.addToCart(product1, 2);
        checkout.addToCart(product2, 2);
        checkout.addToCart(product3, 3);

        checkout.displayInvoice();
    }
}
