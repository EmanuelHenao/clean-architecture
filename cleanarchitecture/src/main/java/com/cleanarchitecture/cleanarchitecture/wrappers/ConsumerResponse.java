package com.cleanarchitecture.cleanarchitecture.wrappers;


import lombok.Builder;
import lombok.Generated;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serial;
import java.util.Optional;

@Builder
@RequiredArgsConstructor
@Getter
@Setter
@Generated
@ToString
public class ConsumerResponse<T> implements IConsumerResponse {


    @Serial
    private static final long serialVersionUID = -9152268190644090400L;

    protected final T data;
    protected final HttpHeaders httpHeaders;
    protected HttpStatus httpStatus;

    public ResponseEntity<ConsumerResponse<T>> entity() {
        return ResponseEntity.status(HttpStatus.OK).body(this);
    }

    public Optional<T> get() {
        return Optional.ofNullable(this.data);
    }

}
