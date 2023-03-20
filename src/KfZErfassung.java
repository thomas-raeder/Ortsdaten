import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KfZErfassung extends JFrame{
    private JPanel pnMain;
    private JButton btCar;
    private JButton btTruck;
    private JButton btBike;
    private JTextField tfOrt;
    private JLabel lbText;

    private Zaehlung model;

public KfZErfassung() {
    model = new Zaehlung();

    setContentPane(pnMain);
    setTitle("KFZ Erfassung");
    setSize(800,800);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);

    btCar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            carButtonPressed(e);
        }
    });
    btTruck.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            truckButtonPressed(e);
        }
    });
    btBike.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            bikeButtonPressed(e);
        }
    });
}

    private void carButtonPressed(ActionEvent e) {
        String ort = tfOrt.getText();
        if (!ort.equals("")){
            model.erfasseKfz(ort, 'P');
            new SuchBaumZeichner(800,600,model.getVerkehrszaehlung());
        }
    }

    private void truckButtonPressed(ActionEvent e) {
        String ort = tfOrt.getText();
        if (!ort.equals("")){
            model.erfasseKfz(ort, 'L');
            new SuchBaumZeichner(800,600,model.getVerkehrszaehlung());
        }
    }

    private void bikeButtonPressed(ActionEvent e) {
        String ort = tfOrt.getText();
        if (!ort.equals("")){
            model.erfasseKfz(ort, 'M');
            new SuchBaumZeichner(800,600,model.getVerkehrszaehlung());
        }
    }

    public static void main(String[] args) {
        KfZErfassung program = new KfZErfassung();

    }
}
