package ise308.karabel.cengizhan.salarycalculator

import android.util.Log

abstract class Employees( val emp_lead: String, val emp_name: String, val emp_surname:String, var emp_salary:Double) {
    var maxsalary= 0.0
    var emp_dep: String = ""

    constructor(emp_name: String, emp_surname: String, emp_salary: Double, emp_dep: String,emp_lead:String) : this(emp_lead, emp_name, emp_surname, emp_salary) {
        this.emp_dep = emp_dep
    }

    init {
        Log.i(TAG,"From $emp_dep $emp_name $emp_surname's salary $emp_salary Dollars.Lead : $emp_lead")


    }

    companion object{

        const val TAG= "Employees"
    }

    fun calcSalary(emp_dep: String) {
        val salaryCalc: SalaryCalc = SalaryCalc()
        val new_salary = salaryCalc.calculatorSalary(emp_dep,emp_salary)
        if (new_salary > emp_salary) {
            Log.i(TAG, "calcSalary: $emp_lead $emp_name's new salary $new_salary Dollars.")
            emp_salary = new_salary
            if (emp_salary > maxsalary)
                maxsalary= emp_salary
        } else {
            Log.i(TAG, "calcSalary: $emp_name's don't have any salary.")

        }
    }

        fun maximumSalary(){
            Log.i(TAG, " maximumSalary: maximum salary= $maxsalary Dollars.")

    }

    abstract fun goHoliday()



}