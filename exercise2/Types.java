package exercise2;

class Types {

    static int number;
    static int[] myArray = { 3, 4, 5, 6, 76, 12, 2 };
    static String movieA = "Harry and the Hendersons";
    static String movieB = "Star Wars";
    static char male = 'm';
    static char female = 'f';

    static void printArray() {
        Arrays.toString(myArray)
    }

    public static void main(String[] args) {
        System.out.println("MovieA: " + movieA);
        System.out.println("MovieB: " + movieB);
        System.out.println("Male: " + male);
        System.out.println("Female: " + female);
        printArray();
    }
//    This class has syntax errors, that will prevent your other classes from running.  So... work on this file first to resolve the issues.
//    boolean number;
//    const myArray = [3,4,5,6,76,12,2];
//    Character movieA = 'Harry and the Hendersons';
//    Character movieB = 'Star Wars';
//    double male = 'm';
//    double female = 'f';
//
//    //the above instance variables have mistakes with their data types.  Fix the data types so the main method correctly displays the value of all of the variables
//
//    public static void main() {
//        System.out.println("There are variables that have been declared in this Accessible class.  Fix the code so that all the variables can be accessed by the main method.  print out the values of every variable once the code has been refactored.");
//    }
}