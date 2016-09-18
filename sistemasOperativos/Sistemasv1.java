/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasv1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author parzibyte
 */
public class Sistemasv1 {

    /**
     * @param args the command line arguments
     */
    public static boolean compruebaDatos(String username, String password) {
        String usernameCorrecto = "foo", passwordCorrecta = "bar";
        return usernameCorrecto.equals(username) && passwordCorrecta.equals(password);
    }

    public static void main(String[] args) {

        VentanaPrincipal ventanita = new VentanaPrincipal();
        TimerTask t = new TimerTask() {
            int segundosTranscurridos = 0;

            @Override
            public void run() {
                segundosTranscurridos++;
                ventanita.etiquetaSegundos.setText("Han transcurrido " + String.valueOf(segundosTranscurridos) + " segundo(s)");
            }
        };
        Timer t2 = new Timer();
        t2.schedule(t, 0L, 1000L);
        ventanita.jTextUsername.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {

                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (compruebaDatos(ventanita.jTextUsername.getText(), ventanita.jTextPassword.getText())) {
                    t2.cancel();
                }
                //System.out.println("" + String.valueOf(compruebaDatos(ventanita.jTextUsername.getText(), ventanita.jTextPassword.getText())));
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        ventanita.jTextPassword.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {

                //System.out.println(""+String.valueOf(compruebaDatos(ventanita.jTextUsername.getText(), ventanita.jTextPassword.getText())));
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (compruebaDatos(ventanita.jTextUsername.getText(), ventanita.jTextPassword.getText())) {
                    t2.cancel();
                }
                //System.out.println("" + String.valueOf(compruebaDatos(ventanita.jTextUsername.getText(), ventanita.jTextPassword.getText())));
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        ventanita.setVisible(true);
    }

}
