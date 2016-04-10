package lt.ktu.tester.app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import lt.ktu.tester.app.R;
import lt.ktu.tester.app.models.QuestionModel;

import java.util.List;

/**
 * Created by erikas on 2016-04-08 KTU final project.
 */
public class NewQAdapter extends ArrayAdapter {

    public NewQAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        QuestionModel model = (QuestionModel) getItem(position);
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.question_list_item, parent, false);
        }
        TextView view = (TextView) convertView.findViewById(R.id.q_list_item_name);
        TextView viewNo = (TextView) convertView.findViewById(R.id.q_list_item_no);
        viewNo.setText(String.valueOf(position + 1));
        view.setText(model.getDisplayString());
        return convertView;
    }
}
