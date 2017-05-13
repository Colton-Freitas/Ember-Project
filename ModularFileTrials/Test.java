public class Test {

    public static void main(String[] args) {
        for (int i = 2; i < 40; i += 1) {
            if (i % 3 == 0)
                continue;
            System.out.println("3PI/" + i + "R = " + (3 * Math.PI / i) + "C " + (3 * Math.PI / i));
        }
    }
}
