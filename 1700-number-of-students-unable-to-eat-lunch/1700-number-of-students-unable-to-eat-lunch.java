import java.util.*;
class Solution {
    public Queue<Integer> que= new ArrayDeque<>();
    
    public int countStudents(int[] students, int[] sandwiches) {
        
        int n= students.length;
        int m=sandwiches.length;
    for(int j = 0; j < n; j++) {
    que.add(students[j]);
}

int rotation =0;
int index=0;

while(!que.isEmpty() && rotation<que.size()) {
    if(que.peek()==sandwiches[index]) {
        que.remove();
        index++;
        rotation=0;
    }
    else {
        que.add(que.remove());
        rotation++;
    }
}
return que.size();
    }
}