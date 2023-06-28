import java.util.ArrayList;
import java.util.HashMap;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Product> products =new ArrayList<>();
        products.add(Product.TEACAKE);
        products.add(Product.CRISPS);
        products.add(Product.CHOCOLATE);
        products.add(Product.COLA);

        HashMap<String, Product> codes=new HashMap<>();
        codes.put("D6",Product.CRISPS);
        codes.put("B5",Product.CHOCOLATE);
        codes.put("A4",Product.COLA);
        codes.put("C1",Product.TEACAKE);


        ArrayList<Coin> tillInput= new ArrayList<>();
        tillInput.add(Coin.TWOPOUND);
        tillInput.add(Coin.ONEPOUND);
        Till till = new Till(tillInput);
        Product crisps = Product.CRISPS;

        //till.buyProduct(crisps);

        VendingMachine vendingMachine = new VendingMachine(products, codes, tillInput);

        vendingMachine.buyProductFromMachine();


    }
}
