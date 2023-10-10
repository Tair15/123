public abstract class CatFoodDecorator implements CatFood{

    private CatFood catFood;

    public CatFoodDecorator(CatFood catFood){
        this.catFood= catFood;
    }
    @Override
    public String getFlavors(){
        return catFood.getFlavors();
    }

    @Override
    public int getPrice(){
        return catFood.getPrice();
    }

}