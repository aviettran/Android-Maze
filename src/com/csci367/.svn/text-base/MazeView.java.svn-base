package com.csci367;

import java.util.*;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

public class MazeView extends GLSurfaceView {
    private MazeRenderer renderer;
    
    public MazeView(Context context) {
        super(context);
        renderer = new MazeRenderer();
        setRenderer(renderer);
        
        //Scheduled task
        class Refresh extends TimerTask {
        	public void run() {
        		renderer.move();
        	}
        }
        
        //Run the scheduled task every 50ms
        Refresh refresh = new Refresh();
        new Timer().scheduleAtFixedRate(refresh, 0, 50);
    }
    
    public boolean onTouchEvent(final MotionEvent event) {
        queueEvent(new Runnable() {
            public void run() {
            	//If the screen is being touched, send the normalized touch coordinates to the renderer
            	if(event.getAction() == MotionEvent.ACTION_MOVE
            			|| event.getAction() == MotionEvent.ACTION_DOWN){
            		renderer.setNTC(event.getX() / getWidth(), event.getY() / getHeight());
            	} else { //Screen is not being touched, reset touch coordinates to middle of screen
            		renderer.setNTC(.5, .5);
            	}
            }
        });
        return true;
    }

    
}