package com.cleanarchitecture.cleanarchitecture.wrappers;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Generated;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.util.Map;

@Builder
@RequiredArgsConstructor
@Getter
@Setter
@Generated
@ToString
@AllArgsConstructor
public class ConsumerRequest<T> implements IConsumerRequest {

    @Serial
    private static final long serialVersionUID = 6679910703103198596L;

    private T request;
    private Map<String, Object> headerParams;
    private Map<String, Object> queryParams;
    private Map<String, Object> pathParams;

}
