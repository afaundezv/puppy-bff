package com.mobdev.afaundez.puppybff.domain.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PuppyError {

    private String status;
    private String message;
    private int code;

}
