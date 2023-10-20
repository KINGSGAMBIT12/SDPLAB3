import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PayPalService payPalService = new PayPalService();
        StripeService stripeService = new StripeService();

        PaymentGW paypalGateway = new PayPalAdapter(payPalService);
        PaymentGW stripeGateway = new StripeAdapter(stripeService);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the payment amount: $");
        double amount = scanner.nextDouble();

        System.out.println("Processing payment with PayPal:");
        paypalGateway.processPayment(amount);

        System.out.println("Processing payment with Stripe:");
        stripeGateway.processPayment(amount);

        scanner.close();
    }
}
