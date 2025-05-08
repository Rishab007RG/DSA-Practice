package DSA.GeeksForGeeks.String;

import java.math.BigInteger;

public class ImplementAtoi {
    public static void main(String[] args) {
        String str="-123";
        Solutions sol=new Solutions();
        sol.myAtoi(str);
    }
}
class Solutions {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        // Step 1: Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Handle sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // Step 3: Parse digits
        long result = 0; // use long to handle overflow during calculation
        while (i < n) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break; // stop on non-digit

            int digit = ch - '0';

            result = result * 10 + digit;

            // Step 4: Check for overflow
            if (sign * result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign * result);
    }
}

