package lt.ktu.tester.app.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import lt.ktu.tester.app.utils.AppDatabase;

/**
 * Created by erikas on 2016-04-11 KTU final project.
 */
@Table(database = AppDatabase.class)
public class TestModel extends BaseModel{
    @PrimaryKey(autoincrement = true) public int id;
    @Column public String name;
}
