
public class Main {
    public static void main(String[] args) {

        int x = new Random().nextInt(10);

        if (x > 5) {
            System.out.print("x > 5");
        }
        if (x < 5) {
            System.out.print("x < 5");
        }
        if (x == 10) {
            System.out.print("x == 10");
        }
        if (x >= 5) {
            System.out.print("x >= 5");
        }
        if (x <= 5) {
            System.out.print("x <= 5");
        }
        if (x > 3 && x < 6) {
            System.out.print("x > 3 && x < 6");
        } else {
            System.out.print("AND wrong!");
        }
        if (x < 3 || x > 6) {
            System.out.print("x < 3 || x > 6");
        } else {
            System.out.print("OR wrong!");
        }
    }
}
