package bsu.rfe.java.group8.lab1.Tischinkov.varB14;

public class Pie extends Food {

    private String filling ;

    public Pie(String filling) {
        super("Пирог");
        this.filling = filling;
    }

    public void consume() {
        System.out.println(this + " съеден" );
    }

    public String getSize() {
        return filling;
    }

    public void setSize(String filling) {
        this.filling = filling;
    }


    public String toString() {
        return super.toString() + " вкуса '" + filling.toUpperCase() + "'";
    }

}
