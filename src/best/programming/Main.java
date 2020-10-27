package best.programming;


public class Main {

    public static void main(String[] args) {

        Color color = Color.BLACK;
        for(int i = 0; i < 20; i++) {
            System.out.println(i + ": " + Color.valueOf(color.getValue() + i));
        }
    }
}

