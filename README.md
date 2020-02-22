# Spaceship
## Classes
### Simulation
#### Methods
- main method(String args[]):void
-------------
### Spaceship
#### Methods
- Spaceship(double x_coordinate, double y_coordinate, double vx_velocity, double vy_velocity, double ax_acceleration, double ay_acceleration)
- move(double dt):void
- isCollided(Spaceship spaceship, double radius):boolean
- collide(Spaceship spaceship):void
- isReachedToXboundry(Space space):boolean
- isReachedToYboundry(Space space):boolean
- reachedToXboundry():void
- reachedToYboundry():void
- print():void
-------------
### Space
#### Methods
- Space(double xdimension, double ydimension)
- getXdimension():double
- getYdimension():double

## Senario
- There are 50 spaceships in a 500 by 500 2D space.
- The spaceships have randome coordinates, 0.0 speed and random acceleration as initial conditions.
- If two spaceships collide (i.e. their center coordinates are within a given radius), then their velocities are set to 0.0 and their accelerations are negated
- if a space ship reaches the boundary, then its velocity is negated.
##### Note: It's better we consider a solid boundary condition on the boundaries of the space to prevent them to exceed out of the space. (Here the problem it's not resolved!).
- At the end, the Information of each spaceships will be printed.
