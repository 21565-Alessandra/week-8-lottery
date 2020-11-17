import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ticket {
    //ticket has 8 panels
    private List<Panel> panels = new ArrayList<Panel>(8);

    public Ticket() {}

    //here is the method that calculates the total bet amount
    //for each panel is added 2 euros
    public double calculateCostLotteryPurchase(){
        double valuePanel = 2.00;
        double total = 0.00;
        for (int i = 0; i < panels.size(); i ++){
            total = total + valuePanel;
        }
        return total;
    }

    public void addPanels(Boolean generateNumber, List<Integer> numbersUser){
        //Here was created a list of integers with 6 numbers, numbers that
        //are the maximum amount that we can register in a game
        List<Integer> numbers = new ArrayList<Integer>(6);
        //Here we check if the user wants 6 RANDOM numbers to be registered
        //if you want, we call the method that generates a list of random numbers, otherwise
        //we take the user's number.
        if(generateNumber == true){
            numbers = generateRandomNumbers();
        }else{
            numbers = numbersUser;
        }
        //Aqui estamos dizendo que para cada painel (no total de 8) estamos adicionando
        //a list of 6 numbers
        for(Panel panel:panels){
            this.panels.add(new Panel(numbers));
        }
    }

    //here this is the method that generates 6 random numbers
    public List<Integer> generateRandomNumbers(){
        Random rand = new Random();
        //generates random numbers from 0 to 50
        int n1 = rand.nextInt(51);
        int n2 = rand.nextInt(51);
        int n3 = rand.nextInt(51);
        int n4 = rand.nextInt(51);
        int n5 = rand.nextInt(51);
        int n6 = rand.nextInt(51);
        return Arrays.asList(n1, n2, n3, n4, n5, n6);
    }
}
