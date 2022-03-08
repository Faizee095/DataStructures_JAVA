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


    public static void main(String[] args) {
        SinglyLinkedlList sll=new SinglyLinkedlList();
        sll.head=new ListNode(10);
        ListNode Second=new ListNode(20);
        ListNode Third=new ListNode(30);
        ListNode Fourth=new ListNode(40);


        sll.head.next=Second;
        Second.next=Third;
        Third.next=Fourth;



        // sll.display();
       System.out.println("Length of this SLL is"+ sll.length()); 
    }


}