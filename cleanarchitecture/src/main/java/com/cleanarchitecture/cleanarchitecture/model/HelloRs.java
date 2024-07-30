package com.cleanarchitecture.cleanarchitecture.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@Getter
@Setter
@Generated
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class HelloRs {

    @JsonProperty("message")
    String message;
}
