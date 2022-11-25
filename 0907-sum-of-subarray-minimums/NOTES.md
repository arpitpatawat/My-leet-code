class Solution {
public int[] nextsmallestelement(int[] arr){
Stack<Integer> st = new Stack<>();
int n = arr.length;
st.push(n-1);
int nse[] = new int[n];
nse[n-1] = n;
for(int i = n-2; i >= 0; --i){
while(st.size() > 0 && arr[i] < arr[st.peek()]){
st.pop();
}
nse[i] = (st.size() > 0) ? st.peek() : n;
st.push(i);
}
return nse;
}
public int sumSubarrayMins(int[] arr) {
int nse[] = nextsmallestelement(arr);
long sum = 0;
int n = arr.length;
int mod = 1000000007;
for(int i = 0 ; i < n; ++i){
for(int range = n-1; range >= i; --range){
int j = i;
while(nse[j] <= range){
j = nse[j];
}
sum += (arr[j] % mod);
}
}
return (int) (sum % mod);
}
}