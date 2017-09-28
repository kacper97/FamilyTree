
public class Tree {

	private static UserInterface userIntf;
	private static Tree tree;

	/*
	 * Main method to run, sets up the user interface and loads data
	 */
	public static void main(String[] args) throws Exception {
	// this method would load the data and call the load method	tree.load("large-database.txt");    // load this text file of data
		userIntf=new UserInterface(tree);	
	}
		
	public static void load(String string) {
		// TODO Auto-generated method stub
		
	}

	public void write() {
		// TODO Auto-generated method stub
		
	}

	public String displayTrees() {
		// TODO Auto-generated method stub
		return null;
	}

}
