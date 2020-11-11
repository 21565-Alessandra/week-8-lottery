package com.dorsetcollegeoop;

import java.io.CharArrayReader;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //ArrayList<String> names = new ArrayList<String>( Arrays.asList("alex", "brian", "charles") );
        Panel panel = new Panel(Arrays.asList(1,2,3,4,5,50));
        Panel panel2 = new Panel(Arrays.asList(1,2,3,4,10,12));
        Ticket ticket = new Ticket();

        ticket.addPanels(panel);
        ticket.addPanels(panel2);

        System.out.println(ticket.getPanels());
    }
}