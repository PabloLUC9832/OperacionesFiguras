import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Base64;

import javax.swing.JOptionPane;

public class EventCombo implements ActionListener{

    public static App app;

    public EventCombo(App app){
        this.app = app;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String tipo = app.tipoFigura.getSelectedItem().toString();
        switch(tipo){
            case "Cuadrado":{
                System.out.println("Soy un cuadrado");
                if (app.opcionArea.isSelected()) {
                    String l = JOptionPane.showInputDialog(null, "Introduce el valor del lado: ");
                    double lado = Double.parseDouble(l);
                    Cuadrado cuadrado = new Cuadrado(lado);
                    JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+cuadrado.calcularArea());  
                }else{
                    String l = JOptionPane.showInputDialog(null, "Introduce el valor del lado: ");
                    double lado = Double.parseDouble(l);
                    Cuadrado cuadrado = new Cuadrado(lado);
                    JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+cuadrado.calcularPerimetro());  
                }
            }
            break;

            case "Rectangulo":
                System.out.println("Soy un rectangulo");
                if (app.opcionArea.isSelected()) {
                    String b = JOptionPane.showInputDialog(null, "Introduce el valor de la base: ");
                    double base = Double.parseDouble(b);
                    String a = JOptionPane.showInputDialog(null, "Introduce el valor de la altura: ");
                    double altura = Double.parseDouble(a);
                     Rectangulo rectangulo = new Rectangulo(base, altura);
                    JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+rectangulo.calcularArea());
                }else{
                    String b = JOptionPane.showInputDialog(null, "Introduce el valor de la base: ");
                    double base = Double.parseDouble(b);
                    String a = JOptionPane.showInputDialog(null, "Introduce el valor de la altura: ");
                    double altura = Double.parseDouble(a);

                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    JOptionPane.showMessageDialog(null,"El perimetro del cuadrado es: "+rectangulo.calcularPerimetro());
                }                    
            break;

            case "Triangulo":{
                System.out.println("Soy un triangulo");
                if (app.opcionArea.isSelected()) {
                    String l = JOptionPane.showInputDialog(null, "Introduce el valor del lado: ");
                    double lado = Double.parseDouble(l);
                    String a = JOptionPane.showInputDialog(null, "Introduce el valor de la altura: ");
                    double altura = Double.parseDouble(a);
                    Triangulo triangulo = new Triangulo(lado, altura);
                    JOptionPane.showMessageDialog(null,"El area del triangulo es: "+triangulo.calcularArea());  
                }else{
                    String l = JOptionPane.showInputDialog(null, "Introduce el valor del lado: ");
                    double lado = Double.parseDouble(l);
                    Triangulo triangulo = new Triangulo(lado);
                    JOptionPane.showMessageDialog(null,"El perimetro del triangulo es: "+triangulo.calcularPerimetro()); 
                       
                }             
            }
            break;

            case "Circulo":{
                System.out.println("Soy un circulo");
                if (app.opcionArea.isSelected()) {
                    String r = JOptionPane.showInputDialog(null, "Introduce el valor del radio: ");
                    double radio = Double.parseDouble(r);
                    Circulo circulo = new Circulo(radio);
                    JOptionPane.showMessageDialog(null,"El area del circulo es: "+circulo.calcularArea());                          
                }else{
                    String r = JOptionPane.showInputDialog(null, "Introduce el valor del radio: ");
                    double radio = Double.parseDouble(r);
                    Circulo circulo = new Circulo(radio);
                    JOptionPane.showMessageDialog(null,"El area del circulo es: "+circulo.calcularPerimetro());                           
                }                
            }
            break;
        }

        

    }
    
}
