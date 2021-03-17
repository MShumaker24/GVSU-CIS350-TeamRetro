package teamretro.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class Ship {

    // ship characteristics
    float movementSpeed;


    //position and dimension
    float xPosition, yPosition;
    float width,height;

    //graphics
    Texture shipTexture;

    public Ship(float movementSpeed, float width,
                float height,  float xCenter,
                float yCenter, Texture shipTexture) {
        this.movementSpeed = movementSpeed;
        this.xPosition = xCenter - width/2;
        this.yPosition = yCenter - height/2;
        this.width = width;
        this.height = height;
        this.shipTexture = shipTexture;
    }

    public void draw(Batch batch){
        batch.draw(shipTexture, xPosition, yPosition);
    }
}
