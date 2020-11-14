package ise308.karabel.cengizhan.salarycalculator

import android.util.Log

class Fulltime( emp_lead: String, emp_name: String,  emp_surname:String,  emp_salary:Double):Employees(emp_lead, emp_name,emp_surname,emp_salary)  {

    companion object{

        const val TAG= "Fulltime"
    }

    override fun goHoliday() {
        Log.i(TAG,"Fulltime worker have to go holiday. Override Test Message")
    }

    fun checkSalary(emp_name: String):Double {
        Log.i(TAG,"Overload Test Message one parameter")
        return emp_salary

    }

    fun checkSalary(emp_name: String,emp_surname: String):Double{
        Log.i(TAG,"Overload Test Message two parameter")
        return emp_salary

    }
}