package lt.ktu.tester.app.utils;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by erikas on 2016-04-10 KTU final project.
 */
@Database(name = AppDatabase.NAME, version = AppDatabase.VERSION)

public class AppDatabase {

    public static final String NAME = "Testerdb";

    public static final int VERSION = 1;
}
