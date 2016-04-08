package lt.ktu.tester.app.acitivies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import lt.ktu.tester.app.R;
import lt.ktu.tester.app.dialogs.NewTestDialog;

/**
 * Created by erikas on 07/03/16.
 */
public class MainActivity extends Activity {
    private Button options;
    private Button search;
    private Button newTest;
    private Button myTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        setViews();
    }

    private void setViews() {
        options = (Button) findViewById(R.id.options);
        newTest = (Button) findViewById(R.id.new_test);
        search = (Button) findViewById(R.id.search);
        myTest = (Button) findViewById(R.id.my_test);
        setClicks();
    }

    private void setClicks() {
        options.setOnClickListener(v -> startActivityByClass(SettingsActivity.class));

        myTest.setOnClickListener(v -> startActivityByClass(MyTestActivity.class));

        newTest.setOnClickListener(v -> setNewDialog());

        search.setOnClickListener(v -> startActivityByClass(SearchActivity.class));
    }

    private void startActivityByClass(Class clazz) {
        Intent intent = new Intent(MainActivity.this, clazz);
        startActivity(intent);
    }

    private void setNewDialog(){
        NewTestDialog dialog = new NewTestDialog(this);
        dialog.show();
    }
}
