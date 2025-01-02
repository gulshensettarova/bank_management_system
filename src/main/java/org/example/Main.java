package org.example;

import org.example.enums.menuoption.MainMenuOption;
import org.example.strategy.MainMenuStrategy;

public class Main {
    public static void main(String[] args) {
     while(true){
         MainMenuOption.MAIN.getStrategy().display();
     }
    }
}