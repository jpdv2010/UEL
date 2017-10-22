package unitriELeqgue.example.UEL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unitriELeqgue.example.UEL.model.Team;

public interface Teams extends JpaRepository<Team,Long> {
}