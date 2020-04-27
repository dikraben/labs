package labs.lab1_1;

import android.media.Image;

public class food {

    private String foodName;
    private String foodDescription;



    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String name) {
        foodName = foodName;
    }


    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }



    public String food() {
        return "our foodtoday"+ getFoodName()+ "and it's" + getFoodDescription();

    }
}
