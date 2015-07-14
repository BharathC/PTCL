import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
					frame.setSize(800, 600);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 786, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		final JPanel MainPanel = new JPanel();
		contentPane.add(MainPanel, "name_4555311140192");
		MainPanel.setLayout(null);
		
		JLabel lblPtcl = new JLabel("PTCL");
		lblPtcl.setBounds(325, 7, 89, 14);
		MainPanel.add(lblPtcl);
		
		JLabel lblAdminOperations = new JLabel("Admin Operations");
		lblAdminOperations.setBounds(305, 32, 153, 14);
		MainPanel.add(lblAdminOperations);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 57, 740, 2);
		MainPanel.add(separator);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAddEmployee.setBounds(10, 57, 101, 34);
		MainPanel.add(btnAddEmployee);
		
		JButton btnEditEmployee = new JButton("Edit Employee");
		btnEditEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	EditEmployee.setVisible(true);
			}
		});
		btnEditEmployee.setBounds(121, 57, 108, 34);
		MainPanel.add(btnEditEmployee);
		
		JButton btnPlantaion = new JButton("Plantaion");
		btnPlantaion.setBounds(254, 57, 89, 34);
		MainPanel.add(btnPlantaion);
		
		JButton btnWashingbottle = new JButton("WashingBottle");
		btnWashingbottle.setBounds(357, 57, 101, 34);
		MainPanel.add(btnWashingbottle);
		
		JButton btnMediaPrepartion = new JButton("Media Prepartion");
		btnMediaPrepartion.setBounds(483, 57, 122, 34);
		MainPanel.add(btnMediaPrepartion);
		
		JButton btnStockSolution = new JButton("Stock Solution");
		btnStockSolution.setBounds(627, 57, 108, 34);
		MainPanel.add(btnStockSolution);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 101, 740, 2);
		MainPanel.add(separator_1);
		
		JLabel lblWelcomeToPtcl = new JLabel("Welcome to PTCL Admin Section");
		lblWelcomeToPtcl.setBounds(235, 149, 306, 60);
		MainPanel.add(lblWelcomeToPtcl);
		
		final JPanel AddEmployee = new JPanel();
		AddEmployee.setLayout(null);
		contentPane.add(AddEmployee, "name_5269182499361");
		
		JLabel label = new JLabel("PTCL");
		label.setBounds(325, 7, 24, 14);
		AddEmployee.add(label);
		
		JLabel label_1 = new JLabel("Admin Operations");
		label_1.setBounds(305, 32, 85, 14);
		AddEmployee.add(label_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 57, 740, 2);
		AddEmployee.add(separator_2);
		
		JButton button = new JButton("Add Employee");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		button.setBounds(10, 57, 101, 34);
		AddEmployee.add(button);
		
		JButton button_1 = new JButton("Edit Employee");
		button_1.setBounds(121, 57, 108, 34);
		AddEmployee.add(button_1);
		
		JButton button_2 = new JButton("Plantaion");
		button_2.setBounds(254, 57, 89, 34);
		AddEmployee.add(button_2);
		
		JButton button_3 = new JButton("WashingBottle");
		button_3.setBounds(357, 57, 101, 34);
		AddEmployee.add(button_3);
		
		JButton button_4 = new JButton("Media Prepartion");
		button_4.setBounds(483, 57, 122, 34);
		AddEmployee.add(button_4);
		
		JButton button_5 = new JButton("Stock Solution");
		button_5.setBounds(627, 57, 108, 34);
		AddEmployee.add(button_5);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 101, 740, 2);
		AddEmployee.add(separator_3);
		
		JLabel label_2 = new JLabel("First Name :");
		label_2.setBounds(45, 114, 66, 14);
		AddEmployee.add(label_2);
		
		JLabel label_3 = new JLabel("Last Name :");
		label_3.setBounds(45, 137, 57, 14);
		AddEmployee.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(121, 111, 122, 20);
		AddEmployee.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(121, 137, 122, 20);
		AddEmployee.add(textField_3);
		
		JLabel lblAddEmployee = new JLabel("Add Employee");
		lblAddEmployee.setBounds(357, 179, 122, 34);
		AddEmployee.add(lblAddEmployee);
		
		final JPanel EditEmployee = new JPanel();
		EditEmployee.setLayout(null);
		contentPane.add(EditEmployee, "name_5338836667487");
		
		JLabel label_4 = new JLabel("PTCL");
		label_4.setBounds(325, 7, 24, 14);
		EditEmployee.add(label_4);
		
		JLabel label_5 = new JLabel("Admin Operations");
		label_5.setBounds(305, 32, 85, 14);
		EditEmployee.add(label_5);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 57, 740, 2);
		EditEmployee.add(separator_4);
		
		JButton button_6 = new JButton("Add Employee");
		button_6.setBounds(10, 57, 101, 34);
		EditEmployee.add(button_6);
		
		JButton button_7 = new JButton("Edit Employee");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditEmployee.setVisible(true);
			}
		});
		button_7.setBounds(121, 57, 108, 34);
		EditEmployee.add(button_7);
		
		JButton button_8 = new JButton("Plantaion");
		button_8.setBounds(254, 57, 89, 34);
		EditEmployee.add(button_8);
		
		JButton button_9 = new JButton("WashingBottle");
		button_9.setBounds(357, 57, 101, 34);
		EditEmployee.add(button_9);
		
		JButton button_10 = new JButton("Media Prepartion");
		button_10.setBounds(483, 57, 122, 34);
		EditEmployee.add(button_10);
		
		JButton button_11 = new JButton("Stock Solution");
		button_11.setBounds(627, 57, 108, 34);
		EditEmployee.add(button_11);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(10, 101, 740, 2);
		EditEmployee.add(separator_5);
		
		JLabel label_6 = new JLabel("First Name :");
		label_6.setBounds(45, 114, 66, 14);
		EditEmployee.add(label_6);
		
		JLabel label_7 = new JLabel("Last Name :");
		label_7.setBounds(45, 137, 57, 14);
		EditEmployee.add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(121, 111, 122, 20);
		EditEmployee.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(121, 137, 122, 20);
		EditEmployee.add(textField_5);
		
		JLabel lblEditEmployee = new JLabel("Edit Employee");
		lblEditEmployee.setBounds(305, 218, 132, 28);
		EditEmployee.add(lblEditEmployee);
		
		final JPanel Plantation = new JPanel();
		Plantation.setLayout(null);
		contentPane.add(Plantation, "name_5403114712508");
		
		JLabel label_8 = new JLabel("PTCL");
		label_8.setBounds(325, 7, 24, 14);
		Plantation.add(label_8);
		
		JLabel label_9 = new JLabel("Admin Operations");
		label_9.setBounds(305, 32, 85, 14);
		Plantation.add(label_9);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(10, 57, 740, 2);
		Plantation.add(separator_6);
		
		JButton button_12 = new JButton("Add Employee");
		button_12.setBounds(10, 57, 101, 34);
		Plantation.add(button_12);
		
		JButton button_13 = new JButton("Edit Employee");
		button_13.setBounds(121, 57, 108, 34);
		Plantation.add(button_13);
		
		JButton button_14 = new JButton("Plantaion");
		button_14.setBounds(254, 57, 89, 34);
		Plantation.add(button_14);
		
		JButton button_15 = new JButton("WashingBottle");
		button_15.setBounds(357, 57, 101, 34);
		Plantation.add(button_15);
		
		JButton button_16 = new JButton("Media Prepartion");
		button_16.setBounds(483, 57, 122, 34);
		Plantation.add(button_16);
		
		JButton button_17 = new JButton("Stock Solution");
		button_17.setBounds(627, 57, 108, 34);
		Plantation.add(button_17);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(10, 101, 740, 2);
		Plantation.add(separator_7);
		
		JLabel lblPlantationSection = new JLabel("Plantation Section");
		lblPlantationSection.setBounds(281, 208, 127, 28);
		Plantation.add(lblPlantationSection);
		
		 final JPanel WashingBottle = new JPanel();
		WashingBottle.setLayout(null);
		contentPane.add(WashingBottle, "name_5455667109341");
		
		JLabel label_12 = new JLabel("PTCL");
		label_12.setBounds(325, 7, 24, 14);
		WashingBottle.add(label_12);
		
		JLabel label_13 = new JLabel("Admin Operations");
		label_13.setBounds(305, 32, 85, 14);
		WashingBottle.add(label_13);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(10, 57, 740, 2);
		WashingBottle.add(separator_8);
		
		JButton button_18 = new JButton("Add Employee");
		button_18.setBounds(10, 57, 101, 34);
		WashingBottle.add(button_18);
		
		JButton button_19 = new JButton("Edit Employee");
		button_19.setBounds(121, 57, 108, 34);
		WashingBottle.add(button_19);
		
		JButton button_20 = new JButton("Plantaion");
		button_20.setBounds(254, 57, 89, 34);
		WashingBottle.add(button_20);
		
		JButton button_21 = new JButton("WashingBottle");
		button_21.setBounds(357, 57, 101, 34);
		WashingBottle.add(button_21);
		
		JButton button_22 = new JButton("Media Prepartion");
		button_22.setBounds(483, 57, 122, 34);
		WashingBottle.add(button_22);
		
		JButton button_23 = new JButton("Stock Solution");
		button_23.setBounds(627, 57, 108, 34);
		WashingBottle.add(button_23);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(10, 101, 740, 2);
		WashingBottle.add(separator_9);
		
		JLabel lblWashingBottleSection = new JLabel("Washing Bottle Section");
		lblWashingBottleSection.setBounds(266, 204, 155, 27);
		WashingBottle.add(lblWashingBottleSection);
		
		final JPanel MediaPreparation = new JPanel();
		MediaPreparation.setLayout(null);
		contentPane.add(MediaPreparation, "name_5489250853905");
		
		JLabel label_16 = new JLabel("PTCL");
		label_16.setBounds(325, 7, 24, 14);
		MediaPreparation.add(label_16);
		
		JLabel label_17 = new JLabel("Admin Operations");
		label_17.setBounds(305, 32, 85, 14);
		MediaPreparation.add(label_17);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(10, 57, 740, 2);
		MediaPreparation.add(separator_10);
		
		JButton button_24 = new JButton("Add Employee");
		button_24.setBounds(10, 57, 101, 34);
		MediaPreparation.add(button_24);
		
		JButton button_25 = new JButton("Edit Employee");
		button_25.setBounds(121, 57, 108, 34);
		MediaPreparation.add(button_25);
		
		JButton button_26 = new JButton("Plantaion");
		button_26.setBounds(254, 57, 89, 34);
		MediaPreparation.add(button_26);
		
		JButton button_27 = new JButton("WashingBottle");
		button_27.setBounds(357, 57, 101, 34);
		MediaPreparation.add(button_27);
		
		JButton button_28 = new JButton("Media Prepartion");
		button_28.setBounds(483, 57, 122, 34);
		MediaPreparation.add(button_28);
		
		JButton button_29 = new JButton("Stock Solution");
		button_29.setBounds(627, 57, 108, 34);
		MediaPreparation.add(button_29);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setBounds(10, 101, 740, 2);
		MediaPreparation.add(separator_11);
		
		JLabel lblMediaPrepartion = new JLabel("Media Preparation");
		lblMediaPrepartion.setBounds(261, 181, 166, 53);
		MediaPreparation.add(lblMediaPrepartion);
		
		final JPanel StockSolution = new JPanel();
		StockSolution.setLayout(null);
		contentPane.add(StockSolution, "name_5517658465810");
		
		JLabel label_20 = new JLabel("PTCL");
		label_20.setBounds(325, 7, 76, 14);
		StockSolution.add(label_20);
		
		JLabel label_21 = new JLabel("Admin Operations");
		label_21.setBounds(305, 32, 153, 14);
		StockSolution.add(label_21);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBounds(10, 57, 740, 2);
		StockSolution.add(separator_12);
		
		JButton button_30 = new JButton("Add Employee");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_30.setBounds(10, 57, 101, 34);
		StockSolution.add(button_30);
		
		JButton button_31 = new JButton("Edit Employee");
		button_31.setBounds(121, 57, 108, 34);
		StockSolution.add(button_31);
		
		JButton button_32 = new JButton("Plantaion");
		button_32.setBounds(254, 57, 89, 34);
		StockSolution.add(button_32);
		
		JButton button_33 = new JButton("WashingBottle");
		button_33.setBounds(357, 57, 101, 34);
		StockSolution.add(button_33);
		
		JButton button_34 = new JButton("Media Prepartion");
		button_34.setBounds(483, 57, 122, 34);
		StockSolution.add(button_34);
		
		JButton button_35 = new JButton("Stock Solution");
		button_35.setBounds(627, 57, 108, 34);
		StockSolution.add(button_35);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setBounds(10, 101, 740, 2);
		StockSolution.add(separator_13);
		
		JLabel lblStockSolutionSection = new JLabel("Stock Solution Section");
		lblStockSolutionSection.setBounds(303, 199, 262, 63);
		StockSolution.add(lblStockSolutionSection);
	}
}
