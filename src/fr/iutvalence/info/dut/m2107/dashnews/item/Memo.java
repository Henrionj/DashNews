package fr.iutvalence.info.dut.m2107.dashnews.item;


/**
 * Class Memo.
 * @author  IT Prouds & CO.
 *
 */
public class Memo extends Item {
 
	/**
	 * Memo's default length
	 */
	private static final int DEFAULT_LENGTH = 50;
	
	/**
	 * Memo's default height
	 */
	private static final int DEFAULT_HEIGHT = 75;
	

	/**
	 * Message in the memo.
	 */
	private String text;

	/**
	 * Creates a new memo with a size.
	 * @param length The length of the memo.
	 * @param height The height of the memo.
	 */
	public Memo(int length, int height) {
		super(length,height);

		this.text = "Click here to write";
		this.text = "Clic here to write";
	}
	
	/**
	 * Creates a new memo with a message and a size.
	 * @param size The size of the new memo.
	 * @param text The message of the new memo.
	 */
	public Memo(int length, int height, String text)
	{
		super(length,height);
		this.text = text;
		System.out.println(text+"\n"+getDateAjout());
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
