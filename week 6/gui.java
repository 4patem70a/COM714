import javax.awt.Dimension;
import Javax.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import Javax.swing.JTextField;

public class Gui extends JFrame {
    // attributes
    JPanel controlPanel;
    JPanel greetingPanel;

    // construtors

    public Gui() {
        // set window properties
        this.setLayout(new BorderLayout());
        this.setSize(new Dimension(500, 500));

        addGreetingPanel();
        addgreetingTextField();
        addGreetingButton();
        addControlPanel();
        addOpenButton();
        addCloseButton();
    }

    // methods
    private void addControlPanel() {
        ControlPanel = Jpanel();
        this.add(controlPanel , BorderLayout.SOUTH);
    }

    private void addOpenButton() {
        JButton addOpenButton = new JButton("open");
        controlPanel.add(openButton);
    }

    private void addCloseButton() {
        JButton closeButton = new JButton("close");
        controlPanel.add(closeButton);
    }

    private void addGreetingButton() {
        // create

        JButton addGreetingButton = new jbutton("Display Greeting");
        // style
        // events
        // add to parent
        this.add(addGreetingButton);
    }

    private void addGreetingPanel() {
        GreetingPanel = new JPanel();
        this.add(greetingPanel ,BordeLayout.NORTH);
    }

    private void addgreetingTextField() {
        JTextField greetingTextField = new JTextField();
        greetingTextField.setpreferSize(new Dimension(200, 50));
        greetingPanel.add(greetingTextField);
    }

    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.setVisible(true);
    }
}
