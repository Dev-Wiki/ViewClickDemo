package com.asia.viewclickdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();
    }

    private Button ttttButton;
    private Button tfttButton;
    private Button tttfButton;
    private Button tftfButton;
    private Button ftttButton;
    private Button ffttButton;
    private Button fttfButton;
    private Button fftfButton;
    private Button clearButton;
    private Button hintButton;
    private TextView textView;
    private void initView() {
        textView = (TextView) super.findViewById(R.id.tv_result);
        clearButton = (Button) super.findViewById(R.id.btn_clear);
        clearButton.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });
        hintButton = (Button) super.findViewById(R.id.btn_hint);
        hintButton.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                textView.setText("");
                textView.append(getResources().getString(R.string.hintContent));
                textView.append(getResources().getString(R.string.hintContent1));
                textView.append(getResources().getString(R.string.hintContent2));
                textView.append(getResources().getString(R.string.hintContent3));
                textView.append(getResources().getString(R.string.hintContent4));
                textView.append(getResources().getString(R.string.hintContent5));
            }
        });
        ttttButton = (Button) super.findViewById(R.id.btn_tttt);
        tfttButton = (Button) super.findViewById(R.id.btn_tftt);
        tttfButton = (Button) super.findViewById(R.id.btn_tttf);
        tftfButton = (Button) super.findViewById(R.id.btn_tftf);
        ftttButton = (Button) super.findViewById(R.id.btn_fttt);
        ffttButton = (Button) super.findViewById(R.id.btn_fftt);
        fttfButton = (Button) super.findViewById(R.id.btn_fttf);
        fftfButton = (Button) super.findViewById(R.id.btn_fftf);
    }
    
    private void setListener(){
        setttttListener();
        settfttListener();
        settttfListener();
        settftfListener();
        
        setftttListener();
        setffttListener();
        setfttfListener();
        setfftfListener();
        
    }
    
    private void setttttListener(){
        ttttButton.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                DLog.d("Click");
                textView.append("Click\n");
            }
        });
        
        ttttButton.setOnLongClickListener(new OnLongClickListener() {
            
            @Override
            public boolean onLongClick(View v) {
                DLog.d("LongClick");
                textView.append("LongClick\n");
                return true;
            }
        });
        
        ttttButton.setOnTouchListener(new OnTouchListener() {
            
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    DLog.d("Down");
                    textView.append("Down\n");
                    return true;
                }
                
                if (action == MotionEvent.ACTION_MOVE) {
                    DLog.d("Move");
                    textView.append("Move\n");
                    return true;
                }
                
                if (action == MotionEvent.ACTION_UP) {
                    DLog.d("Up");
                    textView.append("Up\n");
                    return true;
                }
                return false;
            }
        });
    }
    
    private void settfttListener(){
        tfttButton.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                DLog.d("Click");
                textView.append("Click\n");
            }
        });
        
        tfttButton.setOnLongClickListener(new OnLongClickListener() {
            
            @Override
            public boolean onLongClick(View v) {
                DLog.d("LongClick");
                textView.append("LongClick\n");
                return true;
            }
        });
        
        tfttButton.setOnTouchListener(new OnTouchListener() {
            
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    DLog.d("Down");
                    textView.append("Down\n");
                    return false;
                }
                
                if (action == MotionEvent.ACTION_MOVE) {
                    DLog.d("Move");
                    textView.append("Move\n");
                    return true;
                }
                
                if (action == MotionEvent.ACTION_UP) {
                    DLog.d("Up");
                    textView.append("Up\n");
                    return true;
                }
                return false;
            }
        });
    }
    
    private void settttfListener(){
        tttfButton.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                DLog.d("Click");
                textView.append("Click\n");
            }
        });
        
        tttfButton.setOnLongClickListener(new OnLongClickListener() {
            
            @Override
            public boolean onLongClick(View v) {
                DLog.d("LongClick");
                textView.append("LongClick\n");
                return true;
            }
        });
        
        tttfButton.setOnTouchListener(new OnTouchListener() {
            
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    DLog.d("Down");
                    textView.append("Down\n");
                    return true;
                }
                
                if (action == MotionEvent.ACTION_MOVE) {
                    DLog.d("Move");
                    textView.append("Move\n");
                    return true;
                }
                
                if (action == MotionEvent.ACTION_UP) {
                    DLog.d("Up");
                    textView.append("Up\n");
                    return false;
                }
                return false;
            }
        });
    }
    
    private void settftfListener(){
        tftfButton.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                DLog.d("Click");
                textView.append("Click\n");
            }
        });
        
        tftfButton.setOnLongClickListener(new OnLongClickListener() {
            
            @Override
            public boolean onLongClick(View v) {
                DLog.d("LongClick");
                textView.append("LongClick\n");
                return true;
            }
        });
        
        tftfButton.setOnTouchListener(new OnTouchListener() {
            
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    DLog.d("Down");
                    textView.append("Down\n");
                    return false;
                }
                
                if (action == MotionEvent.ACTION_MOVE) {
                    DLog.d("Move");
                    textView.append("Move\n");
                    return true;
                }
                
                if (action == MotionEvent.ACTION_UP) {
                    DLog.d("Up");
                    textView.append("Up\n");
                    return false;
                }
                return false;
            }
        });
    }
    
    
    private void setftttListener(){
        ftttButton.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                DLog.d("Click");
                textView.append("Click\n");
            }
        });
        
        ftttButton.setOnLongClickListener(new OnLongClickListener() {
            
            @Override
            public boolean onLongClick(View v) {
                DLog.d("LongClick");
                textView.append("LongClick\n");
                return false;
            }
        });
        
        ftttButton.setOnTouchListener(new OnTouchListener() {
            
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    DLog.d("Down");
                    textView.append("Down\n");
                    return true;
                }
                
                if (action == MotionEvent.ACTION_MOVE) {
                    DLog.d("Move");
                    textView.append("Move\n");
                    return true;
                }
                
                if (action == MotionEvent.ACTION_UP) {
                    DLog.d("Up");
                    textView.append("Up\n");
                    return true;
                }
                return false;
            }
        });
    }
    
    private void setffttListener(){
        ffttButton.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                DLog.d("Click");
                textView.append("Click\n");
            }
        });
        
        ffttButton.setOnLongClickListener(new OnLongClickListener() {
            
            @Override
            public boolean onLongClick(View v) {
                DLog.d("LongClick");
                textView.append("LongClick\n");
                return false;
            }
        });
        
        ffttButton.setOnTouchListener(new OnTouchListener() {
            
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    DLog.d("Down");
                    textView.append("Down\n");
                    return false;
                }
                
                if (action == MotionEvent.ACTION_MOVE) {
                    DLog.d("Move");
                    textView.append("Move\n");
                    return true;
                }
                
                if (action == MotionEvent.ACTION_UP) {
                    DLog.d("Up");
                    textView.append("Up\n");
                    return true;
                }
                return false;
            }
        });
    }
    
    private void setfttfListener(){
        fttfButton.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                DLog.d("Click");
                textView.append("Click\n");
            }
        });
        
        fttfButton.setOnLongClickListener(new OnLongClickListener() {
            
            @Override
            public boolean onLongClick(View v) {
                DLog.d("LongClick");
                textView.append("LongClick\n");
                return false;
            }
        });
        
        fttfButton.setOnTouchListener(new OnTouchListener() {
            
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    DLog.d("Down");
                    textView.append("Down\n");
                    return true;
                }
                
                if (action == MotionEvent.ACTION_MOVE) {
                    DLog.d("Move");
                    textView.append("Move\n");
                    return true;
                }
                
                if (action == MotionEvent.ACTION_UP) {
                    DLog.d("Up");
                    textView.append("Up\n");
                    return false;
                }
                return false;
            }
        });
    }
    
    private void setfftfListener(){
        fftfButton.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                DLog.d("Click");
                textView.append("Click\n");
            }
        });
        
        fftfButton.setOnLongClickListener(new OnLongClickListener() {
            
            @Override
            public boolean onLongClick(View v) {
                DLog.d("LongClick");
                textView.append("LongClick\n");
                return false;
            }
        });
        
        fftfButton.setOnTouchListener(new OnTouchListener() {
            
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                if (action == MotionEvent.ACTION_DOWN) {
                    DLog.d("Down");
                    textView.append("Down\n");
                    return false;
                }
                
                if (action == MotionEvent.ACTION_MOVE) {
                    DLog.d("Move");
                    textView.append("Move\n");
                    return true;
                }
                
                if (action == MotionEvent.ACTION_UP) {
                    DLog.d("Up");
                    textView.append("Up\n");
                    return false;
                }
                return false;
            }
        });
    }
}
