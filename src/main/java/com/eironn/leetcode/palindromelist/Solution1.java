package com.eironn.leetcode.palindromelist;

import java.util.Stack;

/**
 * 我自己写的，通过压栈来实现
 */
public class Solution1 {

    /**
     * 使用stack方式完全遍历
     *
     * @param head 链表头
     * @return 是否为palindrome
     */
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (null != temp) {
            stack.push(temp.val);
            temp = temp.next;
        }
        boolean resp = true;
        while (null != head) {
            if (stack.pop() != head.val) {
                resp = false;
                break;
            }
            head = head.next;
        }
        return resp;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        ListNode nodeLast = new ListNode(3, null);
        ListNode nodeSecond = new ListNode(1, nodeLast);
        ListNode nodeFirst = new ListNode(2, nodeSecond);
        boolean result = solution1.isPalindrome(nodeFirst);
        System.out.println(result);
    }

}

