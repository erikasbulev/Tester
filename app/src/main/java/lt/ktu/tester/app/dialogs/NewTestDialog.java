package lt.ktu.tester.app.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import lt.ktu.tester.app.R;
import lt.ktu.tester.app.acitivies.NewTestActivity;

public class NewTestDialog extends Dialog {
    EditText testName;
    Button ok, cancel;
    Intent intent;

    public NewTestDialog(Context context) {
        super(context);
        setContentView(R.layout.dialog_new_test);
        setViews();
        intent = new Intent(context, NewTestActivity.class);
    }

    void setViews() {
        testName = (EditText) findViewById(R.id.new_test_name_ed);
        ok = (Button) findViewById(R.id.nt_dialog_ok);
        cancel = (Button) findViewById(R.id.nt_dialog_cancel);
        setOnClicks();
    }

    void setOnClicks() {
        ok.setOnClickListener(v -> {
            String testName = getTestName();
            if (isValid(testName)) {
                intent.putExtra("test_name", testName);
                getContext().startActivity(intent);
                dismiss();
            } else {
                Toast.makeText(getContext(), "Not_Valid_text", Toast.LENGTH_LONG);
            }
        });

        cancel.setOnClickListener(v -> dismiss());
    }

    boolean isValid(String testName) {
        return !TextUtils.isEmpty(testName);
    }

    String getTestName() {
        return testName.getText().toString();
    }
}
