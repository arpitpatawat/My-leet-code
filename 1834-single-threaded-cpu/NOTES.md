if(change[i][0] > time){
int temp[] = pq.poll();
ans[index++] = temp[1];
time = time + temp[0];
// print(change[i][0] , time, temp[1]);
pq.offer(new int[]{change[i][1], change[i][2]});
}
else if(change[i][0] == time){
pq.offer(new int[]{change[i][1], change[i][2]});
int temp[] = pq.poll();
ans[index++] = temp[1];
time = time + temp[0];
}
else{
pq.offer(new int[]{change[i][1], change[i][2]});
}