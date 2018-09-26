package foo.bar;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.media.MediaPlayer;

import java.io.IOException;


public class MyShoushuWidget extends AppWidgetProvider {
	private MediaPlayer mp_full;
	final String filter = "foo.bar.BUTTON_CLICKED";
	@Override
	public void onUpdate(
		Context context,
		AppWidgetManager appWidgetManager,
		int[] appWidgetIds) {

		RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.sub);

		Intent intent = new Intent( filter );
		PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
		views.setOnClickPendingIntent(R.id.bButton_w, pendingIntent);

		appWidgetManager.updateAppWidget(appWidgetIds, views);
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		super.onReceive(context, intent);
		mp_full = MediaPlayer.create(context, R.raw.miguel_shoshuriki);
		String action = intent.getAction();
		if (action.equals( filter )) {
//			Log.d("Widget02", "Clicked!");
		    if (mp_full.isPlaying()) { //çƒê∂íÜ
	            mp_full.stop();
	            try {
	                mp_full.prepare();
	            } catch (IllegalStateException e) {
	                e.printStackTrace();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }else { //í‚é~íÜ
	        	mp_full.seekTo(0);
	            mp_full.start();
	            mp_full=null;
	        }
		}
	}


/*
	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
//		Log.d("Widget04","onDeleted");
		super.onDeleted(context, appWidgetIds);
		mp_full.stop();
		mp_full.release();
		mp_full=null;
	}


	@Override
	public void onDisabled(Context context) {
//		Log.d("Widget04","onDeleted");
		super.onDisabled(context);
 		mp_full.stop();
		mp_full.release();
		mp_full=null;
	}
*/


}


