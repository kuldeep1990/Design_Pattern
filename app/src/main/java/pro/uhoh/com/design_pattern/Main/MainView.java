package pro.uhoh.com.design_pattern.Main;

import java.util.List;

/**
 * Created by macmini1 on 8/10/17.
 */

public interface MainView {

    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
