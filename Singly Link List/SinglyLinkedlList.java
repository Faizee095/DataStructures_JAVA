public class SinglyLinkedlList{
    private ListNode head;
    
    private static class ListNode{
        private int data;
        private ListNode next;


        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

    }

    public void display(){
        ListNode current=head;
        while(current !=null){
            System.out.println(current.data + "-->");
            current=current.next;
        }
        System.out.println("null");
    }

    public int length(){
        int count=0;
        ListNode current=head;
        while(current !=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public void insertFirst(int value){
        ListNode n1=new ListNode(value);
        n1.next=head;
        head=n1;
    }

    public void insertAtPoisition(int poisition,int value){
        ListNode node =new ListNode(value);
        if(poisition ==1){
            node.next=head;
            head =node;
        }
        else{
            ListNode previous =head;
            int count =1;
            while(count <poisition -1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=node;
             node.next=current;
        }

    }


    public void insertLast(int value){
        ListNode n1=new ListNode(value);
        if(head==null){
            head=n1;
            return;
        }

        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=n1;
    }



    public static void main(String[] args) {
         SinglyLinkedlList sll=new SinglyLinkedlList();
        // sll.head=new ListNode(10);
        //  ListNode Second=new ListNode(20);
        // ListNode Third=new ListNode(30);
        // ListNode Fourth=new ListNode(40); 


         //sll.head.next=Second;
        // Second.next=Third;
        // Third.next=Fourth;



        // sll.insertLast(12);
        // sll.insertLast(22);
        // sll.insertLast(32);
        // sll.insertFirst(2);
       
        //  System.out.println("Length of this SLL is"+ sll.length()); 

        sll.insertAtPoisition(1,7);
        sll.insertAtPoisition(1,8);
        sll.insertAtPoisition(3,9);
         sll.display();
    }


}