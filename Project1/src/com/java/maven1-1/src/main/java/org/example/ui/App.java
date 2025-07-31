package org.example.ui;
import org.example.services.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        System.out.println("welocome!!");
        MenuUi menuUi=new MenuUi();
        menuUi.updateProduct();
        menuUi.getAllProducts();
        }
    }
