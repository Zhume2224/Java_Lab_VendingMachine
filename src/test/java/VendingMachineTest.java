import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachineTest {

    ArrayList<Product> products;
    HashMap<String, Product > codes;

    VendingMachine vendingMachine;


    @Before
    public void before(){
        products =new ArrayList<>();
        products.add(Product.TEACAKE);
        products.add(Product.CRISPS);
        products.add(Product.CHOCOLATE);
        products.add(Product.COLA);

        codes=new HashMap<>();
        codes.put("D6",Product.CRISPS);
        codes.put("B5",Product.CHOCOLATE);
        codes.put("A4",Product.COLA);
        codes.put("C1",Product.TEACAKE);

        ArrayList<Coin> tillInput = new ArrayList<>();
        tillInput.add(Coin.TWOPOUND);
        tillInput.add(Coin.ONEPOUND);


        vendingMachine =new VendingMachine(products,codes,tillInput);

    }

//    @Test





}
