package Task4;

public enum Vehicles {
    BMV(5000, "Black"), AUDI(7000, "White"), MERSEDES(6000, "Pink");
    int price;
    String color;

    Vehicles (int price, String color){
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " in " + this.getColor() + " color will cost $" + this.price;
    }

    public String getColor() {
        return color;
    }
}
