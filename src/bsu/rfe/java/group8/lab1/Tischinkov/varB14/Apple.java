package bsu.rfe.java.group8.lab1.Tischinkov.varB14;

public class Apple extends Food {
    private String size;
    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }
    public void consume() {
        System.out.println(this + " съедено");
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}
