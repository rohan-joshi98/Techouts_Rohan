var canvas = document.querySelector("canvas");
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

var c = canvas.getContext("2d");

function createCircles(num) {
  for (var i = 0; i < num; i++) {
    draw();
  }
}

function Circle(x, y, dx, dy, radius) {
  this.x = x;
  this.y = y;
  this.dx = dx;
  this.dy = dy;
  this.radius = radius;
  this.draw = function () {
    c.beginPath();
    c.fillStyle = "skyblue";
    c.arc(this.x, this.y, this.radius, Math.PI * 2, false);
    c.strokeStyle = "green";
    c.fill();
    c.stroke();
  };
  this.update = function () {
    if (this.x + this.radius > innerWidth || this.x - this.radius < 0) {
      this.dx = -this.dx;
    }

    if (this.y + this.radius > innerHeight || this.y - this.radius < 0) {
      this.dy = -this.dy;
    }
    this.x += this.dx;
    this.y += this.dy;
    this.draw();
  };
}

var circles = [];
for (var i = 0; i < 50; i++) {
  var x = Math.random() * innerWidth;
  var y = Math.random() * innerHeight;
  // console.log(yAxis);
  var dx = (Math.random() - 0.5) * 5;
  var dy = (Math.random() - 0.5) * 5;
  var radius = 20;
  circles.push(new Circle(x, y, dx, dy, radius));
}
console.log(circles);
function animate() {
  requestAnimationFrame(animate);
  c.clearRect(0, 0, innerWidth, innerHeight);
  for (var j = 0; j < circles.length; j++) {
    circles[j].update();
  }
}
animate();
