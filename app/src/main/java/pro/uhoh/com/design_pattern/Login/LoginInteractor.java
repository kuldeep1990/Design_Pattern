package pro.uhoh.com.design_pattern.Login;

/**
 * Created by macmini1 on 8/10/17.
 */


public interface LoginInteractor {

    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);

}

