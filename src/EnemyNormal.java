import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class EnemyNormal extends GameObject{

	public EnemyNormal(int x, int y, GameObjectID id) {
		super(x, y, id);
		veloY = 2;
		dmg = -15;
		health = 5;
	}

	@Override
	public void updateLogic() {
		if(y < 0 || y > Main.HEIGHT - 15 - 28) veloY *= -1;
		y += veloY;
	}

	@Override
	public void updateGraphic(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, 30, 30);
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle(x, y, 30, 30);
	}

}
