public class Main {
    public static void main(String[] args) {

        Trangle t1 = new Trangle(5,2);
        Square s1 = new Square(10);
        AreaCalculator ac = new AreaCalculator(s1);
        ac.printArea();

    }
}
