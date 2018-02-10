

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class page_3a_gg extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_3a_gg frame = new page_3a_gg();
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
	public page_3a_gg() {
		setType(Type.POPUP);
		setBackground(Color.WHITE);
		setTitle("Newlife hospital");
		setIconImage(Toolkit.getDefaultToolkit().getImage(page_3a_gg.class.getResource("/image/hospital-icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 458);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(177, 14, 349, 398);
		contentPane.add(panel_2);
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setLayout(null);
		
		JLabel lblRegistrationNumber = new JLabel("Registration Number:");
		lblRegistrationNumber.setBounds(20, 35, 126, 14);
		lblRegistrationNumber.setFont(new Font("Dialog", Font.BOLD, 11));
		lblRegistrationNumber.setForeground(Color.WHITE);
		panel_2.add(lblRegistrationNumber);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 52, 149, 22);
		panel_2.add(textArea);
		
		JLabel lblAddPatient = new JLabel("Update Receptionist");
		lblAddPatient.setBounds(10, -1, 331, 36);
		lblAddPatient.setIcon(new ImageIcon(page_3a_gg.class.getResource("/image/receptionist-icon.png")));
		lblAddPatient.setBackground(Color.GRAY);
		lblAddPatient.setForeground(Color.LIGHT_GRAY);
		lblAddPatient.setFont(new Font("Rainbow Bridge Personal Use", Font.PLAIN, 25));
		lblAddPatient.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblAddPatient);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(20, 76, 116, 14);
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_2.add(lblName);
		
		JLabel lblAddressLine = new JLabel("Address :");
		lblAddressLine.setBounds(20, 121, 116, 14);
		lblAddressLine.setForeground(Color.WHITE);
		lblAddressLine.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_2.add(lblAddressLine);
		
		JLabel lblAddressLine_1 = new JLabel("Qualification :");
		lblAddressLine_1.setBounds(20, 168, 116, 14);
		lblAddressLine_1.setForeground(Color.WHITE);
		lblAddressLine_1.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_2.add(lblAddressLine_1);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setBounds(20, 308, 116, 14);
		lblSex.setForeground(Color.WHITE);
		lblSex.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_2.add(lblSex);
		
		JLabel lblDateOfBirth = new JLabel("Phone No.  :");
		lblDateOfBirth.setBounds(20, 216, 116, 14);
		lblDateOfBirth.setForeground(Color.WHITE);
		lblDateOfBirth.setFont(new Font("Dialog", Font.BOLD, 11));
		panel_2.add(lblDateOfBirth);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(20, 95, 321, 22);
		panel_2.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(20, 143, 321, 22);
		panel_2.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(20, 190, 321, 22);
		panel_2.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(20, 240, 321, 22);
		panel_2.add(textArea_4);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(220, 20, 60));
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		btnSubmit.setBounds(64, 359, 223, 27);
		panel_2.add(btnSubmit);
		
		JLabel label = new JLabel("Date of Birth:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD, 11));
		label.setBounds(192, 308, 116, 14);
		panel_2.add(label);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(192, 330, 149, 22);
		panel_2.add(textArea_6);
		
		JLabel lblEmailId = new JLabel("E-mail ID :");
		lblEmailId.setForeground(Color.WHITE);
		lblEmailId.setFont(new Font("Dialog", Font.BOLD, 11));
		lblEmailId.setBounds(20, 263, 116, 14);
		panel_2.add(lblEmailId);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBounds(20, 281, 321, 22);
		panel_2.add(textArea_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		comboBox.setBounds(20, 326, 160, 25);
		panel_2.add(comboBox);
		
		JButton button_1 = new JButton("Search");
		button_1.setIcon(new ImageIcon(page_3a_gg.class.getResource("/image/search-red-icon.png")));
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(220, 20, 60));
		button_1.setBounds(186, 52, 136, 23);
		panel_2.add(button_1);
		
		Panel panel = new Panel();
		panel.setBounds(0, 178, 721, 241);
		panel.setBackground(new Color(220, 20, 60));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("Back");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(220, 20, 60));
		button.setIcon(new ImageIcon(page_3a_gg.class.getResource("/image/arrow-back-1-icon.png")));
		button.setBounds(584, 171, 125, 58);
		panel.add(button);
	}
}
