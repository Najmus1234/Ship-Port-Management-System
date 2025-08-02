import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class GUICrewShip extends JFrame {
    private ArrayList<Crew> crewList = new ArrayList<>();
    private ArrayList<Ship> shipList = new ArrayList<>();
    private boolean firstCrewWrite = true;
    private boolean firstShipWrite = true;

    public GUICrewShip() {
        setTitle("NOUKA Ship Port Management");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();

        // Home tab with image (optional, or simple label)
        tabs.add("Home", new JLabel("Welcome to the NOUKA Ship Port Management System!", SwingConstants.CENTER));

        // View tab
        tabs.add("View", new JLabel("Viewing options will be added here."));

        // Manage tab
        tabs.add("Manage", createManagePanel());
        
        tabs.add("About", new JLabel("CSE215.9 Java Project by Group 2. \\nMembers: Nafis Alam Nihal, Dewan Najmus Saqib, Aowlad Hussain"));

        add(tabs);
        setVisible(true);
    }

    private JPanel createManagePanel() {
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        JButton crewBtn = new JButton("Manage Crew");
        JButton shipBtn = new JButton("Manage Ship");
        buttonPanel.add(crewBtn);
        buttonPanel.add(shipBtn);

        JPanel crewForm = new JPanel(new GridLayout(5, 2));
        JTextField crewName = new JTextField();
        JTextField crewID = new JTextField();
        JTextField crewTitle = new JTextField();
        JTextField crewAge = new JTextField();
        JButton submitCrew = new JButton("Submit Crew");

        crewForm.setBorder(BorderFactory.createTitledBorder("Crew Info"));
        crewForm.add(new JLabel("Name:")); crewForm.add(crewName);
        crewForm.add(new JLabel("ID:")); crewForm.add(crewID);
        crewForm.add(new JLabel("Title:")); crewForm.add(crewTitle);
        crewForm.add(new JLabel("Age:")); crewForm.add(crewAge);
        crewForm.add(new JLabel("")); crewForm.add(submitCrew);
        crewForm.setVisible(false);

        JPanel shipForm = new JPanel(new GridLayout(6, 2));
        JTextField shipID = new JTextField();
        JTextField shipType = new JTextField();
        JTextField fuelCap = new JTextField();
        JTextField fuelRem = new JTextField();
        JTextField crewNum = new JTextField();
        JButton submitShip = new JButton("Submit Ship");

        shipForm.setBorder(BorderFactory.createTitledBorder("Ship Info"));
        shipForm.add(new JLabel("ID:")); shipForm.add(shipID);
        shipForm.add(new JLabel("Type:")); shipForm.add(shipType);
        shipForm.add(new JLabel("Fuel Capacity:")); shipForm.add(fuelCap);
        shipForm.add(new JLabel("Fuel Remaining:")); shipForm.add(fuelRem);
        shipForm.add(new JLabel("Crew Count:")); shipForm.add(crewNum);
        shipForm.add(new JLabel("")); shipForm.add(submitShip);
        shipForm.setVisible(false);

        // Button actions using ActionListener (no lambdas)
        crewBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crewForm.setVisible(true);
                shipForm.setVisible(false);
            }
        });

        shipBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shipForm.setVisible(true);
                crewForm.setVisible(false);
            }
        });

        submitCrew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = crewName.getText();
                String id = crewID.getText();
                String title = crewTitle.getText();
                int age = Integer.parseInt(crewAge.getText());

                Crew c = new Crew(name, id, title, age);
                crewList.add(c);
                writeCrewToFile(c);
                JOptionPane.showMessageDialog(null, "Crew saved.");
                crewName.setText(""); crewID.setText(""); crewTitle.setText(""); crewAge.setText("");
            }
        });

        submitShip.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = shipID.getText();
                String type = shipType.getText();
                double cap = Double.parseDouble(fuelCap.getText());
                double rem = Double.parseDouble(fuelRem.getText());
                int crew = Integer.parseInt(crewNum.getText());

                Ship s = new Ship(id, type, cap, rem, crew);
                shipList.add(s);
                writeShipToFile(s);
                JOptionPane.showMessageDialog(null, "Ship saved.");
                shipID.setText(""); shipType.setText(""); fuelCap.setText(""); fuelRem.setText(""); crewNum.setText("");
            }
        });

        JPanel formsPanel = new JPanel(new GridLayout(2, 1));
        formsPanel.add(crewForm);
        formsPanel.add(shipForm);

        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        mainPanel.add(formsPanel, BorderLayout.CENTER);
        return mainPanel;
    }

    private void writeCrewToFile(Crew c) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("crew.txt", !firstCrewWrite));
            bw.write(c.toString());
            bw.newLine();
            bw.close();
            firstCrewWrite = false;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error writing crew: " + ex.getMessage());
        }
    }

    private void writeShipToFile(Ship s) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("ship.txt", !firstShipWrite));
            bw.write(s.toString());
            bw.newLine();
            bw.close();
            firstShipWrite = false;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error writing ship: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new GUICrewShip();
    }
}
