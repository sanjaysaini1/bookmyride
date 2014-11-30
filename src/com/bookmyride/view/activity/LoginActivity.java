package com.bookmyride.view.activity;



import com.bookmyride.R;
import com.bookmyride.controller.AppController;
import com.bookmyride.service.LoginService;
import com.bookmyride.service.LoginServiceFactory;
import com.bookmyride.util.BookMyRideToast;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends BaseActivity {

	EditText loginText,passwordText;
	Button loginButton,resetButton;
	LoginService loginService=LoginServiceFactory.getService();
	String id,password;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		initUI();
	}

	private void initUI() {
		getSupportActionBar().hide();
		loginText=(EditText)findViewById(R.id.loginId);
		passwordText=(EditText)findViewById(R.id.loginPassword);
		loginButton=(Button)findViewById(R.id.loginbutton);
		resetButton=(Button)findViewById(R.id.resetbutton);
		passwordText.setOnKeyListener(new PasswordKeyListener());
		loginButton.setOnClickListener(new LoginClickListener());
		resetButton.setOnClickListener(new ResetClickListener());
		
		
	}
	
	
	private void doReset(){
		loginText.setText("");
		passwordText.setText("");
	}

	private class LoginClickListener implements OnClickListener{
		private AsyncTask<String, Integer, Boolean> loginTask=new LoginTask();
		@Override
		public void onClick(View v) {
			loginTask.execute(null,null);
			
		}
		
	}
	
	private class ResetClickListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			doReset();
			
		}
		
	}
	private class PasswordKeyListener implements OnKeyListener{

		@Override
		public boolean onKey(View v, int keyCode, KeyEvent event) {
			id=loginText.getText().toString();
			password=passwordText.getText().toString();
			if(!id.isEmpty()){
				loginButton.setEnabled(true);
			}
			return false;
		}
		
	}
	
	private class LoginTask extends AsyncTask<String, Integer, Boolean>{

		@Override
		protected Boolean doInBackground(String... params) {
			id=loginText.getText().toString();
			password=passwordText.getText().toString();
			
			return loginService.login(id,password);
		}
		 protected void onPostExecute(Boolean result) {
			 if((java.lang.Boolean) result)
				{	
					gotoActivity(AppController.getContext(), OrderActivity.class);
				}else
				{
					doReset();
					Toast error =new BookMyRideToast(AppController.getContext());
					error.setText(R.string.login_failure);
					error.show();
				
					
				}
	     }
	}
}
