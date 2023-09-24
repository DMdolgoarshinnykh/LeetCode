import java.util.LinkedList;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode tail = new ListNode();
        ListNode head = new ListNode();
        LinkedList<ListNode> MyList = new LinkedList<ListNode>();

        int i = 0; int integer1 = 0, integer2 = 0;
        ListNode bufferL1 = l1;
        while (bufferL1.next != null)
        {
            i++;
            bufferL1 = bufferL1.next;
        }

        while (l1.next != null)
        {
            int buffer = 1;
            for (int j = i; j > 0; j--)
            {
                buffer = buffer * 10;
            }
            integer1 = integer1 + l1.val * buffer;
            l1 = l1.next;
            i--;
        }
        int buffer = 1;
        for (int j = i; i < j; j--)
        {
            buffer = buffer * 10;
        }
        integer1 = integer1 + l1.val * buffer;

        i = 0;
        ListNode bufferL2 = l2;
        while (bufferL2.next != null)
        {
            i++;
            bufferL2 = bufferL2.next;
        }

        while (l2.next != null)
        {
            buffer = 1;
            for (int j = i; j > 0; j--)
            {
                buffer = buffer * 10;
            }
            integer2 = integer2 + l2.val * buffer;
            l2 = l2.next;
            i--;
        }
        buffer = 1;
        for (int j = i; j > i; j--)
        {
            buffer = buffer * 10;
        }
        integer2 = integer2 + l2.val * buffer;
        i++;

        integer1 = integer1+integer2;
        head = tail;
        if (integer1%10 > 0)
        {
            tail.val = integer1%10;
            MyList.add(tail);
            integer1 = integer1/10;
        }
        while (integer1 > 0)
        {
            MyList.add(new ListNode(integer1%10,head));
            head = MyList.getLast();
            head.val = integer1%10;
            integer1 = integer1/10;
        }


        LinkedList <ListNode> MySecondList = new LinkedList<ListNode>();
        ListNode tail2 = new ListNode();
        ListNode head2 = new ListNode();
        {
            tail2.val = head.val;
            MySecondList.add(tail2);
            head = head.next;
            head2 = tail2;
        }

        while (head.next != null)
        {
            MySecondList.add(new ListNode(head.val,head2));
            head2 = MySecondList.getLast();
            head2.val = head.val;
            head = head.next;
        }
        MySecondList.add(new ListNode(head.val,head2));
        head2 = MySecondList.getLast();
        head2.val = head.val;
        return head2;
    }
}