import models.PizzaMenu;
import models.PizzaMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("Hello again!");

        int num = 10;
        int num2 = 15;

        if(num == num2){
            System.out.println("num==num2");
        }
        else if(num < num2) {
            System.out.println("num < num2");
        }
        boolean b1 = false;

        String text1 = "aaa";
        String text2 = "aaa";
        if(text1.equals(text2)){
            System.out.println("text1==text2");
        }
        else{
            System.out.println("text1!=text2");
        }


        PizzaMenuItem item1 = new PizzaMenuItem(
                190, "Hawai", "Pineaple pizza");
        PizzaMenuItem item2 = new PizzaMenuItem(
                190, "Hawai", "Pineaple pizza");

        PizzaMenuItem item3 = item1;

        System.out.println("item1 price "+ item1.getPrice());
        item3.setPrice(200);
        System.out.println("item1 price "+ item1.getPrice());

        if(item1!=item2)
            System.out.println("item1 is not equal with item 2");

        if(item1 == item3)
            System.out.println("item1 == item 3");


        System.out.println(item1.toString());

        List<PizzaMenuItem> pizzaItems = new ArrayList<>();
        pizzaItems.add(item1);
        pizzaItems.add(item2);
        pizzaItems.add(new PizzaMenuItem(250, "Polo", "Chicken pizza"));

        System.out.println("foreach example");
        for (PizzaMenuItem item:
             pizzaItems) {
            System.out.println(item);
        }

        PizzaMenuItem itemFromlist = pizzaItems.get(2);
        System.out.println(itemFromlist);

        System.out.println("------------------");

        PizzaMenu menu1 = new PizzaMenu();
        menu1.addItem(new PizzaMenuItem(150,"Hawai",""));
        menu1.addItem(new PizzaMenuItem(200,"Polo",""));
        menu1.addItem(new PizzaMenuItem(220,"Tuna",""));

        PizzaMenu menu2 = new PizzaMenu();
        menu2.addItem(new PizzaMenuItem(150,"Hawai",""));
        menu2.addItem(new PizzaMenuItem(200,"Polo",""));
        menu2.addItem(new PizzaMenuItem(220,"Tuna",""));


        System.out.println(menu1.getLastUpdate());
        System.out.println("Menu size: "+menu1.getMenuSize());
        for (PizzaMenuItem pizza :
                menu1.getMenuItems()) {
            System.out.println(pizza);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        if(menu1.equals(menu2)){
            System.out.println("menu1 equals menu2");
        }


    }
}