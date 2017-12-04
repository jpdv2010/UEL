package unitriELeqgue.example.UEL.model;

import javax.persistence.*;
import java.text.DecimalFormat;

@Entity
@Table(name = "INSCRIPTION")
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INSCRIPTION_ID")
    private Long id;

    private Boolean itsPaid=false;

    @OneToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    @OneToOne
    @JoinColumn(name = "CHAMPIONSHIP_ID")
    private Championship championship;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getItsPaid() {
        return itsPaid;
    }

    public void setItsPaid(Boolean itsPaid) {
        this.itsPaid = itsPaid;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Championship getChampionship() {
        return championship;
    }

    public void setChampionship(Championship championship) {
        this.championship = championship;
    }
}
