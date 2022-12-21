package list;
//import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
   public static void main(String[] args) {
      
//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

      System.out.println("Crie uma lista e adicione 7 notas: ");
      /* esse exemplo permite adição e remoção de itens! */
      List<Double> notas = new ArrayList<Double>();
      notas.add(8.9);
      notas.add(7.0);
      notas.add(9.5);
      notas.add(5.0);
      notas.add(4.5);
      notas.add(6.7);
      notas.add(10.0);
      System.out.println(notas);

      System.out.println("Exiba a posição da nota 5.0: indíce " + notas.indexOf(5.0));

      System.out.println("Adiciona na lista a nota 8.0 na posição 4:");
      notas.add(4, 8.0);
      System.out.println(notas);

      System.out.println("Substitua a nota 5.0 pela nota 6.0:");
      notas.set(notas.indexOf(5.0), 6.0);
      System.out.println(notas);

      System.out.println("A nota 5.0 está na lista? " + notas.contains(5.0));

      System.out.println("Exiba a terceira nota adicionada" + notas.get(2));

      System.out.println("Exiba a menor nota:" + Collections.min(notas));

      System.out.println("Exiba a maior nota:" + Collections.max(notas));

      Iterator<Double> iterador = notas.iterator();
      Double soma = 0d;
      while(iterador.hasNext()){
         Double next = iterador.next();
         soma += next;
      }
      System.out.println("Exiba a soma dos valores:" + soma);

      System.out.println("Exiba a média das notas: " + (soma / notas.size()));

      System.out.println("Remova a nota 4.5: ");
      notas.remove(4.5);
      System.out.println(notas);

      System.out.println("Exclua a nota na posição 0: " );
      notas.remove(0);
      System.out.println(notas);

      System.out.println("Exclua as notas menores que 7: " );
      Iterator<Double> menor7 = notas.iterator();
      while(menor7.hasNext()){
         Double next = menor7.next();
         if(next < 7) menor7.remove();
      }
      System.out.println(notas);

      System.out.println("Apague toda a lista: ");
      notas.clear();
      System.out.println(notas);

      System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


/*
      Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " +
         "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/

   }
}
