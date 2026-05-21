package loyaltyplatform_modelo.src;

public class Usuario {

    //Definindo os Atributos do Usuário
    private int idUsuario;
    private int idNivel;
    private String nomeUsuario;
    private String emailUsuario;
    private String senhaUsuario;
    private String dataCadUser;
    private int pontosTotMissoes;

    //Construtor padrão
    public Usuario(){

    }

    //Construtor com todos os parâmetros
    public Usuario(int idUsuario, int idNivel, String nomeUsuario, String emailUsuario, String senhaUsuario, String dataCadUser, int pontosTotMissoes){
        this.idUsuario = idUsuario;
        this.idNivel = idNivel;
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
        this.dataCadUser = dataCadUser;
        this.pontosTotMissoes = pontosTotMissoes;
    }

    //Métodos Getters
    public int getIdUsuario(){
        return idUsuario;
    }
    public int getIdNivel(){
        return idNivel;
    }
    public String getNomeUsuario(){
        return nomeUsuario;
    }
    public String getEmailUsuario(){
        return emailUsuario;
    }
    public String getSenhaUsuario(){
        return senhaUsuario;
    }
    public String getDataCadUser(){
        return dataCadUser;
    }
    public int getPontosTotMissoes(){
        return pontosTotMissoes;
    }

    //Métodos Setters
    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }
    public void setIdNivel(int idNivel){
        this.idNivel = idNivel;
    }
    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }
    public void setEmailUsuario(String emailUsuario){
        this.emailUsuario = emailUsuario;
    }
    public void setSenhaUsuario(String senhaUsuario){
        this.senhaUsuario = senhaUsuario;
    }
    public void setDataCadUser(String dataCadUser){
        this.dataCadUser = dataCadUser;
    }
    public void setPontosTotMissoes(int pontosTotMissoes){
        this.pontosTotMissoes = pontosTotMissoes;
    }

    //metodo de negócio (usuário acumulando os pontos)
    public void acumularPontos(int pontos){
        if(pontos > 0 ){
            this.pontosTotMissoes += pontos;
            System.out.println(getNomeUsuario() + "acumulou " + pontos + " pontos! Total: "+ pontosTotMissoes);
        } else {
            System.err.println("Pontos inválidos. Insira um valor maior que zero(0).");
        }
    }

    @Override
    public String toString(){
        return "Dados do Usuário{" +
                "Id do Usuário= " + getIdUsuario() +
                ", Id do Nível do Usuário= "+getIdNivel() +
                ", Nome do Usuário= "+getNomeUsuario() +
                ", Email do Usuário= "+getEmailUsuario()+
                ", Senha do Usuário= "+getSenhaUsuario()+
                ", Data de criação do Cadastro de "+getNomeUsuario()+"= "+getDataCadUser()+
                ", Pontos Acumulados do Usuário= "+getPontosTotMissoes()+
                "}";
    }
}
