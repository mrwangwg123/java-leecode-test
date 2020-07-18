/**
 * 链表反转
 */

public class LinkListReverse implements ITest{

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    @Override
    public void test() {
        System.out.println("wwg->node000-->");
        Node node5 = new Node(5);
        Node node4 = new Node(4);
        Node node3 = new Node(3);
        Node node2 = new Node(2);
        Node node1 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node newNode = new Node(0);
        Node preNode = null;
        Node nextNode;
        for(Node node = node1; node.next!=null;){
            System.out.println("wwg->node111--->"+node.data);
            newNode.next = node;//插入节点步骤1
            nextNode = node.next;//缓存下一个节点
            node.next = preNode;//插入节点步骤2
            preNode = node;//

            node = nextNode;
        }

        for (Node n = newNode; n.next!=null; n = n.next){
            System.out.println("wwg->node--->"+n.next.data);
        }
    }
}
