public class LL2 {
    public static Node head;
    public static Node tail;

    static class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean iscycle(){
        Node slow;
        Node fast;

        slow=fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void removecycle(){
        Node slow;
        Node fast;
        slow=fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow == fast){
                slow =head;

                Node prev=null;

                while(slow!=fast){
                    slow=slow.next;
                    prev=fast;
                    fast=fast.next;
                }

                prev.next=null;

            }
        }

    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next=head.next;

        System.out.println(iscycle());
        removecycle();
        System.out.println(iscycle());
    }

}
