package br.com.jcstech.metodistaensino.domain

import java.time.LocalDate

class AttendanceSheet {

    var date: LocalDate? = null
    var studentClass: StudentClass? = null
    var teacher: Teacher? = null
    var lessons: List<Lesson> = listOf()
    private var attendances: MutableList<Attendance> = mutableListOf()

    fun addNewAttendance(attendance: Attendance) {
        attendances.add(attendance)
    }
}