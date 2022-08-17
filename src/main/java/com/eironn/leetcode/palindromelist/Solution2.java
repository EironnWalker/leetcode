package com.eironn.leetcode.palindromelist;

/**
 * 网上给的答案，通过从中间对比来优化速度
 */
public class Solution2 {

    public boolean isPalindrome(ListNode head) {

        ListNode mid = findMiddle(head);
        ListNode newNode = reverseLL(mid);
        ListNode reversing = newNode;
        ListNode first = head;

        while (newNode != null && first != null) {
            if (newNode.val != first.val) {
                break;
            }
            newNode = newNode.next;
            first = first.next;
        }
        return newNode == null || first == null;
    }

    //Take previous, current and next three pointer and start iterate over node utill our //current not reach to null. Once current is null loop will end but now prev is at place of //curr hence we return the head.
    ListNode reverseLL(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode reverseNode = null;
        ListNode splitNode = head;
        while (null != splitNode) {
            ListNode temp = splitNode.next;
            splitNode.next = reverseNode;
            reverseNode = splitNode;
            splitNode = temp;
        }
        return reverseNode;
    }

    //Take a slow and fast pointer to find middle of the actual node.
    // here slow pointer started from null and fast or fast.next will reach to null then while //loop will end. and we store the next to slow pointer(nn) and return it.

    ListNode findMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode s = null;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = (s == null) ? head : s.next;
            f = f.next.next;
        }
        ListNode nn = s.next;
        s.next = null;
        return nn;
    }

    public static void main(String[] args) {
        Solution2 solution1 = new Solution2();
//        ListNode nodeLast3 = new ListNode(3, null);
        ListNode nodeLast2 = new ListNode(1, null);
        ListNode nodeLast1 = new ListNode(2, nodeLast2);
        ListNode nodeSecond = new ListNode(2, nodeLast1);
        ListNode nodeFirst = new ListNode(1, nodeSecond);
        boolean result = solution1.isPalindrome(nodeFirst);
        System.out.println(result);
    }

    public ListNode recursion(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode last = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }

}

