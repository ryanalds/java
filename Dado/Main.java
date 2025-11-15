package Dado;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main ( String[] args ) {
        
        String lados = JOptionPane.showInputDialog("Digite a quantidade de lados");
        
        int ladosInt = Integer.parseInt(lados);
        Dado dado = new Dado(ladosInt);

        JOptionPane.showMessageDialog(null, dado.rolarDado(), "Resultado", JOptionPane.INFORMATION_MESSAGE);


    }
}
