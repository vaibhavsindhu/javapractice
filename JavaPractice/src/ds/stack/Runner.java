package ds.stack;


public class Runner {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("is stack empty before first push : "+stack.isEmpty());
        System.out.println("pop : "+stack.pop());
        stack.push(8);
        stack.push(10);
        System.out.println("size of stack : "+stack.size());
        System.out.println("peek after 2nd push : "+stack.peek());
        stack.push(15);
        stack.push(15);
        stack.push(15);
        stack.push(15);
        System.out.println("after 3 push");
        System.out.println("size of stack : "+stack.size());
        stack.show();
        System.out.println("pop : "+stack.pop());


        System.out.println("after one pop");
        System.out.println("size of stack : "+stack.size());
        System.out.println("is stack empty : "+stack.isEmpty());
        stack.show();


        //=======================Dynamic stack================================================
        System.out.println("=============================Dynamic stack ===========================");
        Dstack dstack=new Dstack();
        dstack.push(8);
        dstack.show();
        dstack.push(10);
        dstack.show();
        dstack.push(20);
        dstack.show();

        dstack.push(30);
        dstack.show();
        dstack.push(13);
        dstack.show();
        dstack.push(44);
        dstack.show();

        System.out.println("===============After pop size should shrink====================");
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        System.out.println("=======shrink now=========");
        dstack.pop();
        dstack.show();
        System.out.println("=======again shrink now=========");
        dstack.pop();
        dstack.show();
    }
}
