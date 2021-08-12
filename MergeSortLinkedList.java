public class MergeSortLinkedList {

    public static LinkedList mergeSort(Node head, Node tail){

        if(head == tail){
            LinkedList bs = new LinkedList();
            bs.addLast(head.data);
            return bs;
        }

        Node mid = midNode(head , tail);

        LinkedList l1 = mergeSort(head , mid);
        LinkedList l2 = mergeSort(mid.next , tail);

        LinkedList l3 = mergeTwoSortedLists(l1 , l2);

        return l3;

    }


    public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {

        Node p1 , p2;

        p1 = l1.head;
        p2 = l2.head;

        LinkedList res = new LinkedList();

        while(p1 != null || p2!= null){

            if(p1.data > p2.data){
                res.addLast(p2.data);
            }else{
                res.addLast(p1.data);
            }

        }

        while (p1 != null){
            res.addLast(p1.data);
        }

        while (p2 != null){
            res.addLast(p2.data);
        }

        return res;
    }

    public static Node midNode(Node head , Node tail) {
        Node f = head;
        Node s = head;

        while (f != tail && f.next != tail) {
            f = f.next.next;
            s = s.next;
        }

        return s;
    }

}
