package mara.projekts.einkaufsliste.domain;

import java.util.List;

public enum Gericht {

    GARLIC_TOFU("Garlic Tofu",List.of(new Zutat("Tofu", 400, MengenAngabeTyp.GRAMM, ZutatenTyp.GEKUEHLT), new Zutat("Frühlingszwiebel", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Sojasoße", ZutatenTyp.ASIA), new Zutat("Agavendicksaft", ZutatenTyp.SONSTIGES), new Zutat("Mais Stärke", ZutatenTyp.SONSTIGES), new Zutat("Weißweinessig", ZutatenTyp.SONSTIGES), new Zutat("Reis", ZutatenTyp.ASIA))),
    NUDELN_MIT_TOMATENSOßE("Nudlen mit TomatenSoße",List.of(new Zutat("Pasta", 300, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES),new Zutat("Tomatensoße", 1,MengenAngabeTyp.STUECK,ZutatenTyp.SONSTIGES))),
    BAKED_BEANS("Baked Beans + Veganes Rührei",List.of(new Zutat("Baked Beans", 1, MengenAngabeTyp.STUECK, ZutatenTyp.SONSTIGES), new Zutat("Tofu", 200, MengenAngabeTyp.GRAMM, ZutatenTyp.GEKUEHLT))),
    GEBRATENE_NUDELN("Gebratene Nudeln",List.of(new Zutat("Mienudeln", 200, MengenAngabeTyp.GRAMM, ZutatenTyp.ASIA), new Zutat("Sojasoße", ZutatenTyp.ASIA), new Zutat("Möhre", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Paprika", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Brokkoli", ZutatenTyp.GEFROHREN), new Zutat("Zwiebel", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Frühlingszwiebel", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE))),
    ORZO_SALAT("Orzo Salat",List.of(new Zutat("Kritharakinudeln", 250, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES), new Zutat("Grüne Oliven", 50, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES), new Zutat("DattelTomate", 200, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES), new Zutat("Mandel Stifte", ZutatenTyp.SONSTIGES), new Zutat("Petersilie", ZutatenTyp.GEMUESE))),
    ZUCCINIAUFLAUF("Zucciniauflauf",List.of(new Zutat("Pasta", 200, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES), new Zutat("Zuccini", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Tomate", 4, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Zwiebel", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Knoblauch", ZutatenTyp.GEMUESE), new Zutat("Grüne Oliven", ZutatenTyp.SONSTIGES))),
    VEGANE_BOLOGNESE("Vegane Bolognese",List.of(new Zutat("Passata", ZutatenTyp.SONSTIGES), new Zutat("Dosentomaten", 2, MengenAngabeTyp.STUECK, ZutatenTyp.SONSTIGES), new Zutat("Veganes Hack", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEKUEHLT), new Zutat("Knoblauch", ZutatenTyp.GEMUESE), new Zutat("Zwiebel", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Gemüsebrühe", ZutatenTyp.SONSTIGES), new Zutat("Pasta", 200, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES))),
    GLASNUDEL_SALAT("Glasnudel Salat",List.of(new Zutat("Sojasoße", ZutatenTyp.ASIA), new Zutat("Tofu", 400, MengenAngabeTyp.GRAMM, ZutatenTyp.GEKUEHLT), new Zutat("Glasnudeln", 200, MengenAngabeTyp.GRAMM, ZutatenTyp.ASIA), new Zutat("Rote Zwiebel", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Möhre", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Rotkohl (frisch)", 100, MengenAngabeTyp.GRAMM, ZutatenTyp.GEMUESE), new Zutat("Frühlingszwiebel", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Erdnüsse (ungesalzen)", ZutatenTyp.SONSTIGES), new Zutat("Zitrone", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Knoblauch", ZutatenTyp.GEMUESE), new Zutat("Sriracha", ZutatenTyp.ASIA))),
    ERDNUSS_UDON_NUDELN("Erdnuss Udon Nudeln",List.of(new Zutat("Knoblauch", ZutatenTyp.GEMUESE), new Zutat("Erdnüsse (ungesalzen)", ZutatenTyp.SONSTIGES), new Zutat("Erdnussbutter", ZutatenTyp.SONSTIGES), new Zutat("Sojasoße", ZutatenTyp.ASIA), new Zutat("Gemüsebrühe", ZutatenTyp.SONSTIGES), new Zutat("Udon Nudeln", 300, MengenAngabeTyp.GRAMM, ZutatenTyp.ASIA), new Zutat("Möhre", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Brokkoli", ZutatenTyp.GEFROHREN), new Zutat("Frühlingszwiebel", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Paprika", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Limette", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE))),
    VEGANE_TORTELLINI("Vegane Tortellini",List.of(new Zutat("Zwiebel", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Knoblauch", ZutatenTyp.GEMUESE), new Zutat("Speckwürfel", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEKUEHLT), new Zutat("Vegane Butter", ZutatenTyp.SONSTIGES), new Zutat("Vegane Kochsahne", 200, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES), new Zutat("GemüseBrühe", ZutatenTyp.SONSTIGES), new Zutat("Zitrone", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Vegane Tortellini", 300, MengenAngabeTyp.GRAMM, ZutatenTyp.GEKUEHLT))),
    ONE_POT_RICE("One Pot Rice",List.of(new Zutat("Reis", ZutatenTyp.ASIA), new Zutat("Sojasoße", ZutatenTyp.ASIA), new Zutat("Ketchup", ZutatenTyp.SONSTIGES), new Zutat("Agavendicksaft", ZutatenTyp.SONSTIGES), new Zutat("Knoblauch", ZutatenTyp.GEMUESE), new Zutat("Möhre", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Paprika", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Räuchertofu", 200, MengenAngabeTyp.GRAMM, ZutatenTyp.GEKUEHLT), new Zutat("Erbsen", ZutatenTyp.GEFROHREN))),
    BAO_BUNS("Bao Buns",List.of(new Zutat("Mehl", 300, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES), new Zutat("Backpulver", ZutatenTyp.SONSTIGES), new Zutat("Haferdrink", 125, MengenAngabeTyp.MILILITER, ZutatenTyp.SONSTIGES), new Zutat("frische Hefe", ZutatenTyp.GEKUEHLT), new Zutat("Gurke", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Radieschen", ZutatenTyp.GEMUESE), new Zutat("Zwiebel", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Knoblauch", ZutatenTyp.GEMUESE), new Zutat("Zitrone", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Agavendicksaft", ZutatenTyp.SONSTIGES))),
    SCHUPFNUDELN_MIT_SAUERKRAUT("SchupfNudeln mit Sauerkraut",List.of(new Zutat("Zwiebel", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Sauerkraut", 350, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES), new Zutat("Vegane Speckwürfel", ZutatenTyp.GEKUEHLT), new Zutat("SchupfNudeln", 500, MengenAngabeTyp.GRAMM, ZutatenTyp.GEKUEHLT))),
    VEGANE_WRAPS("Vegane Wraps",List.of(new Zutat("Salat", ZutatenTyp.GEMUESE), new Zutat("Wraps",1,MengenAngabeTyp.STUECK, ZutatenTyp.BROT), new Zutat("Gurke", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Mais", 200, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES), new Zutat("Veganer Jogurt", ZutatenTyp.GEKUEHLT), new Zutat("Zitrone", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Tofu", 400, MengenAngabeTyp.GRAMM, ZutatenTyp.GEKUEHLT), new Zutat("Zwiebel", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Tomate", 100, MengenAngabeTyp.GRAMM, ZutatenTyp.GEMUESE))),
    PAD_THAI("Pad Thai",List.of(new Zutat("Reisbandnudeln", 400, MengenAngabeTyp.GRAMM, ZutatenTyp.ASIA), new Zutat("Frühlingszwiebel", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Knoblauch", ZutatenTyp.GEMUESE), new Zutat("Möhre", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Prinzessinnenbohnen", 100, MengenAngabeTyp.GRAMM, ZutatenTyp.GEMUESE), new Zutat("tofu", 400, MengenAngabeTyp.GRAMM, ZutatenTyp.GEKUEHLT), new Zutat("Erdnüsse (Ungesalzen)", ZutatenTyp.SONSTIGES), new Zutat("Sojasoße", ZutatenTyp.ASIA), new Zutat("Agavendicksaft", ZutatenTyp.SONSTIGES), new Zutat("Reisessig", ZutatenTyp.ASIA), new Zutat("Sriracha", ZutatenTyp.ASIA), new Zutat("Limette", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Frühlingszwiebel",1 , MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE))),
    JACKFRUIT_GULASCH("Jackfruit-Gulasch",List.of(new Zutat("Zwiebel", 6, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Knoblauch", ZutatenTyp.GEMUESE), new Zutat("Olivenöl", ZutatenTyp.SONSTIGES), new Zutat("Jackfruit", 500, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES), new Zutat("Kartoffel Knödel", ZutatenTyp.SONSTIGES), new Zutat("Tomatenmark", ZutatenTyp.SONSTIGES), new Zutat("Rotweinessig", ZutatenTyp.SONSTIGES))),
    PAV_SANDWICH("Pav Sandwich",List.of(new Zutat("Zwiebel", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Knoblauch", ZutatenTyp.GEMUESE), new Zutat("Kokosfett", ZutatenTyp.SONSTIGES), new Zutat("tofu", 400, MengenAngabeTyp.GRAMM, ZutatenTyp.GEKUEHLT), new Zutat("passierte Tomaten", 400, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES), new Zutat("Kokosmilch", ZutatenTyp.SONSTIGES), new Zutat("Gurke", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Kokosjogurt", ZutatenTyp.GEKUEHLT), new Zutat("Rote Zwiebel", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Limette", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Vegane Burger Buns", 4, MengenAngabeTyp.STUECK, ZutatenTyp.BROT))),
    BANH_MI("Banh Mi",List.of(new Zutat("Rettich", 150, MengenAngabeTyp.GRAMM, ZutatenTyp.GEMUESE), new Zutat("Möhre", 150, MengenAngabeTyp.GRAMM, ZutatenTyp.GEMUESE), new Zutat("Reisessig", ZutatenTyp.ASIA), new Zutat("Sojasoße", ZutatenTyp.ASIA), new Zutat("Knoblauch", ZutatenTyp.GEMUESE), new Zutat("Agavendicksaft", ZutatenTyp.SONSTIGES),new Zutat("Sweetchilisoße", ZutatenTyp.ASIA), new Zutat("Limette", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Vegane Mayo", ZutatenTyp.SONSTIGES), new Zutat("Frühlingszwiebel", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Räuchertofu", 400, MengenAngabeTyp.GRAMM, ZutatenTyp.GEKUEHLT), new Zutat("Speisestärke", ZutatenTyp.SONSTIGES))),
    MAISPUFFER("Maispuffer",List.of(new Zutat("Reisessig", ZutatenTyp.ASIA), new Zutat("Sojasoße", ZutatenTyp.ASIA), new Zutat("Möhre", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Gurke", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Sellerie", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Paprika", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Rote Zwiebel", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Dosenmais", 600, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES), new Zutat("Reismehl", ZutatenTyp.ASIA), new Zutat("Rote Curry Paste", ZutatenTyp.ASIA), new Zutat("Kokosmilch", ZutatenTyp.SONSTIGES), new Zutat("Backpulver", ZutatenTyp.SONSTIGES))),
    FOCACCIA("Focaccia",List.of(new Zutat("Frische Hefe", ZutatenTyp.GEKUEHLT), new Zutat("Mehl", 500, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES), new Zutat("Olivenöl", ZutatenTyp.SONSTIGES), new Zutat("Möhre", 300, MengenAngabeTyp.GRAMM, ZutatenTyp.GEMUESE), new Zutat("Pastinake", 200, MengenAngabeTyp.GRAMM, ZutatenTyp.GEMUESE), new Zutat("Paprika", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Rote Zwiebel", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Knoblauch", ZutatenTyp.GEMUESE), new Zutat("Kirschtomate", 100, MengenAngabeTyp.GRAMM, ZutatenTyp.GEMUESE), new Zutat("Schwarze Oliven", ZutatenTyp.SONSTIGES), new Zutat("Zitrone", 1, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE))),
    RAEUCHERTOFU_ROESTGEMUESE("Räuchertofu Röstgemüse",List.of(new Zutat("Räuchertofu", 400, MengenAngabeTyp.GRAMM, ZutatenTyp.GEKUEHLT), new Zutat("Knoblauch", ZutatenTyp.GEMUESE), new Zutat("Sojasoße", ZutatenTyp.ASIA), new Zutat("Senf", ZutatenTyp.SONSTIGES), new Zutat("Agavendicksaft", ZutatenTyp.SONSTIGES), new Zutat("Olivenöl", ZutatenTyp.SONSTIGES), new Zutat("Kartoffel", 600, MengenAngabeTyp.GRAMM, ZutatenTyp.GEMUESE), new Zutat("Rote Zwiebel", 4, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE))),
    ZITRONEN_PASTA("Zitronen Pasta",List.of(new Zutat("Pasta", 300, MengenAngabeTyp.GRAMM, ZutatenTyp.SONSTIGES), new Zutat("Zitrone", 2, MengenAngabeTyp.STUECK, ZutatenTyp.GEMUESE), new Zutat("Creme Vega", ZutatenTyp.GEKUEHLT), new Zutat("Butter", ZutatenTyp.SONSTIGES), new Zutat("Schnittlauch", ZutatenTyp.GEFROHREN)));
    
    private final List<Zutat> zutaten;
    private final String name;

    Gericht(String name, List<Zutat> zutaten){
        this.name = name;
        this.zutaten = zutaten;
    }

    public String getName(){
        return name;
    }

    public List<Zutat> getZutaten(){
        return zutaten;
    }

    @Override
    public String toString(){
        return name;
    }
}