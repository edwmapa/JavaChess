package ui;

import data.Board;
import data.Piece;
import data.Player;
import data.Rook;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class UISwing extends javax.swing.JFrame implements UI{
    public UISwing() {
        try{
            initComponents();
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
            this.setIconImage(new ImageIcon(getClass().getResource("resources/gameIcon.png")).getImage());
            
            this.pack();
            this.setVisible(true);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UISwing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(UISwing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(UISwing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(UISwing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("menuframe"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UISwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UISwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UISwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UISwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UISwing().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void onWinMessage(Player player){
        //Magic goes here
    }
    @Override
    public void onTieMessage(Player[] player){
        //Magic goes here
    }
    
    @Override
    public void messageStalemate(){
        //Magic goes here
    }
    @Override
    public void onInvalidMoveCheck(Player[] player, int turn){
        //Magic goes here
    }
    @Override
    public void onCheck(Player[] player, int turn){
        //Magic goes here
    }
    @Override
    public void checkMate(Player[] player, int turn){
        //Magic goes here
    }
    @Override
    public void onQuitGame(Player player){
        //Magic goes here
    }
    @Override
    public void onError(int msg){
        //Magic goes here
    }
    @Override
    public void messageDrawFifty(Player[] player){
        //Magic goes here
    }
    @Override
    public void messageDrawKing(Player[] player){
        //Magic goes here
    }
    @Override
    public void printBoard(Board board){
        //Magic goes here
    }
    @Override
    public String readName(String col){
        //Magic goes here
        return "Not implemented yet";
    }
    @Override
    public void welcome(){
        //Magic goes here
    }
    @Override
    public int menu(){
        //Magic goes here
        return 0;
    }
    @Override
    public void printCemetery(Player w, Player b){
        //Magic goes here
    }
    @Override
    public void whosePlayer(Player player){
        //Magic goes here
    }
    @Override
    public String coordinateRead(){
        //Magic goes here
        return "Not implemented yet";
    }
    @Override
    public ArrayList<ArrayList<Integer>> inputMove(){
        //Magic goes here
        return new ArrayList<ArrayList<Integer>>();
    }
    @Override
    public Piece askPromotioPiece(boolean color){
        //Magic goes here
        return new Rook(color);
    }
    @Override
    public int movementOptions(){
        //Magic goes here
        return 0;
    }
    @Override
    public void showPlayHist(Player[] player){
        //Magic goes here
    }
    @Override
    public boolean overWriteMessage(String fileName){
        //Magic goes here
        return true;
    }
    @Override
    public String saveGameRequest(){
        //Magic goes here
        return "Not implemented yet";
    }
    @Override
    public String loadGameRequest(){
        //Magic goes here
        return "Not implemented yet";
    }
    @Override
    public void onSaveSuceed(){
        //Magic goes here
    }
    @Override
    public void onSaveFailure(){
        //Magic goes here
    }
    @Override
    public void onLoadFailure(){
        //Magic goes here
    }
    @Override
    public void onLoadSuceed(){
        //Magic goes here
    }
}
