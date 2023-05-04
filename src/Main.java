public class Main {
    public static void main(String[] args) {
        var a = "123456789012345678901234567890123456789012345678901234567890";
        var b = "12345678901234567890123456789012345678901234567890";
        String a1;
        if (a.length() >= b.length()) {
             a1 = a;
        } else {
            a1 = "0".repeat(b.length() - a.length()) + a;
        }
        String b1;
        if (b.length() >= a.length()) {
            b1 = b;
        } else {
            b1 = "0".repeat(a.length() - b.length()) + b;
        }
        StringBuilder result = new StringBuilder();

        int prevDigit = 0;
        for (int i = a1.length() - 1; i >= 0 ; i--) {
            var digit1 = Integer.parseInt(String.valueOf(a1.charAt(i)));
            var digit2 = Integer.parseInt(String.valueOf(b1.charAt(i)));
            int sum = digit1 + digit2;

            if (sum > 9) {
                prevDigit = 1;
                sum = sum % 10;
            } else {
                prevDigit = 0;
            }
            result.insert(0, sum);
        }
        if (prevDigit!= 0) {
            result.insert(0, prevDigit);
        }
        String lastResult = result.toString();
        System.out.println(lastResult);
    }
}