package com.cleanarchitecture.cleanarchitecture.consumer;

import com.cleanarchitecture.cleanarchitecture.model.HelloRs;
import com.cleanarchitecture.cleanarchitecture.wrappers.ConsumerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface IHelloControllerInterface {


    //@PreAuthorize("ScopeValidation")
    @GetMapping(
            value = "hello",
            produces = {"application/json"}
    )
    default ResponseEntity<ConsumerResponse<HelloRs>> getHello() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
