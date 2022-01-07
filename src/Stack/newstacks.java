package Stack;

public class newstacks{
    private ListNode top;
    private int length;

    public class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
        }
    }
    public newstacks(){
        top = null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    public  int peek(){
        return top.data;
    }
    public static void main(String[] args){
        newstacks stack = new newstacks();
        stack.push(10);
        stack.push(2);
        stack.push(9);
        System.out.println(stack.peek());
    }



}
