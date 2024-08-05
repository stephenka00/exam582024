package Repository;

import exam582024.tuankiet.Entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository  extends JpaRepository<Score, Long> {
}
