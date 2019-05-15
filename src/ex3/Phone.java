package ex3;

import java.util.ArrayList;

public class Phone extends Appliance {
    ArrayList<String> appArray = new ArrayList<>();
    public void turnOn(){
        System.out.println("Your phone has been restarted");

    }
    public void insertItem(String appName){
        System.out.println(appName + " has been added to your phone");
        appArray.add(appName);
    }
    public void removeItem(String appName){
        if (appArray.contains(appName)) {
            appArray.remove(appName);
            System.out.println(appName + " has been removed from your phone");
        }
        else {
            System.out.println(appName + " is not in your phone");
        }
    }
    public void seeItems(){
        System.out.println("Your current apps:");
        for (String apps :appArray){
            System.out.println(apps);
        }
    }
}
