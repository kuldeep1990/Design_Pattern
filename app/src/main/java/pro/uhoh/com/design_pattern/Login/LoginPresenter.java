package pro.uhoh.com.design_pattern.Login;

/**
 * Created by macmini1 on 8/10/17.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
