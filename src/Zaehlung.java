import java.util.Scanner;

public class Zaehlung {

    private BinarySearchTree<Ortsdaten> verkehrszaehlung;
    private Scanner s;

    public Zaehlung() {
        verkehrszaehlung = new BinarySearchTree<>();
        s = new Scanner(System.in);
        String input = s.nextLine();
        String[] daten = input.split(" ");
        s.close();

        for (String ort: daten){
            Ortsdaten o = new Ortsdaten(ort);
            verkehrszaehlung.insert(o);
        }

        SuchBaumZeichner s = new SuchBaumZeichner(800,600,this.verkehrszaehlung);
    }
}
