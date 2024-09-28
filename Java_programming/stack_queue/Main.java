package stack_queue;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomStack stack = new CustomStack(5);
//
//        stack.push(10);
//        stack.push(15);
//        stack.push(20);
//        stack.push(25);
//        stack.push(30);
//        stack.push(35);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        CustomeQueue queue = new CustomeQueue(5);

        queue.insert(10);
        queue.insert(15);
        queue.insert(20);
        queue.insert(25);
        queue.insert(30);
        queue.display();
        System.out.println(queue.front());
    }
}
