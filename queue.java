import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
class queue{
    public static void main(String a[]){
        Queue<Integer> que=new LinkedList<>();
        que.add(13);
        que.add(787);
        System.out.println(que);
        Queue<Object> que1=new LinkedList<>();
        que1.add(13);
        que1.add('j');
        System.out.println(que1);

        //priority queue:
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(23);
        pq.add(20);
        pq.add(67);
        pq.add(79);
        System.out.println(pq);
    }
}