package nebulous.testGame;

import nebulous.Game;
import nebulous.addons.entity.simple.EntityMovable;
import nebulous.graphics.component.Transform;
import nebulous.logic.Input;
import nebulous.utils.Console;

public class Player extends EntityMovable {
	
	private float walkSpeed = 8f;
	
	public Player(float x, float y) {
		super(x, y);
	}
	
	@Override
	public void init(Game game) {
		Console.println("Player", "Player initialized...");
	}

	@Override
	public void update(Game game, double delta) {
		
		float deltaX = 0;
		float deltaY = 0;
		
		// SPACE
		if(Input.isKeyHeld(Input.KEY_SPACE)){
			
		}
		
		// W(UP)
		if(Input.isKeyHeld(Input.KEY_W)){
			deltaY += walkSpeed * delta;					//TODO: FIX and multiply with delta
		}
		
		// A(LEFT)
		if(Input.isKeyHeld(Input.KEY_A)){
			deltaX += -(walkSpeed) * delta;
		}
		
		// S(DOWN)
		if(Input.isKeyHeld(Input.KEY_S)){
			deltaY += -(walkSpeed) * delta;
		}
		
		// D(RIGHT)
		if(Input.isKeyHeld(Input.KEY_D)){
			deltaX += walkSpeed * delta;
		}
		
		attemptMove(game.getActiveLevel(), deltaX, deltaY);
		game.getActiveLevel().getCamera().setPosition(((Transform)getComponent(Transform.class)).position);
		
	}

}
