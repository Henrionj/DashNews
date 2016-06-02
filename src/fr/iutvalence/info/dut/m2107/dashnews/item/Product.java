package fr.iutvalence.info.dut.m2107.dashnews.item;

/**
 * 
 * @author IT Prouds & CO.
 *
 */
public class Product {
	/**
	 * Product name.
	 */
	private String nameProduct;
	/**
	 * Product price.
	 */
	private double priceProduct;

	/**
	 * Product constructor.
	 * 
	 * @param name
	 * @param price
	 */
	public Product(String name, double price) {
		this.nameProduct = name;
		this.priceProduct = price;
	}

	/**
	 *
	 * @return product name.
	 */
	public String getNameProduct() {
		return this.nameProduct;
	}

	/**
	 * 
	 * @return product price.
	 */
	public double getPriceProduct() {
		return this.priceProduct;
	}

	/**
	 * Change the product price.
	 * 
	 * @param priceProduct
	 */
	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}

}
