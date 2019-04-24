var expect = require('chai').expect;
var rp = require('request-promise');
var url = "http://127.0.0.1:5000";


/*  This function will make a request to the server and return a response
*   @param option: Determines what type of action you are trying to send (login/register)
*   @param user  : Contains the username or email, The server should be able to tell the difference
*   @param pass  : Contains the user password (the server will evaluate the if valid or not)
*   @return : Returns a JSON object in the format of the Reponse function
*/
async function MakeRequest(option,user,pass){
  var data = {
    "option":option,
    "data": {
      "user": user
      "pass": pass
    }
  };
  var options = {
      method: 'POST',
      uri: url,
      body: data,
      json: true // Automatically stringifies the body to JSON
  };
   
  return await rp(options)
      .then(function (parsedBody) {
          // console.log("l134: "+ parsedBody)
          return parsedBody;
      })
      .catch(function (err) {
          console.log(err);
      });
}

describe('Login testing', function () {
  this.timeout(10000);
  it('Valid user',async function () {  
    var res =await MakeRequest("register","John","12345678")
    var res =await MakeRequest("login","John","12345678")
    expect(res.status).to.equal("success")
  });
  it('Missing password',async function () {
    var res =await MakeRequest("login","John","")
    expect(res.status).to.equal("failed")
    expect(res.message).to.equal("Password missing")
  });
  it('Missing password',async function () {
    var res =await MakeRequest("login","","1234567890")
    expect(res.status).to.equal("failed")
    expect(res.message).to.equal("Username missing")
  });
  it('No details',async function () {
    var res =await MakeRequest("login","","")
    expect(res.status).to.equal("failed")
    expect(res.message).to.equal("Username missing")
  });
  it('no option',async function () {
    var res =await MakeRequest("","John","Doe")
    expect(res.status).to.equal("failed")
    expect(res.message).to.equal("Please choose an action")
  });
});


describe('Register testing', function () {
  this.timeout(10000);
  it('Valid user',async function () {
    var res =await MakeRequest("remove","John","")// Just to make sure we can make a user
    var res =await MakeRequest("register","John","12345678")
    expect(res.status).to.equal("success")
    expect(res.message).to.equal("Sucessfully registered")
  });
  it('Existing user',async function () {
    var res =await MakeRequest("register","John","12345678")
    var res2 =await MakeRequest("remove","John","")// removes the user after the test case
    expect(res.status).to.equal("success")
    expect(res.message).to.equal("Sucessfully registered")
  });

  it('Missing password',async function () {
    var res =await MakeRequest("register","John","")
    expect(res.status).to.equal("failed")
    expect(res.message).to.equal("Password missing")
  });
  it('Missing password',async function () {
    var res =await MakeRequest("register","","1234567890")
    expect(res.status).to.equal("failed")
    expect(res.message).to.equal("Username missing")
  });
  it('No details',async function () {
    var res =await MakeRequest("register","","")
    expect(res.status).to.equal("failed")
    expect(res.message).to.equal("Username missing")
  });
  it('no option',async function () {
    var res =await MakeRequest("","John","Doe")
    expect(res.status).to.equal("failed")
    expect(res.message).to.equal("Please choose an action")
  });
});