interface iPerson{
    firstname:string;
    lastname:string;
    sayHi:()=>string;
}
var customer:iPerson={
    firstname:"Tom",
    lastname:"Hamks",
    sayHi:():string=>{return "Hello!!!"} 
    }
        console.log("Customer object");
        console.log(customer.firstname)
        
        console.log(customer.lastname)
        
        console.log(customer.sayHi())

        var employee:iPerson={
            firstname:"Jim",
            lastname:"Blakes",
            sayHi:():string=>{return "Hello"}
                
            
        }
        console.log("Employee object")
        console.log(employee.firstname);
        console.log(employee.lastname);
    
