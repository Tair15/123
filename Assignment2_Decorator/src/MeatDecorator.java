public class MeatDecorator extends CatFoodDecorator{
    public MeatDecorator(CatFood catFood) {
        super(catFood);
    }
    @Override
    public String getFlavors()
    {
        return super.getFlavors() + ", Meat squares";
    }
    @Override
    public int getPrice()
    {
        return super.getPrice() + 200;
    }
}
