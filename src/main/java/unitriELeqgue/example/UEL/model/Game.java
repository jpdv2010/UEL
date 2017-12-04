package unitriELeqgue.example.UEL.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "GAME")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GAME_ID")
    private Long id;

    @NotNull(message = "Digite o nome do jogo")
    private String name;

    @NotNull(message = "Digite uma quantidade de jogadores valida")
    private Long contPlayers;


    public Long getContPlayers() {
        return contPlayers;
    }

    public void setContPlayers(Long contPlayers) {
        this.contPlayers = contPlayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
