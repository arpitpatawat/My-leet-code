class Solution {
public int DP(int amount , int[] coins, int n, int helper []){
if(n < 0) return 0;
if(amount == 0) return 1;
if(helper[amount] == -1){
int sum = 0;
sum += DP( amount ,  coins , n - 1, helper);
if(coins[n] <= amount){
sum += DP(amount - coins[n], coins , n, helper);
}
helper[amount] = sum;
}
return helper[amount];
}
public int change(int amount, int[] coins) {
int helper []= new int[amount + 1];
Arrays.fill(helper , -1);
int x =  DP(amount , coins , coins.length - 1, helper);
System.out.println(Arrays.toString(helper));
return x;
}
}