package listTask;

/**
 * app.patika.dev\aibozlak
 * 
 * Task: Write your own list class (Generic class) - Without using Collection class
 * 
 * Problems: indexOf(T) and lastIndexOf(T) methods... 
 *           Or set(int, T) method ...
 * 
 */
class MyList<T extends Object> {  // <------ In Java: All classes extends Object class

   private Object[] list;  // <----- **** All T type object is a Object type object... (Inheritance) ****

   // ------------------------------- Constructors -----------------------------
   public MyList(){
      list = new Object[10];
      for (int i = 0; i < 10; i++){ list[i] = null; }
   }

   public MyList(int capacity){
      list = new Object[capacity];
      for (int i = 0; i < capacity; i++){ list[i] = null; }
   }

   // ****************************************************  Methods  **************************************************** 
   public int size(){      // <----------------- size() : int method --------------------------------|
      int counter = 0;
      int length = list.length;
      for (int i = 0; i < length; i++){
         if (list[i] != null){ counter++; }
      }
      return counter;
   }

   public int getCapacity(){ return list.length; }  // <--------------------- getCapacity() : int method -----------------|

   public void add(T element){ // <---------------------- Start add() method ----------------------|
      int capacity = this.getCapacity();

      if (this.size() < capacity){

         for (int i = 0; i < capacity; i++){
            if(list[i] == null){ list[i] = element; break; }
         }

      } else {
         Object[] tempArray = new Object[capacity];
         for (int i = 0; i < capacity; i++){ tempArray[i] = list[i]; } // <----- Because arrays are reference type

         list = new Object[capacity * 2];
         for (int i = 0; i < capacity; i++){ list[i] = tempArray[i]; }

         list[capacity] = element;
      }
   }  // <--------------------------- End add() method ------------------------------|

   public T get(int index){  // <-------------- get(index) method ------------------|
      T element = (T) list[index];
      return element;
   }  

   public void remove(int index){   // <----------------------- Start remove(index) method -------------------------|
      int capacity = this.getCapacity();
      if (index < capacity){
         for (int i = index; i < capacity-1; i++){ list[i] = list[i+1]; } // <------ Scroll i <- i+1

         if (list[capacity-1] != null){  // <------- If last element is not null, I must delete it
            for (int i = capacity-1; i > -1; i--){
               if (list[i] != null){ list[i] = null; break; }   
            }
         }

      } else {
         System.out.println("İndis girme hatası yapıldı !!");
      }
   }  // <----------------------- End remove(index) method -------------------------|

   public void set(int index, T element) {  // <----------------------- set(index, T type element) method ----------- ????? --------------|
      if(index < this.getCapacity()){ list[index] = element; }
      else { System.out.println("Geçersiz bir indise atama yapmaya çalışmaktasınız !!"); }
   }

   public String toString(){  // <----------------------- toString() method (Override ?) -------------------------|
      String result = "[";
      int capacity = this.getCapacity();
      for (int i = 0; i < capacity; i++){ result += (list[i] + ","); }
      result += "\b]";

      return result;
   }

   public int indexOf(T element){  // <----------------------- indexOf(T type element) method ----------- ?????????? --------------| 
      int index = -1, capacity = this.getCapacity();
      for (int i = 0; i < capacity; i++){
         if (this.get(i) == element){ index = i; break; }
      }
      return index;
   }
   
   public int lastIndexOf(T element) {  // ---------------------- lastIndexOf(T type element) --------- ???????????? --------------|  
      int index = -1, capacity = this.getCapacity();
      for (int i = capacity-1; i > -1; i--){
         if(this.get(i) == element){ index = i; break; }
      }
      return index;
   }

   public boolean isEmpty() { return this.size() == 0; }  // <------------------- isEmpty() : Boolean method ------------------|

   public Object[] toArray() {   // <---------------------- toArray() : Object[] method  -------------------------|
      int size = this.size(), i = 0, capacity = this.getCapacity();
      Object[] array = new Object[size];

      for(int j = 0; j < capacity; j++){
         if (list[j] != null){ array[i] = list[j]; i++; }
      }

      return array;
   }

   public void clear() { list = new Object[10]; }  // <--------------------------- clear() method -------------------------|

   public MyList<T> sublist(int start, int finish) {  // <------------------ sublist(int,int) : MyList<T>  method -----------------|
      MyList<T> subList = new MyList<>(finish-start);
      for (int i = start; i < finish; i++){  // <---------- start index include, finish index EXCLUDE !!
         subList.add(this.get(i));
      }

      return subList;
   }

   public boolean contains(T data) {    // <---------------- contains(T) : boolean method ------------------|
      if (this.size() == 0){ return false; }

      int capacity = this.getCapacity();
      for (int i = 0; i < capacity; i++){
         if (this.get(i) == data){ return true;}
      }

      return false;
   }
   
}
