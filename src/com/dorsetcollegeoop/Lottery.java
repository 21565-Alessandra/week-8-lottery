import java.util.ArrayList;

public class Lottery {
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    public Lottery(){
        Message.DebugMessage("Creating a Lottery game");
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
}
