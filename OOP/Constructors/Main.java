//package Constructors;

public class Main {
   public static void main(String[] args) {
    Human human = new Human("SL6",20,66.3);
    Human human0 = new Human("MDRE", 22, 70);
    System.out.println(human0.name);
    System.out.println(human.name);
    human.eat();
    human0.drink();
   } 
}
