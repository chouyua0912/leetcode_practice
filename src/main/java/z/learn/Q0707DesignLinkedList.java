package z.learn;

class Q0707DesignLinkedList {

    private Node head;
    private Node tail;
    private int length;

    /**
     * Initialize your data structure here.
     */
    public Q0707DesignLinkedList() {
        Node node = new Node(-1);
        head = node;
        tail = node;
        length = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= length) {
            return -1;
        }
        Node node = head.next;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        addAtIndex(length, val);
    }

    /**
     * Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list, the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index >= 0 && index <= length) {
            Node newNode = new Node(val);
            Node current = head;
            for (int i = 0; i < index && current != null; i++) {
                current = current.next;
            }
            if (current.next != null) {
                newNode.next = current.next;
            }
            current.next = newNode;
            if (tail == head || index == length) {
                tail = newNode;
            }
            length++;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= 0 && index < length) {
            Node current = head;
            for (int i = 0; i < index && current != null; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            length--;
            if (index == length - 1) {
                tail = current;
            }
        }
    }

    class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */