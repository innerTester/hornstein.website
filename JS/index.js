

    function createNew(){
        var email=document.getElementById('email').value;
        var password=document.getElementById('password').value;
        var Http = new XMLHttpRequest();
        var url='http://localhost:8080/demo/add?email='+email+'&password='+password;
        Http.open("GET", url);
        Http.send();

        if(this.readyState==4 && this.status==200){
            
            console.log(Http.responseText);
            var user = JSON.parse(Http.responseText);
            
            
            document.getElementById('stuText').textContent = 'SUCCSESS, Welcome '+user[0].email+".";


        }

       
    }
    