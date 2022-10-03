/**
 * Now lets define a dispenser abstract class with two main purpose:
 *     Process the dispense for a specific face-value of currency note.
 *     Go to another dispenser for processing smaller face value of currency note.
 */

public abstract class PaperCurrencyDispenser {
    protected PaperCurrencyDispenser nextDispenser;
    public void setNetDispenser (PaperCurrencyDispenser nextDispenser) {
        this.nextDispenser=nextDispenser;

    }

    public abstract void dispense(PaperCurrency curreny);
}
