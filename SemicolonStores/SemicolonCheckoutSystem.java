package SemicolonStores;

import java.util.ArrayList;
import java.util.List;

public class SemicolonCheckoutSystem {
    private List<SemicolonCartItems> cart;

    public SemicolonCheckoutSystem() {
        cart = new ArrayList<>();
    }

    public void addToCart(SemicolonProducts product, int quantity) {
        cart.add(new SemicolonCartItems(product, quantity));
    }

    public void displayInvoice() {
        double total = 0;

        System.out.println("===== Semicolon Invoice =====");
        for (SemicolonCartItems item : cart) {
            SemicolonProducts product = item.getProduct();
            int quantity = item.getQuantity();
            double subtotal = product.getPrice() * quantity;
            total += subtotal;

            System.out.printf("%s x%d: %.2f%n", product.getName(), quantity, subtotal);
        }

        double discount = total * 0.1;
        double vat = total * 0.075;

        System.out.println("============================");
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("VAT (7.5%%): %.2f%n", vat);
        System.out.println("============================");
        System.out.printf("Grand Total: %.2f%n", total - discount + vat);
        System.out.println("============================");
    }
}
