
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame{
    
    public JRadioButton opcionArea,opcionPerimetro;
    public JComboBox tipoFigura;

    public App(){
        
        this.setTitle("Area y perimetro");
        this.setLayout(null);
        
        tipoFigura = new JComboBox();
        tipoFigura.addItem("Cuadrado");
        tipoFigura.addItem("Rectangulo");
        tipoFigura.addItem("Triangulo");
        tipoFigura.addItem("Circulo");
        tipoFigura.setBounds(10, 210, 100, 30);
        EventCombo combo = new EventCombo(this);
        tipoFigura.addActionListener(combo);

        ButtonGroup radioGroupTipoOperacion = new ButtonGroup();
        //JRadioButton opcionPerimetro =  new JRadioButton("Perimetro");
        opcionPerimetro =  new JRadioButton("Perimetro");        
        opcionPerimetro.setBounds(10,100,100,30);        
        //JRadioButton opcionArea =  new JRadioButton("Area");
        opcionArea =  new JRadioButton("Area");        
        opcionArea.setBounds(120,100,100,30);
        radioGroupTipoOperacion.add(opcionPerimetro);
        radioGroupTipoOperacion.add(opcionArea);    

        JLabel label1 = new JLabel("Selecciona la operación a realizar:");
        label1.setBounds(10,50,200,30);       
        this.add(label1);     
        this.add(tipoFigura);        
        JLabel label2 = new JLabel("Selecciona una figura:");    
        label2.setBounds(10,150,200,30);
        this.add(label2);
        this.add(opcionPerimetro);
        this.add(opcionArea);

        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);      
        
    }

    public static void main(String[] args) {
        App app = new App();
    }



}
