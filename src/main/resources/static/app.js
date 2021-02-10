var stompClient = null;

var socket = new SockJS("/gs-guide-websocket");
stompClient = Stomp.over(socket);
stompClient.connect({}, function (frame) {
  console.log("Connected: " + frame);
  stompClient.subscribe("/topic/color", function (rgbBackground) {
    setBackground(JSON.parse(rgbBackground.body).rgBcolor);
  });
});

function sendColor() {
  stompClient.send(
    "/app/rgb",
    {},
    JSON.stringify({
      'red': $("#red").val(),
      'green': $("#green").val(),
      'blue': $("#blue").val(),
    })
  );
}

function setBackground(color) {
  var display = document.getElementById("display");
  display.style.background = color;
}
