public class Main {
    // Class attribute x
    private int x;

    // Class constructor
    public Main() {
        // Set initial value of x as 5
        x = 5;
    }

    // Method to get the value of x
    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        // Create an object of class Main
        Main myObj = new Main();

        // Print the value of x using the getX() method
        System.out.println("The value of x is: " + myObj.getX());
    }
}
