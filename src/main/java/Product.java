public enum Product {


    CRISPS("Salt & Vinegar Crisps", 50),
    COLA("Cocacola", 100),
    TEACAKE("Tunnock", 150),

    CHOCOLATE("Galaxy", 65);


    private String name;
    private int price;


    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getFormattedPrice(){
        if(price>=100){
            double priceDouble = price*0.01;
            return "£" + String.format("%.2f",priceDouble);
        }
        else {
            return String.valueOf(price) +"p";
        }
    }

}
