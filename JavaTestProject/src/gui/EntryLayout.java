package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EntryLayout {
	private JTextField lField1;
	private JTextField lField2;
	private JTextField lField3;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntryLayout entryLayout = new EntryLayout();
		entryLayout.drawGUIPanel();

	}

	private void drawGUIPanel() {

		JFrame frame = new JFrame();

		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(200, 150);
		frame.layout();

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6, 6));
		panel.setBackground(Color.GRAY);

		JLabel label1 = new JLabel("First Number");
		JLabel label2 = new JLabel("Second Number");

		lField1 = new JTextField();
		lField1.setSize(100, 50);
		panel.add(label1);
		panel.add(lField1);

		lField2 = new JTextField();
		lField2.setSize(100, 50);
		panel.add(label2);
		panel.add(lField2);

		JLabel label3 = new JLabel("Sum");
		lField3 = new JTextField();
		lField3.setEditable(false);
		lField3.setSize(100, 50);
		panel.add(label3);
		panel.add(lField3);

		createCalculationButtons(panel);
		frame.add(panel);

	}

	/**
	 * @User : deepak.baloni
	 * @Method Return Type : void
	 * @Created Time : 5:42:45 PM
	 */
	private void createCalculationButtons(JPanel panel) {
		JButton sum = new JButton("ADD");
		sum.setSize(100, 50);
		sum.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String value1 = lField1.getText();
				String value2 = lField2.getText();

				int sum = Integer.parseInt(value2) + Integer.parseInt(value1);
				lField3.setText(Integer.toString(sum));

			}
		});

		panel.add(sum);
	}
}
