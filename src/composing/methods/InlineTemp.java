package composing.methods;

public class InlineTemp {

    public double calculateTotal(double basePrice) {
        double discountThreshold = 100.0;
        double discount = 0.1;

        boolean eligibleForDiscount = basePrice > discountThreshold;
        if (eligibleForDiscount) {
            return basePrice * (1 - discount);
        }
        return basePrice;
    }

    public double calculateTotalArreglado(double basePrice) {
        double discountThreshold = 100.0;
        double discount = 0.1;

        return basePrice > discountThreshold ? basePrice * (1 - discount) : basePrice;
    }
}
