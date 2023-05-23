public class Main {
    public static void main(String[] args) {

        Trangle t1 = new Trangle(5,2);
        Square s1 = new Square(10);

        Recctengle r1 = new Recctengle(2,5);
        AreaCalculator ac = new AreaCalculator(r1);
        ac.printArea();

    }
}
