package mara.projekts.einkaufsliste.domain;

public class Zutat {
    private final String name;
    private Integer mengenAngabe;
    private final MengenAngabeTyp typ;
    private final ZutatenTyp zutatenTyp;

    public Zutat(String name, Integer mengenAngabe, MengenAngabeTyp typ, ZutatenTyp zutatenTyp){
        this.name = name;
        this.mengenAngabe = mengenAngabe;
        this.typ = typ;
        this.zutatenTyp = zutatenTyp;
    }

    public Zutat(String name, ZutatenTyp zutatenTyp){
        this.name = name;
        this.zutatenTyp = zutatenTyp;
        mengenAngabe = 0;
        typ = MengenAngabeTyp.NULL;
    }

    public String getName(){
        return name;
    }

    public Integer getMengenAngabe(){
        return mengenAngabe;
    }

    public MengenAngabeTyp getTyp(){
        return typ;
    }

    public ZutatenTyp getZutatenTyp(){
        return zutatenTyp;
    }

    public void increaseMengeBy(Integer menge){
        this.mengenAngabe += menge;
    }

    @Override
    public String toString(){
        if(null == typ){
            return mengenAngabe + " " + typ.toString().toLowerCase() + " " + name;
        }else switch (typ) {
            case NULL:
                return name;
            case STUECK:
                return mengenAngabe + " x " + name;
            case GRAMM:
                return mengenAngabe + " g " + name;
            case MILILITER:
                return mengenAngabe + " ml " + name;
            default:
                return mengenAngabe + " " + typ.toString().toLowerCase() + " " + name;
        }
    }
}
