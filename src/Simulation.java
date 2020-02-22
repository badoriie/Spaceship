

public class Simulation {

	public static void main(String[] args) {
		
		int numberofspaceships = 50;
		int iterationnumber = 1000;
		double dt = 1; // Time step
		double radius = 0.5; // criterian for collision
		
		Space space = new Space(500, 500);
		
		Spaceship[] spaceships = new Spaceship[numberofspaceships];
		
		for (int i = 0 ; i < spaceships.length ; i++) {
			
		spaceships[i] = new Spaceship( Math.random() * space.getXdimension(), Math.random() * space.getYdimension(), 0.0, 0.0, Math.random() * 0.1, Math.random() * 0.1);
			
		}
		
		
		for (int n = 0 ; n < iterationnumber ; n++) {
			
			for (int k = 0 ; k < spaceships.length ; k++) {
				
				spaceships[k].move(dt);
				
			}
				
			for (int i = 0 ; i < spaceships.length ; i++) {
				
				for (int j = i+1 ; j < spaceships.length ; j++) {
					
					if (spaceships[i].isCollided(spaceships[j], radius)) {
						
						spaceships[i].collide(spaceships[j]);
						
					}
					
				}
				
				if (spaceships[i].isReachedToXboundry(space)) {
					
					
					spaceships[i].reachedToXboundry();
					
				}
				
				if (spaceships[i].isReachedToYboundry(space)) {
					
					
					spaceships[i].reachedToYboundry();
					
				}
				
			}
			
		}
		
		for (int i = 0 ; i < spaceships.length ; i++) {
			
			System.out.print("Ship " + (i+1) + ": ");
			spaceships[i].print();
			
		}
		
	}

}
