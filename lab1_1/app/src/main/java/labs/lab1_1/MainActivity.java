package labs.lab1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        didikitchen didiKitchen = new didikitchen();
        didiKitchen.setName("didikitchen");


        food food = new food();
        food.setFoodName("couscous");
        food.setFoodDescription("so yummy");

        recipe recipe = new recipe();
        recipe.setIngredients("tomato");
        recipe.setCookingTime(20);

        didi didi = new didi();
        didi.setName("dikra");
        didi.setUsername("didii");




    }
}
