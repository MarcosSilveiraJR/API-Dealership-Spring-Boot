package com.dealership.mapper;

import java.util.function.Function;

public interface ModelMapper<T> {
    <S>ModelMapper<S> map(Function<? super T, ? extends S> mapper);

}
