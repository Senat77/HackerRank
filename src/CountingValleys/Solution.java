package CountingValleys;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        int res = 0, height = 0, lastHeight = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D')
                height--;
            else
                height++;
            if (height >= 0 && lastHeight < 0)
                res ++;
            lastHeight = height;
        }
        System.out.println(res);
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("CountingValleys"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
