import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class DiseService implements Service {
    JLabel label;
    JComboBox numOfDice;

    @Override
    public JPanel getGuiPanel() {
        JPanel panel = new JPanel();
        JButton button = new JButton("Roll 'em!'");
        String[] choises = {"1", "2", "3", "4", "5"};
        numOfDice = new JComboBox(choises);
        label = new JLabel("dice values here");
        button.addActionListener(new RollEmListener());
        panel.add(numOfDice);
        panel.add(button);
        panel.add(label);
        return panel;
    }

    public class RollEmListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String diseOutput = "";
            String selection = (String) numOfDice.getSelectedItem();
            int numOfDiceToRoll = Integer.parseInt(selection);
            for (int i = 0;i <numOfDiceToRoll; i++) {
                int r = (int) ((Math.random()*6) + 1);
                diseOutput +=(" " + r);
            }
            label.setText(diseOutput);
        }
    }
}
