public class Main {
    public static void main(String[] args) {
        int B = year/4;
        int C = year/100;
        int D = year/400;
        year = B - C + D;
    }}