import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode tail = new ListNode(2);
        ListNode Node1 = new ListNode(4,tail);
        ListNode Head = new ListNode(3,Node1);
        ListNode tail1 = new ListNode(5);
        ListNode Node11 = new ListNode(6,tail1);
        ListNode Head1 = new ListNode(4,Node11);
        Solution sol = new Solution();
        ListNode tail2 =  sol.addTwoNumbers(Head,Head1);
    }
}