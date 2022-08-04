public class Main {
    public static void main(String[] args) {

        // Use static method with no internal state
        System.out.println(Calculator1.add(2,3));

        // Use instance method with object-specific state
        Calculator2 calculator2
                = new Calculator2();
        calculator2.setX(2);
        calculator2.setY(3);
        System.out.println(calculator2.add());

        // Use static method with class-wide state - DON"T DO THIS
        Calculator3.setX(2);
        Calculator3.setY(3);
        System.out.println(Calculator3.add());

    }
}

class Calculator1 {

    public static int add(int x, int y) {
        return x+y;
    }
}

class Calculator2 {

    int x, y;

    public int add() {
        return x+y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Calculator3 {

    static int x, y;

    public static int add() {
        return x+y;
    }

    public static void setX(int x1) {
        x = x1;
    }

    public static void setY(int y1) {
        y = y1;
    }
}






