package lt.ktu.tester.app.acitivies.questionactivities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import lt.ktu.tester.app.R;

/**
 * Created by erikas on 2016-04-10 KTU final project.
 */
public class TextQuestionActivity extends Activity {
    EditText question;
    EditText answer;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_question);
        setViews();
    }

    void setViews() {
        question = (EditText) findViewById(R.id.text_q_q);
        answer = (EditText) findViewById(R.id.text_q_a);
        save = (Button) findViewById(R.id.save_text_q);
        setClicks();
    }

    void setClicks() {
     save.setOnClickListener(v -> {

     });
    }
}
