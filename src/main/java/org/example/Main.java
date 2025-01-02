package org.example;

import org.example.strategy.MainMenuStrategy;

public class Main {
    public static void main(String[] args) {
        MainMenuStrategy strategy = new MainMenuStrategy();
     while(true){
         strategy.display();
     }
    }
}