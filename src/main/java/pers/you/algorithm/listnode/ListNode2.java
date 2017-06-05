package pers.you.algorithm.listnode;

public class ListNode2 {
    public int val;
    public ListNode2 next;
    public ListNode2(int val) {
            super();
            this.val = val;
    }
    public ListNode2(int val, ListNode2 next) {
            super();
            this.val = val;
            this.next = next;
    }
    @Override
    public String toString() {
            return "ListNode [val=" + val + "]";
    }

    public static void printList(ListNode2 head){
            ListNode2 p=head;
            while(p!=null){
                    System.out.print(p.val+" ");
                    p=p.next;
            }
            System.out.println();
    }
    public static ListNode2 arrayToList(int[] array){
            ListNode2 head=new ListNode2(0);
            ListNode2 p=head;
            for(int value:array){
                    p.next=new ListNode2(value);
                    p=p.next;
            }
            return head.next;
    }
    /**
     * 创建约瑟夫环
     */
    public static ListNode2 arrayToCircle(int[] array){
            ListNode2 head=new ListNode2(0);
            ListNode2 p=head;
            for(int value:array){
                    p.next=new ListNode2(value);
                    p=p.next;
            }
            p.next=head.next;
            return head.next;
    }
    /**
     * 创建有交点的两个链表
     */
   public static ListNode2[] arrayToIntersection(int[] array1,int[] array2,int interIndex){
       //array1={1,2,3,4,5,6,7,8} array2={9,10} interIndex=5
       //list1=1,2,3,4,5,6,7,8 list2=9,10,5,6,7,8
       ListNode2 head1 = new ListNode2(0);
       ListNode2 head2 = new ListNode2(0);
       ListNode2 p1=head1;
       ListNode2 p2=head2;
       int m = array1.length;
       ListNode2 intersection = null;
       for(int i=0;i<m;i++){
           p1.next = new ListNode2(array1[i]);
           p1=p1.next;
           if(i==interIndex-1){
               intersection=p1;
           }
       }
       int n = array2.length;
       for(int i=0;i<n;i++){
           p2.next = new ListNode2(array2[i]);
           p2=p2.next;
       }
       p2.next=intersection;
       ListNode2[] array = {head1.next,head2.next};
       return array;
   }
   
   public static ListNode2 createCycle(int[] array,int index){
       ListNode2 head = new ListNode2(0);
       ListNode2 p = head;
       int n = array.length;
       ListNode2 startNode = null;
       for(int i=0;i<n;i++){
           p.next = new ListNode2((array[i]));
           p = p.next;
           if(i == index - 1){
               startNode = p;
           }
       }
       p.next = startNode;
       return head.next;
   }

}
