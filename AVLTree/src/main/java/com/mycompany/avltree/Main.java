/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avltree;

/**
 *
 * @author aser
 */
public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.addContact(new Contact("Alice Johnson", "555-0101", "alice.johnson@email.com"));
        tree.addContact(new Contact("Bob Smith", "555-0102", "bob.smith@email.com"));
        tree.addContact(new Contact("Charlie Davis", "555-0103", "charlie.davis@email.com"));
        tree.addContact(new Contact("Diana Hayes", "555-0104", "diana.hayes@email.com"));
        tree.addContact(new Contact("Ethan Moore", "555-0105", "ethan.moore@email.com"));
        tree.addContact(new Contact("Fiona Campbell", "555-0106", "fiona.campbell@email.com"));
        tree.addContact(new Contact("George Wright", "555-0107", "george.wright@email.com"));
        tree.addContact(new Contact("Hannah Torres", "555-0108", "hannah.torres@email.com"));
        tree.addContact(new Contact("Ian Scott", "555-0109", "ian.scott@email.com"));
        tree.addContact(new Contact("Jenny Adams", "555-0110", "jenny.adams@email.com"));
        tree.listContacts();
    }
}
