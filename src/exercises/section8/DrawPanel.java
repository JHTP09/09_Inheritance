package exercises.section8;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

/**
 *
 * @author Mohamed Elsayed
 */
public class DrawPanel extends JPanel 
{
    private Random randomNumber = new Random();
    private MyLine[] lines;
    private MyOval[] ovals;
    private MyRectangle[] rectangles;
    
    public DrawPanel()
    {
        setBackground( Color.WHITE );
        
        lines = new MyLine[ 1 + randomNumber.nextInt( 5 ) ];
        ovals = new MyOval[ 1 + randomNumber.nextInt( 5 ) ];
        rectangles = new MyRectangle[ 1 + randomNumber.nextInt( 5 ) ];
        
        for ( int i = 0; i < lines.length; i++ )
        {
            lines[ i ] = new MyLine( 
                    randomNumber.nextInt( 700 ),    // x1
                    randomNumber.nextInt( 700 ),    // y1
                    randomNumber.nextInt( 700 ),    // x2
                    randomNumber.nextInt( 700 ),    // y2
                    new Color( randomNumber.nextInt( 256),  // Red 
                            randomNumber.nextInt( 256 ),    // Green
                            randomNumber.nextInt(256 ) ) ); // Blue
        }
        
        for ( int i = 0; i < rectangles.length; i++ )
        {
            rectangles[ i ] = new MyRectangle( 
                    randomNumber.nextInt( 700 ),    // x1
                    randomNumber.nextInt( 700 ),    // y1
                    randomNumber.nextInt( 700 ),    // x2
                    randomNumber.nextInt( 700 ),    // y2
                    randomNumber.nextInt( 2 ) == 0 ? true : false,
                    new Color( randomNumber.nextInt( 256),  // Red 
                            randomNumber.nextInt( 256 ),    // Green
                            randomNumber.nextInt(256 ) ) ); // Blue
        }
        
        for ( int i = 0; i < ovals.length; i++ )
        {
            ovals[ i ] = new MyOval( 
                    randomNumber.nextInt( 700 ),    // x1
                    randomNumber.nextInt( 700 ),    // y1
                    randomNumber.nextInt( 700 ),    // x2
                    randomNumber.nextInt( 700 ),    // y2
                    randomNumber.nextInt( 2 ) == 0 ? true : false,
                    new Color( randomNumber.nextInt( 256),  // Red 
                            randomNumber.nextInt( 256 ),    // Green
                            randomNumber.nextInt(256 ) ) ); // Blue
        }
    }
    
    public String statusText()
    {
        return String.format( "%s: %d, %s: %d, %s: %d", 
                "Lines", lines.length,
                "Ovals", ovals.length,
                "Rectangles", rectangles.length );
    }
    
    @Override
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        
        for ( MyLine line : lines )
            line.draw( g );
        
        for ( MyRectangle rectangle : rectangles )
            rectangle.draw( g );
        
        for ( MyOval oval : ovals )
            oval.draw( g );
    }
}