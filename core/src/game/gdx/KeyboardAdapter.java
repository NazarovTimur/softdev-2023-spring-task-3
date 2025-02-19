package game.gdx;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector2;

public class KeyboardAdapter extends InputAdapter {
    boolean p = true;
    private boolean leftPressed;
    private boolean rightPressed;
    private boolean upPressed;
    private boolean downPressed;

    private final Vector2 direction = new Vector2();
    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.A) leftPressed = true;
        if (keycode == Input.Keys.D) rightPressed = true;
        if (keycode == Input.Keys.W) upPressed = true;
        if (keycode == Input.Keys.S) downPressed = true;

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        if (keycode == Input.Keys.A) leftPressed = false;
        if (keycode == Input.Keys.D) rightPressed = false;
        if (keycode == Input.Keys.W) upPressed = false;
        if (keycode == Input.Keys.S) downPressed = false;

        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }
    public Vector2 getDirection() {
        direction.set(0, 0);
        if (leftPressed) {
            if(p) direction.add(-5, 0);
            else direction.add(-10, 0);
        }
        if (rightPressed) {
            if(p) direction.add(5, 0);
            else direction.add(10, 0);
        }
        if (upPressed) {
            if(p) direction.add(0, 5);
            else direction.add(0, 10);
        }
        if (downPressed) {
            if(p)direction.add(0, -5);
            else direction.add(0, -10);
        }
        return direction;
    }
    public void swap1() {
        p = false;
    }
    public void swap2() {
        p = true;
    }
}
