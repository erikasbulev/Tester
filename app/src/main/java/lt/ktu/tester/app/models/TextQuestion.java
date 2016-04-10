package lt.ktu.tester.app.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import lt.ktu.tester.app.utils.AppDatabase;

/**
 * Created by erikas on 2016-04-10 KTU final project.
 */
@Table(database = AppDatabase.class)
public class TextQuestion extends BaseModel {
    @PrimaryKey(autoincrement = true) @Column public int id;
    @Column public String type;
    @Column public int testId;
    @Column public String answer;
    @Column public String question;
    @Column public int testId_position;
}