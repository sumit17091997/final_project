

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

public class page_3a extends JFrame {

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
					page_3a frame = new page_3a();
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
	public page_3a() {
		setType(Type.POPUP);
		setBackground(Color.WHITE);
		setTitle("Newlife hospital");
		setIconImage(Toolkit.getDefaultToolkit().getImage(page_3a.class.getResource("/image/HealthResearch.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 458);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(0, 0, 349, 419);
		contentPane.add(panel_2);
		panel_2.setBackground(UIManager.getColor("FormattedTextField.caretForeground"));
		panel_2.setLayout(null);
		
		JButton btnSubmit = new JButton("Add Doctor");
		btnSubmit.setBackground(new Color(220, 20, 60));
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		btnSubmit.setBounds(64, 336, 223, 27);
		panel_2.add(btnSubmit);
		
		JButton btnShowPatient = new JButton("Show Patient");
		btnShowPatient.setForeground(Color.WHITE);
		btnShowPatient.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		btnShowPatient.setBackground(new Color(220, 20, 60));
		btnShowPatient.setBounds(64, 16, 223, 27);
		panel_2.add(btnShowPatient);
		
		JButton btnAddNurse = new JButton("Add Nurse");
		btnAddNurse.setForeground(Color.WHITE);
		btnAddNurse.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		btnAddNurse.setBackground(new Color(220, 20, 60));
		btnAddNurse.setBounds(64, 65, 223, 27);
		panel_2.add(btnAddNurse);
		
		JButton btnUpdateNurse = new JButton("Update Nurse");
		btnUpdateNurse.setForeground(Color.WHITE);
		btnUpdateNurse.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		btnUpdateNurse.setBackground(new Color(220, 20, 60));
		btnUpdateNurse.setBounds(64, 103, 223, 27);
		panel_2.add(btnUpdateNurse);
		
		JButton btnAddAccountant = new JButton("Add Accountant");
		btnAddAccountant.setForeground(Color.WHITE);
		btnAddAccountant.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		btnAddAccountant.setBackground(new Color(220, 20, 60));
		btnAddAccountant.setBounds(64, 153, 223, 27);
		panel_2.add(btnAddAccountant);
		
		JButton btnUpdateAccountant = new JButton("Update Accountant");
		btnUpdateAccountant.setForeground(Color.WHITE);
		btnUpdateAccountant.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		btnUpdateAccountant.setBackground(new Color(220, 20, 60));
		btnUpdateAccountant.setBounds(64, 191, 223, 27);
		panel_2.add(btnUpdateAccountant);
		
		JButton btnAddReceptionist = new JButton("Add Receptionist");
		btnAddReceptionist.setForeground(Color.WHITE);
		btnAddReceptionist.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		btnAddReceptionist.setBackground(new Color(220, 20, 60));
		btnAddReceptionist.setBounds(64, 245, 223, 27);
		panel_2.add(btnAddReceptionist);
		
		JButton btnUpdateReceptionist = new JButton("Update receptionist");
		btnUpdateReceptionist.setForeground(Color.WHITE);
		btnUpdateReceptionist.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		btnUpdateReceptionist.setBackground(new Color(220, 20, 60));
		btnUpdateReceptionist.setBounds(64, 284, 223, 27);
		panel_2.add(btnUpdateReceptionist);
		
		JButton btnUpdateDoctor = new JButton("Update Doctor");
		btnUpdateDoctor.setForeground(Color.WHITE);
		btnUpdateDoctor.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 13));
		btnUpdateDoctor.setBackground(new Color(220, 20, 60));
		btnUpdateDoctor.setBounds(64, 374, 223, 27);
		panel_2.add(btnUpdateDoctor);
		panel_2.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnSubmit}));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(page_3a.class.getResource("/image/Backround copy 1.jpg")));
		lblNewLabel.setBounds(342, 0, 379, 419);
		contentPane.add(lblNewLabel);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel_2, contentPane, btnSubmit}));
	}
}
