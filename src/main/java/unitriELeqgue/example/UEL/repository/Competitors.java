package unitriELeqgue.example.UEL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unitriELeqgue.example.UEL.model.Competitor;

public interface Competitors extends JpaRepository<Competitor,Long> {
}
