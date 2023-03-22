import java.util.Random;
import javax.swing.JOptionPane;

public class Cirks {
	static void mestKaulinu(int reizes){
		int skaitlis;
		Random rand = new Random();
		for(int i=0; i<reizes; i++){
			skaitlis = rand.nextInt(6)+1;
			JOptionPane.showMessageDialog(null,"Teva uzkrita: "+skaitlis);			
		}
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