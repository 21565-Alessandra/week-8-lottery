package com.dorsetcollegeoop;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    //ticket tem 8 painéis
    private List<Panel> panels = new ArrayList<Panel>(8);

    public Ticket() { }

    public Ticket(List<Panel> panels) {
        this.panels = panels;
    }

    public List<Panel> getPanels() {
        for(int i = 0; i < panels.size(); i++){
            panels.get(i).getNumbers();
        }
        return panels;
    }

    public void setPanels(List<Panel> panels) {
        this.panels = panels;
    }

    public void addPanels(Panel panel){
        this.panels.add(panel);
    }
}