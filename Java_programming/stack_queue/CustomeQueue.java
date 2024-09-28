package stack_queue;

public class CustomeQueue {
    protected int [] data;
    private static  final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomeQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomeQueue(int size){
        this.data = new int[size];
    }

    public boolean isEmpty(){
        return ptr == 0;
    }

    public  boolean isFull(){
        return ptr == data.length;
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        //shift elements to left
        for (int i = 1;i< ptr;i++){
            data[i-1] = data[i];
        }
        ptr--;
        return removed;
    }

    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

}
