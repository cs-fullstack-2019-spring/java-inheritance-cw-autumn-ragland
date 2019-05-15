package ex3;

import java.util.ArrayList;

public class Camera {
    ArrayList<String> photoArray = new ArrayList<>();
    public void turnOn(){
        System.out.println("Lights Camera Action");

    }
    public void insertItem(String photoName){
        System.out.println("One photos has been added to your memory");
        photoArray.add(photoName);
    }
    public void removeItem(String photoName){
        if (photoArray.contains(photoName)) {
            photoArray.remove(photoName);
            System.out.println("One photo has been removed form your memory");
        }
        else {
            System.out.println("This photo does not exist");
        }
    }
    public void seeItems(){
        System.out.println("You have " + photoArray.size() + " photos on your camera");
        for (String photos :photoArray){
            System.out.println(photos);
        }
    }
}
