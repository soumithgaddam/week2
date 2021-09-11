
public class TestWallet {
    public static void main(String[] args) {
        Wallet wallet = new BiFold();
        wallet.showFeatures();
        wallet = new TriFold();
        wallet.showFeatures();
        wallet = new Travel();
        wallet.showFeatures();
    }
 }
 
 