class Solution {
public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
ListNode fakehead = new ListNode(0);
fakehead.next = list1;
ListNode temp;
if(fakehead.next.val == a){
temp = fakehead.next;
fakehead.next = list2;
}
else{
while(list1.next.val != a){
list1 = list1.next;
}
temp = list1.next;
list1.next = list2;
}
while(temp != null && temp.val != b){
temp = temp.next;
}
while(list2.next != null){
list2 = list2.next;
}
list2.next =temp.next;
return fakehead.next;
}
}