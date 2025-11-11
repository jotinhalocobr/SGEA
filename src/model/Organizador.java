package model;

public class Organizador extends PessoaResponsavel{
    private String funcaoAdiministrativa;

    public String getFuncaoAdiministrativa() {
        return funcaoAdiministrativa;
    }

    public void setFuncaoAdiministrativa(String funcaoAdiministrativa) {
        this.funcaoAdiministrativa = funcaoAdiministrativa;
    }

    public Organizador(String nome, String email, String funcaoAdministrativa) {
        super(nome, email);

        this.funcaoAdiministrativa = funcaoAdministrativa;
    }
}
