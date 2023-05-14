package com.site.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtItemCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Item Code");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNewLabel.setBounds(318, 10, 96, 23);
		contentPane.add(lblNewLabel);
		
		txtItemCode = new JTextField();
		txtItemCode.setBounds(424, 10, 157, 25);
		contentPane.add(txtItemCode);
		txtItemCode.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 43, 864, 23);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 316, 864, 23);
		contentPane.add(separator_1);
		
		Button txtSearch = new Button("New button");
		txtSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtSearch.setBounds(30, 328, 100, 100);
		contentPane.add(txtSearch);
		
		Button button_1 = new Button("New button");
		button_1.setBounds(500, 328, 100, 100);
		contentPane.add(button_1);
		
		Button button_2 = new Button("New button");
		button_2.setBounds(621, 328, 100, 100);
		contentPane.add(button_2);
		
		Button button_3 = new Button("New button");
		button_3.setBounds(746, 328, 100, 100);
		contentPane.add(button_3);
		
		TextArea txtTextArea = new TextArea();
		txtTextArea.setBounds(10, 60, 864, 236);
		contentPane.add(txtTextArea);
	}
}
