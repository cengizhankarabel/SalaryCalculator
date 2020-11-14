package ise308.karabel.cengizhan.salarycalculator

import android.util.Log

class Contract( emp_lead: String, emp_name: String,  emp_surname:String,  emp_salary:Double):Employees(emp_lead, emp_name,emp_surname,emp_salary) {

    companion object{

        const val TAG= "Contract"
    }

    override fun goHoliday() {
        Log.i(TAG,"Contract worker have to go holiday. Override Test Message")
    }
}

