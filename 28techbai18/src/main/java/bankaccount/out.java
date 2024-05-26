
package bankaccount;


import java.util.Scanner;


public class out 
{
    public static void main(String[] args) 
    {
        System.out.println("nhap vap sp acc");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        Account[] acc= new Account[n] ;
        for(int i=0; i<n;i++)
        {
            sc.nextLine();

            System.out.println("nhap vao acc va pass "+(i+1));
            acc[i]= new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        System.out.println("Nhap vao so luong thao tac");
        
        int q= sc.nextInt();
        sc.nextLine() ;
        for(int i=0; i<q;i++)
        {
            sc.nextLine();

            System.out.println("loai tran");
            sc.nextLine() ;
            String tran= sc.nextLine();
            if(tran.equals("withdraw"))
            {
                String stk=sc.nextLine();
                int tien=sc.nextInt();
                int pos = Account.findPos(acc, stk);
                acc[pos].withdraw(tien);
            }
            else
                if(tran.equals("deposit"))
                    {
                        String stk=sc.nextLine();
                        int tien=sc.nextInt();
                        int pos = Account.findPos(acc, stk);
                        acc[pos].deposit(tien);
                    }
                else
                {
                        System.out.println("tk nguon");
                        String X= sc.nextLine();
                        System.out.println(" tk dich");
                        String Y= sc.nextLine();
                        System.out.println("so tien chuyen");
                        int tien= sc.nextInt() ;
                        int post1= Account.findPos(acc, X);
                        int post2= Account.findPos(acc, Y);
                        if((acc[post1].getsoDu()-50000) >= tien)
                        {
                            acc[post1].withdraw(tien);
                            acc[post2].deposit(tien);
                        }
                }
                    
                
        }
        for(Account x: acc)
        {
            System.out.println(x);
        }
        
    }
}
