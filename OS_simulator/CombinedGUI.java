import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CombinedGUI extends JFrame {

    public CombinedGUI() {
        setTitle("Combined GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1));

        JButton btnPriorityScheduling = new JButton("Priority Scheduling");
        btnPriorityScheduling.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrioritySchedulingGUI prioritySchedulingGUI = new PrioritySchedulingGUI();
                prioritySchedulingGUI.setVisible(true);
            }
        });

        JButton btnReaderWritersProblem = new JButton("Reader Writers Problem");
        btnReaderWritersProblem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReaderWritersProblemGUI readerWritersProblemGUI = new ReaderWritersProblemGUI();
                readerWritersProblemGUI.setVisible(true);
            }
        });

        JButton btnFCFSDiskScheduling = new JButton("FCFS Disk Scheduling");
        btnFCFSDiskScheduling.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FCFSDiskGUI fcfsDiskGUI = new FCFSDiskGUI();
                fcfsDiskGUI.setVisible(true);
            }
        });

        mainPanel.add(btnPriorityScheduling);
        mainPanel.add(btnReaderWritersProblem);
        mainPanel.add(btnFCFSDiskScheduling);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CombinedGUI().setVisible(true);
            }
        });
    }
}
