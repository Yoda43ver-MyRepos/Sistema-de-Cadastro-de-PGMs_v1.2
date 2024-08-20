package br.com.ibns.pgm.domain.endereco;

import jakarta.validation.constraints.NotBlank;

public record DadosEndereco(

        @NotBlank
        String logradouro,

        @NotBlank
        String bairro,

        @NotBlank
        String cep,

        @NotBlank
        String numero,

        String complemento,

        @NotBlank
        String cidade,

        @NotBlank
        String uf
) {
}
