import java.util.Scanner;

public class Zaehlung {

    private BinarySearchTree<Ortsdaten> verkehrszaehlung;

    public Zaehlung() {
        verkehrszaehlung = new BinarySearchTree<>();
    }

    public BinarySearchTree<Ortsdaten> getVerkehrszaehlung() {
        return verkehrszaehlung;
    }

    public void erfasseKfz(String pOrtskuerzel, char pKfzKlasse){
        Ortsdaten neu = new Ortsdaten(pOrtskuerzel);
        Messung messung = new Messung(pKfzKlasse);
        Ortsdaten suche = verkehrszaehlung.search(neu);

        if (suche!=null){
            suche.erfasseMessung(messung);
        } else {
            neu.erfasseMessung(messung);
            verkehrszaehlung.insert(neu);
        }
    }

}
