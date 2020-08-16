package datastructure.stack;

public class TestStack {
    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray();
        stackUsingArray.push(7);
        System.out.println("top element of the stack : "+stackUsingArray.peek());
        stackUsingArray.push(4);
        System.out.println("top element of the stack : "+stackUsingArray.peek());
        stackUsingArray.push(5);
        System.out.println("top element of the stack : "+stackUsingArray.peek());
        stackUsingArray.push(8);
        System.out.println("top element of the stack : "+stackUsingArray.peek());
        stackUsingArray.push(1);
        System.out.println("top element of the stack : "+stackUsingArray.peek());
        stackUsingArray.push(2);   //this one is to chk array index out of bound exception
        System.out.println("top element of the stack : "+stackUsingArray.peek());
        stackUsingArray.showStack();
        System.out.print(stackUsingArray.pop());
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.pop();  //this one is to check the stack empty exception
        stackUsingArray.push(9);
        System.out.println("top element of the stack : "+stackUsingArray.peek());
        stackUsingArray.showStack();

        System.out.println("***********reverse the list**********************");
       int [] list={1,2,4,7,3};
        stackUsingArray.reverse(list);

        //***********************************Implement stack using linked list******************************************************
        System.out.println("*******************************Implement stack using linked list************************");
        StackUsingLinkedList stackUsingLinkedList=new StackUsingLinkedList();
        stackUsingLinkedList.push(2);
        stackUsingLinkedList.push(7);
        stackUsingLinkedList.push(1);

        stackUsingLinkedList.show();
        stackUsingLinkedList.pop();
        stackUsingLinkedList.show();


    }


}
