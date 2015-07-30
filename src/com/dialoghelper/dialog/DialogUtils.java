package com.dialoghelper.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
/**
 * 
 * @author Ran
 *
 * 时间: 2015年7月30日
 */
public class DialogUtils {
	public static Dialog createDialog(Activity activity,View view,int style){
		Dialog dialog=new Dialog(activity,style);
		dialog.setContentView(view);
		Window dialogWindow =dialog.getWindow();
		WindowManager.LayoutParams dialogLayoutParams= dialogWindow.getAttributes();
		dialogLayoutParams.width=LayoutParams.MATCH_PARENT;
		dialogLayoutParams.height=LayoutParams.WRAP_CONTENT;
		dialogWindow.setGravity(Gravity.CENTER);
		dialog.setCancelable(false);
		return dialog;
	}
}
