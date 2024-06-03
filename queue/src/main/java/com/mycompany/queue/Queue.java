/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queue;

/**
 *
 * @author aser
 */
public class Queue {
    private ListNode head;
    private ListNode tail; 
    private int length;
    
    private class ListNode {
        private String job;
        private int priority;
        private ListNode next;

        public ListNode(String job, int priority) {
            this.job = job;
            this.priority = priority;
            this.next = null;
        }
    }
    public Queue() {
        head = tail = null;
        length = 0;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public void enqueue(String job, int priority) 
    {
        ListNode newNode = new ListNode(job, priority);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            if (newNode.priority < head.priority) 
            {
                // Insert at the front
                newNode.next = head;
                head = newNode;
            } else 
            {
                //insert at the end or middle
                ListNode current = head;
                while (current.next != null && current.next.priority <= newNode.priority) 
                {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;  
                }
            }
        }
        length++;
}

    public void display()
    {
        ListNode current= head;
        while(current!=null)
        {
            System.out.println(current.job);
            current=current.next;
        }
        
    }
}
