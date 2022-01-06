package com.hr.problemsolving.datastructures.queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        Scanner sc = new Scanner(System.in);
        int query = Integer.parseInt(sc.nextLine());

        while (query > 0) {
            String[] q = sc.nextLine().split(" ");
            int queryType = Integer.parseInt(q[0]);
            if (queryType == 1) {
                queue.enqueue(Integer.parseInt(q[1]));
            } else if (queryType == 2) {
                queue.dequeue();
            } else {
                System.out.println(queue.peek());
            }
            query--;
        }
    }

    static class CustomQueue {
        Stack<Integer> stackNewOnTop = new Stack<>();
        Stack<Integer> stackOldOnTop = new Stack<>();

        public void enqueue(int item) {
            stackNewOnTop.push(item);
        }

        public int dequeue() {
            shiftElement();
            return stackOldOnTop.pop();
        }

        public int peek() {
            shiftElement();
            return stackOldOnTop.peek();
        }

        private void shiftElement() {
            if (stackOldOnTop.isEmpty()) {
                while (!stackNewOnTop.isEmpty()) {
                    stackOldOnTop.push(stackNewOnTop.pop());
                }
            }
        }


    }
}
