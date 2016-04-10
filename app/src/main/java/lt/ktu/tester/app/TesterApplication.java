package lt.ktu.tester.app;

import android.app.Application;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by erikas on 2016-04-10 KTU final project.
 */
public class TesterApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }
}
