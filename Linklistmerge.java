public class Linklistmerge {
        public static Node head;
        public static Node tail;
    
        public static class Node{
    
            int data;
            Node next;
    
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        public static void print(){
            Node temp=head;
    
            if(head == null){
                System.out.println("LL is Empty");
                return;
            }
    
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        
        public static Node findmid(Node head){
            Node slow ;
            Node fast=head.next;
            slow=head;

            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            return slow;

        }

        public static Node merge(Node head1, Node head2){
            Node merged = new Node(-1);
            Node temp = merged;
            while(head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                temp=temp.next;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                temp=temp.next;
                head2=head2.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head1=head2.next;
            temp=temp.next;
        }
        return merged.next;
        }

        public static Node mergesort(Node head){
              if(head==null||head.next==null){
                return head;
            }
            Node mid=findmid(head);
            Node righthead=mid.next;
            mid.next=null;


            Node leftnode=mergesort(head);
            Node rightnode=mergesort(righthead);
            return merge(leftnode,rightnode);
        }
    
        public static void main(String[] args) {
            Linklistmerge newnode = new Linklistmerge();
            newnode.print();
            
        
        head = new Node(5);
        head.next= new Node(4);
        head.next.next= new Node(3);
        head.next.next.next= new Node(2);
        head.next.next.next.next= new Node(1);
        newnode.print();
        newnode.head=newnode.mergesort(head);
        newnode.print();
        }
    
    }
    
