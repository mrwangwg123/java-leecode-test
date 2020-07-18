public class LinkListReverse2 implements ITest {


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

        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        for (Node node = node1; node.next != null; node = node.next) {

            System.out.println(node.data + "--111111-->" + node.next.data);

        }

        Node newNode = linkListReverse(node1);

        for (Node node = newNode; node.next != null; node = node.next) {

            System.out.println(node.data + "--222222222-->" + node.next.data);

        }
    }


    //
    public Node linkListReverse(Node linkFirst) {

        Node head = new Node(0);

        for (Node node = linkFirst; node.data != null; ) {
            System.out.println("======" + node.data);

            Node tmp = head.next;
            head.next = node;

                Node tmp2 = node.next;

            node.next = tmp;

            if (tmp2 == null)
                break;

            node = tmp2;
        }

        return head.next;
    }
}
