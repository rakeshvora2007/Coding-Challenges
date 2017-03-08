   var gaadi = ["Santro", "Mercedes", "Maruti"];
        var gaadi2 = ["Audi", "Honda", "Hyundai"];
        var gaadi3 = ["Car1", "Car2"];



            function selection() {
                var input;
                input = document.getElementById("input").value;

                switch (input) {
                case '0': (function myFunction(){

                    var person ={firstName:"R",
                                 lastName:"J",
                                 id:2459,
                                 fullName:function(){
                                    x = 12.678;
                                     return parseFloat(x);
                                 }};

                    document.getElementById("demo").innerHTML=gaadi;


                })()
                    break;
                case '1': (function myFunction2(){


                                document.getElementById("demo").innerHTML = gaadi2;

                            })()

                    break;

                case '2': (function myFunction3(){
                                var gaadimeet = gaadi.concat(gaadi2,gaadi3);
                                var gaadislice = gaadimeet.slice(2,5);
                                document.getElementById("demo").innerHTML= gaadimeet.sort();
                                document.getElementById("demo1").innerHTML= gaadislice;
                            })()

                    break;

                case '3': (function myFunction4()
                            {       
                                if(gaadi[0] =="Santro") {
                                document.getElementById("demo").innerHTML = "There is car";
                            }
                                else {
                                document.getElementById("demo").innerHTML = "There is no such car";
                                     }
                            })()
                    break;
                    

            default: document.getElementById("demo").innerHTML="Sorry Wrong Input";
                    
            }
        }