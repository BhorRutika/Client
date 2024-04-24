package Utility;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse2 extends JFrame {

    public Mouse2() {
    	
    	
    	
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(403, 412);
        setLocationRelativeTo(null);
        setTitle("Mouse Pointer Detection");

        JPanel panel = new JPanel();
        panel.setName("Panel1");
        System.out.println(panel.getX()+"-"+panel.getY());
        

        JButton button = new JButton("Button");
        button.setBounds(141, 269, 82, 25);
        JTextField textField = new JTextField("TextField");
        textField.setBounds(151, 238, 60, 19);
        JLabel label = new JLabel("Label");
        label.setBounds(161, 211, 39, 15);
        panel.setLayout(null);

        // Adding MouseListener to the components
		
		  
		 
        panel.add(button);
        panel.add(textField);
        panel.add(label);

        getContentPane().add(panel);
        panel.addMouseListener(new MouseRecenter("Panel"));
        
        button.addMouseListener(new MouseRecenter("Button"));
		  textField.addMouseListener(new MouseRecenter("TextField"));
		  label.addMouseListener(new MouseRecenter("Label"));
        
        setVisible(true);
        
        
    }

    
    
    
    private class MouseRecenter extends MouseAdapter {
        private String componentName;

        public MouseRecenter(String componentName) {
            this.componentName = componentName;
           
        }
        @Override
        public void mouseEntered(MouseEvent e) {
        	Component source = (Component) e.getSource();
             Container ss=  source.getParent();
        	 System.out.println("Mouse entered " + componentName+ss.getName());
        	 if(componentName=="Button") 
			  {}
        }
        
        @Override
        public void mouseExited(MouseEvent e) 
        {
        	Component source = (Component) e.getSource();
             Container ss=  source.getParent();
             System.out.println("Mouse exited " +componentName+ " X "+e.getX()+" Y "+ e.getY());
             
             setSize(400, 400);
             Dimension frameSize =getSize();

             int frameWidth = frameSize.width;
             int frameHeight = frameSize.height;
             System.out.println(frameWidth+"//"+frameHeight);
             
			  if(componentName=="Panel" && (e.getX()<0 || e.getX()>=frameWidth || e.getY()<0 || e.getY()>=frameHeight)) 
			  { 
				  draw(e.getX(),e.getY());
			  }
        }
    }
    
    public void draw(int mouseX, int mouseY)
	{
		try
		    {
		        Robot bot = new Robot();
		        bot.mouseMove(680,346);
		        //System.out.print(" MouseX Mouse y"+mouseX +mouseY);
		    }
		    catch (AWTException e)
		    {
		        e.printStackTrace();
		    }
	}
    
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Mouse2::new);
    }
}
