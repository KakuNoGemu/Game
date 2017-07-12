package me.game.data.entity;

/**
 * Created by michtros17 on 11.07.2017.
 */
public class EntityMovementManager {

    private Entity entity;

    private int factor = 32;

    private int curX, curY;

    public EntityMovementManager(Entity entity) {
        this.entity = entity;
        this.curX = this.entity.getX();
        this.curY = this.entity.getY();
    }

    public void handleLeftMovement() {
        this.curX -= factor;
        updatePosition();
    }

    public void handleRightMovement() {
        this.curX += factor;
        updatePosition();
    }

    public void handleUpMovement() {
        this.curY -= factor;
        updatePosition();
    }

    public void handleDownMovement() {
        this.curY += factor;
        updatePosition();
    }

    private void updatePosition() {
        this.entity.setPositions(this.curX, this.curY);
    }

}
