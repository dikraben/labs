package labs.lab1_1;

public class recipe extends food {

    private String ingredients ;
    private int cookingTime;
    private String food ;


    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void setfoodName(String food){
        this.food = food;
    }

    @Override

    public String food() {

        return "our recipe today is:" + getFoodName() + "here's the ingredients and cooking time:" + getIngredients() + getCookingTime();

    }
}

