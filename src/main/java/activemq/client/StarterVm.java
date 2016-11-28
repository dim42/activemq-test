package activemq.client;

import java.util.concurrent.TimeUnit;

import javax.jms.JMSException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StarterVm {
    public static void main(String[] args) throws JMSException, InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "activemq/client/ApplicationContextJmsClientVm.xml");
        JmsMessageProducer jmsMessageProducer = (JmsMessageProducer) context.getBean("jmsProducer");
        jmsMessageProducer.generateMessages();
        TimeUnit.SECONDS.sleep(1);
        System.exit(0);
    }
}