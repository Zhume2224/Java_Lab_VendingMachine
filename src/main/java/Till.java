import java.util.ArrayList;
import java.util.Scanner;

public class Till {

    private ArrayList<Coin> allCoins= new ArrayList<>();
    private ArrayList<Coin> total;
    private ArrayList<Coin> coinsIn;
    private ArrayList<Coin> coinsReturn;
    private ArrayList<Coin> coinsRejected;
//    changes for coin return , invalid coins;

    public Till(ArrayList<Coin> total) {
        this.total = total;
        this.coinsIn = new ArrayList<>();
        //coins return is for change
        this.coinsReturn = new ArrayList<>();
        //rejected coins is for 1p & 2ps
        this.coinsRejected =new ArrayList<>();

    }



    public void insertCoin(Coin coin){
        if (coin.getValue()!=1 && coin.getValue()!=2){
            this.coinsIn.add(coin);
        }
        else {this.coinsRejected.add(coin);
        System.out.println("You inserted an invalid coin: " + coin.getName());
        }
    }

    public int getInsertedTotal() {
        int insertTotal=0;
//      loops over coins and counts total
            for (int i = 0; i < coinsIn.size(); i++) {
                insertTotal += coinsIn.get(i).getValue();
            }
            return insertTotal;
    }

    //if reminding is >= 100, return £1.50, otherwise 40p;
    public String formattedString(int price){
        if(price>=100){
            double priceDouble = price*0.01;
           return "£" + String.format("%.2f",priceDouble);
        }
        else {
            return String.valueOf(price) +"p";
        }
        }


    public void buyProduct(Product product){
//        insert total should be the sum of coins array

       int price=product.getPrice();
       while (getInsertedTotal() < price) {
           int priceRemaining = price - getInsertedTotal();
           System.out.println("Price remaining is: " + formattedString(priceRemaining));
           Scanner keyboard = new Scanner(System.in);
           System.out.println("Please insert a coin (5p, 10p, 20p, 50p, £1, £2)");
           String input = keyboard.nextLine().toLowerCase();
//           System.out.println("INPUT IS: " + input);
           if (input.equals("1p") || input.equals("1")) {
               insertCoin(Coin.ONEPENNY);
           } else if (input.equals("2p") || input.equals("2")) {
               insertCoin(Coin.TWOPENCE);
           } else if (input.equals("5p") || input.equals("5")) {
               insertCoin(Coin.FIVEPENCE);
           } else if (input.equals("10p") || input.equals("10")) {
               insertCoin(Coin.TENPENCE);
           } else if (input.equals("20p") || input.equals("20")) {
               insertCoin(Coin.TWENTYPENCE);
           } else if (input.equals("50p") || input.equals("50")) {
               insertCoin(Coin.FIFTYPENCE);
           } else if (input.equals("£1") || input.equals("100")) {
               insertCoin(Coin.ONEPOUND);
           } else if (input.equals("£2") || input.equals("200")) {
               insertCoin(Coin.TWOPOUND);
           } else {
               System.out.println("NOT A COIN!!");
           }

       }
        System.out.println("Here's your " + product.getName());
        int moneyToReturn=getInsertedTotal()-price;
//       ArrayList<int> moneyToReturnBox= new ArrayList<int>();

       while(moneyToReturn>0){
           if(moneyToReturn>=200){
               coinsReturn.add(Coin.TWOPOUND);
               moneyToReturn-=200;
           }
              else if(moneyToReturn>=100){
               coinsReturn.add(Coin.ONEPOUND);
                   moneyToReturn-=100;
               }
           else if(moneyToReturn>=50){
               coinsReturn.add(Coin.FIFTYPENCE);
               moneyToReturn-=50;
           }
           else if(moneyToReturn>=20){
               coinsReturn.add(Coin.TWENTYPENCE);
               moneyToReturn-=20;
           }
           else if(moneyToReturn>=10){
               coinsReturn.add(Coin.TENPENCE);
               moneyToReturn-=10;
           }
           else if(moneyToReturn>=5){
               coinsReturn.add(Coin.FIVEPENCE);
               moneyToReturn-=5;
           }}
       String listOfChangeCoins = " ";
       String listOfRejectedCoins = " ";
               for(int i=0; i<coinsReturn.size();i++) {
                   listOfChangeCoins = listOfChangeCoins + formattedString(coinsReturn.get(i).getValue()) + " ";
               }
               for (int i=0; i<coinsRejected.size(); i++){
                   listOfRejectedCoins =listOfRejectedCoins+ formattedString(coinsRejected.get(i).getValue()) + " ";
               }
        System.out.println("Here's your changes" + listOfChangeCoins);
        System.out.println("Here's your rejected coins" + listOfRejectedCoins);

       }

    }








