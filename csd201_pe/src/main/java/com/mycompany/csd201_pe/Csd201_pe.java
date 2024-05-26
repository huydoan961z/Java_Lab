/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.csd201_pe;
import java.util.NoSuchElementException;

/**
 *
 * @author aser
 */
public class Csd201_pe 
{
//QUESTION 1
    public class Task implements Comparable<Task > 
    {
        private int id, priority;
        private String description;

        public Task(int id, String description, int priority ) {
            this.id = id;
            this.description = description;
            this.priority = priority;

        } 

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPriority() {
                return priority;
            }

            public void setPriority(int priority) {
                this.priority = priority;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

        @Override
        public int compareTo(Task o) {
            return Integer.compare(this.priority, o.priority);
        } 
        //tostring function to see the details of task( avoid error when printMax heap or task with .com.com..... 
        @Override
        public String toString() {
            return "Task{" + "id=" + id + ", priority=" + priority + ", description=" + description + '}';
        }

    }
    public class main
    {
        public  void main(String[] args) 
        {
    //QUESTION 2

    /*  The advangted of array 
            When discuss about access, it easy to use and quick because in array, every element have the index so it easy to acess  
        The disadvangted of array
            The number or capacity of array was limit, as was declare as first so we cant extand to make it bigger or make it smaller
            And the insert and delete the index in the array is hard, because for sample we have to create a loop to go from 0 to the max index, so its take a lot of time if we use with big data */
            Task[] task = new Task[] {
            new Task(1, "Security patch for vulnerability", 100),
            new Task(1, "Add login feature", 80),
            new Task(1, "Update documentation", 40),
            new Task(1, "Fix email notification bug", 90),
            new Task(1, "Refactor user management module", 70),
            new Task(1, "Implement data caching", 85),
            new Task(1, "Optimize database queries", 75),
            new Task(1, "Write unit tests for new features", 60),
            new Task(1, "Upgrade third-party libraries", 50),
            new Task(1, "Upgrade third-party libraries", 55)
        };


        //run for the merge sort
        mergesort(task, 0, task.length-1);    


        //main for run question 4 
        MaxHeap mh= new MaxHeap(10);
                mh.insert(new Task(1, "Security patch for vulnerability", 100));
                mh.insert(new Task(1, "Add login feature", 80));
                mh.insert(new Task(1, "Update documentation", 40));
                mh.insert(new Task(1, "Fix email notification bug", 90));
                mh.insert(new Task(1, "Refactor user management module", 70));
                mh.insert(new Task(1, "Implement data caching", 85));
                mh.insert(new Task(1, "Optimize database queries", 75));
                mh.insert(new Task(1, "Upgrade third-party libraries", 50));
                mh.insert(new Task(1, "Upgrade third-party libraries", 55));
                //print after insert maxheap
                mh.printMaxHeap();
                //delete max heap then print to see the changes
                mh.deleteMax();
                mh.printMaxHeap();     
        }
//QUESTION 3
        public void merge(Task[] task, int low, int mid, int high) {
         int i, j, k;
         //create a temporary array b and copy a to b
         Task [] b = new Task[task.length];
         for(i = 0; i < task.length; i++) b[i] = task[i];
         i = low; j = mid + 1; k = low;
         while(i <= mid && j <= high) 
        {
            if(b[i].getPriority() > b[j].getPriority())
            task[k++] = b[j++];
              else task[k++] = b[i++];
        }
         while(i <= mid) task[k++] = b[i++];
         while(j <= high) task[k++] = b[j++];
        }
        public void mergesort(Task []a, int low, int high) 
        {
         if(low < high) {
          int k = (low + high) / 2;
          mergesort(a, low, k);
          mergesort(a, k + 1, high);
          merge(a, low, k, high);
         }
        }

        /* About stable we can compare merge sort with the quick sort(as know as not stable)
           Quick is not stable because when we sort each of the element of quick will change the position(sample example is about 2 number 4 in a array when use quick sort
           And that is the reason why when merge sort is stable, every element dont have to change big position
        */


    }


    //question 4
    public class MaxHeap
    {   
        private Task[] heap;
        private int n;
        public MaxHeap(int capacity)
        {
            heap= new Task[capacity+1];
            n=0;
        }
        public boolean isEmpty()
        {
            return n==0; 
        }
         public int size() {
            return n;
        }
        public void resize(int capacity) {
            Task[] temp = new Task[capacity];
            for (int i = 1; i <= n; i++) {
                temp[i] = heap[i];
            }
            heap = temp;
        }
        public void insert(Task task) {
            if (n == heap.length - 1) {
                resize(2 * heap.length);
            }
            n++;
            heap[n] = task;
            swim(n);
        }
        public void swim(int k) {
            while (k > 1 && heap[k / 2].compareTo(heap[k]) < 0) {
                Task temp = heap[k];
                heap[k] = heap[k / 2];
                heap[k / 2] = temp;
                k = k / 2;
            }
        }
        public void printMaxHeap() {
            for (int i = 1; i <= n; i++) {
                System.out.println(heap[i]);
            }
        }
        private boolean less(int i, int j) {
            return heap[i].compareTo(heap[j]) < 0;
        }
        private void sink(int k) {
            while (2 * k <= n) {
                int j = 2 * k;
                if (j < n && less(j, j + 1)) {
                    j++;
                }
                if (!less(k, j)) {
                    break;
                }
                swap(k, j);
                k = j;
            }
        }
        private void swap(int i, int j) {
            Task temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }
        public Task deleteMax() {
            if (isEmpty()) {
                throw new NoSuchElementException("Max Heap is empty");
            }
            Task max = heap[1];
            swap(1, n--);
            sink(1);
            heap[n + 1] = null; // preventing loiter
            if ((n > 0) && (n == (heap.length - 1) / 4)) {
                resize(heap.length / 2);
            }
            return max;
        }
       /*Advangted of max heap 
       -Max Heap provide efficient implementation of priority. The highest priority element is always kept at the front. 
       -Morever Max Heap dont take some extra storage while during use.
       -And the comlexity of space of max heap is O(1)
        */

        // run the heap max is in the main function( question 2) 
    }

}
