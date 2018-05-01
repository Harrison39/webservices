package com.customer.service.processor;

import java.math.BigInteger;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.customer.service.types.v1.CreateCustomerResponse;


public class CustomerResponseProcessor implements Processor {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerResponseProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        CreateCustomerResponse response = new CreateCustomerResponse();
        Map<String, Object> parameters = exchange.getProperty("sqlParameters", Map.class);
        response.setCustomerID(BigInteger.valueOf((int) parameters.get("customerID")));
        exchange.getOut().setBody(response);
    }

}
