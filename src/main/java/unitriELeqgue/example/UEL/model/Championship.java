package unitriELeqgue.example.UEL.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "CHAMPIONCHIP")
public class Championship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHAMPIONCHIP_ID")
    private Long id;

    @NotNull(message = "Escolha um nome para a competiçao!")
    private String name;

    @NotNull(message = "Escolha um locacl para o campeonato")
    private String local;

    @NotNull(message = "Escolha uma data")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date eventDate;

    private String description;

    @OneToOne
    @JoinColumn(name = "GAME_ID")
    private Game game;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PROVIDER_ID")
    @JsonIgnore
    private Provider provider;

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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
