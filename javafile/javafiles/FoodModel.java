package com.example.easylearn;

public class FoodModel {
    String foodName;

    int foodImage;

    public FoodModel(String foodName, int foodImage) {
        this.foodName = foodName;

        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }




    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }
}

