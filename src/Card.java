class Card {
    String value;
    String type;


    public Card(String value, String type) {
        this.value = value;
        this.type = type;
    }

    public String toString() {
        return value + "-" + type;
    }

    public int getValue() {
        if ("AJQK".contains(value)) {
            if (value == "A") {
                return 11;
            }
            return 10; // J, Q, K
        }
        return Integer.parseInt(value);   //  2 - 10
    }

    public boolean isAce() {
        return value == "A";
    }

    public String getImagePath() {
        return  "./cards/" + toString() + ".png";
    }
}