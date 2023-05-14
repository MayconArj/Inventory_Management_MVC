package com.site.view;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.site.dao.ItemDAO;
import com.site.model.Item;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtAmount;
	private JTextField txtItem;
	private JTextField txtInside_Date;
	private JTextField txtOut_Date;
	private JTextField txtObs;

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
		
		JLabel lblNewLabel = new JLabel("Item ID");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNewLabel.setBounds(318, 10, 96, 23);
		contentPane.add(lblNewLabel);
		
		txtId = new JTextField();
		txtId.setBounds(409, 13, 157, 25);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 43, 864, 23);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 316, 864, 23);
		contentPane.add(separator_1);
		
		Button btnSave = new Button("New button");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Item item = new Item();
				
				item.setId(Integer.parseInt(txtId.getText()));
				item.setItem(txtItem.getText());
				item.setAmount(Integer.parseInt(txtAmount.getText()));
				item.setInside_date(txtInside_Date.getText());
				item.setOut_date(txtOut_Date.getText());
				item.setObs(txtObs.getText());
				
				// Checks if the fields are filled
				if(txtItem.getText().isEmpty() || txtAmount.getText().isEmpty() || txtInside_Date.getText().isEmpty() || txtOut_Date.getText().isEmpty() || txtObs.getText().isEmpty()){
				} else {
					try {
						ItemDAO dao = new ItemDAO();
						dao.Save(item);
						JOptionPane.showMessageDialog(null, "Saved!");
					} catch (Exception e1){
						JOptionPane.showMessageDialog(null, "Save Error");
					}
				}
				
			}
		});
		btnSave.setBounds(30, 328, 100, 100);
		contentPane.add(btnSave);
		
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
		txtTextArea.setBounds(10, 152, 864, 144);
		contentPane.add(txtTextArea);
		
		JLabel lblNewLabel_1 = new JLabel("Amount");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(20, 62, 96, 23);
		contentPane.add(lblNewLabel_1);
		
		txtAmount = new JTextField();
		txtAmount.setColumns(10);
		txtAmount.setBounds(126, 62, 157, 25);
		contentPane.add(txtAmount);
		
		JLabel lblNewLabel_2 = new JLabel("Item");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(20, 96, 96, 23);
		contentPane.add(lblNewLabel_2);
		
		txtItem = new JTextField();
		txtItem.setColumns(10);
		txtItem.setBounds(126, 96, 157, 25);
		contentPane.add(txtItem);
		
		JLabel lblNewLabel_3 = new JLabel("Inside Date");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(303, 62, 96, 23);
		contentPane.add(lblNewLabel_3);
		
		txtInside_Date = new JTextField();
		txtInside_Date.setColumns(10);
		txtInside_Date.setBounds(409, 62, 157, 25);
		contentPane.add(txtInside_Date);
		
		JLabel lblOutDate = new JLabel("Out Date");
		lblOutDate.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblOutDate.setBounds(303, 96, 96, 23);
		contentPane.add(lblOutDate);
		
		txtOut_Date = new JTextField();
		txtOut_Date.setColumns(10);
		txtOut_Date.setBounds(409, 96, 157, 25);
		contentPane.add(txtOut_Date);
		
		JLabel lblObs = new JLabel("Obs");
		lblObs.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblObs.setBounds(589, 60, 96, 23);
		contentPane.add(lblObs);
		
		txtObs = new JTextField();
		txtObs.setColumns(10);
		txtObs.setBounds(695, 60, 157, 25);
		contentPane.add(txtObs);
	}
}
