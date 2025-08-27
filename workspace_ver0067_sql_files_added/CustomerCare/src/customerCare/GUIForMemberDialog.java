package customerCare;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class GUIForMemberDialog {
	
	public static Calendar cal = Calendar.getInstance();
	
	public static JDialog jDialog = new JDialog(GUIForCustomerCare.jFrame, "Customer Info Input");
	public static JDialog jDialogForAuto = new JDialog(GUIForCustomerCare.jFrame, "Automobile Info Input");
	public static JDialog jDialogForHome = new JDialog(GUIForCustomerCare.jFrame, "Home Info Input");
	public static JDialog jDialogForTravel = new JDialog(GUIForCustomerCare.jFrame, "Travel Info Input");
	public static JDialog jDialogForCommercial = new JDialog(GUIForCustomerCare.jFrame, "Commercial Info Input");
	public static JDialog jDialogUpdate = new JDialog(GUIForCustomerCare.jFrame, "Update");
	public static JDialog jDialogUpdateForAuto = new JDialog(GUIForCustomerCare.jFrame, "Automobile Update");
	public static JDialog jDialogUpdateForHome = new JDialog(GUIForCustomerCare.jFrame, "Home Update");
	public static JDialog jDialogUpdateForTravel = new JDialog(GUIForCustomerCare.jFrame, "Travel Update");
	public static JDialog jDialogUpdateForCommercial = new JDialog(GUIForCustomerCare.jFrame, "Commercial Update");
	
	public static JButton submitButton = new JButton("Register");
	public static JButton cancelButton = new JButton("Cancel");
	
	public static JPanel fieldNamePanel = new JPanel(new GridLayout(0,1));
	public static JPanel fieldValuePanel = new JPanel(new GridLayout(0,1));
	public static JPanel buttonPanel = new JPanel(new FlowLayout());
	public static JPanel buttonPanelForAuto = new JPanel(new FlowLayout());
	public static JPanel idPanel = new JPanel(new BorderLayout());
	public static JPanel idPanelForAuto = new JPanel(new BorderLayout());
	public static JPanel timeStampPanelForAuto = new JPanel(new BorderLayout());
	public static JPanel premiumPanelForAuto = new JPanel(new BorderLayout());

	public static JLabel idLabel = new JLabel("ID");
	public static JLabel lastNameLabel = new JLabel("Last Name");
	public static JLabel firstNameLabel = new JLabel("First Name");
	public static JLabel cellLabel= new JLabel("Phone #");
	public static JLabel birthDateLabel= new JLabel("Birth Date");
	public static JLabel emailLabel = new JLabel("Email");
	public static JLabel priCustIDLabel = new JLabel("Primary ID");
	public static JLabel memoLabel = new JLabel("Memo");
	public static JLabel postalCdLabel = new JLabel("Postal Code");
	public static JLabel addrStNumLabel = new JLabel("Address");
	public static JLabel addrPvNumLabel = new JLabel("City/Prov.");
	
	public static JLabel idLabelForAuto = new JLabel("ID");
	public static JLabel timeStampLabel = new JLabel("Time Stamp");
	public static JLabel txnTypeLabel = new JLabel("Txn Type");
	public static JLabel plateNoLabel = new JLabel("Plate #");
	public static JLabel docNoLabel = new JLabel("Doc #");
	public static JLabel expDatelabel = new JLabel("Expiry Date");
	public static JLabel newExpDatelabel = new JLabel("New Expiry Date");
	public static JLabel procTypeLabel = new JLabel("Proc Type");
	public static JLabel premiumLabel = new JLabel("Premium");
	public static JLabel textDateTime = new JLabel("Text Date");
	public static JLabel callDateTime = new JLabel("Call Date");
	public static JLabel visitDateTime = new JLabel("Visit Date");
	public static JLabel completeDateLabel = new JLabel("Complete Date");
	public static JLabel companyNameLabel = new JLabel("Company Name");
	public static JLabel onwerLabel = new JLabel("Owner");
	
	public static JLabel effDateLabel = new JLabel("Eff Date");
	public static JLabel sigxpNoLabel = new JLabel("Sigxp No");
	public static JLabel mailDateTimeLabel = new JLabel("Mail Date");
	public static JLabel crtDateTimeLabel = new JLabel("Crt Date Time");
	public static JLabel policyNoLabel = new JLabel("Policy #");
	
	public static JTextField idField = new JTextField(20);
	public static JTextField lastNameField = new JTextField(20);
	public static JTextField firstNameField = new JTextField(20);
	public static JTextField cellField = new JTextField(20);
	
	public static JTextField birthDateTextField = new JTextField();
	public static JTextField emailTextField = new JTextField(20);
	public static JTextField priCustIDTextField = new JTextField(20);
	public static JTextArea memoTextField = new JTextArea();
	public static JScrollPane memoTextFieldArea = new JScrollPane(memoTextField);
	public static JTextField postalCdField = new JTextField(20);
	public static JTextField addrStrtNumTextField = new JTextField(20);
	public static JTextField addrPvNumTextField = new JTextField(20);

	public static JTextField idFieldForAuto = new JTextField(20);
	public static JTextField idFieldForHome = new JTextField(20);
	public static JTextField idFieldForTravel = new JTextField(20);
	public static JTextField idFieldForCommercial = new JTextField(20);		
	public static JTextField timeStampField = new JTextField(20);
	public static String[] txnTypeStrings = {"NEW BIZ", "RENEWAL", "CHANGE", "CANCEL", "CLAIM"};
	public static String[] txnTypeStringsForAutomobile = {"NEW PLATE", "RENEWAL", "TRANSFER", "CHANGE", "CANCEL", "CLAIM", "AMEND"};
	public static JComboBox<String> txnTypeField = new JComboBox<String>(txnTypeStrings);
	public static JComboBox<String> txnTypeFieldForAuto = new JComboBox<String>(txnTypeStringsForAutomobile);
	public static JTextField plateNoField = new JTextField(20);
	public static JTextField docNoField = new JTextField(20);
	public static JTextField expDateField = new JTextField(20);
	public static JTextField newExpDateField = new JTextField(20);
	public static String[] procTypeStrings = { "READY", "ONGOING", "WAITING", "RESERVED", "COMPLETE", "SUCCESS", "FAIL", "NEXT", "OPEN", "CLOSE"};
	public static JComboBox<String> procTypeField = new JComboBox<String>(procTypeStrings);
	public static JTextField premiumField = new JTextField(20);
	public static JTextField premiumFieldForAuto = new JTextField(20);
	public static JTextField premiumFieldForHome = new JTextField(20);
	public static JTextField premiumFieldForTravel = new JTextField(20);
	public static JTextField premiumFieldForCommercial = new JTextField(20);
	public static JTextField textDateTimeField = new JTextField();
	public static JTextField callDateTimeField = new JTextField();
	public static JTextField visitDateTimeField = new JTextField();
	public static JTextField completeDateField = new JTextField();
	public static JTextField companyNameField = new JTextField();
	public static JTextField ownerField = new JTextField(20);
	
	public static JTextField effDateField = new JTextField();
	public static JTextField mailDateTimeField = new JTextField();
	public static JTextField sigxpNoField = new JTextField(20);
	public static JTextField crtDateTimeField = new JTextField();
	public static JTextField policyNoField = new JTextField();
	
	private static String currentDate = "currentDate";
	private static String expDate = "expDate";
	
	public GUIForMemberDialog() {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		
		effDateField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.META_DOWN_MASK), currentDate);
		effDateField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.META_DOWN_MASK), expDate);
		
		mailDateTimeField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.META_DOWN_MASK), currentDate);
		mailDateTimeField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.META_DOWN_MASK), expDate);
		
		crtDateTimeField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.META_DOWN_MASK), currentDate);
		crtDateTimeField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.META_DOWN_MASK), expDate);
		
		textDateTimeField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.META_DOWN_MASK), currentDate);
		textDateTimeField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.META_DOWN_MASK), expDate);
		
		callDateTimeField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.META_DOWN_MASK), currentDate);
		callDateTimeField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.META_DOWN_MASK), expDate);
		
		visitDateTimeField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.META_DOWN_MASK), currentDate);
		visitDateTimeField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.META_DOWN_MASK), expDate);
		
		completeDateField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.META_DOWN_MASK), currentDate);
		completeDateField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.META_DOWN_MASK), expDate);
		
		expDateField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.META_DOWN_MASK), currentDate);
		expDateField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.META_DOWN_MASK), expDate);
		
		newExpDateField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.META_DOWN_MASK), currentDate);
		newExpDateField.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.META_DOWN_MASK), expDate);
		
		effDateField.getActionMap().put(currentDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	System.out.println("hello1");
		   		effDateField.setText(dateFormat.format(date));
	        }
	    });
		
		effDateField.getActionMap().put(expDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	System.out.println("hello1");
		   		effDateField.setText(expDateField.getText());
	        }
	    });
		mailDateTimeField.getActionMap().put(currentDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	mailDateTimeField.setText(dateFormat.format(date));
	        }
	    });
		mailDateTimeField.getActionMap().put(expDate,   new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	mailDateTimeField.setText(expDateField.getText());
	        }
	    });
		crtDateTimeField.getActionMap().put(currentDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	crtDateTimeField.setText(dateFormat.format(date));
	        }
	    });
		crtDateTimeField.getActionMap().put(expDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	crtDateTimeField.setText(expDateField.getText());
	        }
	    });
		textDateTimeField.getActionMap().put(currentDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	textDateTimeField.setText(dateFormat.format(date));
	        }
	    });
		textDateTimeField.getActionMap().put(expDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	textDateTimeField.setText(expDateField.getText());
	        }
	    });
		callDateTimeField.getActionMap().put(currentDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	callDateTimeField.setText(dateFormat.format(date));
	        }
	    });
		callDateTimeField.getActionMap().put(expDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	callDateTimeField.setText(expDateField.getText());
	        }
	    });
		visitDateTimeField.getActionMap().put(currentDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	visitDateTimeField.setText(dateFormat.format(date));
	        }
	    });
		visitDateTimeField.getActionMap().put(expDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	visitDateTimeField.setText(expDateField.getText());
	        }
	    });
		completeDateField.getActionMap().put(currentDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	completeDateField.setText(dateFormat.format(date));
	        }
	    });
		completeDateField.getActionMap().put(expDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	completeDateField.setText(expDateField.getText());
	        }
	    });
		expDateField.getActionMap().put(currentDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	expDateField.setText(dateFormat.format(date));
	        }
	    });
		expDateField.getActionMap().put(expDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	expDateField.setText(expDateField.getText());
	        }
	    });
		newExpDateField.getActionMap().put(currentDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	newExpDateField.setText(dateFormat.format(date));
	        }
	    });
		newExpDateField.getActionMap().put(expDate, new AbstractAction() {
	        public void actionPerformed(ActionEvent e) {
	        	newExpDateField.setText(expDateField.getText());
	        }
	    });
	}
}
