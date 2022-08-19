class tesla(var model:String,var color:String,var speed:Double):car(model,color,speed),imported {
    override fun getfuletype() :String {
        return "electricity"
    }

    override fun theCountryOfManufacture():String {
        return "California"

    }
}