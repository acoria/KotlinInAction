package com.example.kotlininaction

fun main(){
    val rect = Rectangle(2,2)
    println("${if(rect.isSquare) "Rectangle is square" else "Rectangle is not square"}")
    println("${if(rect.isHuge) "Rectangle is huge" else "Rectangle is tiny"}")
    println("${if(rect.isWide()) "is wide" else "is not wide"}")
    println(rect.sayMyName)
}

class Rectangle(val height: Int, val width: Int){
    //custom accessors without property
    val isSquare: Boolean
        get() {
            return height == width
        }

    //one liner
    val isHuge: Boolean
        get() = height > 5

    //several lines
    val sayMyName: String
        get() {
            //i could do more stuff here
            return "hello $height"
        }

    fun isWide(): Boolean = width > 10
}