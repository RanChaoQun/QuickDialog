package com.dialoghelper.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
/**
 * 
 * @author Ran
 *
 * 时间: 2015年7月30日
 */
public abstract class DialogCreater {
	protected Dialog dialog;
	protected View dialogView;
	protected DialogHolder dialogHolder;
	protected Activity mActivity;
	
	public DialogCreater(Activity mActivity) {
		this.mActivity = mActivity;
		createDialog();
	}
	public  Dialog getDialog(){
		return dialog;
	}
	public  DialogHolder getDialogHolder(){
		return dialogHolder;
	}
	public abstract void createDialog();
}
