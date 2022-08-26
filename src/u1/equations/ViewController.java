package u1.equations;

public class ViewController {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    public boolean solve() {
        double radicand = Math.pow(b, 2) - 4 * a * c;
        if (radicand < 0)
            return false;
        x1 = (-b + Math.sqrt(radicand)) / 2 * a;
        x2 = (-b - Math.sqrt(radicand)) / 2 * a;
        return true;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
}
