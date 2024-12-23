package mara.projekts.einkaufsliste.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class GerichteListe {

    private final Set<Gericht> gerichte = new HashSet<>(
        Set.of(
            Gericht.GARLIC_TOFU,
            Gericht.ORZO_SALAT,
            Gericht.GEBRATENE_NUDELN,
            Gericht.BAO_BUNS,
            Gericht.PAD_THAI,
            Gericht.VEGANE_WRAPS,
            Gericht.ONE_POT_RICE,
            Gericht.SCHUPFNUDELN_MIT_SAUERKRAUT,
            Gericht.NUDELN_MIT_TOMATENSOßE,
            Gericht.RAEUCHERTOFU_ROESTGEMUESE,
            Gericht.FOCACCIA,
            Gericht.ERDNUSS_UDON_NUDELN,
            Gericht.VEGANE_TORTELLINI,
            Gericht.MAISPUFFER,
            Gericht.ZUCCINIAUFLAUF,
            Gericht.VEGANE_BOLOGNESE,
            Gericht.GLASNUDEL_SALAT,
            Gericht.PAV_SANDWICH,
            Gericht.JACKFRUIT_GULASCH,
            Gericht.BAKED_BEANS,
            Gericht.BANH_MI,
            Gericht.ZITRONEN_PASTA));

    public List<Gericht> getGerichte(){
        return gerichte.stream().toList();
    }

    public List<Gericht> getGericht(String name){
        return gerichte
        .stream()
        .filter(a -> a.getName().equals(name))
        .toList();
    }

    public boolean contains(Gericht gericht){
        return gerichte.contains(gericht);
    }

    @Override
    public String toString(){

        String string = "";

        for(Gericht gericht: gerichte){
            string += gericht + System.lineSeparator();
        }

        return string;
    }
}
