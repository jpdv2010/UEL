package unitriELeqgue.example.UEL.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PROVIDER")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "provider_id")
    private Long id;

    @NotNull(message = "Digite o nome do provedor")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Championship> championshipList = new ArrayList<>();

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

    public List<Championship> getChampionshipList() {
        return championshipList;
    }

    public void setChampionshipList(List<Championship> championshipList) {
        this.championshipList = championshipList;
    }
}
