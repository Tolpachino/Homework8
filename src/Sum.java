public class Sum {
    int sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println(result);
        return result;
    }

    int sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
        return result;
    }

    int sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result;
    }

    int sum(int a) {
        int result = a;
        System.out.println(result);
        return result;
    }

    int sum() {
        int result = 0;
        System.out.println(result);
        return result;
    }
}
class sumTest{
    public static void main(String[] args) {
        Sum s = new Sum();
        s.sum(12,12,12,12);
        s.sum(12,12,12);
        s.sum(12,12);
        s.sum(12);
        s.sum();
    }
}
