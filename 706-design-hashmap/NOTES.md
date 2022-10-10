if(mainHead == null ){
return ;
}
if(mainHead.val1 == key){
mainHead = mainHead.next;
return ;
}
Node head = mainHead;
while(head.next != null){
if(head.next.val1 == key){
head.next = head.next.next;
return ;
}
head = head.next;
}
return ;