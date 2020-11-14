package ise308.karabel.cengizhan.salarycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SalaryCalculator()

    }

    private fun SalaryCalculator() {

        val fulltime_emp1 = Fulltime("Fulltime","Cengizhan","Karabel",8000.0)
        fulltime_emp1.calcSalary("Technical")
        fulltime_emp1.goHoliday()
        fulltime_emp1.checkSalary("Cengizhan")
        fulltime_emp1.checkSalary("Cengizhan","Karabel")


        val conract_emp1 = Contract("Contract","Selin","Karabel",6000.0)
        conract_emp1.calcSalary("Hr")
        conract_emp1.goHoliday()

      /*  var emp1 = Employees("stajyer","Cengizhan","Karabel",8000.0)
        var emp2 = Employees("1 yıl sozlesmeli","Selin","Karabel",6000.0)
        var emp3 = Employees("3 aylık sozlesmeli","Chivas","Karabel",4000.0)
        emp1.calcSalary("Sales")
        emp1.calcSalary("Sales")
        emp2.calcSalary("Technical")
        emp3.calcSalary("Hr")

        emp1.maximumSalary()*/
    }
}