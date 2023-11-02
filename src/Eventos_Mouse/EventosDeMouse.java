package Eventos_Mouse;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class EventosDeMouse implements MouseListener  {

    @Override
    public void mouseClicked(MouseEvent me) {
        
            System.out.println(" Click!");
        
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
        System.out.println(" Pressed ");
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
        System.out.println(" Released ");
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
        System.out.println(" You are in the interface ");
        
    }

    @Override
    public void mouseExited(MouseEvent me) {

        System.out.println(" You are over the interface ");        
        
    }
    
}

class Marco extends JFrame{

public Marco(){

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBounds(0,0,500,400);
    setLocationRelativeTo(null);
    setVisible(true);
    
    EventosDeMouse h1 = new EventosDeMouse();
    addMouseListener(h1);

    

}

}
