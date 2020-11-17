import java.util.ArrayList;
import java.util.List;

public class Panel {
    //each panel has 50 numbers
    //in the code below we created a list in java with 50 numbers, so we guarantee that the panel will have 50 numbers.
    private List<Integer> numbers = new ArrayList<Integer>(50);

    //Here we have a constructor that receives a list of integers
    public Panel(List<Integer> numbers) {
        //Here we scan this list of numbers to be later saved in the list
        for (int i = 0; i < numbers.size(); i++) {
            //Here we save the number entered by the user
            addNumber(numbers.get(i));
        }
    }

    public void addNumber(int number) {
        //here we guarantee that the number is not less than 0 nor greater than 50
        if(number >= 0 && number <= 50)
            this.numbers.add(number);
    }
}
