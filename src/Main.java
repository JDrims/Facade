public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("10(2) + 101(5) = " + bins.sum("10", "101"));
        System.out.println("10(2) * 101(5) = " + bins.mult("10", "101"));
    }
}