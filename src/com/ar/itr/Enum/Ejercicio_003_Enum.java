package com.ar.itr.Enum;

import com.ar.itr.Enum.EnumColor.Color;

public class Ejercicio_003_Enum {

	private Fruits myFruit;
    
    public Ejercicio_003_Enum(Fruits fruit){
        this.myFruit = fruit;
    }
     
    public void getFruitDesc(){
         
        switch (myFruit) {
            case GRAPE:
                System.out.println("A grape is a non-climacteric fruit.");
                break;
                     
            case APPLE:
                System.out.println("The apple is the pomaceous fruit.");
                break;
                          
            case MANGO: 
                System.out.println("The mango is a fleshy stone fruit.");
                break;
              
            case LEMON: 
                System.out.println("Lemons are slow growing varieties of citrus.");
                break;
                 
            default:
                System.out.println("No desc available.");
                break;
        }
    }
     
    public static void main(String a[]){
        Ejercicio_003_Enum grape = new Ejercicio_003_Enum(Fruits.GRAPE);
        grape.getFruitDesc();
        Ejercicio_003_Enum apple = new Ejercicio_003_Enum(Fruits.APPLE);
        apple.getFruitDesc();
        Ejercicio_003_Enum lemon = new Ejercicio_003_Enum(Fruits.LEMON);
        lemon.getFruitDesc();
        Ejercicio_003_Enum guava = new Ejercicio_003_Enum(Fruits.GUAVA);
        guava.getFruitDesc();
    }
}
 
enum Fruits {
    GRAPE, APPLE, MANGO, LEMON,GUAVA 
}
		
