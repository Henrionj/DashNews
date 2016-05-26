package fr.iutvalence.info.dut.m2107.dashnews.item;

/**
 * Class Memo.
 * @author  IT Prouds & CO.
 *
 */
public class Memo extends Item {
 
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
		super();
		this.text = "Clic here to write";
	}
	
	/**
	 * Creates a new memo with a message and a size.
	 * @param size The size of the new memo.
	 * @param text The message of the new memo.
	 */
	public Memo(int length, int height, String text)
	{
		super();
		this.text = text;
		System.out.println(text+"\n"+getDateAjout());
	}

}
