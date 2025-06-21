package composing.methods;

public class RemoveAssignmentsToParameters {
    public double applyDiscount(double price, int discountPercentage) {
        discountPercentage = validateDiscount(discountPercentage);
        return price * (1 - discountPercentage / 100.0);
    }

    public double applyDiscountArreglado(double price, int discountPercentage) {
        int discount = validateDiscount(discountPercentage);
        return price * (1 - discount / 100.0);
    }

    private int validateDiscount(int discount) {
        if (discount < 0) return 0;
        if (discount > 50) return 50;
        return discount;
    }
}
