package com.lowagie.text.pdf;

public class FontErrorException extends RuntimeException {

    FontErrorException(String message, Exception e){
        super(message, e);
    }

}
