package frontEnd;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NameMenu extends JOptionPane {
    private String name;

        public NameMenu(){

                name = (String) showInputDialog(null, "Ingrese su nombre","DesktopDungeons",JOptionPane.OK_CANCEL_OPTION, 
                                new ImageIcon("./resources/mirror3.jpg"),null, "<nombre>");
                
        }
    public String getName() {
        return name;
    }
}