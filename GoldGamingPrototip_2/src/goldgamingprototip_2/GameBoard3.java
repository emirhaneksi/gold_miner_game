package goldgamingprototip_2;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.JComponent;

///!!!!! Bu kod parçacığında internetten yardım alınmıştır!!!!///////
///!!!!! Kaynakçanın 1.maddesinde kaynak belirtilmişti!!!//////
public class GameBoard3 {
    public JPanel board = new JPanel(new BorderLayout(3,3));
    public JButton[][] c1squares = new JButton[100][100];
    public JPanel c1Board;
    public JLabel messagec1 = new JLabel("Altın Arazisi");
    JToolBar tool = new JToolBar();
    Insets Margin = new Insets(0,0,0,0);
    int squares = 100;
    int space =100;
    ImageIcon icon = new ImageIcon(new BufferedImage(space, space, BufferedImage.TYPE_INT_ARGB));
    
      
public void initializeGui(int sayi1, int sayi2,int [][]matrix,int [][]matrix2) {
        System.out.println("heeoovvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        System.out.println();System.out.println();System.out.println();
         for (int i = 0; i < sayi1; i++) {
            for (int j = 0; j < sayi2; j++) {
                System.out.print(" "+matrix[i][j]);
                
            }
             System.out.println();
        }
         System.out.println();
         System.out.println("------------------------------------------------------------------------");
         System.out.println();
         for (int i = 0; i < sayi1; i++) {
            for (int j = 0; j < sayi2; j++) {
                System.out.print(" "+matrix2[i][j]);
                
            }
             System.out.println();
        }
        
        
    board.setBorder(new EmptyBorder(5, 5, 5, 5));
    tool.setFloatable(false);
    board.add(tool, BorderLayout.PAGE_START);
    tool.add(messagec1);
    c1Board = new JPanel(new GridLayout(sayi1, sayi2));
    c1Board.setBorder(new LineBorder(Color.BLACK));
    board.add(c1Board);
    String deger ;
    
        JButton b1;
        for (int i = 0; i < sayi1; i++) {
            for (int j = 0; j <sayi2; j++) {
                JButton b = new JButton();
                b.setMargin(Margin);
                b.setIcon(icon);
               

                c1squares[i][j]=b;
                switch (matrix[i][j]) {
                    case 1:
                        b.setFont(new Font("Dialog",Font.PLAIN,5));
                        b.setBackground(Color.YELLOW);
                        b.setForeground(Color.black);
                        b.setText("20");
                        break;
                    case 2:
                        b.setBackground(Color.ORANGE);
                        break;
                    case 0:
                        b.setBackground(Color.LIGHT_GRAY);
                        break;
                    case -1:
                        b.setBackground(Color.DARK_GRAY);
                        break;
                    case 5:
                        b.setBackground(Color.MAGENTA);
                        break;
                    case 6:
                        b.setBackground(Color.CYAN);
                        break;
                    case 7:
                        b.setBackground(Color.RED);
                        break;
                    case 8:
                        b.setBackground(Color.blue);
                        break;
                    default:
                        break;
                }
            }
            
        }
        for (int i = 0; i < sayi1; i++) {
        for (int j = 0; j < sayi2; j++) {     
                    c1Board.add(c1squares[i][j]);      
        }
    } 
   
}
public void renk(int x,int y,int [][] matris,int [][] matris2){
    for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {     
                if(matris[i][j]==1){
                    
                    c1squares[i][j].setBackground(Color.YELLOW);
                   
                }
                else if(matris[i][j]==2){
                    
                     c1squares[i][j].setBackground(Color.ORANGE);
                }else if(matris[i][j]==0){
                    c1squares[i][j].setBackground(Color.LIGHT_GRAY);
                }
                else if(matris[i][j]==-1){
                     c1squares[i][j].setBackground(Color.DARK_GRAY);
                    
                }else if(matris[i][j]==5){
                    c1squares[i][j].setBackground(Color.MAGENTA);
                }
                else if(matris[i][j]==6){
                     c1squares[i][j].setBackground(Color.CYAN);
                }
                else if(matris[i][j]==7){
                     c1squares[i][j].setBackground(Color.RED);
                }
                else if(matris[i][j]==8){
                     c1squares[i][j].setBackground(Color.blue);
                }
        }
    } 
    
}
public JComponent getGui() {
    return board;
    
    }

}
