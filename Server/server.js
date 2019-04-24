var express = require("express");
var app = express();
var server = require("http").createServer(app);
var os = require("os");
var bodyParser = require('body-parser');
var rp = require('request-promise');
const PORT = process.env.PORT || 5000;

console.log("============ Starting server ============");
	var HostAddress = os.hostname();
	server.listen(PORT);
	app.use(express.static(__dirname+ "js"));
	app.use(bodyParser.json()); 
	app.use(bodyParser.urlencoded({		extended: true		}));
console.log("Waiting for Incoming connections on "+HostAddress+":" + PORT);
console.log("--------------------------------------------------");

server.listen(PORT);

app.use(express.static(__dirname+ "js"));
app.use(bodyParser.json()); 
app.use(bodyParser.urlencoded({		extended: true		}));

/*Web UI*/
/*To be added in the future*/ 
/*
app.get("/",function(req,res){
	res.sendFile( __dirname + "/client/index.html");
});
*/

app.post("/", async function(req,res){
	try{
		
		var data = req.body;

		res.json(response("failed","Nothing implemented yet"))

	}catch(error){
		console.log(error);
	}
});




function response(status,message,userData = null){
  var response = {
    "status" : status,
    "timestamp": new Date(),
    "message":message
  }
  if(userData != null){
    reponse.userData = userData;
  }
  return response
}

exports.shutdown = function (){
	server.close();
}