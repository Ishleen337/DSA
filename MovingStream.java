import java.util.*;

class MovingAverage {

    Queue<Integer> queue;
    int size;
    MovingAverage(int size) {
        this.size = size;
        queue = new LinkedList<>();
    }
    double next(int val) {
        queue.add(val);
        if (queue.size() > size) {
            queue.poll();
        }
        int sum=0;
        for(int num:queue){
            sum+=num;
        }
        return (double)sum / queue.size();
    }

    public static void main(String[] args) {

        MovingAverage obj = new MovingAverage(3);

        System.out.println(obj.next(1));
        System.out.println(obj.next(10));
        System.out.println(obj.next(3));
        System.out.println(obj.next(5));
    }
}
