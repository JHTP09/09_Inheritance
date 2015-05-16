package exercises.section8;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Mohamed Elsayed
 */
public class DrawTest 
{
    public static void main( String[] args )
    {
        DrawPanel panel = new DrawPanel();
        JLabel statusLabel = new JLabel( panel.statusText() );
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        application.add( panel );
        application.add( statusLabel, BorderLayout.SOUTH );
        
        application.setSize( 750, 750 );
        application.setVisible( true );
    }
}
