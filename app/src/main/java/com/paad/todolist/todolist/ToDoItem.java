package com.paad.todolist.todolist;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by WangWei on 2014/12/12.
 */
public class ToDoItem {
    String task;
    Date created;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public ToDoItem(String task, Date created) {
        this.task = task;
        this.created = created;
    }

    public ToDoItem(String task) {
        this(task,new Date(java.lang.System.currentTimeMillis()));
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        String dateString = sdf.format(created);
        return "("+dateString+")"+task;
    }
}
