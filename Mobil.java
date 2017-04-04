import javax.swing.*;

public class Mobil {
    public static double månadskostnad (int antal, int minDag, int minÖvr) { 
	return 50 + antal*0.60 + minDag*2.50 + minÖvr*0.55;
    }

}
