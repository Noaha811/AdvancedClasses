//Noah Anderson
import java.text.DecimalFormat

class Employee(private var name: String, private var position: PositionTitle,
               private var salary: Boolean, private var payRate: Double, private var shift: Int){

    //calculates pay and prints it to console
    fun calculate(hoursIn: Double){
        val twoDigits = DecimalFormat("$###,###,###.00")
        val totalPay = if(this.salary){
            40*this.payRate
        } else{
            if(hoursIn > 40){
                val otHours = hoursIn-40
                40*this.payRate+otHours*this.payRate*1.5
            } else{
                hoursIn*this.payRate
            }
        }
        if(this.shift==1){
            println("${this.name} earned ${twoDigits.format(totalPay)}")
        }
        if(this.shift==2){
            println("${this.name} earned ${twoDigits.format(totalPay*1.05)}")
        }
        if(this.shift==3){
            println("${this.name} earned ${twoDigits.format(totalPay*1.10)}")
        }

    }

    //prints out employee information in a formated way
    fun display(){
        val twoDigits = DecimalFormat("$###,###,###.00")

        println(this.name)
        println("${this.position.printedPos} Is Salary: ${this.salary} shift: ${this.shift}")
        println("Rate of pay is: ${twoDigits.format(this.payRate)}")
    }


}


