package com.paad.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.paad.todolist.todolist.R;

/**
 * Created by WangWei on 2014/12/11.
 */
public class ClearableEditText extends LinearLayout {
    private  Button clearButton;
    private  EditText editText;

//    public ClearableEditText(Context context) {
//        super(context);
//
//        String infservice = Context.LAYOUT_INFLATER_SERVICE;
//        LayoutInflater li;
//        li = (LayoutInflater) getContext().getSystemService(infservice);
//
//        li.inflate(R.layout.clearable_edit_text,this,true);
//
//        editText=(EditText) findViewById(R.id.editText);
//        clearButton=(Button) findViewById(R.id.clearButton);
//
//        hookupButton();
//    }

    public ClearableEditText(Context context) {
        super(context);

        setOrientation(LinearLayout.VERTICAL);

        editText = new EditText(getContext());
        clearButton = new Button(getContext());
        clearButton.setText("Clear");

        int lHeight = LayoutParams.WRAP_CONTENT;
        int lWidth = LayoutParams.MATCH_PARENT;

        addView(editText,new LinearLayout.LayoutParams(lWidth,lHeight));
        addView(clearButton,new LinearLayout.LayoutParams(lWidth,lHeight));

        hookupButton();
    }

    public ClearableEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ClearableEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    private void hookupButton() {
        clearButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });
    }
}
