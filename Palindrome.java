public class Palindrome {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        for (int num = start; num <= end; ++num) {
            if (num == reverse(num)) {
                System.out.println(num);
            }
        }
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }
}
