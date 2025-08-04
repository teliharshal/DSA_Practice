import java.util.*;

public class CityJump {

    public static int countWays(int N, int T, int K, int[] E) {
        int MOD = 1000000007;
        int[][] dp = new int[N][T + 1];

        if (E[0] > T) return 0;

        dp[0][T - E[0]] = 1;

        for (int i = 0; i < N; i++) {
            for (int energy = 0; energy <= T; energy++) {
                if (dp[i][energy] > 0) {
                    for (int jump = 1; jump <= K && i + jump < N; jump++) {
                        int nextCity = i + jump;
                        int nextCost = E[nextCity];
                        if (energy >= nextCost) {
                            dp[nextCity][energy - nextCost] =
                                    (dp[nextCity][energy - nextCost] + dp[i][energy]) % MOD;
                        }
                    }
                }
            }
        }

        // Sum up all ways to reach city N-1
        int result = 0;
        for (int energy = 0; energy <= T; energy++) {
            result = (result + dp[N - 1][energy]) % MOD;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // number of cities
        int T = sc.nextInt(); // total energy
        int K = sc.nextInt(); // max jump distance
        int[] E = new int[N];


        for (int i = 0; i < N; i++) {
            E[i] = sc.nextInt();
        }

        sc.close();
        System.out.println(countWays(N, T, K, E));
    }
}
