package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SignUpPage;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String completeMessage = Text.of(SignUpPage.REGISTRATION_COMPLETE).viewedBy(actor).asString();

        if (question.equals(completeMessage)){
            result = true;
        }else {
            result = false;
        }

        return result;
    }
}
