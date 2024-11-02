package School_excercise_quanlychungkhoang;

public class PreferredStock extends Stock{
    private double annualDividend;
    public PreferredStock(String symbol, String name, double price, int volume) {
        super(symbol, name, price, volume);
        this.annualDividend = 0;
    }

    public void setAnnualDividend(double annualDividend) {
        this.annualDividend = annualDividend;
    }

    public double getAnnualDividend() {
        return annualDividend;
    }

    @Override
    public void display() {
        System.out.println(this.toString());
        System.out.println("Annual Dividend: " + this.annualDividend);
    }
}
