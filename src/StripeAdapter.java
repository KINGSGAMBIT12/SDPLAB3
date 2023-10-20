class StripeAdapter implements PaymentGW {
    private StripeService stripeService;

    public StripeAdapter(StripeService stripeService) {
        this.stripeService = stripeService;
    }

    @Override
    public void processPayment(double amount) {
        stripeService.charge(amount);
    }
}