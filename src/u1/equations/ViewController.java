package u1.equations;

public class ViewController {
    private double x1;
    private double x2;

    public boolean solve(double a, double b, double c) {
        double radicand = Math.pow(b, 2) - 4 * a * c;
        if (radicand >= 0) {
            x1 = (-b + Math.sqrt(radicand)) / 2 * a;
            x2 = (-b - Math.sqrt(radicand)) / 2 * a;
            return true;
        }
        return false;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
}
