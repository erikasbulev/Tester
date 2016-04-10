package lt.ktu.tester.app.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import lt.ktu.tester.app.R;
import lt.ktu.tester.app.acitivies.questionactivities.PickQuestionActivity;
import lt.ktu.tester.app.acitivies.questionactivities.PictureQuestionActivity;
import lt.ktu.tester.app.acitivies.questionactivities.RadioQuestionActivity;
import lt.ktu.tester.app.acitivies.questionactivities.TextQuestionActivity;

/**
 * Created by erikas on 2016-04-08 KTU final project.
 */
public class AddQuestionDialog extends Dialog {
    Button radioQuestion;
    Button textQuestion;
    Button pictureQuestion;
    Button correctPick;

    public AddQuestionDialog(Context context) {
        super(context);
        setContentView(R.layout.dialog_new_q);
        setViews();
        setTitle("Add new question");
    }

    void setViews() {
        radioQuestion = (Button) findViewById(R.id.radio_question);
        textQuestion = (Button) findViewById(R.id.text_question);
        pictureQuestion = (Button) findViewById(R.id.picture_question);
        correctPick = (Button) findViewById(R.id.correct_pick);
        setClicks();
    }

    void setClicks() {
        radioQuestion.setOnClickListener(v -> startActivityByClass(RadioQuestionActivity.class));
        textQuestion.setOnClickListener(v -> startActivityByClass(TextQuestionActivity.class));
        pictureQuestion.setOnClickListener(v -> startActivityByClass(PictureQuestionActivity.class));
        correctPick.setOnClickListener(v -> startActivityByClass(PickQuestionActivity.class));
    }

    private void startActivityByClass(Class clazz) {
        Intent intent = new Intent(getContext(), clazz);
        getContext().startActivity(intent);
    }
}
