
package com.myapp.main;

import com.myapp.utility.MyClass;  // Import MyClass from utility package
import com.myapp.anotherpackage.AnotherClass;  // Import AnotherClass from anotherpackage

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();  // Create object of MyClass
        myClass.greet();  // Call method from MyClass
        
        AnotherClass anotherClass = new AnotherClass();  // Create object of AnotherClass
        anotherClass.greet();  // Call method from AnotherClass
    }
}
