package goldgamingprototip_2;

import java.awt.Dimension;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;


public class GoldGamingPrototip_2 {

    
    public static void main(String[] args) throws IOException {
        GameBoard3 gb = new GameBoard3();
        JFrame jf = new JFrame("Altın Yakalama Oyunu");
        
        StartPage sp = new StartPage();
        
        sp.setMinimumSize(new Dimension(510,510));
        sp.setLocation(50,50);
        sp.setVisible(true);
        
        
        

}
    
   
    
}