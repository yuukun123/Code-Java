package School_excercise_quanlychungkhoang;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("AAPL", "Apple", 1000, 100);
        stock.UpdatePrice(1100);
        stock.display();

        System.out.println();

        Investor investor = new Investor("A01", "John Doe");
        investor.buyStock(stock, 10);
        investor.displayPortfolio();

        System.out.println();

        investor.sellStock(stock, 5);
        investor.displayPortfolio();

        System.out.println();

        StockPurchase purchase = new StockPurchase(stock, 5, investor);
        purchase.registerOrder();
        purchase.executeOrder();
    }
}
