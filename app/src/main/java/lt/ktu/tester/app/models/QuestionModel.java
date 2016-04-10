package lt.ktu.tester.app.models;

/**
 * Created by erikas on 2016-04-11 KTU final project.
 */
public class QuestionModel {
    private String displayString;
    private String type;
    private int questionId;
    private int testId;

    public String getDisplayString() {
        return displayString;
    }

    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }
}
