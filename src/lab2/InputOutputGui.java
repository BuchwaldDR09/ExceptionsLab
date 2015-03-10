package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        boolean isError = true;
        String lastName = "";
        do {
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        try{
            lastName = nameService.extractLastName(fullName);
            isError = false;
        } catch (IllegalArgumentException ia){
            JOptionPane.showMessageDialog(null, ia.getMessage());
            isError = true;
        }
        } while (isError);
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
    }
}
