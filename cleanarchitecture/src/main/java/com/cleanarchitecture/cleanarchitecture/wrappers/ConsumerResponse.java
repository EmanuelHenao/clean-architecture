package com.cleanarchitecture.cleanarchitecture.wrappers;


import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsumerResponse<T> implements IConsumerResponse {


    @Serial
    private static final long serialVersionUID = -9152268190644090400L;

    protected final T data;
    protected final HttpHeaders httpHeaders;
    protected final HttpStatus httpStatus;

    public ResponseEntity<ConsumerResponse<T>> entity() {
        return ResponseEntity
                .status(httpStatus).headers(httpHeaders)
                .body(this);
    }

    public Optional<T> get() {
        return Optional.ofNullable(this.data);
    }

}
