package mara.projekts.einkaufsliste.Web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import mara.projekts.einkaufsliste.domain.AuswahlListe;
import mara.projekts.einkaufsliste.domain.GerichteListe;
import mara.projekts.einkaufsliste.domain.Zutat;



@Controller
public class MainController {
    private final GerichteListe gerichte;
    private final AuswahlListe auswahl;

    public MainController(GerichteListe gerichte, AuswahlListe auswahl){
        this.gerichte = gerichte;
        this.auswahl = auswahl;
    }


    @GetMapping("/")
    public String startSeite(Model model) {
        model.addAttribute("gerichte", gerichte.getGerichte());
        model.addAttribute("gerichteAuswahl", auswahl.getGerichte());
        return "mainPage";
    }


    @PostMapping("/addGericht")
    public String hinzufügen(String name) {

        auswahl.add(gerichte.getGericht(name));

        return "redirect:/";
    }


    @PostMapping("/deleteGericht")
    public String löschen(String name) {

        auswahl.removeGericht(gerichte.getGericht(name));

        return "redirect:/";
    }


    @PostMapping("/erstelleListe")
    public String erstelleListe(Model model) {
        List<Zutat> zutaten = auswahl.getAllZutaten();

        model.addAttribute("zutaten", zutaten);

        return "einkaufsliste";
    }
    
    
}
