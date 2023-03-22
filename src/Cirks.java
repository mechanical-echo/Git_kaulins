import java.util.Random;
import javax.swing.JOptionPane;

public class Cirks {
	static void mestKaulinu(int reizes) {
		int skaitlis, lielakais = 0;
		Random rand = new Random();
		for (int i = 0; i < reizes; i++) {
			skaitlis = rand.nextInt(6) + 1;
			System.out.println("Uzkrita skaitlis: " + skaitlis);

			if (lielakais < skaitlis) {
				lielakais = skaitlis;
			}
		}
		System.out.println("Liel�kais skaitlis metienos ir " + lielakais);
	
}
	
	
	//Mans komentars
	public static void main(String[] args) {
		int reizes;
		do{
			reizes = Integer.parseInt(JOptionPane.showInputDialog(null,"Ievadi kauliņu mēšanas reizes"));
		}while(reizes<1);
		mestKaulinu(reizes);

}
}
//Kļūdas lābošana