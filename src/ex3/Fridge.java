package ex3;

import java.util.ArrayList;

public class Fridge extends Appliance {
    ArrayList<String> foodArray = new ArrayList<>();
    public void turnOn(){
        System.out.println("Your fridge is running, better go catch it");

    }
    public void insertItem(String foodItem){
        System.out.println(foodItem + " has been added to your fridge");
        foodArray.add(foodItem);
    }
    public void removeItem(String foodItem){
        if (foodArray.contains(foodItem)) {
            foodArray.remove(foodItem);
            System.out.println(foodItem + " has been removed from your fridge");
        }
        else {
            System.out.println(foodItem + " is not in your fridge");
        }
    }
    public void seeItems(){
        System.out.println("What's in your fridge:");
        for (String food :foodArray){
            System.out.println(food);
        }
    }
}
