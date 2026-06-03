package Atividade_Dia_a_Dia03.Entidades.enums;

public enum status {
    IMFORMACOES_ADICIONADAS("Informações adicionadas"),
    VERIFICANDO_HORARIO_DISPONIVEL("Verificando horário disponível"),
    COMSULTA_CONFIRMADA("Consulta confirmada"),
    ATENDIMENTO_ENCERRADO("Atendimento encerrado");
    private String descricao;

    status(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
