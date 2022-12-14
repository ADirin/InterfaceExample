public class ATMWithdrawal {
    protected static PaperCurrencyDispenser hundredDispenser = new HundredDispenser();
       protected static PaperCurrencyDispenser dispenserChain;

    static {
   /**    // construct the chain of the currency dispensers in higher to lower
        // denomination
        hundredDispenser.setNextDispenser(fiftyDispenser);
        fiftyDispenser.setNextDispenser(twentyDispenser);
        twentyDispenser.setNextDispenser(tenDispenser);
        dispenserChain = hundredDispenser;
    */
    }

    public static void withdraw(PaperCurrency currency) {
        if (currency != null) {
            dispenserChain.dispense(currency);
        }
    }
}
