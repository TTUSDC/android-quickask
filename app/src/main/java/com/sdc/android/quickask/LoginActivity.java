package com.sdc.android.quickask;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.ui.auth.core.AuthProviderType;
import com.firebase.ui.auth.core.FirebaseLoginBaseActivity;
import com.firebase.ui.auth.core.FirebaseLoginError;

public class LoginActivity extends FirebaseLoginBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = (Button)findViewById(R.id.mainLoginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFirebaseLoginPrompt();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        setEnabledAuthProvider(AuthProviderType.PASSWORD);
    }

    @Override
    protected Firebase getFirebaseRef() {
        return null;
    }

    @Override
    protected void onFirebaseLoginProviderError(FirebaseLoginError firebaseLoginError) {

    }

    @Override
    protected void onFirebaseLoginUserError(FirebaseLoginError firebaseLoginError) {

    }

    @Override
    protected void onFirebaseLoggedIn(AuthData authData) {
        super.onFirebaseLoggedIn(authData);
    }

    @Override
    protected void onFirebaseLoggedOut() {
        super.onFirebaseLoggedOut();
    }
}
