package com.dorsetcollegeoop;

import java.util.ArrayList;
import java.util.List;

public class Panel {
    //cada panel tem 50 números
    //in the code below I created a list in java with 50 numbers, to guarantee that the panel will have 50 numbers.
    private List<Integer> numbers = new ArrayList<Integer>(50);
    //List<Integer> myCoords = new ArrayList<Integer>();

    //Here we have a constructor that receives a list of numbers
    public Panel(List<Integer> numbers) {
        //Here we scan this list of numbers to be later saved in the list
        for (int i = 0; i < numbers.size(); i++) {
            //Here we save the number entered by the user
            addNumber(numbers.get(i));
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }


    public void addNumber(int number) {
        //here we guarantee that the number is not less than 0 nor greater than 50
        if(number >= 0 && number <= 50)
            this.numbers.add(number);
    }
}

