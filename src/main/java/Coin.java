public enum Coin {
    ONEPENNY(1, "1p"),
    TWOPENCE(2, "2p"),
    FIVEPENCE(5, "5p"),
    TENPENCE(10, "10p"),
    TWENTYPENCE(20, "20p"),
    FIFTYPENCE(50, "50p"),
    ONEPOUND(100, "£1"),
    TWOPOUND(200, "£2");


    private int value;
    private String name;

    Coin(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
