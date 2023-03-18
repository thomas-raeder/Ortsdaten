public class Ortsdaten implements ComparableContent<Ortsdaten>{

    private String ortsKuerzel;
    private int anzahlMessungen;
    private List<Messung> messungen;

    public String getOrtsKuerzel() {
        return ortsKuerzel;
    }

    public int getAnzahlMessungen() {
        return anzahlMessungen;
    }



    public Ortsdaten(String ortsKuerzel) {
        this.ortsKuerzel = ortsKuerzel;
    }

    @Override
    public String toString() {
        return ortsKuerzel;
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
