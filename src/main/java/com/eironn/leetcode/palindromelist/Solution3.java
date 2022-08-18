package com.eironn.leetcode.palindromelist;

/**
 * 自己写的一个，思路按照网络上2的方案实现，速度很快。
 * Java方法的参数传递是值传递，而对象的值拷贝实际就是一个变量引用。获取middle时head的结构未变，反转middle后head也发生了断裂。
 */
public class Solution3 {

    public boolean isPalindrome(ListNode head) {
        ListNode middle = this.getMiddle(head);
        ListNode copyReverse = reverse(middle);
        ListNode copyHead = head;
        while (null != copyReverse && null != copyHead) {
            if (copyReverse.val != copyHead.val) {
                return false;
            }
            copyHead = copyHead.next;
            copyReverse = copyReverse.next;
        }
        return true;
    }

    public ListNode reverse(ListNode node) {
        if (null == node || null == node.next) {
            return node;
        }
        ListNode resp = null;
        ListNode split = node;
        while (null != split) {
            ListNode temp = split.next;
            split.next = resp;
            resp = split;
            split = temp;
        }
        return resp;
    }

    public ListNode getMiddle(ListNode node) {
        if (null == node || null == node.next) {
            return node;
        }
        ListNode temp = node;
        ListNode s = temp;
        ListNode f = temp.next.next;
        while (null != f && null != f.next) {
            s = temp;
            f = temp.next.next;
            temp = temp.next;
        }
        return s;
    }

    public static void main(String[] args) {
        Solution3 solution1 = new Solution3();
//        ListNode nodeLast3 = new ListNode(3, null);
        ListNode nodeLast2 = new ListNode(1, null);
        ListNode nodeLast1 = new ListNode(2, nodeLast2);
        ListNode nodeSecond = new ListNode(2, nodeLast1);
        ListNode nodeFirst = new ListNode(1, nodeSecond);
        boolean result = solution1.isPalindrome(nodeFirst);
        System.out.println(result);
    }

}

