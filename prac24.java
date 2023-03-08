class prac24 {

    public static void main(String[] args)  throws CloneNotSupportedException{
        MypriorityQueue<Integer> q1 = new MypriorityQueue<>();
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        MypriorityQueue<Integer> q2 = q1.clone();
        System.out.print("Queue1: ");
        while (q1.size() > 0) {
            System.out.print(q1.remove() + " ");
        }
        System.out.println();
        System.out.print("Queue2: ");
        while (q2.size() > 0) {
            System.out.print(q2.remove() + " ");
        }

    }
}