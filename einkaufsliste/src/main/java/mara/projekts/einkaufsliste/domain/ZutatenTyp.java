package mara.projekts.einkaufsliste.domain;

public enum ZutatenTyp {
    GEMUESE(1),GEKUEHLT(2),GEFROHREN(6),ASIA(5),BROT(3),SONSTIGES(4);

    private final Integer priority;

    private ZutatenTyp(Integer priority) {
        this.priority = priority;
    }

    public Integer getPriority(){
        return priority;
    }
}
