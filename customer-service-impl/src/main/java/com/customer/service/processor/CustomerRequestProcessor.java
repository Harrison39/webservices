package com.customer.service.processor;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.customer.service.types.v1.CreateCustomerRequest;

public class CustomerRequestProcessor implements Processor {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRequestProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        CreateCustomerRequest request = exchange.getIn().getBody(CreateCustomerRequest.class);
        
        Map<String,Object> parameters = new HashMap<>();
        parameters.put("customerName", request.getCustomerName());
        parameters.put("customerCity", request.getCustomerCity());
        parameters.put("customerPhoneNumber", request.getCustomerPhoneNumber());
        parameters.put("customerAge", request.getCustomerAge());
        
        exchange.setProperty("sqlParameters", parameters);
    }
    
    public void getCustomerID(Exchange exchange){
        List list = exchange.getIn().getBody(List.class);
        Map map = (Map)list.get(0);
        Integer customerID = ((BigDecimal)map.get("NEXTVAL")).intValue();
        Map<String,Object> parameters = exchange.getProperty("sqlParameters",Map.class);
        parameters.put("customerID", customerID);
        exchange.getOut().setBody(parameters);
    }
    
}

