package projectjava;
import javax.swing.JOptionPane;
public class Homepage {
	public static void main(String[] args) {
		String zgj;
		int zgjint;
		zgj = JOptionPane.showInputDialog(null,"Zgjidhni nje opsion:\n1.Admin\n2.Klient","Miresevini",JOptionPane.INFORMATION_MESSAGE);
		zgjint = Integer.parseInt(zgj);
		if (zgjint == 1)
		{
			Admin();
		}
		else if (zgjint == 2) {
			Klient();
		}
		else {
			JOptionPane.showMessageDialog(null, "Komande e panjohur!","Gabim!",JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void Admin(){
		String username, password;
		String emr = "Admin", pass = "1234";
		username = JOptionPane.showInputDialog("Vendosni username-in: ");
		password = JOptionPane.showInputDialog("Vendosni password-in: ");
		if(username.equals(emr) && password.equals(pass)) {
			Magazina();
		}
		else {
			JOptionPane.showMessageDialog(null, "Kredinciale te gabuara!","Gabim!",JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void Klient() {
		String zgj2;
		int zgjint2;
		zgj2 = JOptionPane.showInputDialog("Zgjidhni nje veprim:\n1.Fatura\n2.Piket totale\n3.Dhuratat");
		zgjint2 = Integer.parseInt(zgj2);
		if(zgjint2 == 1) {
			//Fatura
		}
		else if(zgjint2 == 2) {
			//Piket totale
		}
		else if(zgjint2 == 3) {
			//Dhuratat
		}
		else {
			JOptionPane.showMessageDialog(null, "Komande e panjohur!","Gabim!",JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void Magazina() {
		String zgj1;
		int zgjint1;
		zgj1 = JOptionPane.showInputDialog("1.Afisho Produkte\n2.Shto Produkte\n3.Fshi produkte");
		zgjint1 = Integer.parseInt(zgj1);
		if(zgjint1 == 1) {
			//Afisho Produkte
		}
		else if(zgjint1 == 2) {
			//Shto produkte
		}
		else if (zgjint1 == 3) {
			//Fshi Produkte
		}
		else {
			JOptionPane.showMessageDialog(null, "Komande e panjohur!","Gabim!",JOptionPane.ERROR_MESSAGE);
		}
	}
}
