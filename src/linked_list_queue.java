import java.util.Scanner;

public class linked_list_queue {
    node front;
    node rear;
    linked_list_queue()
    {
        front=null;
        rear=null;

    }
   public boolean is_empty()
   {
        if(front==null&&rear==null )
        {
             return true;
        }
        else
            return false;
   }
    public void enqueue(int val)
   {
       node n=new node();
       n.setData(val);
       if(is_empty())
       {
            front=rear=n;
       }
       else {
           rear.setNext(n);
           rear=n;
       }

   }
   public int dequeue()
   {  int temp3;
       if(front==null) {
           System.out.println("empty list");
        return 0;
       }
       else {
           temp3=front.getData();
           front = front.getnext();
       return temp3;
       }
   }
   public void display()
   {
        node temp;
        temp=front;
        if(is_empty()) {
            System.out.println("empty list");
            return;
        }
        else{
        while(temp!=null)
        {
            System.out.println(temp.getData());
            temp=temp.getnext();
        }
   }}

    public static void main(String[] args) {
        linked_list_queue obj=new linked_list_queue();
        int n=1;
        while(n!=0) {
            System.out.println("select any option");
            Scanner sc = new Scanner(System.in);
            System.out.println("to enter data press 1");
            System.out.println("to retrieve data press 2");
            System.out.println("to display all elements press 3");
            System.out.println("to exit press 0");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    n = 0;
                    break;
                case 1:
                    System.out.println("enter data");
                    int temp = sc.nextInt();
                    obj.enqueue(temp);
                    break;
                case 2:
                    temp = obj.dequeue();
                    System.out.println(temp);
                    break;
                case 3:
                    obj.display();

            }

        }}}