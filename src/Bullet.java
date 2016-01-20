import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bullet extends GameObject{
	
	private GameObjectHandler handler;
	
	public Bullet(int x, int y, GameObjectID id, GameObjectHandler handler) {
		super(x, y, id);
		veloY = 10;
		dmg = -5;
		this.handler = handler;
	}
	
	@Override
	public void updateLogic() {

		y -= veloY;
		collisionAnalyse();
	}

	@Override
	public void updateGraphic(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, 10, 10);
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle(x, y, 10, 10);
	}
	
	private void collisionAnalyse() {

<<<<<<< HEAD
		for(GameObject object : handler.getAllObjects()){
			if(object instanceof Enemy){
				if(this.getBounds().intersects(object.getBounds())){
					handler.removeObject(object);
=======
		GameObject object;
		for(int i = 0; i < handler.getAllObjects().size(); i++){
			object = handler.getAllObjects().get(i);
			if(!(object instanceof Player)){
				if(this.getBounds().intersects(object.getBounds())){
					object.changeHealth(this);
					if(object.getHealth() <= 0)
						handler.removeObject(object);
					handler.removeObject(this);
>>>>>>> origin/master
				}
			}
		}
	}
	
}