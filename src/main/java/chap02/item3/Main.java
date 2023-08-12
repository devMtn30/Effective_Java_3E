package chap02.item3;

import chap02.item2.BuilderNutritionFacts;
import chap02.item2.JavaBeansNutritionFacts;
import chap02.item2.TelescopingNutritionFacts;

public class Main {
    public static void main(String[] args) {
        Field field = Field.INSTANCE;
        field.leaveTheBuilding();

        StaticFactory stfac = StaticFactory.getInstance();
        stfac.leaveTheBuilding();

        Enum elvis = Enum.INSTANCE;
        Enum.leaveTheBuilding();

    }


}
