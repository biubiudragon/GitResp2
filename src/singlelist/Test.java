package singlelist;

public class Test {
    public static void main(String[] args) {
        //创建单链表
        Node lastNode = new Node(44);
        Node node3 = new Node(33,lastNode);
        Node node2 = new Node(22,node3);
        Node headNode = new Node(11,node2);
        System.out.print("反转之前的单链表：");
        print(headNode);
        System.out.println();
        System.out.print("反转之后的单链表：");
        Node reverse = reverseLinkedList(headNode);
        print(reverse);
    }

    /**
     * 实现单链表的遍历操作
     * @param headNode
     */
    public static void print(Node headNode){
        //1.定义一个临时结点，用于辅助单链表的遍历操作
        Node tempNode = headNode;
        //2.定义一个循环，用于循环单链表的遍历操作
        while (tempNode!=null){
            System.out.print(tempNode.getData()+" ");
            //4.让tempNode指向下一个结点
            tempNode = tempNode.getNext();
        }
    }

    /**
     * 实现单链表的首节点
     * @param headNode 需要反转单链表的首节点
     * @return 反转之后链表的首节点
     */
    public static Node reverseLinkedList(Node headNode){
        //1.判断headNode为null。或者只有一个结点
        if (headNode==null||headNode.getNext()==null){
            return headNode;
        }
        //2.定义一个结点，用于保存反转之后的链表的首节点
        Node reverse = null;
        //3.定义一个循环实现反转
        while (headNode!=null){
            //4.获取headNode的下一个结点
            Node nextNode = headNode.getNext();
            //5.把headNode插入反转后链表的最前面
            headNode.setNext(reverse);
            //6.更新反转后链表的首节点
            reverse = headNode;
            //7.更新需要反转列表的首节点
            headNode = nextNode;
        }
        //8.返回反转后链表的首节点
        return reverse;
    }
}
