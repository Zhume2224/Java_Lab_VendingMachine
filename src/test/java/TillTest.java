import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TillTest {
    Till till;
    Product crisps;
    ArrayList<Coin> tillInput;

    @Before
    public void before() {
        tillInput = new ArrayList<>();
        tillInput.add(Coin.TWOPOUND);
        tillInput.add(Coin.ONEPOUND);
        till = new Till(tillInput);
        crisps = Product.CRISPS;
    }

//    @Test
//    public void canBuyCrisps() {
//        till.buyProduct(crisps);
//    }

}
