package mara.projekts.einkaufsliste.domain;

import java.util.List;

public class EinkaufsListe {
    
    private final List<Zutat> zutaten;

    public EinkaufsListe(List<Zutat> zutaten){
        this.zutaten = zutaten;
    }

    public void add(Zutat zutat){
        zutaten.add(zutat);
    }
}
