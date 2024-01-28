package org.adaschool.tdd.exception;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum EMessage {

    //USER_NOT_FOUND(HttpStatus.NOT_FOUND,"Usuario no encontrado"),

    WEATHER_ID_NOT_FOUND(HttpStatus.NOT_FOUND,"No se encontró el Id solicitado"),
    WEATHER_NAME_NOT_FOUND(HttpStatus.NOT_FOUND,"No se encontró el nombre solicitado");

    private final HttpStatus status;
    private final String message;

}
