import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Lektion1{
	public static void main(String[] args){
            //JOptionPane.showMessageDialog(null, "Du k" + '\u00F6' + "r " + System.getProperty("os.name") + " idag!");
            //Toolkit.getDefaultToolkit() .beep();
            //JOptionPane.showMessageDialog(null, "0738003244");
            //Toolkit.getDefaultToolkit() .beep();
        //JOptionPane.showMessageDialog(null, "Rasmus Mattas\nPerOlsV11\n0738003244");
        //JOptionPane.showMessageDialog(null, "Datum och tid:\n" + Calendar.getInstance() .getTime());
        JOptionPane.showMessageDialog(null, "Information", "Information", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Varning", "Varning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Fel", "Felmeddelande", JOptionPane.ERROR_MESSAGE);
	}
}