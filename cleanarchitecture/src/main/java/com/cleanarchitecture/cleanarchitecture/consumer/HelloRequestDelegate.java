package com.cleanarchitecture.cleanarchitecture.consumer;

import com.cleanarchitecture.cleanarchitecture.model.HelloRs;
import com.cleanarchitecture.cleanarchitecture.wrappers.ConsumerRequest;
import com.cleanarchitecture.cleanarchitecture.wrappers.ConsumerResponse;
import com.cleanarchitecture.cleanarchitecture.wrappers.IOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class HelloRequestDelegate {

    @Autowired
    @Qualifier("getHelloOperation")
    private IOperation<ConsumerRequest<Void>, ConsumerResponse<HelloRs>> getHelloOperation;

    public ResponseEntity<ConsumerResponse<HelloRs>> getHello(ConsumerRequest<Void> consumerRequest) {

        return getHelloOperation.handle(consumerRequest).entity();
    }

}
