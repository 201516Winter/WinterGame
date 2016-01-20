
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class HUD {
	
	public static int HP = 100;
	private int colorValue = 255;
	public final static int height = 50;
	private int HPBarWidth = 200;
	
	public void updateHUDLogic(){

		HP = Main.constrain(HP, 0, 100);
		
		colorValue = Main.constrain(colorValue, 0, 255);
		
		colorValue = HP * 2;
		
	}
	
	public void updateHUDGraphic(Graphics g){
		// Health
		g.setColor(Color.gray);
		g.fillRect(0, 0, this.HPBarWidth, this.height);
		g.setColor(new Color(75, colorValue,0));
		g.fillRect(0, 0, HUD.HP * 2, this.height);
		g.setColor(Color.white);
		g.drawRect(0, 0, this.HPBarWidth, this.height);
		
		// Score
		int scoreBarWidth = this.HPBarWidth*3/4;
		
		g.setColor(Color.gray);
		g.fillRect(this.HPBarWidth, 0, scoreBarWidth , this.height);
		g.setColor(Color.white);
		g.drawRect(this.HPBarWidth, 0, scoreBarWidth, this.height);
		// Button
		int button1_xpos = this.HPBarWidth + scoreBarWidth;
		int button_width = (Main.WIDTH-button1_xpos)/2;
		g.setColor(Color.gray);
		g.fillRect(button1_xpos, 0, button_width, this.height);
		g.setColor(Color.white);
		g.drawRect(button1_xpos, 0, button_width, this.height);
		// Button 2
		int button2_xpos = this.HPBarWidth + scoreBarWidth + button_width;
		g.setColor(Color.gray);
		g.fillRect(button2_xpos, 0, button_width, this.height);
		g.setColor(Color.white);
		g.drawRect(button2_xpos, 0, button_width, this.height);
		

	}
}
