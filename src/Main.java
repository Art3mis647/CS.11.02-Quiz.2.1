public class Main {
    public static void main(String[] args) {
        int resultOne = add(1, 1);
        System.out.println(resultOne); //should print 2
        String resultTwo = greeting("tony");
        System.out.println(resultTwo); //should print "Bonjour, tony!
        int resultThree = add(1, 1, 1, 1);
        System.out.println(resultThree); //should print 4
        printMe("this was a triumph, i'm making a note here huge success!");
    }
    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }
    public static String greeting (String name) {
        return "Bonjour, " + name + "!";
    }
    public static int add (int numOne, int numTwo, int numThree, int numFour) {
        return add(add(numOne, numTwo), add(numThree, numFour));
    }
    public static void printMe(String toBePrinted) {
        System.out.println(toBePrinted);
    }
}
