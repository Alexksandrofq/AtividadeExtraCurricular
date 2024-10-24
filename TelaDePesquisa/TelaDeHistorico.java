import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TelaDeHistorico extends JFrame {
    private static JTextField txtid;

    public static JButton btnVer;


    public TelaDeHistorico() {
        super("Tela De Historico");
        setLayout(new GridLayout(4, 1, 5, 5));

        JPanel linha_id = new JPanel(new GridLayout(1, 2));
        txtid = new JTextField(20);
        txtid.setEnabled(false);
        linha_id.add(txtid);
        add(linha_id);

        JPanel linha_id2 = new JPanel(new GridLayout(1, 2));
        txtid = new JTextField(20);
        txtid.setEnabled(false);
        linha_id2.add(txtid);
        add(linha_id2);

        JPanel linha_id3 = new JPanel(new GridLayout(1, 2));
        txtid = new JTextField(20);
        txtid.setEnabled(false);
        linha_id3.add(txtid);
        add(linha_id3);

        JPanel linha_btnVer = new JPanel(new GridLayout(1,2));
        btnVer = new JButton("btnVer");
        btnVer.setEnabled(true);

        linha_btnVer.add(btnVer);
        add(linha_btnVer);



        btnVer.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    
                }
                
            }
        );
    

        setSize(150, 160);
        setVisible(true);

    }

    public static void main(String[] args) {
        TelaDeHistorico appTelaDeHistorico = new TelaDeHistorico();
        appTelaDeHistorico.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}