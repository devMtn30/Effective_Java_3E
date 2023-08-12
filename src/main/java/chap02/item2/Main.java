package chap02.item2;

import chap02.item1.Product1;

public class Main {
    public static void main(String[] args) {
        // 점층적 생성자 패턴
        TelescopingNutritionFacts cocaCola1 =
                new TelescopingNutritionFacts(240, 8, 100, 0, 35, 27);

        // 자바빈즈 패턴
        JavaBeansNutritionFacts cocaCola2 = new JavaBeansNutritionFacts();
        cocaCola2.setServingSize(240);
        cocaCola2.setServings(8);
        cocaCola2.setCalories(100);
        cocaCola2.setSodium(35);
        cocaCola2.setCarbohydrate(27);

        // 빌더 패턴
        BuilderNutritionFacts cocaCola3 = new BuilderNutritionFacts
                .Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }


}
