/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jointgames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

import java.awt.Dimension;

/**
 *
 * @author leahr
 */
public class JointGames extends JPanel{

    /**
     * @param args the command line arguments
     */
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);  // Call JPanel's paintComponent method
    }
    
    public void setUpComponents(){
      
       JFrame window = new JFrame("GameBook");
       window.setBounds(800, 200, 900, 900);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Container c = window.getContentPane(); //create thingies
       
       c.add(BorderLayout.NORTH,this);
       JPanel topGamesPanel = new JPanel(); //top games strip
       topGamesPanel.setPreferredSize(new Dimension (900,300));
       Color topColor = new Color(221,160,221); // RGB values - slightly more red?
       topGamesPanel.setBackground(topColor);
       JButton addConnect4Btn = new JButton("Connect Four"); //add connect four button
       addConnect4Btn.setPreferredSize(new Dimension (300,100));
       addConnect4Btn.addActionListener(new doItConnect4BtnListener());
       topGamesPanel.add(addConnect4Btn);
       JButton addCheckersBtn = new JButton("Checkers"); //add checkers button
       addCheckersBtn.setPreferredSize(new Dimension (300,100));
       addCheckersBtn.addActionListener(new doItCheckersBtnListener());
       topGamesPanel.add(addCheckersBtn);
       c.add(BorderLayout.NORTH,topGamesPanel);
       
       c.add(BorderLayout.CENTER,this);
       JPanel titlePanel = new JPanel();
       Color titlePanelColor = new Color(221,160,221); // RGB values - slightly more red?
       topGamesPanel.setBackground(titlePanelColor);
       JLabel jointGamesLabel = new JLabel("JointGames");
       titlePanel.add(jointGamesLabel);
       c.add(BorderLayout.CENTER,titlePanel);
       
       c.add(BorderLayout.SOUTH,this);
       JPanel bottomGamesPanel = new JPanel(); //bottom games strip
       bottomGamesPanel.setPreferredSize(new Dimension (900,300));
       Color bottomColor = new Color(221,160,221); //plum
       bottomGamesPanel.setBackground(bottomColor);
       JButton addBattleshipBtn = new JButton("Battleship"); //add battleship button
       addBattleshipBtn.setPreferredSize(new Dimension (300,100));
       addBattleshipBtn.addActionListener(new doItBattleshipBtnListener());
       bottomGamesPanel.add(addBattleshipBtn);
       JButton addTicTacToeBtn = new JButton("Tic-Tac-Toe"); //add tic-tac-toe button
       addTicTacToeBtn.setPreferredSize(new Dimension (300,100));
       addTicTacToeBtn.addActionListener(new doItTicTacToeBtnListener());
       bottomGamesPanel.add(addTicTacToeBtn);
       c.add(BorderLayout.SOUTH,bottomGamesPanel);
       
       window.setResizable(false);
       window.setVisible(true);
       
     }
    
    class doItConnect4BtnListener implements ActionListener {
         @Override
        public void actionPerformed(ActionEvent e) {
            
        }
     }
    
    class doItCheckersBtnListener implements ActionListener {
         @Override
        public void actionPerformed(ActionEvent e) {
            
        }
     }
    
    class doItBattleshipBtnListener implements ActionListener {
         @Override
        public void actionPerformed(ActionEvent e) {
            
        }
     }
    
    class doItTicTacToeBtnListener implements ActionListener {
         @Override
        public void actionPerformed(ActionEvent e) {
            
        }
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
      
       JointGames panel = new JointGames();
       panel.setUpComponents();
        
        
        
        
    }
    
}
