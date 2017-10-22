package unitriELeqgue.example.UEL.model;

/**
 * Created by joaop on 06/09/2017.
 */
public enum Games {
    GAME1("CS:GO"),
    GAME2("League Of Legends");

    private String descricao;

    Games(String descricao){
        this.descricao=descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
