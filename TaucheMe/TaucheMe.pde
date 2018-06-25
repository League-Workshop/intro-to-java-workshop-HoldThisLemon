 PImage mustache;
   PImage friend;
 void setup() {
   PImage mustache;
   PImage friend;
   friend = loadImage ("friend.jpg");
   friend.resize(800,600);
   mustache = loadImage ("mustache.png");
  size(800,600);
  friend.resize(width,height);
 }
 void draw() {
 background(friend);
 
 }