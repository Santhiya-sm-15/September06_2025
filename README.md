# September06_2025
The problem that I solved today

Given the head of a linked list, determine whether the list contains a loop. If a loop is present, return the number of nodes in the loop, otherwise return 0.

Note: Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. If pos = 0, it means the last node points to null, indicating there is no loop. Note that pos is not passed as a parameter.

Code:
class Solution {
    public int lengthOfLoop(Node head) {
        Map<Node,Integer> m=new HashMap<>();
        int cnt=0;
        while(head!=null)
        {
            cnt++;
            if(m.containsKey(head))
                return cnt-m.get(head);
            m.put(head,cnt);
            head=head.next;
        }
        return 0;
    }
}
