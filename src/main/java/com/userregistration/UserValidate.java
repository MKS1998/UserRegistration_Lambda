package com.userregistration;

@FunctionalInterface
public interface UserValidate<T> {
    boolean validate(T param);
}