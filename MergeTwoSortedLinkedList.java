public class MergeTwoSortedLinkedList {

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

}
