package exercise2;

public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    private static String glue = "Epoxy";
    public String jello = "Jello";

    public static void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    public static void stubborn() {
        moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");
    }

    public static void glue() {
        System.out.println(glue);
    }

    public static void explain() {
        stubborn();
        glue();
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
        System.out.println(
                "Static methods in java belong to the class and not the object."
        );
        System.out.println(
                " Static methods in javascript is for methods that stay the same across the board."
        );
    }

    //get the below code to run correctly without errors:  Make sure you explain what you did in the the explain()
//method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.
    public static void main(String[] args) {

        Statically stats = new Statically();

        moveAndShake();
        stubborn();
        explain();

        glue();
        System.out.println(stats.jello);

    }
}
