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
------
The thread is in new state if you create an instance of Thread class.
Ex: Thread t= new Thread(); // using new keyword we are creating instance of thread class

2. Runnable: 
-----------
The thread is in runnable state after invocation of start() method.

-- means thread is in ready to run state and not in running state.
Ex: t.start(); //calling start() method

3. Running: 
----------
The thread is in running state means the thread scheduler has selected it for an execution.

Ex: void run(){}; // goes to run() method for execution

4. Terminate:
------------
When thread completed its tasks then it will go into terminated or dead state.

5. Blocked:(waiting and sleeping)
-----------
When thread call wait() then it will go into blocked state.
Whenever blocked state thread get notify/notifyAll signal it will go into a runnable state.
When thread call sleep() then it will go into blocked state for a specified time.
When that time elapsed it will go again into runnable state.

How to create thread:
---------------------
There are two ways to create a thread:

1. By extending Thread class
-- Thread class extends Object class and implements Runnable interface.

2. By implementing Runnable interface.












Collections Framework
===================

**Java Collections Framework -heirarchy-- relationship between various api **

Iterator
--------
root interface , used to iterate to forward direction.
hasnext()
next()
remove()
through iterable method we get the reference of hasnext & next


List
----
* Stores elements in indexed approach
* can add duplicate elements (supports redudancy)

* ArryList 
    * ArrayList is implemented as a resizable array.
    * As more elements are added to ArrayList, its size is increased dynamically.
    * It's elements can be accessed directly by using the get and set methods, since ArrayList is essentially an array.

* Linkedlist
    * LinkedList is implemented as a double linked list. 
    * Its performance on add and remove is better than Arraylist, but worse on get and set methods. 
    * Single vs double linked list 
         * Single - Used for stack
         * Double Linked List -  implement stacks as well as heaps and binary trees.

* Vector
    * similar to Arraylist , but vector is synchronized.

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
    * basically we get the hashcode of which we added

**Performance of tree set slower since it takes time for sorting the data.**
