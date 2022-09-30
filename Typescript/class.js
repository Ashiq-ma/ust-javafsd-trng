var Car = /** @class */ (function () {
    function Car(engine) {
        this.engine = engine;
    }
    Car.prototype.disp = function () {
        console.log("Function displays Engine is:" + this.engine);
    };
    return Car;
}());
var ob = new Car("XXSY1");
console.log("Reading attribute value engine as:" + ob.engine);
