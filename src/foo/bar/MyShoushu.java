package foo.bar;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.speech.RecognizerIntent;
import android.widget.Toast;
import java.util.ArrayList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

public class MyShoushu extends Activity implements OnTouchListener {
	ViewFlipper viewflipper;
	float posX;
    Animation in_from_left;
    Animation in_from_right;
    Animation out_to_left;
    Animation out_to_right;
	/** Called when the activity is first created. */
	private MediaPlayer mp1;
	private MediaPlayer mp2;
	private MediaPlayer mp3;
	private MediaPlayer mp4;
	private MediaPlayer mp5;
	private MediaPlayer mp6;
	private MediaPlayer mp7;
	private MediaPlayer mp8;
	private MediaPlayer mp9;
	private MediaPlayer mp10;
	private MediaPlayer mp11;
	private MediaPlayer mp12;
	private MediaPlayer mp13;
	private MediaPlayer mp14;
	private MediaPlayer mp15;
	private MediaPlayer mp16;
	private MediaPlayer mp21;
	private MediaPlayer mp22;
	private MediaPlayer mp23;
	private MediaPlayer mp24;
	private MediaPlayer mp25;
	private MediaPlayer mp26;
	private MediaPlayer mp31;
	private MediaPlayer mp32;
	private MediaPlayer mp33;
	private MediaPlayer mp34;
	private MediaPlayer mp35;
	private MediaPlayer mp36;
	private MediaPlayer mp41;
	private MediaPlayer mp42;
	private MediaPlayer mp43;
	private MediaPlayer mp44;
	private MediaPlayer mp45;
	private MediaPlayer mp46;
	private MediaPlayer mp51;
	private MediaPlayer mp52;
	private MediaPlayer mp53;
	private MediaPlayer mp54;
	private MediaPlayer mp55;
	private MediaPlayer mp56;
	private MediaPlayer mp61;
	private MediaPlayer mp62;
	private MediaPlayer mp_secret;

	private static final int REQUEST = 0;
	private int micflag = 0;
	private int intentflag = 0;
	private int buttoncount = 0;
	private int swipecount = 0;

	private Twitter twitter = null;
	private RequestToken requestToken = null;
	private String CONSUMER_KEY = "yHIivIjsLuIKHXTrDLfRuQ";
	private String CONSUMER_SECRET = "zb3ulSz7eor6oavfrLb1s5ha8StQQr89XIaiRA5IQ";
	private String nechatterStatus;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        viewflipper = (ViewFlipper)this.findViewById(R.id.viewflipper);

        viewflipper.setOnTouchListener(this);

        in_from_left = AnimationUtils.loadAnimation(this, R.anim.in_from_left);
        in_from_right = AnimationUtils.loadAnimation(this, R.anim.in_from_right);
        out_to_left = AnimationUtils.loadAnimation(this, R.anim.out_to_left);
        out_to_right = AnimationUtils.loadAnimation(this, R.anim.out_to_right);

    }

        @Override
        public void onStart() {
            super.onStart();


        	Button bButton1 = (Button)findViewById(R.id.bButton1);
        	mp1 = MediaPlayer.create(this, R.raw.miguel_1);

        	bButton1.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
                	mp1.seekTo(0);
        			mp1.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton2 = (Button)findViewById(R.id.bButton2);
        	mp2 = MediaPlayer.create(this, R.raw.miguel_2);

        	bButton2.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp2.seekTo(0);
        			mp2.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton3 = (Button)findViewById(R.id.bButton3);
        	mp3 = MediaPlayer.create(this, R.raw.miguel_3);

        	bButton3.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp3.seekTo(0);
        			mp3.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton4 = (Button)findViewById(R.id.bButton4);
        	mp4 = MediaPlayer.create(this, R.raw.miguel_4);

        	bButton4.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp4.seekTo(0);
        			mp4.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton5 = (Button)findViewById(R.id.bButton5);
        	mp5 = MediaPlayer.create(this, R.raw.miguel_5);

        	bButton5.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp5.seekTo(0);
        			mp5.start();
        			buttoncount = buttoncount + 1;
                }
        	});

        	Button bButton6 = (Button)findViewById(R.id.bButton6);
        	mp6 = MediaPlayer.create(this, R.raw.miguel_6);

        	bButton6.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp6.seekTo(0);
        			mp6.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton7 = (Button)findViewById(R.id.bButton7);
        	mp7 = MediaPlayer.create(this, R.raw.miguel_sho);

        	bButton7.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp7.seekTo(0);
        			mp7.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton8 = (Button)findViewById(R.id.bButton8);
        	mp8 = MediaPlayer.create(this, R.raw.miguel_shu);

        	bButton8.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp8.seekTo(0);
        			mp8.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton9 = (Button)findViewById(R.id.bButton9);
        	mp9 = MediaPlayer.create(this, R.raw.miguel_riki);

        	bButton9.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp9.seekTo(0);
        			mp9.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton10 = (Button)findViewById(R.id.bButton10);
        	mp10 = MediaPlayer.create(this, R.raw.sound_st);

        	bButton10.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp10.seekTo(0);
        			mp10.start();
        			buttoncount = buttoncount + 1;
        		}
        	});


        	Button bButton11 = (Button)findViewById(R.id.bButton11);
        	mp11 = MediaPlayer.create(this, R.raw.francisco_1);

        	bButton11.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp11.seekTo(0);
        			mp11.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton12 = (Button)findViewById(R.id.bButton12);
        	mp12 = MediaPlayer.create(this, R.raw.francisco_2);

        	bButton12.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp12.seekTo(0);
        			mp12.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton13 = (Button)findViewById(R.id.bButton13);
        	mp13 = MediaPlayer.create(this, R.raw.francisco_3);

        	bButton13.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp13.seekTo(0);
        			mp13.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton14 = (Button)findViewById(R.id.bButton14);
        	mp14 = MediaPlayer.create(this, R.raw.francisco_sho);

        	bButton14.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp14.seekTo(0);
        			mp14.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton15 = (Button)findViewById(R.id.bButton15);
        	mp15 = MediaPlayer.create(this, R.raw.francisco_shu);

        	bButton15.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp15.seekTo(0);
        			mp15.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton16 = (Button)findViewById(R.id.bButton16);
        	mp16 = MediaPlayer.create(this, R.raw.francisco_riki);

        	bButton16.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp16.seekTo(0);
        			mp16.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton17 = (Button)findViewById(R.id.bButton17);

        	bButton17.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp10.seekTo(0);
        			mp10.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton21 = (Button)findViewById(R.id.bButton21);
        	mp21 = MediaPlayer.create(this, R.raw.tomas_1);

        	bButton21.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp21.seekTo(0);
        			mp21.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton22 = (Button)findViewById(R.id.bButton22);
        	mp22 = MediaPlayer.create(this, R.raw.tomas_2);

        	bButton22.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp22.seekTo(0);
        			mp22.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton23 = (Button)findViewById(R.id.bButton23);
        	mp23 = MediaPlayer.create(this, R.raw.tomas_3);

        	bButton23.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp23.seekTo(0);
        			mp23.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton24 = (Button)findViewById(R.id.bButton24);
        	mp24 = MediaPlayer.create(this, R.raw.tomas_sho);

        	bButton24.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp24.seekTo(0);
        			mp24.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton25 = (Button)findViewById(R.id.bButton25);
        	mp25 = MediaPlayer.create(this, R.raw.tomas_shu);

        	bButton25.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp25.seekTo(0);
        			mp25.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton26 = (Button)findViewById(R.id.bButton26);
        	mp26 = MediaPlayer.create(this, R.raw.tomas_riki);

        	bButton26.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp26.seekTo(0);
        			mp26.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton27 = (Button)findViewById(R.id.bButton27);

        	bButton27.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp10.seekTo(0);
        			mp10.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton31 = (Button)findViewById(R.id.bButton31);
        	mp31 = MediaPlayer.create(this, R.raw.americo_1);

        	bButton31.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp31.seekTo(0);
        			mp31.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton32 = (Button)findViewById(R.id.bButton32);
        	mp32 = MediaPlayer.create(this, R.raw.americo_2);

        	bButton32.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp32.seekTo(0);
        			mp32.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton33 = (Button)findViewById(R.id.bButton33);
        	mp33 = MediaPlayer.create(this, R.raw.americo_3);

        	bButton33.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp33.seekTo(0);
        			mp33.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton34 = (Button)findViewById(R.id.bButton34);
        	mp34 = MediaPlayer.create(this, R.raw.americo_sho);

        	bButton34.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp34.seekTo(0);
        			mp34.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton35 = (Button)findViewById(R.id.bButton35);
        	mp35 = MediaPlayer.create(this, R.raw.americo_shu);

        	bButton35.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp35.seekTo(0);
        			mp35.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton36 = (Button)findViewById(R.id.bButton36);
        	mp36 = MediaPlayer.create(this, R.raw.americo_riki);

        	bButton36.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp36.seekTo(0);
        			mp36.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton37 = (Button)findViewById(R.id.bButton37);

        	bButton37.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp10.seekTo(0);
        			mp10.start();
        			buttoncount = buttoncount + 1;
        		}
        	});


        	Button bButton41 = (Button)findViewById(R.id.bButton41);
        	mp41 = MediaPlayer.create(this, R.raw.carlos_1);

        	bButton41.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp41.seekTo(0);
        			mp41.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton42 = (Button)findViewById(R.id.bButton42);
        	mp42 = MediaPlayer.create(this, R.raw.carlos_2);

        	bButton42.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp42.seekTo(0);
        			mp42.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton43 = (Button)findViewById(R.id.bButton43);
        	mp43 = MediaPlayer.create(this, R.raw.carlos_3);

        	bButton43.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp43.seekTo(0);
        			mp43.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton44 = (Button)findViewById(R.id.bButton44);
        	mp44 = MediaPlayer.create(this, R.raw.carlos_sho);

        	bButton44.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp44.seekTo(0);
        			mp44.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton45 = (Button)findViewById(R.id.bButton45);
        	mp45 = MediaPlayer.create(this, R.raw.carlos_shu);

        	bButton45.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp45.seekTo(0);
        			mp45.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton46 = (Button)findViewById(R.id.bButton46);
        	mp46 = MediaPlayer.create(this, R.raw.carlos_riki);

        	bButton46.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp46.seekTo(0);
        			mp46.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton47 = (Button)findViewById(R.id.bButton47);

        	bButton47.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp10.seekTo(0);
        			mp10.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton51 = (Button)findViewById(R.id.bButton51);
        	mp51 = MediaPlayer.create(this, R.raw.live_1);

        	bButton51.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp51.seekTo(0);
        			mp51.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton52 = (Button)findViewById(R.id.bButton52);
        	mp52 = MediaPlayer.create(this, R.raw.live_2);

        	bButton52.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp52.seekTo(0);
        			mp52.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton53 = (Button)findViewById(R.id.bButton53);
        	mp53 = MediaPlayer.create(this, R.raw.live_3);

        	bButton53.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp53.seekTo(0);
        			mp53.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton54 = (Button)findViewById(R.id.bButton54);
        	mp54 = MediaPlayer.create(this, R.raw.live_shoshuriki);

        	bButton54.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp54.seekTo(0);
        			mp54.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton55 = (Button)findViewById(R.id.bButton55);
        	mp55 = MediaPlayer.create(this, R.raw.live_namae);

        	bButton55.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp55.seekTo(0);
        			mp55.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton56 = (Button)findViewById(R.id.bButton56);
        	mp56 = MediaPlayer.create(this, R.raw.live_arigato);

        	bButton56.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp56.seekTo(0);
        			mp56.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton57 = (Button)findViewById(R.id.bButton57);

        	bButton57.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp10.seekTo(0);
        			mp10.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	Button bButton61 = (Button)findViewById(R.id.bButton61);
        	mp61 = MediaPlayer.create(this, R.raw.miguel_full1);

        	bButton61.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp61.seekTo(0);
        			mp61.start();
        			buttoncount = buttoncount + 1;
        		}
        	});


        	Button bButton62 = (Button)findViewById(R.id.bButton62);
        	mp62 = MediaPlayer.create(this, R.raw.miguel_full2);

        	bButton62.setOnClickListener(new OnClickListener() {
        		@Override
        		public void onClick(View v) {
        			mp62.seekTo(0);
        			mp62.start();
        			buttoncount = buttoncount + 1;
        		}
        	});

        	mp_secret = MediaPlayer.create(this, R.raw.live_migueldeshita);


    		Button bButton_mic1 = (Button)findViewById(R.id.bButton_mic1);
            // ボタンイベント処理
            bButton_mic1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                	intentflag = 1;
                    try {
                        // インテント作成
                        // 入力した音声を解析する。
                        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                        // free-form speech recognition.
                        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                                                    RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                        // 表示させる文字列
                        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                                                    getString(R.string.sing)
);

                        // インテント開始
                        startActivityForResult(intent, REQUEST);
                        micflag = 1;
                    } catch (ActivityNotFoundException e) {
                        // アクティビティが見つからなかった
                        Toast.makeText(MyShoushu.this,
                        	getString(R.string.error_activity), Toast.LENGTH_LONG).show();
                    }
                }
            });

    		Button bButton_mic2 = (Button)findViewById(R.id.bButton_mic2);
            // ボタンイベント処理
            bButton_mic2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                	intentflag = 1;
                    try {
                        // インテント作成
                        // 入力した音声を解析する。
                        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                        // free-form speech recognition.
                        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                                                    RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                        // 表示させる文字列
                        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                        							getString(R.string.q_name));

                        // インテント開始
                        startActivityForResult(intent, REQUEST);
                        micflag = 2;
                    } catch (ActivityNotFoundException e) {
                        // アクティビティが見つからなかった
                        Toast.makeText(MyShoushu.this,
                        		getString(R.string.error_activity), Toast.LENGTH_LONG).show();
                    }
                }
            });


    		Button loginbutton = (Button) findViewById(R.id.tweetLogin);
            loginbutton.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                	intentflag = 2;
            	    SharedPreferences pref = getSharedPreferences("Twitter_seting",MODE_PRIVATE);
            		nechatterStatus  = pref.getString("status", "");
            		//もう設定されているか？
            		if(isConnected(nechatterStatus)){

            			//disconnectTwitter();

    					Intent intent2=new Intent();
    					intent2.setClassName("foo.bar","foo.bar.Tweet");
    					intent2.setAction(Intent.ACTION_VIEW);
    					startActivityForResult(intent2,0);

            		}else{

            			try {
    						connectTwitter();
    					} catch (TwitterException e) {
    						//showToast(R.string.nechatter_connect_error);
    					}
            		}


            	}
            });

        }

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				posX = event.getX();
				break;
			case MotionEvent.ACTION_UP:
				if ( posX > event.getX() ){
					viewflipper.setInAnimation(in_from_right);
					viewflipper.setOutAnimation(out_to_left);
					viewflipper.showNext();
					swipecount = swipecount + 1;
					if ( buttoncount > 20 && swipecount > 2){
						onStop();
						onStart();
					}
				}else if (posX < event.getX() ){
					viewflipper.setInAnimation(in_from_left);
					viewflipper.setOutAnimation(out_to_right);
					viewflipper.showPrevious();
					swipecount = swipecount + 1;
					if ( buttoncount > 20 && swipecount > 2){
						onStop();
						onStart();
					}
				}
				break;
		}
		return true;
	}


    // アクティビティ終了
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // 自分が投げたインテントであれば応答する
        if (requestCode == REQUEST && resultCode == RESULT_OK && intentflag == 1) {
            String speakedString = "";

            // 結果文字列リスト
            // 複数の文字を認識した場合，結合して出力
            ArrayList<String> speechToChar = data.getStringArrayListExtra(
                    RecognizerIntent.EXTRA_RESULTS);

            for (int i = 0; i< speechToChar.size(); i++) {
                speakedString += speechToChar.get(i);
            }

            //　文字が短かった場合空白文字でパディング
            for (int i = (20-speakedString.length()); i>0; i--)
                speakedString += " ";

            // 音声選択処理
        		//（デバッグ）認識結果をダイアログ表示
				//	showDialog(this, "", speakedString);
                if ((speakedString.indexOf("消臭") >= 0 || (speakedString.indexOf("sho") >= 0 && (speakedString.indexOf("shoe") >= 0 || speakedString.indexOf("shu") >= 0 ))) && micflag == 1){
        			mp9.seekTo(0);
        			mp9.start();
        			showDialog(this, "", "Good!!");
                }else if (speakedString.indexOf("ラララ") >= 0 && micflag == 1){
        			mp1.seekTo(0);
        			mp1.start();
        			showDialog(this, "", "ラーラーララーー");
                }else if ((speakedString.indexOf("ミゲル") >= 0 || speakedString.indexOf("miguel") >= 0) && micflag == 2){
        			mp56.seekTo(0);
        			mp56.start();
        			showDialog(this, "", getString(R.string.correct));
                }else if (speakedString.indexOf("西川") >= 0 && micflag == 2){
        			mp_secret.seekTo(0);
        			mp_secret.start();
        			showDialog(this, "", "男の子の名前だよ？");
                }else if ((speakedString.indexOf("ミゲル") == -1 || speakedString.indexOf("miguel") == -1) && speakedString.indexOf("西川") == -1 && micflag == 2){
        			mp55.seekTo(0);
        			mp55.start();
        			showDialog(this, "", getString(R.string.incorrect));
                }else{
        			mp10.seekTo(0);
        			mp10.start();
        			showDialog(this, "", getString(R.string.notgood));
                }
                super.onActivityResult(requestCode, resultCode, data);
        }

		if(resultCode == RESULT_OK && intentflag == 2){
			super.onActivityResult(requestCode, resultCode, data);

			AccessToken accessToken = null;

			try {
				accessToken = twitter.getOAuthAccessToken(
						requestToken,
						data.getExtras().getString("oauth_verifier"));


		        SharedPreferences pref=getSharedPreferences("Twitter_seting",MODE_PRIVATE);

		        SharedPreferences.Editor editor=pref.edit();
		        editor.putString("oauth_token",accessToken.getToken());
		        editor.putString("oauth_token_secret",accessToken.getTokenSecret());
		        editor.putString("status","available");

		        editor.commit();


		        //つぶやくページへGO
		        Intent intent2 = new Intent(this, Tweet.class);
				this.startActivityForResult(intent2, 0);

		        //finish();
			} catch (TwitterException e) {
				//showToast(R.string.nechatter_connect_error);
			}


		}
    }


    // ダイアログの表示
    private static void showDialog(final Activity activity,String title, String text)
    {
        AlertDialog.Builder ad = new AlertDialog.Builder(activity);
        ad.setTitle(title);
        ad.setMessage(text);
        ad.setPositiveButton("OK", new DialogInterface.OnClickListener()
        {
                public void onClick(DialogInterface dialog, int whichButton)
                {
                        activity.setResult(Activity.RESULT_OK);
                }
        });
        ad.create();
        ad.show();
    }





    private void connectTwitter() throws TwitterException{


		//参考:http://groups.google.com/group/twitter4j/browse_thread/thread/d18c179ba0d85351
		//英語だけど読んでね！
		ConfigurationBuilder confbuilder  = new ConfigurationBuilder();

		confbuilder.setOAuthConsumerKey(CONSUMER_KEY).setOAuthConsumerSecret(CONSUMER_SECRET);

		twitter = new TwitterFactory(confbuilder.build()).getInstance();


		String CALLBACK_URL = "myapp://oauth";
//		String CALLBACK_URL = "https://market.android.com/details?id=foo.bar";
		// requestTokenもクラス変数。
		try {
			requestToken = twitter.getOAuthRequestToken(CALLBACK_URL);
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  // 認証用URLをインテントにセット。
		  // TwitterLoginはActivityのクラス名。
		  Intent data = new Intent(this, TwitterLogin.class);
		  data.putExtra("auth_url", requestToken.getAuthorizationURL());

		  // アクティビティを起動
		  this.startActivityForResult(data, 0);

	}



    final private boolean isConnected(String nechatterStatus){
		if(nechatterStatus != null && nechatterStatus.equals("available")){
			return true;
		}else{
			return false;
		}
	}


    public void disconnectTwitter(){

        SharedPreferences pref=getSharedPreferences("Twitter_seting",MODE_PRIVATE);

        SharedPreferences.Editor editor=pref.edit();
        editor.remove("oauth_token");
        editor.remove("oauth_token_secret");
        editor.remove("status");

        editor.commit();



        //finish();
	}


	@Override
//	protected void onDestroy() {
//		super.onDestroy();
	protected void onStop() {
		super.onStop();
		mp1.release();
		mp2.release();
		mp3.release();
		mp4.release();
		mp5.release();
		mp6.release();
		mp7.release();
		mp8.release();
		mp9.release();
		mp10.release();
		mp11.release();
		mp12.release();
		mp13.release();
		mp14.release();
		mp15.release();
		mp16.release();
		mp21.release();
		mp22.release();
		mp23.release();
		mp24.release();
		mp25.release();
		mp26.release();
		mp31.release();
		mp32.release();
		mp33.release();
		mp34.release();
		mp35.release();
		mp36.release();
		mp41.release();
		mp42.release();
		mp43.release();
		mp44.release();
		mp45.release();
		mp46.release();
		mp51.release();
		mp52.release();
		mp53.release();
		mp54.release();
		mp55.release();
		mp56.release();
		mp61.release();
		mp62.release();
		mp_secret.release();
		buttoncount = 0;
		swipecount = 0;
	}


}

