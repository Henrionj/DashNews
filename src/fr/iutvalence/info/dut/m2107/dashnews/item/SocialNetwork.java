package fr.iutvalence.info.dut.m2107.dashnews.item;


/**
 * Class SocialNetwork
 * @author  IT Prouds & CO.
 *
 */
public class SocialNetwork extends Information {
 
	/**
	 * SocialNetwork's default length
	 */
	private static final int DEFAULT_LENGTH = 50;
	
	/**
	 * SocialNetwork's default height
	 */
	private static final int DEFAULT_HEIGHT = 100;
	
	/**
	 * Initializes social network item with a size
	 * @param length The length of social network item.
	 * @param height The height of social network item. 
	 */
	public SocialNetwork(int length,int height) {
		super(length,height);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Display informations about the chosen social network.
	 */
	public void displayNetwork() {

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualize() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static int getDefaultLength() {
		return DEFAULT_LENGTH;
	}

	public static int getDefaultHeight() {
		return DEFAULT_HEIGHT;
	}


}
