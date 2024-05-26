/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.BorderLayout;
import java.util.Scanner;
import model.DocterList;
import view.Menu;

/**
 *
 * @author aser
 */
public class DocterManage extends Menu {

    private static final DocterList model = new DocterList();
    private static final String MENU_TITLE = "========= Doctor Management ==========";
    private static final String[] MENU_OPTIONS = {" Add Doctor", " Update Doctor", " Delete Doctor", " View All Doctor", "Exit"};

    public DocterManage() {
        super(MENU_TITLE, MENU_OPTIONS);
    }

//    @Override
//    public void execute(int n) {
//        switch (n) {
//            case 1:
//                model.showList();
//                break;
//            case 2:
//                subMenu.run();
//                break;
//            case 3:
//            {
//                try {
//                    model.addNew();
//                } catch (Exception ex) {
//                    Logger.getLogger(DocterManage.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//                break;
//
//            case 4:
//            {
//                try {
//                    model.changeNumber();
//                } catch (Exception ex) {
//                    Logger.getLogger(DocterManage.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//                break;
//
//            default :
//                System.out.println("have a good day");
//        }
//    }

    
    public void addDocter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code: ");
        String code= sc.nextLine();
        System.out.print("Enter name: ");
        String name= sc.nextLine();
        System.out.print("Enter specialization: ");
        String spec= sc.nextLine();
        System.out.println("Enter availability");
        int avai=sc.nextInt();
        
        
    }
    
    
    
    public static void main(String[] args) {
        DocterManage manager = new DocterManage();
        manager.run();
    }

    @Override
    public void execute(int n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
