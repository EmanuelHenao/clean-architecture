package com.cleanarchitecture.cleanarchitecture.consumer;

import com.cleanarchitecture.cleanarchitecture.model.HelloRs;
import com.cleanarchitecture.cleanarchitecture.wrappers.ConsumerRequest;
import com.cleanarchitecture.cleanarchitecture.wrappers.ConsumerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("${base-path:/api/v1/}")
@RequiredArgsConstructor
public class HelloController implements IHelloControllerInterface {

    private HelloRequestDelegate requestDelegate;

    @Override
    public ResponseEntity<ConsumerResponse<HelloRs>> getHello() {

        ConsumerRequest<Void> consumerRequest = getHelloPrepareRequest();

        return requestDelegate.getHello(consumerRequest);

    }

    private ConsumerRequest<Void> getHelloPrepareRequest() {

        Map<String, Object> headerParams = new HashMap<>();
        Map<String, Object> pathParams = new HashMap<>();
        Map<String, Object> queryParams = new HashMap<>();

        return ConsumerRequest.<Void>builder()
                .headerParams(headerParams)
                .pathParams(pathParams)
                .queryParams(queryParams)
                .build();
    }
}
