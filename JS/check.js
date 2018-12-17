     alert("haim")
     var liad = 5 ; 
     console.log(liad)
     function searchUser(){
     var username=document.getElementById('username').value;
     var password=document.getElementById('password').value;
     var Http = new XMLHttpRequest();
     var url='http://localhost:8080/demo/login?email='+username;
     Http.open("GET", url);
     Http.send();
     Http.onreadystatechange=function(){
        if(this.readyState==4 && this.status==200){
            
            console.log(Http.responseText);
            var user = JSON.parse(Http.responseText);
            
            
            document.getElementById('stuText').textContent = 'SUCCSESS, Welcome '+user[0].email+".";


        }
     }  
                    
    }

