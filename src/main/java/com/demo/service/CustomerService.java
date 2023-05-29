package com.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.demo.model.Customer;
import com.demo.util.KafkaConstants;

/**
 * This class is used to perform business operation
 * 
 * @author Motilal Kumar.
 *
 */

@Service("customerService")
public class CustomerService {

	/**
	 * This method is used to consumer messages from kafka topic
	 * 
	 * @param c
	 * @return
	 */
	@KafkaListener(topics = KafkaConstants.TOPIC, groupId = KafkaConstants.GROUP_ID)
	public Customer listener(Customer c) {
		System.out.println("***Msg recieved from Kafka Topic ::" + c);
		return c;
	}

}
