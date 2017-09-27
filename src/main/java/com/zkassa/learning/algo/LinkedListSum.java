package com.zkassa.learning.algo;

import com.zkassa.learning.dataStructure.linkedList.LinkedListT;
import com.zkassa.learning.dataStructure.linkedList.ListNode;
import com.zkassa.learning.dataStructure.linkedList.Node;

public class LinkedListSum {

    public static void main(String[] args){
        LinkedListT listT1 = new LinkedListT();

        listT1.addAtEnd(2);
        listT1.addAtEnd(4);
        listT1.addAtEnd(3);

        listT1.display();

        LinkedListT listT2 = new LinkedListT();

        listT2.addAtEnd(5);
        listT2.addAtEnd(6);
        listT2.addAtEnd(4);

        listT2.display();

        System.out.println();

        LinkedListT result = linkedListSum(listT1,listT2);
        result.display();

        System.out.println("with list node");
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next = new ListNode(4);

        ListNode result1 = addTwoNumbers1(l1,l2);
        System.out.println(result1);

    }

    private static LinkedListT linkedListSum(LinkedListT list1, LinkedListT list2){

        LinkedListT result = new LinkedListT();

        Node current1 = list1.head;
        Node current2 = list2.head;

        int carry = 0;
        int value = 0;

        while (current1 != null || current2 != null || carry != 0){

            if(current1 != null){
                value += current1.data;
                current1 = current1.next;
            }

            if(current2 != null){
                value += current2.data;
                current2 = current2.next;
            }

            value += carry;

            carry  = value/10;
            value = value%10;

            System.out.println("carry is: " + carry);
            result.addAtEnd(value);

            value = 0;
        }

        return result;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current1 =l1;
        ListNode current2 = l2;

        ListNode dummy = new ListNode(0);
        ListNode result = dummy;

        int carry = 0;
        int value = 0;

        while (current1 != null || current2 != null || carry != 0){

            if(current1 != null){
                value += current1.data;
                current1 = current1.next;
            }

            if(current2 != null){
                value += current2.data;
                current2 = current2.next;
            }

            value += carry;

            carry  = value/10;
            value = value%10;

            result.next = new ListNode(value);
            result = result.next;

            value = 0;
        }

        return dummy.next;
    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.data : 0;
            int y = (q != null) ? q.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
