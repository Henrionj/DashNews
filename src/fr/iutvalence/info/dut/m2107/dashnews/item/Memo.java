package fr.iutvalence.info.dut.m2107.dashnews.item;

public class Memo extends Item {
 
	private String text;

	/**
	 * @param size
	 */
	public Memo(int size) {
		super(size);
		this.text = "Cliquez ici pour écrire";
	}
	public Memo(int size, String text)
	{
		super(size);
		this.text = text;
		System.out.println(text+"\n"+getDateAjout());
	}

}