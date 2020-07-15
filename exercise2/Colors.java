package exercise2;

import java.util.ArrayList;

public class Colors {

    String[] colorful(String[] strings) {
        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.) return an array of strings that start with a color.  discard all the other strings.  If no strings start with a color in the input array, return an empty array.
        return new String[]{};
    }

    public static void main(String[] args) {
        String[] code = {"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"};
        ArrayList<String> matches = new ArrayList<>();
        System.out.println("This is the Colors class");
        for ( String e : code) {
            if (e.matches(".*(black|red|blue|pink|yellow|green).*")){
                matches.add(e);
            }
        }
        System.out.println(matches);
    }


}