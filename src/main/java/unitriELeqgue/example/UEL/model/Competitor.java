package unitriELeqgue.example.UEL.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.format.annotation.DateTimeFormat;
import unitriELeqgue.example.UEL.model.Games;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by joaop on 06/09/2017.
 */
@Entity
public class Competitor {

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getBirdDate() {
        return birdDate;
    }

    public void setBirdDate(Date birdDate) {
        this.birdDate = birdDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Digite um nome válido!")
    private String name;
    private String lastname;
    @NotEmpty(message = "Digite um nick válido!")
    private String nickname;

    @NotNull(message = "Digite uma data válida!")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date birdDate;

    @NotEmpty(message="Digite uma senha válida!")
    private String password;


    @NotNull(message = "Escolha um game!")
    private String game;

}

