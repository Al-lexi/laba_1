package bsu.rfe.java.group8.lab1.Tischinkov.varB14;

public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];

        for (int itemIndex = 0; itemIndex < args.length; itemIndex++) {
            String[] parts = args[itemIndex].split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemIndex] = new Cheese();
            }
            else if (parts[0].equals("Apple")) {
                breakfast[itemIndex] = new Apple(parts[1]);
            }
            else if (parts[0].equals("Pie")) {
                breakfast[itemIndex] = new Pie(parts[1]);
            }
        }

        for (Food item : breakfast) {
            if (item == null) break;
            item.consume();
        }

        int cheeseCount = countFood(breakfast, new Cheese());
        int appleCount = countFood(breakfast, new Apple(""));
        int pieCount = countFood(breakfast, new Pie(""));

        System.out.println("Количество сыра в завтраке: " + cheeseCount);
        System.out.println("Количество яблок в завтраке: " + appleCount);
        System.out.println("Количество пирогов в завтраке: " + pieCount);
        System.out.println("Всего хорошего!");
    }

    public static int countFood(Food[] breakfast, Food food) {
        int count = 0;
        for (Food item : breakfast) {
            if (item == null) break;
            if (item.equals(food)) {
                count++;
            }
        }
        return count;
    }
}