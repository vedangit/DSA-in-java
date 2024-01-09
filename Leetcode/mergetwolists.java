//Merge two sorted lists
//one new head 
//two loops for l1 and l2
//compare l1 and l2 and make link accoridngly
//copy remaining

public class mergetwolists {
    private class ListNode {
            ListNode next;
            int val;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        head.next = null;
    
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode temp3 = head;
        

        while(temp1! = null && temp2 != null){
            if(temp1.val>temp2.val){
                temp3.next = temp2;
                temp2 = temp2.next;
            }
            else if(temp1.val<temp2.val){
                temp3.next = temp1;
                temp1 = temp1.next;
            }
        }

        while(temp1!=null){
            temp3.next = temp1;
            temp1 = temp1.next;
        }

        while(temp2!=null){
            temp3.next = temp2;
            temp2 = temp1.next;
        }

        return temp3;

    }
}
