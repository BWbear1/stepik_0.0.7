public class Main {
    public static boolean doubleExpression(double a, double b, double c) {
        double d=a+b;
        c = c - d;
        double absoluteValue = Math.abs(c);
        return  absoluteValue < 0.0001;
    }
}