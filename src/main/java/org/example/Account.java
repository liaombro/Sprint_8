package org.example;

public class Account {

    private String name;

    public Account(String name){
        this.name = name;
    }

    public boolean checkNameToEmboss(){
        int length = name.length();

        int indexOfSpace = name.indexOf(" ");
        int lastIndexOfSpace = name.lastIndexOf(" ");
        return length < 20 && length > 2 && indexOfSpace > 0 && indexOfSpace < length - 1 && lastIndexOfSpace == indexOfSpace;
    }
}
