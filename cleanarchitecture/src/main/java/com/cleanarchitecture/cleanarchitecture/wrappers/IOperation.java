package com.cleanarchitecture.cleanarchitecture.wrappers;

public interface IOperation < I extends IConsumerRequest, O extends IConsumerResponse>{

    O handle (I consumerRequest);
}
