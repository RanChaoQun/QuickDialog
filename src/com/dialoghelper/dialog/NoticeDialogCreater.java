package com.dialoghelper.dialog;

import com.dialoghelper.R;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;


/**
 * 
 * @author Ran
 *
 * 时间: 2015年7月30日
 */
public class NoticeDialogCreater extends DialogCreater{
	
	public NoticeDialogCreater(Activity mActivity) {
		super(mActivity);
		
	}
	@Override
	public void createDialog() {
		dialogView=View.inflate(mActivity, R.layout.dialog_notice_view, null);
		dialogHolder=new NoticeDialogHolder();
		((NoticeDialogHolder)dialogHolder).tv_title=(TextView) dialogView.findViewById(R.id.tv_title);
		((NoticeDialogHolder)dialogHolder).tv_detail=(TextView) dialogView.findViewById(R.id.tv_detail);
		((NoticeDialogHolder)dialogHolder).tv_sure=(TextView) dialogView.findViewById(R.id.tv_sure);
		dialog=DialogUtils.createDialogCenter(mActivity, dialogView, R.style.Trans_Fullscreen);
	}
	
    public	class NoticeDialogHolder extends DialogHolder{
		public TextView tv_title;
		public TextView tv_detail;
		public TextView tv_sure;
	}


}
