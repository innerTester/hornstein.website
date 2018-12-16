var mysql= require("mysql");

var con= mysql.createConnection({

    host:'localhost:3306',
    user:'root',
    password:'0451'
});

con.connect(function(err) {
    if (err) throw err;
    console.log("Connected!");
  });