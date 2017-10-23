package unitriELeqgue.example.UEL.model;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "digite um nome valido")
    private String name;
    private String description;
    private Boolean itsPaid=false;
    @NotEmpty(message = "O time deve conter 5 jogadores!")
    private String nickPlayer1;
    @NotEmpty(message = "O time deve conter 5 jogadores!")
    private String nickPlayer2;
    @NotEmpty(message = "O time deve conter 5 jogadores!")
    private String nickPlayer3;
    @NotEmpty(message = "O time deve conter 5 jogadores!")
    private String nickPlayer4;
    @NotEmpty(message = "O time deve conter 5 jogadores!")
    private String nickPlayer5;
    private String nickReservePlayer;
    private String game;

    public String getNickPlayer1() {
        return nickPlayer1;
    }

    public void setNickPlayer1(String nickPlayer1) {
        this.nickPlayer1 = nickPlayer1;
    }

    public String getNickPlayer2() {
        return nickPlayer2;
    }

    public void setNickPlayer2(String nickPlayer2) {
        this.nickPlayer2 = nickPlayer2;
    }

    public String getNickPlayer3() {
        return nickPlayer3;
    }

    public void setNickPlayer3(String nickPlayer3) {
        this.nickPlayer3 = nickPlayer3;
    }

    public String getNickPlayer4() {
        return nickPlayer4;
    }

    public void setNickPlayer4(String nickPlayer4) {
        this.nickPlayer4 = nickPlayer4;
    }

    public String getNickPlayer5() {
        return nickPlayer5;
    }

    public void setNickPlayer5(String nickPlayer5) {
        this.nickPlayer5 = nickPlayer5;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Boolean getItsPaid() {
        return itsPaid;
    }

    public void setItsPaid(Boolean itsPaid) {
        this.itsPaid = itsPaid;
    }

    public String getNickReservePlayer() {
        return nickReservePlayer;
    }

    public void setNickReservePlayer(String nickReservePlayer) {
        this.nickReservePlayer = nickReservePlayer;
    }
}
