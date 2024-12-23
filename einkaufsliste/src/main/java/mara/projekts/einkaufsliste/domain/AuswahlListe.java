package mara.projekts.einkaufsliste.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AuswahlListe {
    private final List<Gericht> gerichte;
    private final List<Zutat> zutaten;

    public AuswahlListe(List<Gericht> gerichte, List<Zutat> zutaten){
        this.gerichte = gerichte;
        this.zutaten = zutaten;
    }

    public void add(List<Gericht> gerichteliste){
        Gericht gericht = gerichteliste.getFirst();
        gerichte.add(gericht);

        List<Zutat> andereZutaten = gericht.getZutaten();
        List<Zutat> zutatenClone = new ArrayList<>();
        for(Zutat zutat: andereZutaten){
            zutatenClone.add(new Zutat(zutat.getName(), zutat.getMengenAngabe(), zutat.getTyp(), zutat.getZutatenTyp()));
        }

        zutaten.addAll(zutatenClone);
    }

    public void removeGericht(List<Gericht> gerichteliste){
        Gericht gericht = gerichteliste.getFirst();
        gerichte.remove(gericht);

        List<Zutat> andereZutaten = gericht.getZutaten();
        List<Zutat> andereZutatenClone = new ArrayList<>();
        for(Zutat zutat: andereZutaten){
            andereZutatenClone.add(new Zutat(zutat.getName(), zutat.getMengenAngabe(), zutat.getTyp(), zutat.getZutatenTyp()));
        }

        List<Integer> indexListe = new ArrayList<>();
        for(Zutat zutat1: andereZutatenClone){
            for(Zutat zutat2: zutaten){
                if(zutat1.getName().equals(zutat2.getName()) && zutat1.getMengenAngabe().equals(zutat2.getMengenAngabe()) && zutat1.getTyp().equals(zutat2.getTyp()) && zutat1.getZutatenTyp().equals(zutat2.getZutatenTyp())){
                    indexListe.add(zutaten.indexOf(zutat2));
                    break;
                }
            }
        }

        int n = 0;
        Collections.sort(indexListe);
        for(Integer index: indexListe){
            zutaten.remove((int) index - n);
            n ++;
        }
    }

/* 
    public void add(List<Gericht> gerichteliste){
        gerichte.addAll(gerichteliste);

        //Zutaten Clonen
        List<Zutat> clone = gerichteliste.getFirst().getZutaten();
        List<Zutat> andereZutaten = new ArrayList<>();
        for(Zutat zutat: clone){
            andereZutaten.add(new Zutat(zutat.getName(), zutat.getMengenAngabe(), zutat.getTyp(), zutat.getZutatenTyp()));
        }

        //Fall leer einfach add
        if(zutaten.isEmpty()){
            zutaten.addAll(andereZutaten);
            return;
        }

        //Increase falls schon vorhanden ansonsten add
        List<Zutat> zutatenToBeeDeletedFromAndereZutaten = new ArrayList<>();
        List<Zutat> zutatenToBeeDeletedFromZutaten = new ArrayList<>();
        List<Zutat> zutatenDieErneuertWurden = new ArrayList<>();
        for(Zutat zutat1: andereZutaten){
            for(Zutat zutat2: zutaten){
                if (zutat1.getName().equals(zutat2.getName()) && zutat1.getTyp().name().equals(zutat2.getTyp().name()) || zutat1.getTyp() == MengenAngabeTyp.NULL && zutat2.getTyp() == MengenAngabeTyp.NULL) {
                    zutatenToBeeDeletedFromZutaten.add(zutat2);
                    zutatenToBeeDeletedFromAndereZutaten.add(zutat1);
                    zutatenDieErneuertWurden.add(new Zutat(zutat1.getName(), zutat1.getMengenAngabe() + zutat2.getMengenAngabe(), zutat1.getTyp(), zutat1.getZutatenTyp()));
                }
            }
        }

        andereZutaten.removeAll(zutatenToBeeDeletedFromAndereZutaten);

        zutaten.removeAll(zutatenToBeeDeletedFromZutaten);
        zutaten.addAll(zutatenDieErneuertWurden);
        zutaten.addAll(andereZutaten);
    }


    public void removeGericht(List<Gericht> gerichteliste){
        Gericht gericht = gerichteliste.getFirst();
        gerichte.remove(gericht);

        //Zutaten Clonen
        List<Zutat> clone = gerichteliste.getFirst().getZutaten();
        List<Zutat> andereZutaten = new ArrayList<>();
        for(Zutat zutat: clone){
            andereZutaten.add(new Zutat(zutat.getName(), zutat.getMengenAngabe(), zutat.getTyp(), zutat.getZutatenTyp()));
        }

        List<Zutat> zutatenToBeDecreased = new ArrayList<>();
        List<Zutat> zutatentoBeDeleted = new ArrayList<>();
        List<Zutat> zutatentoBeDeletedFromAndereZutaten = new ArrayList<>();
        for(Zutat zutat1: andereZutaten){
            for(Zutat zutat2: zutaten){
                if(zutat1.getName().equals(zutat2.getName()) && zutat1.getTyp().name().equals(zutat2.getTyp().name()) || zutat1.getTyp() == MengenAngabeTyp.NULL && zutat2.getTyp() == MengenAngabeTyp.NULL){
                    zutatenToBeDecreased.add(new Zutat(zutat1.getName(), zutat2.getMengenAngabe() - zutat1.getMengenAngabe(), zutat1.getTyp(), zutat1.getZutatenTyp()));
                    zutatentoBeDeleted.add(zutat2);
                    zutatentoBeDeletedFromAndereZutaten.add(zutat1);
                }
            }
        }
        andereZutaten.removeAll(zutatentoBeDeletedFromAndereZutaten);

        zutaten.removeAll(andereZutaten);
        zutaten.removeAll(zutatentoBeDeleted);
        zutaten.addAll(zutatenToBeDecreased);
    }
*/


    public List<Gericht> getGerichte(){
        return gerichte;
    }

    public List<Zutat> getAllZutaten(){
        List<Zutat> zutatenClone = new ArrayList<>();
        for(Zutat zutat: zutaten){
            zutatenClone.add(new Zutat(zutat.getName(),zutat.getMengenAngabe(),zutat.getTyp(),zutat.getZutatenTyp()));
        }

        for(int i = 0; i < zutatenClone.size(); i++){
            for(int j = i + 1; j < zutatenClone.size(); j++){
                Zutat zutat1 = zutatenClone.get(i);
                Zutat zutat2 = zutatenClone.get(j);
                if (zutat1.getName().equals(zutat2.getName()) && (zutat1.getTyp().name().equals(zutat2.getTyp().name()) || zutat1.getTyp() == MengenAngabeTyp.NULL && zutat2.getTyp() == MengenAngabeTyp.NULL)) {
                    zutat1.increaseMengeBy(zutat2.getMengenAngabe());
                    zutatenClone.remove(zutat2);
                    j --;
                }
            }
        }

        Collections.sort(zutatenClone, (a,b) -> a.getZutatenTyp().getPriority().compareTo(b.getZutatenTyp().getPriority()));
        return zutatenClone;
    }

}
