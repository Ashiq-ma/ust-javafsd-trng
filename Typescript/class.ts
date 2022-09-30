class Car{
    engine:string;


constructor(engine:string){
    this.engine=engine

}
disp():void{
    console.log("Function displays Engine is:"+this.engine)
}
}
var ob=new Car("XXSY1")
console.log("Reading attribute value engine as:"+ob.engine);