package activemq_test_gr.activemq_test_art;

import java.util.concurrent.TimeUnit;

import javax.jms.JMSException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import activemq.client.JmsMessageProducer;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * 
     * @throws InterruptedException
     * @throws JMSException
     */
    public void testApp() throws InterruptedException, JMSException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "activemq/client/ApplicationContextJmsClientVm.xml");
        JmsMessageProducer jmsMessageProducer = (JmsMessageProducer) context.getBean("jmsProducer");
        jmsMessageProducer.generateMessages();
        TimeUnit.SECONDS.sleep(1);
    }
}
