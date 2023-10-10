public class SimpleCatFood implements CatFood{
    @Override
    public String getFlavors() {
        return "strange goo";
    }

    @Override
    public int getPrice() {
        return 500;
    }
}
