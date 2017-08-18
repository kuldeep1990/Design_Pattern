package pro.uhoh.com.design_pattern.Login;

/**
 * Created by macmini1 on 8/10/17.
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}

