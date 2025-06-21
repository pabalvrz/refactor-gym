package composing.methods;

public class ReplaceTempWithQuery {

    public double calculateTotal(int quantity, double itemPrice) {
        double basePrice = quantity * itemPrice;

        if (basePrice > 1000) {
            return basePrice * 0.95;
        }
        return basePrice;
    }

    public double calculateTotalArreglado(int quantity, double itemPrice) {
        double basePrice = getBasePrice(quantity, itemPrice);
        return basePrice > 1000 ? basePrice * 0.95 : basePrice;
    }

    private double getBasePrice(int quantity, double itemPrice) {
        return quantity * itemPrice;
    }
}
