public class Link2Link implements ITest {

    static class Node<T> {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(T data) {
            this.data = data;
        }
    }


    @Override
    public void test() {

        /**
         * 链表一
         */
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        /**
         * 链表二
         */
        Node<Integer> xnode1 = new Node<>(3);
        Node<Integer> xnode2 = new Node<>(4);
        Node<Integer> xnode3 = new Node<>(5);
        Node<Integer> xnode4 = new Node<>(6);
        Node<Integer> xnode5 = new Node<>(7);
        xnode1.next = xnode2;
        xnode2.next = xnode3;
        xnode3.next = xnode4;
        xnode4.next = xnode5;

        Node<Integer> curNode;
        Node<Integer> node = node1;
        Node<Integer> xnode = xnode1;

        while (node.data != null && xnode.data != null) {

//            if (node.data < xnode.data) {
//                curNode = node;
//
//
//                Node nodeNext = node.next;
//                curNode.next = node;
//                node.next = null;
//
//                curNode = node;
//
//                node = newnode;
//            } else {
//                Node xnodeNext = xnode.next;
//                curNode.next = xnode;
//                xnode.next = null;
//
//                xnode = xnode.next;
//            }
            break;
        }


    }


}
