
public class Spaceship {
	
	private double x_coordinate;
	private double y_coordinate;
	private double vx_velocity;
	private double vy_velocity;
	private double ax_acceleration;
	private double ay_acceleration;
	final double acceleration_lower_bound = 0.0;
	final double acceleration_upper_bound = 0.1;
	
	public Spaceship(double x_coordinate, double y_coordinate, double vx_velocity, double vy_velocity, double ax_acceleration, double ay_acceleration) {
		
		this.x_coordinate = x_coordinate;
		this.y_coordinate = y_coordinate;
		this.vx_velocity = vx_velocity;
		this.vy_velocity = vy_velocity;
		
		if( acceleration_lower_bound <= ax_acceleration && ax_acceleration <= acceleration_upper_bound) {
		
			this.ax_acceleration = ax_acceleration;

		}
		else {
			
			throw new IllegalArgumentException(ax_acceleration + " is not a valid ax_acceleration value!, It has to be between 0.0 and 0.1.");
			
		}
		
		if( acceleration_lower_bound <= ay_acceleration && ay_acceleration <= acceleration_upper_bound) {
			
			this.ay_acceleration = ay_acceleration;

		}
		else {
			
			throw new IllegalArgumentException(ay_acceleration + " is not a valid ay_acceleration value!, It has to be between 0.0 and 0.1.");	
			
		}
			
		
	}
	
	
	public void move(double dt) {
		
		this.x_coordinate = this.x_coordinate + this.vx_velocity * dt;
		this.y_coordinate = this.y_coordinate + this.vy_velocity * dt;
		
		this.vx_velocity = this.vx_velocity + this.ax_acceleration * dt;
		this.vy_velocity = this.vy_velocity + this.ay_acceleration * dt;
		

	}
	
	public boolean isCollided(Spaceship spaceship, double radius) {
		
		double distance = Math.sqrt(Math.pow(this.x_coordinate - spaceship.x_coordinate, 2) + Math.pow(this.y_coordinate - spaceship.y_coordinate, 2)); // Euclidean distance
		
		if ( distance <= radius ) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
	public void collide(Spaceship spaceship) {
		
		this.vx_velocity = 0.0;
		this.vy_velocity = 0.0;
		
		spaceship.vx_velocity = 0.0;
		spaceship.vy_velocity = 0.0;
		
		this.ax_acceleration = -1 * this.ax_acceleration;
		this.ay_acceleration = -1 * this.ay_acceleration;
		
		spaceship.ax_acceleration = -1 * spaceship.ax_acceleration;
		spaceship.ay_acceleration = -1 * spaceship.ay_acceleration;
		
	}
	
	public boolean isReachedToXboundry(Space space) {
		
		if ( this.x_coordinate <= 0.0 ||  space.getXdimension() <= this.x_coordinate  ) {
			
			return true;
			
		}
		else {
			
			return false;
			
		}
		
		
	}
	
	public boolean isReachedToYboundry(Space space) {
		
		if ( this.y_coordinate <= 0.0 || space.getYdimension() <= this.y_coordinate ) {
			
			return true;
			
		}
		else {
			
			return false;
			
		}
		
		
	}
	
	public void reachedToXboundry() {
		
		this.vx_velocity = -1 * this.vx_velocity;
		
		
	}
	
	public void reachedToYboundry() {
		
		this.vy_velocity = -1 * this.vy_velocity;
		
		
	}
	
	public void print() {
			
		System.out.format("{x=%.0f ,y=%.0f ,vx=%.0f ,vy=%.0f ,ax=%.2f, ay=%.2f}\n", this.x_coordinate, this.y_coordinate, this.vx_velocity, this.vy_velocity, this.ax_acceleration, this.ay_acceleration );
		
	}
	
}
