package ru.maximov.kotlininaction.ch07.propertydelegation

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun main(args: Array<String>) {
    val person = Person("Dmitry", 34, 2000)
    person.addPropertyChangeListner(
            PropertyChangeListener { event ->
                println("Property ${event.propertyName} changed from ${event.oldValue} to ${event.newValue}")
            }
    )

    person.age = 35
    person.salary = 2100
}

class Person(val name: String, age: Int, salary: Int) : PropertyChangedAware() {

    //реализовано руками
    var age: Int by ObservablePropety(age, changeSupport)

    //стандартные средства
    var salary: Int by Delegates.observable(salary,
            { property, oldValue, newValue -> changeSupport.firePropertyChange(property.name, oldValue, newValue) })

}

class ObservablePropety(var propValue: Int, val changeSupport: PropertyChangeSupport) {

    operator fun getValue(p: Person, prop: KProperty<*>): Int = propValue

    operator fun setValue(p: Person, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}

open class PropertyChangedAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListner(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListner(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}