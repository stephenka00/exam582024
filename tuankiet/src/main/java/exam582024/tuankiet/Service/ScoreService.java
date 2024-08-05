package exam582024.tuankiet.Service;

import Repository.ScoreRepository;
import exam582024.tuankiet.Entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }

    public void saveScore(Score score) {
        scoreRepository.save(score);
    }
}
