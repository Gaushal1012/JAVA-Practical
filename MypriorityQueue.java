import java.util.*;

class MypriorityQueue<E> extends PriorityQueue<E> implements Cloneable {

    @Override
    public MypriorityQueue<E> clone() throws CloneNotSupportedException
    {
        MypriorityQueue<E> temp=new MypriorityQueue<>();
        temp.addAll((MypriorityQueue<E>)super.clone());
        return temp;
    }
}
