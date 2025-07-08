package com.aliyaman.FlyerTrack.exception;


public class BaseException extends RuntimeException{

    BaseException(){

    }

    BaseException(ErrorMessage errorMessage){
        super(errorMessage.prepareErrorMessage());
    }
}
