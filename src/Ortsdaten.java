public class Ortsdaten implements ComparableContent<Ortsdaten>{

    private String ortsKuerzel;
    private int anzahlMessungen;
    private List<Messung> messungen;





    public Ortsdaten(String ortsKuerzel) {
        this.ortsKuerzel = ortsKuerzel;
        messungen = new List<Messung>();
        anzahlMessungen = 0;
    }

    public void erfasseMessung(Messung pMessung){
        messungen.append(pMessung);
        anzahlMessungen = anzahlMessungen + 1;
    }

    @Override
    public String toString() {
        return ortsKuerzel +  " (" + anzahlMessungen +")";
    }

    public String getOrtsKuerzel() {
        return ortsKuerzel;
    }

    public int getAnzahlMessungen() {
        return anzahlMessungen;
    }

    public List<Messung> getMessungen() {
        return messungen;
    }

    @Override
    public boolean isGreater(Ortsdaten pContent) {
        return this.ortsKuerzel.compareTo(pContent.getOrtsKuerzel())>0;
    }

    @Override
    public boolean isEqual(Ortsdaten pContent) {
        return this.ortsKuerzel.compareTo(pContent.getOrtsKuerzel())==0;
    }

    @Override
    public boolean isLess(Ortsdaten pContent) {
        return this.ortsKuerzel.compareTo(pContent.getOrtsKuerzel())<0;
    }
}
