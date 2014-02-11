package com.csci367;

import android.app.Activity;
import android.os.Bundle;

public class Maze extends Activity {
    private MazeView mazeView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mazeView = new MazeView(this);
        setContentView(mazeView);
    }
}