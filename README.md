Learning Java
================

Table of contents
=================

<!--ts-->
   * [OOPs Concept](#oops-concept)
   * [Exception Handling](#exception-handling)
   * [Collections Framework](#collections-framework)
   * [MultiThreading](#multithreading)
   * [DataStructure](#datastructure)
   * [SpringBoot](#springboot)
   * [Serialization](#serialization)
  
  
<!--te-->


SpringBoot
==========

* What is framework?

-> Framework contains prewritten codes in the form of APIs,library,jre,etc. And that is used by developers to create an application.

-> it provides code reusability and save time.


* What is SpringBoot?

-> It is a framework for Rapid Applicaton Development built on top of the Spring framework.

-> we can say in simple words springboot is a combination of spring framwork and embedded servers. 

* Why springboot is used?

-> To design any spring application, a developer needs to taken care of manual set up on Hibernate data source, Entity management,Ssession factory, Transaction management everything.

-> To design all those common set up, a developer doesn't need to define everything individualy, @SpringBootConfiguration annotation enough to manage everything at the time of deployment.

-> It helps us creating efficient fast and stand-alone application.removes lot of configuration and dependencies.

* Use of @SpringBootApplication annotation and ho it works internally?

-> The  @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan with their default attributes.

-> Spring boot enables the developer to use a single annotaion instead of using multiple. But Spring provided loosely coupled features that we can use for individual annotation as per our project.
 
-> @Configuration: which helps you in identyfing  your beans for a  particular spring dependency injection.

-> @EnableAutoConfiguration:helps you in auto scan. auto scan means if particular bean is available in class path it will be auto scan and added to its set of dependencies.  

-> @ComponentScan: it is a places where we can scan our component or bean.


* What are starter dependencies??

-> Springboot starters are maven templates that contain a collection of relevant dependencies that are needed to start a particular functionality.
 
-> we need to import is spring-bbot-starter-web dependency.

-> in pom.xml

   <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
      <version>2.5.4</version>
    </dependency>

-> it contains spring-webmvc, spring-web, hibernate-validator,tomcat-embed-core, tomcat-embed-el,tomcat-embed-websocket.

* What is Spring Actuator? and its advantages?

-> It is springboot feature which allows seeing inside a runing application.

-> It helps you monitor and manage your Spring Boot application by providing production-ready features like health check-up, auditing, metrics gathering, HTTP tracing etc.


* Core Concepts of Spring Security:

1] Authentication: Process of identifying the person trying to access the application. means process of identifying the person is trusted or not.

2] Authorization: Process of identifying if the person is allowed to do this operation.

3] Principal: is the person that identified by authentication process. It is also called currently logged in user that we can store in session.

4] Granted Authority: group of permissions which are allowed for a user.

5] Roles: group of authority that are assigned together.

   Ex: Role_User: login and search
      
       Role_Admin: login search and update            

* How Spring Security is implemented?

-> using basic default autentication which is done by Authentication Manager, by adding dependency of springboot-starter-security in pom.xml.

-> In that, default username is "user" and password is auto-generated after running the application.
 
-> we can provide our custom username and password by defining in application.properties file.

-> Ex: spring.security.user.name=""

       spring.security.user.password=""          

* How to configure Authentication in Spring security (SS)?

-> add springboot-starter-security dependency. 

-> Extend WSCA(WebSecurityConfigureAdapter) in custom class and  use @EnableWebSecurity annotation.

-> override configure(AMB(AuthenticationManagerBuilder)) method.

-> configure type of authentication,user,pass and role.

-> This will create and configure new AM(Authentication Manager) and now SS will use this AM instead of default one.

-> For Authorization, override configure(HttpSercurity http) method.





* ORM(Object Relational Mapping)

-> mapping in the form of xml or annotaion based.

-> used for CRUD operation.

-> suppose from jdbc you want to store data in database.

-> if one object want to store in database then that object have to convert into sql query by writting the query. then getting the record from database, we have ResultSet object. That ResultSet object is converted into object because our output should be in object form.

-> means we have to map our object into SQL query and ResultSet again going to map with object.

-> here all code is hardcoded in jdbc.

-> But in ORM it gives facility to save,update,get,and delete object directly.

-> means it is mapping class with table and varible with column directly. 

* Association Mapping: (4 types):

-> one To one

-> one To many

-> many To one

-> many To many












OOPs Concept
============
OBject Oriented Programming system is a programming concept that work on principle of Object,Class,Inheritance,Polymorphism,Abstraction and Encapsulation.

1] Object:

   Any entity that has states and behavior in known as Object.
   
   Ex: chair,pen,table,etc. it can be any entity logical or physical.
   
   EX.1: A dog is an object. 
   
         States: color,name,breed,etc
         
         Behavior: barking,eating,etc
         
   EX.2: Human is an Object
   
         Human States: height,weight,hair color,name,etc.
         
         Human Behavior: eating,walking,talking,etc.

2] Class:

   Collection of objects is called is called as Class.
   
   EX: If Animal is a class then dog,cat is an object.
   
       If Human is a class then man is an object.
        
3] Inheritance:

   When one object acquires all the properties & behavior of parent object is known as Inheritance.
  
   It provides code reusability.
  
   EX: Operating system -> window 8 to window 8.1 extending functionality.
   
4] Polymorphism:(means same action perform in many ways)

   Same message given to a generalize thing with same behavior but implemented differently for specialize thing.
  
   Polymorphism can be achieve by using overriding(runtime polymorphism) and overloading(compile time polymorphism).
      
   EX: 
      
```java
      //Generalize class
      class Vehicle{ 
	       //gives msg to all vehicle should be stopped  
	       void stop(){
	           System.out.println("Vehicle gives stop msg");
	       }    
      }
       
       //Specialize class
       class Car extends Vehicle{
	       //gives same msg
	        void stop()
	        {
	            System.out.println("Car uses disc to stop");
	        }
       }
       
       class Bicycle extends Vehicle{
	        void stop()
	        {
	             System.out.println("Bicycle has different mechanism to stop");
	        }
       }
       
```
   
   Another example is Traffic signal:
   
   Traffic signal has red,green,yellow light.
   red light gives stop message to all types of vehicles
   and all types of vehicle has different mechanism to stop.
   
5] Abstraction:   
   
   means partial contract/higher level information(concrete method)
   
   Hiding internal details and only showing funtionality.
   
   In java, we use abstract class and interface to achieve abstraction.
   
   EX. 1: A man driving a car. Man knows only pressing the accelerator will increase the speed or applying brakes will stop the car, but he doesn't know about how that funtionality works internally.
   
   EX. 2: T.V remote has the funtionality ON and OFF but customer doesn't know how it works.
    
6] Encapsulation:

   Binding data(States and behavior) into a single unit(Class).
      
   EX: a capsule which is mixed of several medicine.

----------------------------------------------------------------------------------------------------------------------------------------------------------------

JDK:
====
1. JIT is a part of JVM. JVM is a part of JRE.JRE is a part of JDK. 

2. JDK is a java development kit. It provides development tools(java,javac,etc) and runtime enviornment. 

   Development tool contain Compiler(javac) and runtime enviornment is JRE.

3. JRE is a Java Runtime Enviornment. It provides only runtime enviornment,it doesn't provides any development tools. 
  
   Hence,JRE contains only JVM. Hence, we can execute only already developed application, not new application.

4. JVM is a Java Virtual Machine. It is java platform. 

   It provides interperter and JIT using which we can run java bytecode by converting them into current OS machine language.
   
   It is used to excute bytecode.  
   
5. JIT stands for Just In  Time Compiler. It is responsible to help interpreter for executing java bytecode fast.

   JIT is used to improve the performance of java program execution.
   
--------------------------------********************************-------------------------------------------------------

Exception Handling:
===================
Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such as NullPointerException,

it is programmers' fault that he is not checking the code before it being used.

Exception propagation :

-> An exception is first thrown from the top of the stack and if it is not caught, 

-> it drops down the call stack to the previous method.

-> By default, Unchecked Exceptions are forwarded in calling chain (propagated).

-> In case of Checked Exception and its mandatory to use throw keyword.

-> By default only unchecked exceptions are propagated. Checked exceptions throw compilation error, if without declaring throws keyword.

-> throws keyword describes that checked exceptions can be propagated by throws keyword.


--------------------------------********************************-------------------------------------------------------

* Marker interface:

-> it is an empty interface which has no fields and methods.

-> Example of marker interface is Serializable,Clonable,Remote interface.

* Serializable interface: present in java.io.package.
 
-> Serialization is a mechanism of converting state of an object into byte Stream.  

-> DeSerialization is the reverse process of Serialization where byte stream is converted into object.

-> So the advantage of byte stream is platform independent.

-> means we can serialize an object on one platform and deserialize on another platform. 

* Clonable interface:

-> present in java.lang package.

-> clone() method present in Object class. 

-> implements Clonable interface java.lang.Object.clone() method.

-> it is used to create a copy of an object.


Immutable class:
================
-> means once you created an object, we cannot change its content.

-> Example: String,Boolean,Bye,Short classes are immutable.

-> we can create our own immutable class also.

-> by declaring class as final, so we can't extends that class.

-> or by declaring all fields as private. so direct access can't allowed. 

-> or not providing setter methods for variables,can not access outside the class..

-> or make all fields as final, so that values can't change once intialized.

* Why String objects are immutable in Java?

-> As Java uses the concept of String literal. Suppose there are 5 reference variables, all refer to one object "Sachin". 

->If one reference variable changes the value of the object, it will be affected by all the reference variables. 

-> That is why String objects are immutable in Java.

* Why String class is Final in Java?

-> The reason behind the String class being final is because no one can override the methods of the String class. So that it can provide the same features to the new String objects as well as to the old ones.



Difference between String, StringBuffer and StringBuilder.
==========================================================
-> all are represent sequence of characters.

-> But string is immutable class and remaining are mutable class.

-> When we used string literal stores in String Constant Pool and when we used string with new keyword stores in Heap area.

-> When we modify the String object, each time it creates new Object,it can't modify on same object.So performance wise slow and requires more memory.

-> StringBuffer and StringBuilder stores in Heap Area and consume less memory because it modify on existing memory.

-> String and StringBuilder is not thread-safe because of non-synchronized methods.

-> StringBuffer is thread-safe because of synchronized methods.

  





DataStructure
=============
DataStructure is a way of organizing data in a computer so that it can be used effectively.

There are various types of DataStructure:

* Linear DataStructure:Stack,Queue,LinkedList 

  * All operations are done in Stack,Queue,LinkedList in a sequential manner so these datastructure is called as linear datastructure.

Stack:
------
* perform operations on LIFO(Last In First Out) or FILO(First In LastOut) order.
* Stacks are used to implement functions, parsers, backtracking algorithms. A pile of books, a stack of dinner plates,etc. 
* The basic operating principle is that last item you put in is first item you can take out.
* Stack is used in solving problems works on recursion.

Queue:
------
* perform operations on FIFO(First In First Out) order.
* i.e. the element inserted at first in the list, is the first element to be removed from the list. 
* the insertion and deletion can take place from one end.
* It requires more memory
* Queue is used in solving problems having sequential processing.
* A real-world example of queue can be a printer,election voting.


Circular Queue:
---------------
* a linear data structure in which the last element of the Queue is connected to the first element, thus creating a circle.
* the insertion and deletion can take place from any end.
* It requires less memory.
* It has no specific order for execution.
* A real-world example: Traffic system
* In a computer-control traffic system, Each light of traffic light gets ON one by one after every interval of time. 

  Like red light gets ON for one minute then yellow light for one minute and then green light. After green light, the red light gets ON.

Singly linked list (SLL):
-------------------------
* SLL has nodes with only one data field and next link field.
* traversal can be done using the next node link only.
* occupies less memory than DLL as it has only 2 fields.

Doubly linked list (DLL):
-------------------------
* DLL has nodes with a data field, a previous link field and a next link field.
* traversal can be done using the previous node link or the next node link.
* occupies more memory than SLL as it has 3 fields.





MultiThreading
==============
Multithreading is a process of executing multiple threads simultaneously.

Process
-------
* A program in execution is referred as process.
* A process consists of multiple threads.
* A process has its own address space.

Thread
------
* A thread is a lightweight subprocess.
* Threads share the same address space.
* Threads are independent. 
* If there occurs exception in one thread, it doesn't affect other threads. 
  because it uses a shared memory area.

Life cycle of a Thread
----------------------
The life cycle of the thread in java is controlled by JVM.
 
There are states in thread life cycle in java new, runnable, running, wait, sleep and terminated.

<p align="center">
  <img width="460" height="300" src=".images/thread-lifecycle.jpg">
</p>


1. New: 

The thread is in new state if you create an instance of Thread class.

Ex: Thread t= new Thread(); // using new keyword we are creating instance of thread class

2. Runnable: 

The thread is in runnable state after invocation of start() method.

-- means thread is in ready to run state and not in running state.

Ex: t.start(); //calling start() method

3. Running: 

The thread is in running state means the thread scheduler has selected it for an execution.

Ex: void run(){}; // goes to run() method for execution

4. Terminate:

When thread completed its tasks then it will go into terminated or dead state.

5. Blocked:(waiting and sleeping)

When thread call wait() then it will go into blocked state.

Whenever blocked state thread get notify/notifyAll signal it will go into a runnable state.

When thread call sleep() then it will go into blocked state for a specified time.

When that time elapsed it will go again into runnable state.

How to create thread:
---------------------
There are two ways to create a thread:

1. By extending Thread class

-- Thread class extends Object class and implements Runnable interface.

* Java Thread Example by extending Thread class
```
class CreateThread extends Thread{  
	
	public void run(){  
		System.out.println("thread is running...");  
	}  
	
	public static void main(String args[]){  
		CreateThread t1=new CreateThread();  
		t1.start();  
 	}  
}   
```

2. By implementing Runnable interface.

-- The Runnable interface should be implemented by any class.

   But their instance should be executed by a thread.
   
   Runnable interface have only one method named run().
   
*  public void run(): is used to perform action for a thread.

* Java Thread Example by implementing Runnable interface
```
class CreateThread implements Runnable{
  
     public void run(){  
         System.out.println("thread is running...");  
     }  
  
     public static void main(String args[]){  
          CreateThread m1=new CreateThread();  
          Thread t1 =new Thread(m1);  
          t1.start();  
     }  
}  
```

Runnable vs Threads
-------------------
--> When a class is already extended by another class then we can't extend it by Thread class.

--> Because java doesn't support multiple inheritance.

--> But we can implement the Runnable interface while extending another class.
   
--> Each Thread created by the Thread class is associated with new Object.
															
--> whereas Each Thread created by the Runnable interface shares the same Object.


Thread Scheduler in Java
------------------------
It is a part of JVM that decides which thread should be run.
It is a controller of threads.

* Imp points:

--> we cannot start a thread twice.

throws exception IllegalThreadStateException

```
public class ThreadTwice extends Thread{  
 	
 	public void run(){  
   		System.out.println("running...");  
	} 
	 
 	public static void main(String args[]){  
  		ThreadTwice t1=new ThreadTwice();  
  		t1.start();  
  		t1.start();  
	}
}  
 
 o/p:
 running
 Exception in thread "main" java.lang.IllegalThreadStateException
 ```
--> we cannot call run() method directly instead start() method.

because it is not coming from Thread class. So, that method consider as normal run() method
 ```
class CallRun extends Thread{  
 	
 	public void run(){  
   		System.out.println("running...");  
 	}  
 	
 	public static void main(String args[]){  
  		CallRun1 t1=new CallRun1();  
  		t1.run();//fine, but does not start a separate call stack  
 	}  
}  

Output:running...
 ```
 
 Critical Section:
 ----------------
 --> part of a program which accesses a shared resources at the same time is known as critical section.
 
Race Condition:
---------------
--> when multiple threads tries to access a shared resource at the same time, So it gives erroneous result known as race condition. 

--> to avoid this condition and the ways to achieve thread safe execution is as follows:

* by using synchronization (implicit lock)
* by using lock mechanism  (explicit lock)
* using Semaphore
* using Volatile keyword for fields.
 
 --> above types are comes under mutex or mutual exclusive.
 
 --> mutual exclusive means it is taking the mutual decision which thread can come in execution at a time.
 

Methods inherited from class java.lang.Object
---------------------------------------------
--> clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait.
 
DeadLock:
---------
When a thread acquires the lock and it goes on waiting state.

At the same time another thread tries to acquire the same lock, it can't get access.

Because previous thread already holding the lock, that time deadlock occur.

Avoid DeadLock:
---------------
-> By providing ordered locked position.
-> avoid nested locked
-> avoid unnecessary locks.


Synchronization in Java:
------------------------
--> controlling the access of multiple threads to any shared resource.

--> without synchronization RaceConditon will occur.

    see example: multithreading.RaceCondition source code in src folder

The synchronization is mainly used to

1. To prevent thread interference.

2. To prevent consistency problem.

Thread Synchronization:
-----------------------
There are two types of thread synchronization

mutual exclusive and inter-thread communication.

Mutual Exclusive:
-----------------
preventing threads from interfering with one another while sharing data.
 
This can be done by three ways in java:

1. Synchronized method:

Synchronized method is used to lock an object for any shared resource.

When a thread invokes a synchronized method,
it automatically acquires the lock for that object and releases it when the thread completes its task.

 refer example: multithreading.synchronization source code in src folder
 
2. Synchronized block:

Synchronized block can be used to perform synchronization on any specific resource of the method.

Suppose you have 100 lines of code in your method, but you want to synchronize only 8 lines,
you can use synchronized block.

3. static synchronization.



Cooperation (Inter-thread communication in java)
------------------------------------------------
wait(),notify() and notifyAll():

These methods are allowed for inter-thread communication.

Inter-thread communication allowing synchronized threads to communicate with each other.

It is implemented by following methods of Object class:

* wait():

waiting thread goes to blocked state that means it releases the lock and wait until either another thread invokes notify() / notifyAll() method
for this object or a specified amount of time has elapsed.

wait() method should be called from synchronized method only otherwise it will throw exception "IllegalMonitorStateException".

* notify():
wake up signal 

It gives signal to waiting thread and that thread goes to runnable state for execution.

At a time only one thread is chosen to awakened.

* notifyAll():

It is also wake up signal.

It gives signal to all waiting threads and that threads goes to runnable state for execution.

At a time all waited threads are chosen to awakened. 

Locking Mechanism:
------------------
Locking mechanism is similar to synchronization.

Ex: using lock.lock();  //lock acquired
    ........
    ........
    
    lock.unlock();     // lock releases
    
We can achieve synchronization by using locking mechanism also provided with some new features.

Main difference between synchronization and Lock API is that fairness property.

fairness property means giving 1st priority to access longest waiting thread to the lock. 
  
But in synchronization there is no guarantee which waiting thread will get 1st access.

Lock API
--------
* void lock()
* void lockInterruptibly() 
* boolean tryLock() 
* boolean tryLock(long timeout, TimeUnit timeUnit)
* void unlock()

Lock Implementations
--------------------
* using ReentrantLock

* ReentrantReadWriteLock

* StampedLock

Working With Conditions
-----------------------
Traditionally Java provides wait(), notify() and notifyAll() methods for thread intercommunication. 

Conditions have similar mechanisms, but in addition, we can specify multiple conditions.

wait(), notify() and notifyAll() instead of these await(),signal(),signalAll() are used.

Semaphore in Java:
------------------
Semaphore is a variable use for synchronization process.

But it limits the number of threads to access a shared resource concurrently at a time.

Basically it sets the limit of the threads.

if number count > 0 then allowed to access.

if number count <= 0 then denied to access.(negative no. not allowed)

Ex: If we set a semaphore limit 4.

Semaphore semaphore = new Semaphore(4);

then it allows only 4 threads to access shared resource concurrently at a time.

by using semaphore.acquire(); 

it acquires the lock and count will decrease by 1 

And it releases the lock by using

semaphore.release(); 

Then count will increase by 1

Thread Pool in Java
-------------------
--> Thread Pool means a collection of idle threads that are used when required to execute tasks.

--> Need of Thread Pool: 
   
* to limits the number of threads
    
* to reuse the threads 





    
    
Collections Framework
=====================
Collection is a group of individual objects.

A framework is a set of classes and interfaces which provide a ready-made architecture.

**Java Collections Framework -heirarchy-- relationship between various api **

1. Iterable Interface:

root interface , used to iterate to forward direction.
hasNext()
next()
remove()
through Iterable method we get the reference of hasNext & next

2. Collection Interface: 

This interface extends the iterable interface and implemented by all the classes in the collection framework. 

This interface contains all the basic methods which every collection has like adding, removing, clearing, etc.

3. List Interface:

* Stores elements in indexed approach
* can add duplicate elements (supports redundancy)

* ArryList (Class):
    * ArrayList is implemented as a resizable or growable array.
    * As more elements are added to ArrayList, its size is increased dynamically.
    * default capacity = 10 and increaseing capacity = (current capacity * 3/2)+1.
    * It's elements can be accessed directly by using the get and set methods, since ArrayList is essentially an array.
    * duplicates,heterogeneous and null objects are allowed.
    * Worst choice for inserting/deleting in middle of ArrayList. Because several shift operation required.
    * Insertion order is preserved.
    * non-synchronized.
     
    
* LinkedList (Class):
    * LinkedList is implemented as a double linked list.
    * Insertion order is preserved. 
    * non-synchronized.
    * duplicates,heterogeneous and null objects are allowed.
    * Its performance on add and remove is better than ArrayList, but worse on get and set methods. 
    * Single vs double linked list 
         * Single - Used for stack
         * Double Linked List -  implement stacks as well as heaps and binary trees.
    * for retrieval ArrayList is better.


* Vector (Class):
    * similar to ArrayList , but vector is synchronized.
 
* Stack (Class):
    * implements Stack data structure. 
    * stack is child class of Vector 
    * based on last-in-first-out. 
    * In addition to the basic push and pop operations, the class provides three more functions of empty, search and peek.
    
4. Queue (Interface):
    * Will sort the data
    * front will point to last element 
    * rear will be point to first element which get added
    * In Priority queue- data will get sorted. and front will point least number
    * peeking - obtaining head of queue 
    * polling - removing head of queue

* Priority Queue (Class):
    * PriorityQueue doesn�t permit null
    * PriorityQueue is not thread-safe 
    * so java provides PriorityBlockingQueue class that implements the BlockingQueue interface to use in java multithreading environment.

5. Deque (Interface):
    * also known as a double-ended queue.
    * we can add and remove the elements from both the ends of the queue.
    * This interface extends the queue interface. 
    * implements this interface is ArrayDeque class.

* ArrayDeque (Class):
    * provides resizable-array, no capacity restriction.
    * not thread-safe.
    * null element not allowed.
    * ArrayDeque is faster than Stack,LinkedList.


6. Set (Interface):
    * for storing unique objects, data is unordered because it doesn't have index.
    * retrieving is sequential because of not index base.
    * basically we get the hashCode of which we added
    * only one null is allowed.
    * This set interface is implemented by various classes like HashSet, TreeSet, LinkedHashSet.
    * HS and LHS must override equals() and hashcode() method, otherwise data wise duplicates will store.
    * HS and LHS allowed homogeneous,heterogeneous and unique objects.
    * HS and LHS default capacity is 16 and increases by double and Load factor(LF) is 75% .
    * HS and LHS are not synchronize.

* HashSet(HS) (Class):
    * inherent implementation of the hash table data structure.
    * HashSet also uses HashMap internally.
    
    <p align="center">
     <img width="460" height="300" src=".images/hashsetinternal.png">
    </p>
    
    * inherent implementation of the hash table data structure. 
    * objects are inserted based on hashcode.
    
* LinkedHashSet(LHS) (Class):
    * background uses hashset and doubly linkedlist datastructure.
    * performance wise LHS is slower than HS.
    * maintains storing order or insertion order but not index order.
    
7. Sorted Set (Interface):
    * similar to Set Interface.
    * sorted set interface extends the set interface.
    * The class which implements this interface is TreeSet.
    
    
* TreeSet (Class): 
    * must compare objects.
    * allowed only homogeneous and comparable objects.
    * default data store in ascending sorting order.
    * must override Comparable.compareTo() or Comparator.compare(_,_) method otherwise it will throw ClassCastException, if inserted Heterogeneous objects.
    * null value not allowed.
    * duplicate values are not allowed
    * is an implementation of a self-balancing binary search tree like a Red-Black Tree. 
    * implementation of a TreeSet is not synchronized. 
    * to make synchronized use Collections.synchronizedSortedSet() method.
    * Ex:
     
    ```java
      TreeSet ts = new TreeSet();
      Set syncSet = Collections.synchronziedSet(ts);
    ```

**Performance of tree set slower since it takes time for sorting the data.**

8. Map (Interface):
    * Map interface is not a subtype of the Collection interface.
    * Map interface present in java.util package. 
    * A Map is a Data Structure, contains value on the basis of key-value pair.
    * Each key-value pair is known as Entry.
    * Map contains unique keys but value can be homogeneous,heterogeneous and duplicate.
    * map is useful for searching,updating,deleting on the basis of key.
    * if duplicate value is passed then old value is replace with new one.
    
* HashMap (Class):
    * implements Map interface.
    * HashMap uses technique called Hashing.
    * Hashing is a process of converting an Object into Integer value.
    * contains array of nodes.
    * hashCode(): returns memory reference of object in Integer form.
    * And that Integer number is called as Bucket number.
    * Bucket is used to store nodes.
    
* why we use HashMap and HashMap Internals?
  -> HashMap is used for storing objects with Mapping.
  Ex: 
     
    <p align="center">
     <img width="460" height="300" src=".images/hashMap1.png">
    </p>
    
    Comparing an object with every object available in collection is time consuming.
    
    Because no. of comparison increases and performance decreases.
    
    Comparing objects with only its related group of objects(means in hashMap, Bucket is used for grouping) is good programming practice.
    
    Hence while storing objects we must store objects as group based on their values.
    
    So that while searching we can compare this new object only with its group. 
    
   
    * When we add HashSet,LinkedHashSet,HashMap,LinkedHashMap,HashTable,properties put() method internally calls 
    1)hashCode() 2)== operator 3)equals() methods  for stopping duplicate objects.
    * to stop duplicate objects, newly adding key must be compare to all keys available in this map.
    * for comparison we need 
    1)== operator -> for reference comparison</br>
    2)equals() method -> for data comparison</br>
    
    then why hashCode() need?
    * hashCode is not meant for comparison rather it is meant for storing relative objects as one group.
    and it is also used for finding the newly adding or searching objects belong to which group.
    * by using hashCode() no. of comparison decreases and execution become fast.
    * Algorithm of put(): when we add object to map
    1. put() internally calls hashCode() method by using this object/key.
    
    2. put() will find with key hashCode is there any bucket already existed.
    
    3. if not existed then it creates new bucket and store this object in this bucket directly without any comparison.
    
    4. if bucket is available then comparison starts to know whether that object/key is duplicate or not.
       * it uses == operator to compare objects with reference.
       * if reference is same, it is duplicate,then existing mapped value is replace with new value.
       * if reference is different, it calls equals(-) method to compare two objects with this data
       * if data is same, it is duplicate, then existing mapped value is replace with new value.
       * if data is different it is store in same bucket.
        
    
* HashTable Vs ConcurrentHashMap:
        
1. HashTable:

-> is an implementation of Map interface.

-> this is legacy class in which all methods are synchronized.

-> that's why it is thread-safe.

-> it is similar to HashMap,store values in key-value pair but it is synchronized.

-> doen't allow any null key/value.

-> stores data based on hashCode value.

* Comparable Vs Comparator:

-> the thing which are comparable is called comparable.

-> And if the thing not comparable then we can make it comparable by implementing Comparable or Comparator interface.

-> for Example: All Integer or all String values are comparable we can directly sort without any issue using Collections.sort() method.

-> Suppose Employee object want to sort then we have to implement our own logic by implementing Comparable or Comparator interface because Employee object can have many fields.   

-> Comparable interface implements only actual or existing class we can't create comparable customize class.

-> it has only one method compareTo(_);

-> Comparator interface implements original class and can create its own comparator class also. so that this class is used in multiple places and no need to modify existing class everytime.

-> it has compare(_,_); method


    

Collections Class in Java
=========================

1. Adding Elements
2. Sorting a Collection
3. Searching in a Collection
4. Copying Elements
5. Disjoint Collection












