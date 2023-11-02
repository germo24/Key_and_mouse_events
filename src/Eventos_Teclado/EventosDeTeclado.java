package Eventos_Teclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class EventosDeTeclado implements KeyListener {

    @Override
    public void keyTyped(KeyEvent ke) {

        System.out.println(" Typed ");
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {

        System.out.println(" Pressed ");

    }

    @Override
    public void keyReleased(KeyEvent ke) {

        System.out.println(" Released ");

    }
}

class Marco extends JFrame {

    public Marco() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(0, 0, 500, 400);
        setLocationRelativeTo(null);

        EventosDeTeclado tecla = new EventosDeTeclado();
        addKeyListener(tecla);

    }

}
