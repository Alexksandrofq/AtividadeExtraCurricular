import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;


public class TelaDeHistorico extends JFrame {
    private final JList<String> idJList;

    private static final String[] ids = {""};


    public TelaDeHistorico() {
        super("Historico");
        setLayout(new FlowLayout());

        idJList = new JList<String>(ids);
        idJList.setVisibleRowCount(5);

        idJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add(new )
       

        sizeJList = new JList<String>(sizeNames);
        sizeJList.setVisibleRowCount(3);
        sizeJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(sizeJList));

        colorJList.addListSelectionListener(
            @Override
            public void valueChanged(ListSelectionEvent event) {
                getContentPane().setB
            }
        );

        sizeJList.addListSelectionListener( 
            new ListSelectionListener() 
            {
               @Override
               public void valueChanged(ListSelectionEvent event)
               {
                  switch (sizeJList.getSelectedIndex()) {
                     case  0:
                        setSize(350,150);
                        break;
   
                     case  1:
                     setSize(550,350);                 
                     break;
   
                     case  2:
                     setSize(750,550);                 
                     break;
   
                     default:
                     setSize(350,150);
                        break;
                  }
               }
   
            }
      
         );



    

    }

    public static void main(String[] args) {
        TelaDeHistorico appTelaDeHistorico = new TelaDeHistorico();
        appTelaDeHistorico.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}