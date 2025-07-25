// Last updated: 7/25/2025, 8:52:29 AM
class MyHashSet {
    Node head;

    public MyHashSet() {
        head = null;
    }

    public void add(int key) {
        if (head == null) {
            head = new Node(key);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(key);
    }

    public void remove(int key) {
        if(head == null) {
            return;
        }
        if(head.data == key){
            head = head.next;
        }        
        Node temp = head;

        while(temp.next != null){
            if(temp.next.data == key){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
    }

    public boolean contains(int key) {
        if(head==null) return false;
        if(head.data==key) return true;
        
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==key) return true;
            temp=temp.next;
        }
        return false;
    }
}

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */