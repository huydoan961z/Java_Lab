
import java.util.Scanner;
import java.util.StringTokenizer;




class Node {
    
    public int value;
    public Node  next;
    public Node(int value, Node next)
    { 
        this.value=value; 
        this.next=null; 
    }
   
}

 class LinkListedStack
 {
    Node head;
    public void push(int value)
    {
        Node newNode=new Node(value,null);
        newNode.next=head;
        head=newNode;
    }
    
    public boolean isEmpty()
    {
        return head==null;
    }
    
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("The Stack is Empty");
        }
            int valuepop=head.value;
            head=head.next;
            return valuepop;
    }
    
 }

public class PostfixEvaluator {
    
    public static int evaluatePostfix(String expression)
    {
        LinkListedStack linkliststack=new LinkListedStack();

        StringTokenizer st=new StringTokenizer(expression);
        while(st.hasMoreTokens())
        {
            char[] charArray = st.nextToken().toCharArray();
            for(char token: charArray)
            {
                if(Character.isDigit(token))
                {
                    linkliststack.push(token - '0');
                }
                else
                {
                    int result=0;
                    int op1=linkliststack.pop();
                    int op2=linkliststack.pop();
                    switch(token)
                    {
                        case '+':
                            result=op1+op2;
                            linkliststack.push(result);
                            break;
                        case '-':
                            result=op2-op1;
                            linkliststack.push(result);
                            break;
                        case '*':
                            result=op1*op2;
                            linkliststack.push(result);
                            break;
                        case '/':
                            result=op2/op1;
                            linkliststack.push(result);
                            break;
                    }
                }
            }   
        }
        return linkliststack.pop();
    }
    
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Expression: ");
        String expression=scanner.nextLine();   
        System.out.println(evaluatePostfix(expression));
        
    }
}