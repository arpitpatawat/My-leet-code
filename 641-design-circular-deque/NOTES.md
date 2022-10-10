}
else{
return false;
}
}
public boolean isFull() {
if(count == max){
return true;
}
else{
return false;
}
}
}
​
/**
* Your MyCircularDeque object will be instantiated and called as such:
* MyCircularDeque obj = new MyCircularDeque(k);
* boolean param_1 = obj.insertFront(value);
* boolean param_2 = obj.insertLast(value);
* boolean param_3 = obj.deleteFront();
* boolean param_4 = obj.deleteLast();
* int param_5 = obj.getFront();
* int param_6 = obj.getRear();
* boolean param_7 = obj.isEmpty();
* boolean param_8 = obj.isFull();
*/