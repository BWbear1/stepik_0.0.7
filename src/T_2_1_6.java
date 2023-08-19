public class Main {
    public static boolean main(String[] args) {
    }
}
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d){
        return (a && b && !c && !d || a && !b && c && !d || !a && b && c && !d || !a && b && !c && d
                || a && !b && !c && d || !a && !b && c && d);

    }