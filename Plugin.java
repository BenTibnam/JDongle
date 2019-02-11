import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.event.*;
import java.io.Serializable;
import java.io.IOException;
import java.util.ArrayList;


public class Plugin extends JPanel implements Serializable, MouseListener, KeyListener{
    private String name;
    private int width;
    private int height;
    private ArrayList<JComponent> components;

    // MouseListener overrides
    
    public Plugin(String name, int width, int height){
        this.name = name;
        
        if(width > Toolkit.getDefaultToolkit().getScreenSize().width || height > Toolkit.getDefaultToolkit().getScreenSize().height){
            System.out.println("Notice: the dimensions of the plugin is greater than the actual screen dimensions");
        }

        this.width = width;
        this.height = height;

        this.components = new ArrayList<JComponent>();

        this.setSize(this.width, this.height);
    }

    public void addComponent(JComponent component){
        this.components.add(component);
        this.add(component);
    }
}