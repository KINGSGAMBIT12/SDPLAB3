class PayPalAdapter implements PaymentGW {
    private PayPalService payPalService;

    public PayPalAdapter(PayPalService payPalService) {
        this.payPalService = payPalService;
    }

    @Override
    public void processPayment(double amount) {
        double convertedAmount = amount * 0.9; // Apply a 10% fee for using PayPal
        payPalService.makePayment(convertedAmount);
    }
}
