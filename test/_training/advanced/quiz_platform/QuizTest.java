package _training.advanced.quiz_platform;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QuizTest {

    private Utilisateur alice;
    private Utilisateur auteur;
    private Quiz quiz;
    private Question q1;
    private Question q2;

    @BeforeEach
    void setUp() {
        alice = new Utilisateur(1, "Alice", "alice@gmail.com");
        auteur = new Utilisateur(2, "Prof", "prof@gmail.com");

        quiz = new Quiz(1, "Java Basics", auteur);

        q1 = new Question(1, "What is JVM?",
                List.of("Java Virtual Machine", "JavaScript VM", "Java Variable Model"), 0);

        q2 = new Question(2, "Which keyword is used to inherit?",
                List.of("implement", "extends", "inherits"), 1);

        quiz.ajouterQuestion(q1);
        quiz.ajouterQuestion(q2);

        alice.repondre(q1, 0); // correct
        alice.repondre(q2, 2); // incorrect
    }

    @Test
    void testCalculScore() {
        int score = quiz.calculerScore(alice);
        assertEquals(1, score);
    }

    @Test
    void testAjouterQuestion() {
        assertEquals(2, quiz.getQuestions().size());
    }

    @Test
    void testReponseCorrecte() {
        Reponse r = alice.getReponses().get(0);
        assertTrue(r.estCorrecte());
    }

    @Test
    void testReponseIncorrecte() {
        Reponse r = alice.getReponses().get(1);
        assertFalse(r.estCorrecte());
    }
}
