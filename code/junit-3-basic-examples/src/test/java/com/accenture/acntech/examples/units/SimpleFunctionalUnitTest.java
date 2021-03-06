package com.accenture.acntech.examples.units;

import junit.framework.TestCase;

/**
 * Test case for the {@link SimpleFunctionalUnit} class.
 * <p/>
 * <ul>
 * <li>Must extend {@link TestCase}</li>
 * <li>Should be named the same as the class under test, with "Test" appended at the end</li>
 * <li>Should have the same package name as the class under test</li>
 * </ul>
 */
public class SimpleFunctionalUnitTest extends TestCase {

    private SimpleFunctionalUnit sfu;

    /**
     * Test case set-up method.
     * <p/>
     * This method is invoked before each of the test methods of this test case.
     * <p/>
     * <ul>
     * <li>Should contain common scaffolding needed to run tests</li>
     * <li>Extensive scaffolding is a sign of too monolithic production code</li>
     * </ul>
     *
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        sfu = new SimpleFunctionalUnit();
    }

    /**
     * Test case tear-down method.
     * <p/>
     * This method is invoked after each of the test methods of this test case.
     * <p/>
     * <ul>
     * <li>Should remove any persistent scaffolding created for the tests</li>
     * </ul>
     *
     * @throws Exception
     */
    @Override
    protected void tearDown() throws Exception {
        sfu = null;
    }

    /**
     * Test method.
     * <p/>
     * <ul>
     * <li>Name should always start with "test"</li>
     * <li>Name should be descriptive and hint to what the test does</li>
     * <li>Should test only one condition per test method</li>
     * <li>Should assert values that are affected by the condition under test</li>
     * </ul>
     */
    public void testNameIsNull() {
        assertNull("Greeting should be null", sfu.getGreeting(null));
    }

    public void testNameIsEmptyString() {
        assertNull("Greeting should be null", sfu.getGreeting(""));
    }

    public void testNameIsWhitespaceString() {
        assertNull("Greeting should be null", sfu.getGreeting("   "));
    }

    public void testNameIsSet() {
        String greeting = sfu.getGreeting("Foo");

        assertNotNull("Greeting should not be null", greeting);
        assertEquals("Greeting should be equal", "Hello Foo!", greeting);
    }
}
