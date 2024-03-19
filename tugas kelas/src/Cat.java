//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cat {

        static String name = "Rara";
        static int age = 3;
        static String various = "persia";
        static String colour = "grey";

        public static void getName(){
            System.out.println("The Name of cat is = " + name);
        }
        public static void getAge(){
            System.out.println("The Age of cat is = " + age + "years old");
        }
        public static void getVarious(){
            System.out.println("The Various of cat is = " + various);
        }
        public static void getColour(){
            System.out.println("The Colour of cat is = " + colour);
        }

        public static void main(String[] args) {
            getName();
            getAge();
            getVarious();
            getColour();
        }
}