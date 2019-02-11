import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.GridLayout;

public class WindowManager{
    // variables for defining default window
    private static final int DEFAULT_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static final int DEFAULT_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
    private static final String PROGRAM_NAME = "Dongle Pre Build";

    public static void mainWindow(){
        JFrame frame = createBasicWindow();

        Plugin testPlug = new Plugin("Test", 100, 100);
        JLabel test = new JLabel();
        test.setText("Hello World");
        testPlug.addComponent(test);

        frame.add(testPlug);

        frame.setVisible(true);
    }

    /**
     * creates a basic window using the default settings
     * @return basic JFrame used in the program
     */
    private static JFrame createBasicWindow(){
        JFrame frame = new JFrame(PROGRAM_NAME);

        frame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        frame.setLayout(new GridLayout(1,1));
        
        frame.setLocationRelativeTo(null);

        return frame;
    }
}