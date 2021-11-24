package alles;

public class Main {

	public static void main(String[] args) {
		
		Main main = new Main();
		main.testMethode();

	}
	
	public void testMethode() {
		for(int i = 0; i<10; i++) {
			System.out.println("Hier steht die " + (i+1) + ". Zeile!");
			//Kommentar
		}
	}

}
