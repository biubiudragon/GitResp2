package singlelist;

import java.util.HashSet;
import java.util.Set;

public class Panduanshouhuan {
    public static void main(String[] args) {
        Node lastNode = new Node(44);
        Node node3 = new Node(33,lastNode);
        Node node2 = new Node(22,node3);
        Node headNode = new Node(11,node2);
    }

    /**
     * hashset
     * @param head
     * @return
     */
    public static boolean hasCycle(Node head){
        Set<Node> seen = new HashSet<Node>();
        while (head!=null){
            if(!seen.add(head)){
                return true;//假如失败说明有环,没换最后退出循环，null
            }
            head = head.getNext();
        }
        return false;
    }
}
