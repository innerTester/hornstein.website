

    function createNew(){
        var email=document.getElementById('email').value;
        var password=document.getElementById('password').value;
        var Http = new XMLHttpRequest();
        var url='http://localhost:8080/demo/add?email='+email+'&password='+password;
        Http.open("GET", url);
        Http.send();

        console.log(Http.responseText)

       
    }
    