package org.adaschool.tdd.exception;

import org.springframework.http.HttpStatus;

public class WeatherReportNotFoundException
    extends RuntimeException
{
    private HttpStatus status;
    private String message;

    public WeatherReportNotFoundException(EMessage message){
        this.status = message.getStatus();
        this.message = message.getMessage();
    }

}
