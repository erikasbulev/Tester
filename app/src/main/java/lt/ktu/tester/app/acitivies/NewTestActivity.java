package lt.ktu.tester.app.acitivies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.raizlabs.android.dbflow.sql.language.Select;
import lt.ktu.tester.app.R;
import lt.ktu.tester.app.adapters.NewQAdapter;
import lt.ktu.tester.app.dialogs.AddQuestionDialog;
import lt.ktu.tester.app.models.QuestionModel;
import lt.ktu.tester.app.models.TextQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by erikas on 2016-04-03.
 */
public class NewTestActivity extends Activity {
    TextView testName;
    Button addNewQuestion;
    ListView questions;
    List<QuestionModel> names = new ArrayList<>();
    NewQAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_test_activity);
        setTestName(getIntent());
        setViews();
        adapter = new NewQAdapter(this, R.layout.question_list_item,names);
        questions.setAdapter(adapter);
    }

    void setViews() {
        addNewQuestion = (Button) findViewById(R.id.add_new_qst);
        questions = (ListView) findViewById(R.id.new_question_lst_vw);
        setOnClicks();
    }

    void setTestName(Intent intent) {
        testName = (TextView) findViewById(R.id.questionaire_name);
        String sTestName = intent.getExtras().getString("test_name");
        if (TextUtils.isEmpty(sTestName))
            testName.setVisibility(View.INVISIBLE);
        else
            testName.setText(sTestName);
    }

    void setOnClicks(){
        addNewQuestion.setOnClickListener(v -> addNewQuestion());
    }

    void addNewQuestion(){
        AddQuestionDialog dialog = new AddQuestionDialog(this);
        dialog.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        names.clear();
        List<TextQuestion> listas = new Select().from(TextQuestion.class).queryList();
        for(TextQuestion item : listas){
            QuestionModel model = new QuestionModel();
            model.setDisplayString(item.question);
            model.setType(item.type);
            names.add(model);
        }
        if(adapter != null)
            adapter.notifyDataSetChanged();
    }
}
