Learning Java
================

Table of contents
=================

<!--ts-->
   * [Collections Framework](#collections-framework)
   * [Serialization](#serialization)
   * [MultiThreading](#multithreading)

<!--te-->

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

* by using synchronization
* by using lock mechanism  
 
 --> above types are comes under mutex or mutual exclusive.
 
 --> mutual exclusive means it is taking the mutual decision which thread can come in execution at a time.
 

Methods inherited from class java.lang.Object
---------------------------------------------
--> clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait.
 
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



Collections Framework
===================

**Java Collections Framework -heirarchy-- relationship between various api **

Iterator
--------
root interface , used to iterate to forward direction.
hasNext()
next()
remove()
through Iterable method we get the reference of hasNext & next


List
----
* Stores elements in indexed approach
* can add duplicate elements (supports redundancy)

* ArryList 
    * ArrayList is implemented as a resizable array.
    * As more elements are added to ArrayList, its size is increased dynamically.
    * It's elements can be accessed directly by using the get and set methods, since ArrayList is essentially an array.

* LinkedlList
    * LinkedList is implemented as a double linked list. 
    * Its performance on add and remove is better than Arraylist, but worse on get and set methods. 
    * Single vs double linked list 
         * Single - Used for stack
         * Double Linked List -  implement stacks as well as heaps and binary trees.

* Vector
    * similar to ArrayList , but vector is synchronized.

* Queue
    * Will sort the data
    * front will point to last element 
    * rear will be point to first element which get added
    * In Priority queue- data will get sorted. and front will point least number
    * peeking - obtaining head of queue 
    * polling - removing head of queue


* Set
    * data is unique, data is unordered due to hashing
    * data is being added is not indexed
    * basically we get the hashCode of which we added

**Performance of tree set slower since it takes time for sorting the data.**
