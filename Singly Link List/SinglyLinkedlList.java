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
        sll.head=new ListNode(10);
         ListNode Second=new ListNode(20);
        // ListNode Third=new ListNode(30);
        // ListNode Fourth=new ListNode(40);


         sll.head.next=Second;
        // Second.next=Third;
        // Third.next=Fourth;



        sll.insertLast(22);
        sll.display();
    //    System.out.println("Length of this SLL is"+ sll.length()); 
    }


}