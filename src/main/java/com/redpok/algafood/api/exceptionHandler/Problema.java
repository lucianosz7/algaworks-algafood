package com.redpok.algafood.api.exceptionHandler;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class Problema {

    private LocalDateTime dataHora;
    private String mensagem;
}
