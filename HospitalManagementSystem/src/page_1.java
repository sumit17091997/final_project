

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
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.SystemColor;

public class page_1 extends JFrame {

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
					page_1 frame = new page_1();
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
	public page_1() {
		setType(Type.POPUP);
		setBackground(Color.WHITE);
		setTitle("Newlife hospital");
		setIconImage(Toolkit.getDefaultToolkit().getImage(page_1.class.getResource("/image/hospital-icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 458);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(372, 0, 349, 419);
		contentPane.add(panel_2);
		panel_2.setBackground(UIManager.getColor("FormattedTextField.caretForeground"));
		panel_2.setLayout(null);
		
		JButton btnSubmit = new JButton("Proceed");
		btnSubmit.setBackground(new Color(220, 20, 60));
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		btnSubmit.setBounds(63, 360, 223, 27);
		panel_2.add(btnSubmit);
		
		JLabel lblUserRole = new JLabel("User Role ");
		lblUserRole.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserRole.setForeground(Color.LIGHT_GRAY);
		lblUserRole.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblUserRole.setBounds(88, 61, 174, 24);
		panel_2.add(lblUserRole);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Accountant", "Doctor", "Nurse", "Receptionist"}));
		comboBox.setToolTipText("");
		comboBox.setForeground(SystemColor.inactiveCaption);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setBackground(SystemColor.controlDkShadow);
		comboBox.setBounds(74, 140, 198, 27);
		panel_2.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(98, 98, 155, 14);
		panel_2.add(separator);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(page_1.class.getResource("/image/Backround.jpg")));
		label.setBounds(0, 0, 372, 419);
		contentPane.add(label);
	}
}
