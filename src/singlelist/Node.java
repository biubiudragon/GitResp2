package singlelist;

public class Node {
    //用于保存结点中的数据
    private Object data;
    //用于保存下一个结点的地址值
    private Node next;

    /**
     * data做初始化工作
     * @param data
     */
    public Node(Object data) {
        this.data = data;
    }

    /**
     * data next 初始化
     * @param data
     * @param next
     */
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
