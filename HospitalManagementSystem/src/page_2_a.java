

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
import javax.swing.JTextField;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.SystemColor;

public class page_2_a extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEnter;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page_2_a frame = new page_2_a();
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
	public page_2_a() {
		setType(Type.POPUP);
		setBackground(Color.WHITE);
		setTitle("Newlife hospital");
		setIconImage(Toolkit.getDefaultToolkit().getImage(page_2_a.class.getResource("/image/hospital-icon.png")));
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
		
		JButton btnSubmit = new JButton("Login");
		btnSubmit.setIcon(new ImageIcon(page_2_a.class.getResource("/image/keyring-icon.png")));
		btnSubmit.setBackground(new Color(220, 20, 60));
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		btnSubmit.setBounds(64, 304, 223, 27);
		panel_2.add(btnSubmit);
		
		JLabel lblUserName = new JLabel("User Name :");
		lblUserName.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		lblUserName.setForeground(Color.LIGHT_GRAY);
		lblUserName.setBounds(44, 57, 125, 27);
		panel_2.add(lblUserName);
		
		txtEnter = new JTextField();
		txtEnter.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtEnter.setForeground(Color.DARK_GRAY);
		txtEnter.setBackground(Color.WHITE);
		txtEnter.setBounds(44, 96, 243, 27);
		panel_2.add(txtEnter);
		txtEnter.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(UIManager.getColor("EditorPane.background"));
		textField_1.setBackground(Color.WHITE);
		textField_1.setColumns(10);
		textField_1.setBounds(44, 197, 243, 27);
		panel_2.add(textField_1);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.LIGHT_GRAY);
		lblPassword.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		lblPassword.setBounds(44, 158, 110, 27);
		panel_2.add(lblPassword);
		panel_2.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtEnter, btnSubmit, lblUserName, textField_1, lblPassword}));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(page_2_a.class.getResource("/image/Backround.jpg")));
		label.setBounds(0, 0, 372, 419);
		contentPane.add(label);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel_2, lblPassword, contentPane, btnSubmit, lblUserName, txtEnter, textField_1, label}));
	}
}
