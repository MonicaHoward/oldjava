package exercise2;

class Arrays {

    public static void main(String[] args) {
        int[] nums = new int[]{10,23,3,4,5,2,1};
        String[] greetings = new String[] {"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};
        //If you make a boolean[] you cannot store int values. Changed to int[].
        int[] binaries = new int[] {0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};

        printNums(nums);
        printGreetings(greetings);
        printBinaries(binaries);
    }
    private static void printNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    };

    public static void printGreetings(String[] greetings) {
        for (int i = 0; i < greetings.length; i++) {
            System.out.println(greetings[i]);
        }
    };

    public static void printBinaries(int[] binaries) {
        for (int i = 0; i < binaries.length; i++) {
            System.out.println(binaries[i]);
        }
    }

    public static void toString(int[] myArray) {
    }
}

//const nums = [10,23,3,4,5,2,1];
//        const greetings = ["hello","howdy","hallo","hola","bonjour","ciao","أهلا"];
//        const binaries = [0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0];
//
//        nums.forEach(n => console.log(n));
//
//        greetings.forEach(g => console.log(g));
//
//        binaries.forEach(b => console.log(!!b));







