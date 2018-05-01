package com.customer.service.processor;

import java.util.HashMap;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.customer.service.types.v1.DeleteCustomerRequest;


public class DeleteCustomerRequestProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        DeleteCustomerRequest request = exchange.getIn().getBody(DeleteCustomerRequest.class);
        int customerId = request.getCustomerID();

        Map<String, Object> map = new HashMap<>();
        map.put("customerID", customerId);

        exchange.getOut().setBody(map);

    }

}
