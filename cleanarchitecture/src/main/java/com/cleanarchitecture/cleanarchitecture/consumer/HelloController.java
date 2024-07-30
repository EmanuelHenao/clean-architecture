package com.cleanarchitecture.cleanarchitecture.consumer;

import com.cleanarchitecture.cleanarchitecture.model.HelloRs;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${base-path:/api/v1/}")
public class HelloController implements IHelloControllerInterface {


    @Override
    public ResponseEntity<HelloRs> getHello() {
        return IHelloControllerInterface.super.getHello();
    }
}
