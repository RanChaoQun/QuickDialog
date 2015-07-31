# QuickDialog
QuickDialog可以很好的统一管理和构建dialo,具有很好的扩展性。<br>
1.使用DialogUtils来管理构建Dialog的主题样式以及位置等。<br>
2.使用DialogCreater来实例化dialog。<br>
3.DialogHolder返回该dialog对应的viewHolder.<br>
每一个dialog的布局对应一个DialogCreater
  ``` java 
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
```
在Activity中使用
``` java 
public class MainActivity extends Activity implements OnClickListener{

	NoticeDialogCreater.NoticeDialogHolder dialogHolder;
	Dialog dialog;
	NoticeDialogCreater noticeDialogCreater;
	
	TextView tv_dialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//创建
		noticeDialogCreater=new NoticeDialogCreater(this);
		dialog=noticeDialogCreater.getDialog();
		dialogHolder=(NoticeDialogHolder) noticeDialogCreater.getDialogHolder();
		dialogHolder.tv_title.setText("温馨提醒");
		dialogHolder.tv_detail.setText("android（Google公司开发的操作系统）");
		dialogHolder.tv_sure.setOnClickListener(this);
		
		tv_dialog=(TextView)findViewById(R.id.tv_dialog);
		tv_dialog.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v==dialogHolder.tv_sure){
			dialog.dismiss();
		}else if(v==tv_dialog){
			dialog.show();
		}
	}

}
```

