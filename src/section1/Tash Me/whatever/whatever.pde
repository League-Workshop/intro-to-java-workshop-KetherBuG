PImage mustache;
PImage cell;
void setup() {
  cell = loadImage("cell.png");
  size(800, 600);
  cell.resize(width,height);
  mustache = loadImage("boi.png");
  
}

void draw() {
  background(cell); {
    if(mousePressed){
      image(mustache, mouseX, mouseY);
      
    }
  }
}