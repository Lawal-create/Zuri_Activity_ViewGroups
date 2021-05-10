package com.example.zuri_activity

import com.example.zuri_activity.models.FactModel

object data {
    val funfacts= listOf<FactModel>(
        FactModel(
            "Python",R.drawable.python_logo,"Python is an interpreted high-level general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant indentation."
        ),
        FactModel("Kotlin",R.drawable.kotlin_logo,"Kotlin is a general purpose, free, open source, statically typed “pragmatic” programming language initially designed for the JVM (Java Virtual Machine) and Android that combines object-oriented and functional programming features."),
        FactModel("Php",R.drawable.php_logo,"PHP is a general-purpose scripting language especially suited to web development. It was originally created by Danish-Canadian programmer Rasmus Lerdorf in 1994. The PHP reference implementation is now produced by The PHP Group."),
        FactModel("Java",R.drawable.java_logo,"Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible."),
        FactModel("JavaScript",R.drawable.javascript_logo,"JavaScript, often abbreviated as JS, is a programming language that conforms to the ECMAScript specification. JavaScript is high-level, often just-in-time compiled, and multi-paradigm. It has curly-bracket syntax, dynamic typing, prototype-based object-orientation, and first-class functions.")
    )
}