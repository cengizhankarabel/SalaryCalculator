package ise308.karabel.cengizhan.salarycalculator

const val INVALID_ARG = -1.0

class SalaryCalc {

    val departments : Array<String> = arrayOf("Sales","Marketing","Hr","Technical")

    fun getIncRate(dep_name: String): Double {
        when (dep_name) {
            "Sales" -> {return (0.20)}
            "Marketing" -> {return (0.20)}
            "Hr" -> {return (0.20)}
            "Technical" -> {return (0.20)}
            else -> return INVALID_ARG
        }

    }

    fun calculatorSalary(dep_name: String, emp_salary: Double): Double {
        return (getIncRate(dep_name)*emp_salary)+emp_salary
    }


}