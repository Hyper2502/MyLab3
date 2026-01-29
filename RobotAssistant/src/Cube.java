public class Cube {
    private static int getCube2(int x){
        return x * x * x + 2;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            int result = getCube2(i);
            System.out.println("The cube plus two of " + i + " is: " + result);
        }
    }
}
/*
the output is
The cube plus two of 1 is: 1
The cube plus two of 2 is: 4
The cube plus two of 3 is: 9
The cube plus two of 4 is: 16
The cube plus two of 5 is: 25
The cube plus two of 6 is: 36

The Java Method is useful for code reusability because you are working with already pre-existing code
you might need to re-use something and it's redudant and messy to read again the same line of code
so with abstraction what you do is simple take that part of code put it aside of the code so you can
use how many times you want and looking your code simple and readable.
 */