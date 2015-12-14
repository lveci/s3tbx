/*
 * $Id: AuxFileTest.java,v 1.1 2007/03/27 12:51:41 marcoz Exp $
 *
 * Copyright (c) 2003 Brockmann Consult GmbH. All right reserved.
 * http://www.brockmann-consult.de
 */
package org.esa.s3tbx.meris.l2auxdata;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AuxFileTest extends TestCase {

    public static final String CASE1_TEST_FILE = "case1/case1.60.04.prd";
    public static final String CASE2_TEST_FILE = "case2/case2.42.00.prd";

    public AuxFileTest(String s) {
        super(s);
    }

    public static Test suite() {
        return new TestSuite(AuxFileTest.class);
    }

    // todo: all tests currently disabled. Reactivate when auxiliary data setup is clarified.
    public void testNothing() {
        assertNull(null);
    }

//    public void testConstructor() {
//        final AuxFileInfo fileInfo = AuxDatabase.getInstance().getFileInfo('Z');
//        final AuxFile auxFile = new AuxFile(fileInfo, new File("./unknown.prd"));
//        assertEquals(new File("./unknown.prd"), auxFile.getFile());
//        assertEquals(false, auxFile.isOpen());
//        assertEquals(null, auxFile.getInputStream());
//    }
//
//    public void testOpenWithInvalidFile() {
//        final AuxFileInfo fileInfo = AuxDatabase.getInstance().getFileInfo('Z');
//        final AuxFile auxFile = new AuxFile(fileInfo, new File("./unknown.prd"));
//        try {
//            auxFile.open();
//            fail("IOException expected");
//        } catch (IOException e) {
//            assertEquals(false, auxFile.isOpen());
//        }
//    }
//
//    public void testCloseWithoutOpen() {
//        final AuxFileInfo fileInfo = AuxDatabase.getInstance().getFileInfo('Z');
//        final AuxFile auxFile = new AuxFile(fileInfo, new File("./unknown.prd"));
//        auxFile.close();
//    }
}
