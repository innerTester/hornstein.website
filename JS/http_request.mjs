export function sendNewUser(name, email){

    var xmlHttp= new XMLHttpRequest();
    var url = 'http://localhost:8080/demo/add?name='+name+'&'+email+'=edi'
    xmlHttp.open('GET',url);
    xmlHttp.send(null);
    return xmlHttp.responseText


}
