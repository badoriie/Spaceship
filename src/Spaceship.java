
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
	
	public double getXcoordinate() {
		
		return this.x_coordinate;
		
	}
	
	public void setXcoordinate(double x_coordinate) {
		
		this.x_coordinate = x_coordinate;
		
	}
	

	public double getYcoordinate() {
		
		return this.y_coordinate;
		
	}
	
	public void setYcoordinate(double y_coordinate) {
		
		this.y_coordinate = y_coordinate;
		
	}
	
	public double getVXvelocity() {
		
		return this.vx_velocity;
		
	}
	
	public void setVXvelocity(double vx_velocity) {
		
		this.vx_velocity = vx_velocity;
		
	}
	
	
	public double getVYvelocity() {
		
		return this.vy_velocity;
		
	}
	
	public void setVYvelocity(double vy_velocity) {
		
		this.vx_velocity = vy_velocity; 
		
	}

	public double getAXacceleration() {
		
		return this.ax_acceleration;
		
	}
	
	public void setAXacceleration(double ax_acceleration) {
		
		if( acceleration_lower_bound <= ax_acceleration && ax_acceleration <= acceleration_upper_bound) {
			
			this.ax_acceleration = ax_acceleration;

			}
			else {
				
				throw new IllegalArgumentException(ax_acceleration + " is not a valid ax_acceleration value!, It has to be between 0.0 and 0.1.");
				
			}
		
	}
	
	public double getAYacceleration() {
		
		return this.ay_acceleration;
		
	}
	
	
	public void setAYacceleration(double ay_acceleration) {
		
		if( acceleration_lower_bound <= ay_acceleration && ay_acceleration <= acceleration_upper_bound) {
			
			this.ay_acceleration = ay_acceleration;

		}
		else {
			
			throw new IllegalArgumentException(ay_acceleration + " is not a valid ax_acceleration value!, It has to be between 0.0 and 0.1.");
			
		}
		
	}
	
	public void move(double dt) {
		
		this.x_coordinate = this.x_coordinate + this.vx_velocity * dt;
		this.y_coordinate = this.y_coordinate + this.vy_velocity * dt;
		
		this.vx_velocity = this.vx_velocity + this.ax_acceleration * dt;
		this.vy_velocity = this.vy_velocity + this.ay_acceleration * dt;
		
		
	}
	
	
	
}
