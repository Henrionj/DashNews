package fr.iutvalence.info.dut.m2107.dashnews.junittest;

/**
 * @author IT Prouds & CO.
 *
 */
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(IhmTest.suite());

		return suite;
	}

	// public static void main(String[] args) {
	// junit.textui.TestRunner.run(suite());
	//
}