package com.customer.service.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.customer.service.types.v1.UpdateCustomerResponse;


public class UpdateCustomerResponseProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        int rowUpdated = exchange.getIn().getHeader("CamelSqlUpdateCount", Integer.class);
        UpdateCustomerResponse response = new UpdateCustomerResponse();
        if (rowUpdated > 0) {
            response.setStatus("Successfully updated");
        } else {
            response.setStatus("Customer Not found");
        }
        exchange.getOut().setBody(response);
    }

}
