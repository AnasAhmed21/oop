class BMW(var model:String,var color:String,var speed:Double):car(model,color,speed) ,imported {
    override fun getfuletype() :String {
        return "gas"
    }
    override fun theCountryOfManufacture ():String{
        return "germany"
    }
}