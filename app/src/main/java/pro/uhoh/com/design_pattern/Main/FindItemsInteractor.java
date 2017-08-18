package pro.uhoh.com.design_pattern.Main;

import java.util.List;

/**
 * Created by macmini1 on 8/10/17.
 */

public interface FindItemsInteractor {

    interface OnFinishedListener {
        void onFinished(List<String> items);
    }

    void findItems(OnFinishedListener listener);
}
