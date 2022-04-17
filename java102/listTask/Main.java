package listTask;

class Main {
   public static void main(String[] args) {
      MyList<Integer> list = new MyList<>();
      System.out.println();
      list.add(85);
      list.add(96);
      list.add(145);
      for (int i = 4; i < 11; i++){
         list.add(i);
      }
      list.add(785);

      System.out.println("list'teki null olmayan değer sayısı: " + list.size());
      System.out.println("list'in kapasitesi: " + list.getCapacity());

      System.out.println("---------------------------------------");
      System.out.println("list'teki 2 nolu indisteki eleman: " + list.get(2));
      list.remove(2);
      System.out.println("list'teki indis nosu 2 olan eleman silindi...");
      System.out.println("list'teki 2 nolu indisteki eleman: " + list.get(2));
      System.out.println("list'teki 9 nolu indisteki eleman: " + list.get(9));
      System.out.println("list'teki null olmayan değer sayısı: " + list.size());
      System.out.println("list'in kapasitesi: " + list.getCapacity());

      System.out.println();
      System.out.println("listenin 5 nolu indisteki elemanı: " + list.get(5));
      list.set(5, 200);
      System.out.println("listenin 5 nolu indisine 200 değeri atandı.");
      System.out.println("list listesindeki 5 nolu indisteki değer: " + list.get(5));
      System.out.println("\nListenin sınırlarını aşan bir indise atama yapılmaya çalışılıyor: ");
      list.set(21,453);  

      System.out.println("\nListedeki elemanlar (güncel hali): ");
      System.out.println(list.toString());

      System.out.println("---------------------------------------");
      System.out.println("Varsa 9'un bulunduğu ilk indis no: " + list.indexOf(9)); 
      System.out.println("Varsa 10'un bulunduğu son indis no: " + list.lastIndexOf(10)); 
      System.out.println("Varsa 200'ün bulunduğu son indis no: " + list.lastIndexOf(200)); // <------ !!!???
      System.out.println("list boş mu? : " + list.isEmpty());
      
      System.out.println();
      Object[] array = list.toArray();
      int length = array.length;
      System.out.println("Oluşturulan arrayın adedi: " + length);
      for (int i = 0; i < length; i++){
         System.out.print(array[i] + "  ");
      }
      System.out.println("\n");

      MyList<Integer> altListe = list.sublist(3, 7);
      System.out.println("sublist metodu ile oluşturulan alt liste: \n" + altListe.toString());

      System.out.println();
      list.clear();
      System.out.println("list clear()'dan sonra capasity: " + list.getCapacity());
      System.out.println("list clear()'dan sonra size: " + list.size());

      System.out.println();
      System.out.println("altListe 6'yı içeriyor mu? : " + altListe.contains(6));
      System.out.println("altListe 200'ü içeriyor mu? : " + altListe.contains(200));  // <----- !!!???
      System.out.println("altListe 72'yi içeriyor mu? : " + altListe.contains(72));
   }   
}
