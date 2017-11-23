
import javax.swing.UIManager;


public class Test {

    public static void main(String[] args) {
        
        UIManager.LookAndFeelInfo[] installedLookAndFeels = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo installedLookAndFeel : installedLookAndFeels) {
            System.out.println(installedLookAndFeel);
        }
   
    }
}
