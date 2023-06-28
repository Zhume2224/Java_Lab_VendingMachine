import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    private ArrayList<Product> products;
//    items in the machine
    private HashMap<String, Product > codes;
//    codes for items in the machine

    private Till till;

    public VendingMachine(ArrayList<Product> products, HashMap<String, Product> codes,ArrayList<Coin> coinsInTill) {
        this.products = products;
        this.codes = codes;
        this.till = new Till(coinsInTill);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public HashMap<String, Product> getCodes() {
        return codes;
    }

    public Till getTill() {
        return till;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setCodes(HashMap<String, Product> codes) {
        this.codes = codes;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void getAllProducts(){
        for (Map.Entry<String,Product> code: codes.entrySet()){
            System.out.println("Please enter code : "+ code.getKey() + " to buy " + code.getValue().getName() + " price is: " + code.getValue().getFormattedPrice());
        }
    }



    public void enterCode() {
        Product selectedProduct = null;
        while (selectedProduct == null) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter a code to buy a product.");
            String input = keyboard.nextLine().toUpperCase();
            System.out.println("INPUT IS: " + input );
            //print out for debugging ^^

            selectedProduct = getCodes().get(input);

            if (selectedProduct != null) {
                System.out.println( "You have selected: " + selectedProduct.getName());
                till.buyProduct(selectedProduct);
            } else {
                System.out.println("Invalid code, please enter a new code.");
            }
        }
    }

//    select a product and buy it
    public void buyProductFromMachine(){
        getAllProducts();
        enterCode();

    }



}
