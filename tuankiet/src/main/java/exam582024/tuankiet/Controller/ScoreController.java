package exam582024.tuankiet.Controller;

import exam582024.tuankiet.Entity.Score;
import exam582024.tuankiet.Service.ScoreService;
import exam582024.tuankiet.Service.StudentService;
import exam582024.tuankiet.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/scores/new")
    public String showScoreForm(Model model) {
        model.addAttribute("score", new Score());
        model.addAttribute("students", studentService.getAllStudents());
        model.addAttribute("subjects", subjectService.getAllSubjects());
        return "score-form";
    }

    @PostMapping("/scores")
    public String saveScore(Score score) {
        scoreService.saveScore(score);
        return "redirect:/students";
    }
}
