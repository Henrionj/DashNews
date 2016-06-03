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
	}

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(new IhmTest("CreationTest"));
		return suite;
	}
}
