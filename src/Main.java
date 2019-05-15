import ex1.*;
import ex2.*;
import ex3.Camera;
import ex3.Fridge;
import ex3.Phone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ex1();
//        ex2();
        ex3();
    }

    private static void ex1(){
        ArrayList<Person> personArray = new ArrayList<>();
        personArray.add(new Friend());
        personArray.add(new Teacher());
        personArray.add(new Doctor());
        System.out.println(personArray.get(0));
        System.out.println(personArray.get(1));
        System.out.println(personArray.get(2));
    }
    private static  void ex2(){
        ArrayList<Building> buildingArray = new ArrayList<>();
        buildingArray.add(new Resident());
        buildingArray.add(new Resturant());
        buildingArray.add(new Commercial());
        System.out.println(buildingArray.get(0));
        System.out.println("\n");
        System.out.println(buildingArray.get(1));
        System.out.println("\n");
        System.out.println(buildingArray.get(2));
        System.out.println("\n");
        System.out.println("The realator has " +buildingArray.size()+ " buildings total");
    }

    private static void ex3(){
        Phone phone1 = new Phone();
        phone1.insertItem("Flappy Bird");
        phone1.insertItem("Two Dots");
        phone1.insertItem("2048");
        System.out.println("\n");
        phone1.seeItems();
        System.out.println("\n");
        phone1.turnOn();
        System.out.println("\n");
        phone1.removeItem("Two Dots");
        System.out.println("\n");
        phone1.seeItems();
        System.out.println("\n");

        Fridge fridge1 = new Fridge();
        fridge1.insertItem("Bread Loaf");
        fridge1.insertItem("Eggs");
        fridge1.insertItem("Milk");
        System.out.println("\n");
        fridge1.seeItems();
        System.out.println("\n");
        fridge1.turnOn();
        System.out.println("\n");
        fridge1.removeItem("Bread Loaf");
        System.out.println("\n");
        fridge1.seeItems();

        System.out.println("\n");
        Camera camera1 = new Camera();
        camera1.insertItem("Sunset");
        camera1.insertItem("Dogs");
        camera1.insertItem("Kids");
        System.out.println("\n");
        camera1.seeItems();
        System.out.println("\n");
        camera1.turnOn();
        System.out.println("\n");
        camera1.removeItem("Kids");
        System.out.println("\n");
        camera1.seeItems();
    }
}
