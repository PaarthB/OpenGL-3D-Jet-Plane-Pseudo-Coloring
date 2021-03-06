# OpenGL: 3D Jet Plane Loader

![Image](/Screenshot1.bmp?raw=true "3D Jet Plane Image")

- Loads data from a .dat file which represents a 3D Jet Model. 

- This application follows the MVC Architectural Pattern as can be observed by seeing the model, view and controller packages. That's why it also possesses a separate GUI for interaction with the 3D Model. The MVC pattern used is the passive variant of MVC.

- It loads data in Tecplot ASCII format and renders it to be displayed. The application supports rotation & translation with the mouse (by keeping track of mouse events), pseduo coloring and wireframe display of the model. Additionally, we can also change the view: Orthographic and Perspective. The code is documented throghout which makes it easier to understand. 

# Usage:
- Run the Renderer.java file, keeping the csv file and .dat file in the project directory.
- Requires the standard JOGL (Java OpenGL) Distribution.
