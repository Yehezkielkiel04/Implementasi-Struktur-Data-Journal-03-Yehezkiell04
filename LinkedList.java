public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    
    public void addFirst(Buku data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    
    public void addLast(Buku data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    
    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("List kosong, tidak ada yang bisa dihapus.");
        }
    }

    
    public void deleteLast() {
        if (head == null) {
            System.out.println("List kosong, tidak ada yang bisa dihapus.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    
    public void printList() {
        if (head == null) {
            System.out.println("List kosong.");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}
