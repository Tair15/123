public class ChickenDecorator extends CatFoodDecorator{
    public ChickenDecorator(CatFood catFood) {
        super(catFood);
    }
    @Override
    public String getFlavors()
    {
        return super.getFlavors() + ", Chicken";
    }
    @Override
    public int getPrice()
    {
        return super.getPrice() + 300;
    }
}
