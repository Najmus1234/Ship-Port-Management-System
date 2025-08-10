package com.mycompany.testship1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GUIShipPort extends JFrame {

    private ArrayList<Crew> crewList = new ArrayList<>();
    private ArrayList<Ship> shipList = new ArrayList<>();
    private boolean firstCrewWrite = true;
    private boolean firstShipWrite = true;
    private JTextArea textArea;

    public GUICrewShip() {
        setTitle("NOUKA Ship Port Management");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();

        // Home tab with image (optional, or simple label)
        tabs.add("Home", new JLabel("Welcome to the NOUKA Ship Port Management System!", SwingConstants.CENTER));

        // View tab
        tabs.add("View", createViewPanel());

        // Manage tab
        tabs.add("Manage", createManagePanel());

        //Fuel tab
        tabs.add("Fuel", createFuelPanel());

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

        JPanel crewForm = new JPanel(new GridLayout(6, 2));
        JTextField crewName = new JTextField();
        JTextField crewID = new JTextField();
        

        crewForm.setBorder(BorderFactory.createTitledBorder("Crew Info"));
        crewForm.add(new JLabel("Name:"));
        crewForm.add(crewName);
        crewForm.add(new JLabel("ID:"));
        crewForm.add(crewID);
        
        JPanel shipForm = new JPanel(new GridLayout(6, 2));
        JTextField shipID = new JTextField();
        

        shipForm.setBorder(BorderFactory.createTitledBorder("Ship Info"));
        shipForm.add(new JLabel("ID:"));
        shipForm.add(shipID);
        

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
                

                Crew c = new Crew(name, id, shipId, title, age);
                crewList.add(c);
                writeCrewToFile(c);
                JOptionPane.showMessageDialog(null, "Crew saved.");
                crewName.setText("");
                crewID.setText("");
                
            }
        });

        submitShip.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = shipID.getText();
                
                
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
            FileWriter fw = new FileWriter("crew.txt", !firstCrewWrite);
            fw.write(c.toString() + "\n");
            fw.close();
            firstCrewWrite = false;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error writing crew: " + e.getMessage());
        }
    }

    private void writeShipToFile(Ship s) {
        try {
            FileWriter fw = new FileWriter("ship.txt", !firstShipWrite);
            fw.write(s.toString() + "\n");
            fw.close();
            firstShipWrite = false;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error writing ship: " + e.getMessage());
        }
    }

    private JPanel createViewPanel() {
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton btnShowCrew = new JButton("Show Crew File");
        JButton btnShowShip = new JButton("Show Ship File");
        JButton btnShowSample1 = new JButton("Entries Yesterday");

        buttonPanel.add(btnShowCrew);
        buttonPanel.add(btnShowShip);
        buttonPanel.add(btnShowSample1);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        btnShowCrew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayFileContent("crew.txt");
            }
        });

        btnShowShip.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayFileContent("ship.txt");
            }
        });

        btnShowSample1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayFileContent("Entries Yesterday(Sample).txt");
            }
        });
        return mainPanel;
    }

    private void displayFileContent(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            Scanner scanner = new Scanner(reader);
            StringBuilder content = new StringBuilder();
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("\n");
            }
            scanner.close();
            textArea.setText(content.toString());
        } catch (FileNotFoundException ex) {
            textArea.setText(filename + " not found.");
        }
    }

   
    public static void main(String[] args) {
        new GUIShipPort();
    }
}

