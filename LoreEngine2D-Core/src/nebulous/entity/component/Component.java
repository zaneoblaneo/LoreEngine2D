package nebulous.entity.component;

import nebulous.Game;
import nebulous.entity.Entity;

public class Component {
	
	protected Entity parent = null;
	
	public void init(Game game) {}
	
	public void setParent(Entity entity) {
		this.parent = entity;
	}
	
	public Entity getParent() {
		return parent;
	}
	
	@Override
	public String toString() {
		return "No metadata available";
	}
}
