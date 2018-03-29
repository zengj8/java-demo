import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    public T data;

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }

    public static void main(String... args) {
        Node<Integer> n = new MyNode(5);
//        Node n = new MyNode(5);
        n.setData(1);

//        List<?>[] l = new ArrayList<?>[10];
//        l[0].add("ss");
    }
}

class MyNode extends Node<Integer> {
    public MyNode(Integer data) {
        super(data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}

