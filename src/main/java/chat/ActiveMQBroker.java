package chat;

import org.apache.activemq.broker.BrokerService;

public class ActiveMQBroker {

	public static void main(String[] args) {
		try {

			BrokerService brokerService = new BrokerService();
			brokerService.setPersistent(false);
			brokerService.addConnector("tcp://localhost:61616");
			brokerService.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
