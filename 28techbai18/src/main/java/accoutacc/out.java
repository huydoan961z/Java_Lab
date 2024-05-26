
package accoutacc;

import java.util.Scanner;


public class out 
{
    public static void main(String[] args) {
        System.out.println("nhap vap sp acc");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Account[] acc= new Account[n] ;
        for(int i=0; i<n;i++)
        {
            System.out.println("nhap vao acc va pass "+(i+1));
            acc[i]= new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        System.out.println("Nhap vao so acc can check");
        int q= sc.nextInt();
        sc.nextLine();
        for(int i=0; i<q;i++)
        {
            String username= sc.nextLine();
            String password=sc.nextLine();
            boolean check=false;
            for(int j=0;j<n;j++)
            {
                if(acc[j].checkLogin(username, password)){
                    check=true;
                    break;
                }
            }
            if(check)
                System.out.println("ok");
            else
                System.out.println("false");
                        
            
        }
    }
}
