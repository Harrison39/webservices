package com.customer.service.processor;

import java.util.HashMap;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.customer.service.types.v1.UpdateCustomerRequest;


public class UpdateCustomerRequestProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        UpdateCustomerRequest request = exchange.getIn().getBody(UpdateCustomerRequest.class);

        Map<String, Object> sqlParameters = new HashMap<>();
        sqlParameters.put("customerName", request.getCustomerName());
        sqlParameters.put("customerPhoneNumber", request.getCustomerPhoneNumber());
        sqlParameters.put("customerCity", request.getCustomerCity());
        sqlParameters.put("customerAge", request.getCustomerAge());
        sqlParameters.put("customerID", request.getCustomerID());

        exchange.getOut().setBody(sqlParameters);
    }
}
