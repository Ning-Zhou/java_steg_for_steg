import javax.swing.*;

public class Mobiltest {
    public static void main(String[] arg) {
	String s;
	s = JOptionPane.showInputDialog("Antal samtal?");
	int n = Integer.parseInt(s);
	s = JOptionPane.showInputDialog("Minuter dagtid?");
	int dag = Integer.parseInt(s);
	s = JOptionPane.showInputDialog("Minuter övrig tid?");
	int other = Integer.parseInt(s);
	double kos = Mobil.månadskostnad (n, dag, other);
	JOptionPane.showInputDialog(null,"Kostnad: " + kos);
    }
}

