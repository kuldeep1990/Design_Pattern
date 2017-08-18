package pro.uhoh.com.design_pattern.Main;

/**
 * Created by macmini1 on 8/10/17.
 */

public interface MainPresenter {

    void onResume();

    void onItemClicked(int position);

    void onDestroy();
}
