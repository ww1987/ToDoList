package com.paad.todolist.todolist;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.paad.EventInterface.OnNewItemAddedListener;
import com.paad.fragment.ToDoListFragment;

import java.util.ArrayList;


public class MainActivity extends Activity implements OnNewItemAddedListener{


    private ListView myListView;
    private ArrayList<ToDoItem> todoItems ;
    private ArrayAdapter<ToDoItem> aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        FragmentManager fm = getFragmentManager();
        ToDoListFragment toDoListFragment = (ToDoListFragment) fm.findFragmentById(R.id.to_do_lidt_fragment);
        todoItems = new ArrayList<ToDoItem>();
        aa = new ArrayAdapter<ToDoItem>(this,R.layout.todolist_item,todoItems);

        toDoListFragment.setListAdapter(aa);
    }


    @Override
    public void onNewItemAdded(String newItem) {
        ToDoItem newTodoItem = new ToDoItem(newItem);
        todoItems.add(newTodoItem);
        aa.notifyDataSetChanged();
    }
}
