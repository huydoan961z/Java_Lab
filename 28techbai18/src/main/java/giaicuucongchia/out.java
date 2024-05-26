
package giaicuucongchia;


import java.util.Scanner;


public class out 
{
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int power = Integer.parseInt(sc.nextLine().substring(8));
 int blood = Integer.parseInt(sc.nextLine().substring(8));
 String tmp = sc.nextLine();
 boolean alive = false;
 if(tmp.equals("ALIVE")) alive = true;
 NhanVat nv = new NhanVat(power, blood, alive);
 int suKien = sc.nextInt(); sc.nextLine();
 for(int i = 0; i < suKien; i++){
 String s = sc.nextLine();
 if(s.equals("pea")){
 nv.pea();
 }
 else if(s.equals("mushroom")){
 nv.mushRoom();
 }
 else if(s.charAt(0) == 's'){
 int power1 = Integer.parseInt(s.substring(8));
 nv.soldier(power1);
 }
 else{
 int power1 = Integer.parseInt(s.substring(6));
 nv.witch(power1);
 }
 System.out.print(nv);
 }
 }
 
}
