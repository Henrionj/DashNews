package fr.iutvalence.info.dut.m2107.dashnews.junittest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import fr.iutvalence.info.dut.m2107.dashnews.ihm.Ihm;

/**
 * 
 * @author IT Prouds & CO.
 *
 */
public class IhmTest extends TestCase {

	public IhmTest(String name) {
		super(name);
	}

	public void testCreation() {
		Ihm ihm = new Ihm();

		assertEquals(ihm.getHeight(), 600);
		assertEquals(ihm.getWidth(), 800);
		assertEquals(ihm.getTitle(), "DashNews");
		assertEquals(ihm.isResizable(), false);
		assertEquals(ihm.isVisible(), true);
		assertEquals(ihm.hasFocus(), false);
	}

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(new IhmTest("testCreation"));
		return suite;
	}
}
