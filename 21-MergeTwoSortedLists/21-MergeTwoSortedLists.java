// Last updated: 10/3/2026, 1:43:46 PM
1
2class Solution {
3    public ListNode mergeTwoLists(ListNode list1, ListNode list2) { 
4     ListNode dummy =new ListNode(0);
5    ListNode temp= dummy;
6    ListNode p1 =list1;
7    ListNode p2 =list2;
8    while(p1!=null && p2!=null){
9        if(p1.val<p2.val){
10            temp.next =p1;
11            p1=p1.next;
12        }else{
13            temp.next=p2;
14            p2=p2.next;
15        }
16        temp=temp.next;
17    }
18    if(p1!=null){
19        temp.next=p1;
20    }
21    if(p2!=null){
22        temp.next=p2;
23    }
24    return dummy.next;
25        
26    }
27}