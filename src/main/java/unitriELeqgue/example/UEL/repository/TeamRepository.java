package unitriELeqgue.example.UEL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unitriELeqgue.example.UEL.model.Team;

public interface TeamRepository extends JpaRepository<Team,Long> {
}