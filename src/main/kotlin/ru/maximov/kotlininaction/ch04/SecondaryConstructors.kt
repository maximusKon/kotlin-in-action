package ru.maximov.kotlininaction.ch04.secondaryconstructors

open class View {

    constructor(ctx: Context)

    constructor(ctx: Context, attr: AttributeSet)

}

class MyButton : View {

    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr)
}

class MyButton1 : View {

    constructor(ctx: Context) : this(ctx, AttributeSet())

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr)
}

class AttributeSet

class Context
