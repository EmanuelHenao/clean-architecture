package com.cleanarchitecture.cleanarchitecture.operation;

import com.cleanarchitecture.cleanarchitecture.model.HelloRs;
import com.cleanarchitecture.cleanarchitecture.wrappers.ConsumerRequest;
import com.cleanarchitecture.cleanarchitecture.wrappers.ConsumerResponse;
import com.cleanarchitecture.cleanarchitecture.wrappers.IOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetHelloOperation implements IOperation<ConsumerRequest<Void>, ConsumerResponse<HelloRs>> {

    @Override
    public ConsumerResponse<HelloRs> handle(ConsumerRequest<Void> consumerRequest) {

        HelloRs response = HelloRs.builder()
                .message("Hello Word")
                .build();


        return ConsumerResponse.<HelloRs>builder()
                .data(response)
                .httpStatus(HttpStatus.OK)
                .build();
    }
}
