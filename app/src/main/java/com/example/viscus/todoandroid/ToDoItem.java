package com.example.viscus.todoandroid;

/**
 * Created by Viscus on 9/28/16.
 */

public class ToDoItem {
    String text;
    boolean isDone;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public ToDoItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }




    @Override
    public String toString() {
        String checkbox = "";
        if (isDone) {
            checkbox = "x";

        }
    }

    return String.format("%s %s", checkbox, text);
}
