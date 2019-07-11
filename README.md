## IOP vs OOP ##

In the Working Software Conference 2019(https://www.agilemovement.it/workingsoftware/schedule.html),</br> 
I've seen the speech of  Claudio Pattarello: IF Oriented vs Object Oriented.</br>
The idea is to show the IF/Catch/Other abuse and how to use alternative patterns </br>
to have a more Object Oriented version.</br>

Since it's an interesting discussion, also if I don't like every</br>
solution proposed, and since the code used in the speech is written</br> 
in C# (https://archive.codeplex.com/?p=iopvsoop), I've done a version in Java 8 .</br> 
I've try to not alter the code and to make it the more similar I can</br>
to the original version (so, my excuses for some estetics).</br>

If you want to contribute, enriching this repository whit other solutions</br>
without modifing the original code (so separate packages and added tests),   </br>
you're welcome!</br>


### IDEAs PRESENTED ###

 
1. favor branch-less code using modular arithmetic or other</br>
   intrinsic properties of a model or of a computation</br>
  

2. avoid the IF/SWiTCH on the enumeration thanks to the polymorphism</br>
   and with the Visitor Pattern</br>


3. avoid the IF enriching the result of another operation</br>
   via a Decoration Function/Decorator Pattern </br>

  
4. avoid using IF to check for NULL.</br>
   The idea is to return a Processor Object and to bound the</br>
   unvoidable Null-Check to the more internal section of the</br>
   code, limiting its visibility/propagation</br>
               

5. avoid the use IF on executions that can go wrong</br>
   using a Processor Object. We pay the price of a side-effect</br>
   assignment on a Processor Object</br>

6. avoid using the Catch of exceptions as IF through</br>
   the use of Processor Object (lambda) and </br>
   Chain of Responsibility Pattern</br>

7. avoid the IF on the initialization of Singleton or </br>
   other elements when desidered lazy, using Supplier </br>
   which is reassigned at first computation.</br>

