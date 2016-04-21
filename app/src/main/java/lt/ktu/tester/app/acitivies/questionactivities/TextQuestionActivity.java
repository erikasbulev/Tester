package lt.ktu.tester.app.acitivies.questionactivities;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import lt.ktu.tester.app.R;
import lt.ktu.tester.app.models.TextQuestion;

/**
 * Created by erikas on 2016-04-10 KTU final project.
 */
public class TextQuestionActivity extends Activity {
    EditText question;
    EditText answer;
    Button save;
    int test_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_question);
        setViews();
        test_id = getIntent().getExtras().getInt("test_id");
    }

    void setViews() {
        question = (EditText) findViewById(R.id.text_q_q);
        answer = (EditText) findViewById(R.id.text_q_a);
        save = (Button) findViewById(R.id.save_text_q);
        setClicks();
    }

    void setClicks() {
     save.setOnClickListener(v -> saveData());
    }

    void saveData(){
        String question = this.question.getText().toString();
        String answer = this.answer.getText().toString();
        if(!TextUtils.isEmpty(question) && !TextUtils.isEmpty(answer)){
            TextQuestion textQuestion = new TextQuestion();
            textQuestion.type = "text";
            textQuestion.question = question;
            textQuestion.answer = answer;
            textQuestion.testId = test_id;
            textQuestion.save();
            finish();
            Toast.makeText(this,"Saved",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"Enter full fields",Toast.LENGTH_LONG).show();
        }
    }
}
