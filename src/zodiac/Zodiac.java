/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zodiac;
import javax.swing.*;

/**
 *
 * @author krist
 */
public class Zodiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        String  mes;
        dia=Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia:"));
        mes=JOptionPane.showInputDialog("Ingresar el mes" + "\n" + "Eje. Enero");
        String[] zodiac = {"Acuario", "Piscis","Aries", "Tauro", "Geminis", "Cancer", "Leo", "Virgo", "Libra", "Escorpion", "Sagitario", "Capricornio" };
        
    
        if((dia >=21 && dia <=31 && mes.equalsIgnoreCase("Enero"))||(dia >= 1 && dia <=18 && mes.equalsIgnoreCase("Febrero"))){
            JOptionPane.showMessageDialog(null, "Tu signo es " + zodiac[0]);
        }
        
        else if ((dia >=19 && dia <=29 && mes.equalsIgnoreCase("Febrero"))||(dia >= 1 && dia <=20 && mes.equalsIgnoreCase("Marzo"))){
            JOptionPane.showMessageDialog(null, "Tu signo es " + zodiac[1]);
        }
        else if ((dia >=21 && dia <=31 && mes.equalsIgnoreCase("Marzo"))||(dia >= 1 && dia <=20 && mes.equalsIgnoreCase("Abril"))){
            JOptionPane.showMessageDialog(null, "Tu signo es " +zodiac[2]);
        }
        else if ((dia >=21 && dia <=30 && mes.equalsIgnoreCase("Abril"))||(dia >= 1 && dia <=21 && mes.equalsIgnoreCase("Mayo"))){
            JOptionPane.showMessageDialog(null, "Tu signo es " +zodiac[3]);
        }
        else if ((dia >=22 && dia <=31 && mes.equalsIgnoreCase("Mayo"))||(dia >= 1 && dia <=21 && mes.equalsIgnoreCase("Junio"))){
            JOptionPane.showMessageDialog(null, "Tu signo es " +zodiac[4]);
        }
        else if ((dia >=22 && dia <=30 && mes.equalsIgnoreCase("Junio"))||(dia >= 1 && dia <=22 && mes.equalsIgnoreCase("Julio"))){
            JOptionPane.showMessageDialog(null, "Tu signo es " +zodiac[5]);
        }
        else if ((dia >=23 && dia <=31 && mes.equalsIgnoreCase("Julio"))||(dia >= 1 && dia <=23 && mes.equalsIgnoreCase("Agosto"))){
            JOptionPane.showMessageDialog(null, "Tu signo es " +zodiac[6]);
        }
        else if ((dia >=24 && dia <=30 && mes.equalsIgnoreCase("Agosto"))||(dia >= 1 && dia <=23 && mes.equalsIgnoreCase("Septiember"))){
            JOptionPane.showMessageDialog(null, "Tu signo es " +zodiac[7]);
        }
        else if ((dia >=24 && dia <=31 && mes.equalsIgnoreCase("Septiember"))||(dia >= 1 && dia <=23 && mes.equalsIgnoreCase("Octubre"))){
            JOptionPane.showMessageDialog(null, "Tu signo es " +zodiac[8]);
        }
        else if ((dia >=24 && dia <=30 && "Octubre".equals(mes))||(dia >= 1 && dia <=22 && mes.equalsIgnoreCase("Noviembre"))){
            JOptionPane.showMessageDialog(null,"Tu signo es " +zodiac[9]);
        }
        
        else if ((dia >=23 && dia <=31 && mes.equalsIgnoreCase("Noviembre"))||(dia >= 1 && dia <=21 && mes.equalsIgnoreCase("Diciembre"))){
            JOptionPane.showMessageDialog(null, "Tu signo es " +zodiac[10]);
        }
        else if ((dia >=22 && dia <=31 && mes.equalsIgnoreCase("Diciembre"))||(dia >= 1 && dia <=20 && mes.equalsIgnoreCase("Enero"))){
            JOptionPane.showMessageDialog(null, "Tu signo es " +zodiac[11]);
        }
        else 
        JOptionPane.showMessageDialog(null,"Tus datos no están correctos!!!");
	}
}
