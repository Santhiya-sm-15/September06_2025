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