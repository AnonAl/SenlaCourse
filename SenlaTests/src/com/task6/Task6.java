package com.task6;

public class Task6 {
    public int knapsack(int weights[], int costs[], int needed) {
        int n = weights.length;
        int dp[][] = new int[needed + 1][n + 1];
        for (int j = 1; j <= n; j++) {
            for (int w = 1; w <= needed; w++) {
                if (weights[j-1] <= w) {
                    dp[w][j] = Math.max(dp[w][j - 1], dp[w - weights[j-1]][j - 1] + costs[j-1]);
                } else {
                    dp[w][j] = dp[w][j - 1];
                }
            }
        }
        return dp[needed][n];
    }
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        int[] weight = {13,34,35,88};
        int[] costs = {45,25,66,34};
        System.out.println(task6.knapsack(weight,costs,50));
    }
}



