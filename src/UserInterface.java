
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * @author Kacper Woloszyn
 */
public class UserInterface implements ActionListener    // interface which listens for key presses by user
{
	private Tree tree;
	private JFrame frame;       // frame of window
	private JTextArea visualDisplay;  // the text area for all text display

	/**
	 * Create a user interface for a given family tree program.
	 */
	public UserInterface(Tree tree)
	{
		this.tree =tree;
		makeFrame();    //call to method which creates the window
		frame.setVisible(true);    //display window created
	}
	/**
	 * Make this interface visible again. (Has no effect if it is already
	 * visible.)
	 */
	public void setVisible(boolean visible)
	{
		frame.setVisible(visible);
	}

	// getters and setters for visual display
	public JTextArea getVisualDisplay() {
		return visualDisplay;
	}
	public void setVisualDisplay(JTextArea visualDisplay) {
		this.visualDisplay = visualDisplay;
	}
	
	/**
	 * Make the frame for the user interface.
	 */
	private void makeFrame()
	{
		frame = new JFrame("Family Tree");    // initialise frame 
// OVERALL FRAME
		JPanel contentPane = (JPanel)frame.getContentPane();
		contentPane.setPreferredSize(new Dimension(800,750));    //set sizes
		contentPane.setLayout(new BorderLayout(8, 8));
		contentPane.setBorder(new EmptyBorder( 10, 10, 10, 10));
		
		// DIfferent scenes or panels in this case, tried swapping around for visuals but this looks the best, done based on the calculator lab.
		JPanel panel1 = new JPanel();    // display panel
		Border blackline = BorderFactory.createLineBorder(Color.black);   // black border for panel
		TitledBorder title = BorderFactory.createTitledBorder(blackline, "FAMILY TREE "); //titled border created  with the black line border
		panel1.setBorder(title);  //set this border on the panel
		title.setTitleJustification(TitledBorder.CENTER);  //title in center of border

		visualDisplay = new JTextArea();    // text area for text display
		visualDisplay.setEditable(false);  //cannot type here
		JScrollPane scrollPane=new JScrollPane(visualDisplay);  //add scroll function to area if text is long
		scrollPane.setPreferredSize( new Dimension( 750, 400 ) );   // text field size
		panel1.add(scrollPane);
		contentPane.add(panel1, BorderLayout.NORTH);

	
		JPanel panel2 = new JPanel(new GridLayout(2,3));    // button options for family tree displays
		TitledBorder title2 = BorderFactory.createTitledBorder(blackline, "FAMILY TREE OPTIONS"); //titled border created  with the black line border
		title2.setTitleJustification(TitledBorder.CENTER);  //title in center of border
		panel2.setBorder(title2);  //set this border on the translation panel
		
		addButton(panel2,"Add Child");
		addButton(panel2,"Add Spouse");
		addButton(panel2,"Get Details");
		addButton(panel2,"Display Trees");
		addButton(panel2,"Delete Member");
		addButton(panel2,"Modify Details");
		contentPane.add(panel2, BorderLayout.CENTER);


		JPanel panel3 = new JPanel(new GridLayout(1,3));    // program options panel
		TitledBorder title3 = BorderFactory.createTitledBorder(blackline, " GENERIC OPTIONS"); //titled border created  with the black line border
		title3.setTitleJustification(TitledBorder.CENTER);  //title in center of border
		panel3.setBorder(title3);  //set this border on the panel
		
		addButton(panel3,"Reload");
		addButton(panel3,"Save");
		addButton(panel3,"Exit");
		
		contentPane.add(panel3, BorderLayout.SOUTH);
		
		frame.pack();

	}

	/**
	 * Add a button to the button panel.
	 */
	private void addButton(Container panel, String buttonText)
	{
		JButton button = new JButton(buttonText);
		button.addActionListener(this);
		panel.add(button);
	}

	/**
	 * An interface action has been performed. Find out what it was and
	 * handle it.
	 */
	
	public void actionPerformed(ActionEvent event) 
	{
		// since the ui does not do any actions I decided to stop coding this part.
		/**
		String command = event.getActionCommand();
		
		if(command=="Display Trees"){
		
		}
		
		if(command=="Save"){
			
		}
		
		if(command=="Reload"){  // reload from xml
			
		}
		
		if(command=="Exit"){
			System.exit(0);  //exits whole program
		}
		
		if(command=="Add Child"){
		 addChild();
		}
		
		if(command=="Get Details"){
			getDetails();
		}
		
		if(command=="Modify Details"){
			modifyDetails(String membersDetails);
		}
		
		if(command=="Add Spouse"){
			addSpouse();
		}
		
		if(command=="Delete Person"){
			deletePerson(JOptionPane.showInputDialog(frame,"Please enter the person to delete:"));
			*/
		}
		

	private void addChild() {
		// TODO Auto-generated method stub
		
	}
	private void getDetails(String membersDetails) {
		// TODO Auto-generated method stub
		
	}
	private void modifyDetails() {
		// TODO Auto-generated method stub
		
	}
	private void addSpouse() {
		// TODO Auto-generated method stub
		
	}
	private void deletePerson(String showInputDialog) {
		// TODO Auto-generated method stub
		
	}
}