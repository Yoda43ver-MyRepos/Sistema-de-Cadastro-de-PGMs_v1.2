package br.com.ibns.pgm.pgm;

import br.com.ibns.pgm.endereco.DadosEndereco;
import br.com.ibns.pgm.endereco.Endereco;

public record DadosDetalhamentoPgm(
        Long id,
        String nome,
        String dia,
        String hora,
        Endereco endereco,
        Boolean ativo
) {

    public DadosDetalhamentoPgm(Pgm pgm){
        this(
                pgm.getId(),
                pgm.getNome(),
                pgm.getDia(),
                pgm.getHora(),
                pgm.getEndereco(),
                pgm.getAtivo()
        );
    }
}
