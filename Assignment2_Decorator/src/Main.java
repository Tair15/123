import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CatFood catFood = new SimpleCatFood();
        Boolean x = true;
        while (x) {

            System.out.println(catFood.getFlavors() + "\nцена: " + catFood.getPrice() + "\nМожет что-то еще?");
            System.out.println(
                    "1 - Chiken\n" +
                            "2 - Meat\n" +
                            "3 - Выйти");
            switch (scanner.nextInt()) {
                case 1:
                    catFood = new ChickenDecorator(catFood);
                    break;
                case 2:
                    catFood = new MeatDecorator(catFood);
                    break;
                case 3:
                    x = false;
                    break;
            }
        }
    }
}