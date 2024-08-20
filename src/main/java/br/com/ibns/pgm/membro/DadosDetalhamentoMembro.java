package br.com.ibns.pgm.membro;

import br.com.ibns.pgm.endereco.DadosEndereco;
import br.com.ibns.pgm.endereco.Endereco;

public record DadosDetalhamentoMembro(
        Long id,
        String nome,
        String telefone,
        String email,
        String aniversario,
        Endereco endereco
) {
    public DadosDetalhamentoMembro(Membro membro){
        this(
                membro.getId(),
                membro.getNome(),
                membro.getTelefone(),
                membro.getEmail(),
                membro.getAniversario(),
                membro.getEndereco()
        );
    }

}
