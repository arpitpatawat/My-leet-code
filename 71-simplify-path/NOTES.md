class Solution {
public String simplifyPath(String path) {
if (path == null) {
throw new IllegalArgumentException("Input string is null");
}
​
if (path.length() <= 1) {
return "/";
}
​
// Stack is used to store the length of StringBuilder until previous directory.
Deque<Integer> stack = new ArrayDeque<>();
StringBuilder sb = new StringBuilder();
​
int i = 0;
int len = path.length();
​
while (i < len) {
if (path.charAt(i) == '/') {
i++;
continue;
}
​
StringBuilder dir = new StringBuilder();
while (i < len && path.charAt(i) != '/') {
dir.append(path.charAt(i));
i++;
}
​
String dirName = dir.toString();
switch (dirName) {
case ".":
break;
case "..":
if (!stack.isEmpty()) {
sb.setLength(stack.pop());
}
break;
default:
stack.push(sb.length());
sb.append('/').append(dirName);
}
}
​
return sb.length() != 0 ? sb.toString() : "/";
}
}