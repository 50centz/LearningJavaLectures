package Lectures.Lecture3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lecture3 {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<Integer>(); // Тип обобщения
        ArrayList list = new ArrayList<>(); // Сырой тип
        list.add(2809);
        list.add("54");

        for (Object o : list) {
            System.out.println(o);
            
        }

        //List<Integer> list = list.of(1, 12, 123, 1234, 12345);
        // for (int item  : list) {
        //     System.out.println(item);
            
        // }
        // Iterator<Integer> col = list.iterator();
        // System.out.println();

        // while(col.hasNext()){
        //     System.out.println(col.next());
        //     //col.next();
        //     //col.remove();
        }

    }


    //                     Методы коллекций

    //add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
    // get(pos) – возвращает элемент из списка по указанной позиции
    // indexOf(item) – первое вхождение или -1
    // lastIndexOf(item) – последнее вхождение или -1
    // remove(pos) – удаление элемента на указанной позиции и его возвращение
    // set(int pos, T item) – gjvtoftn значение item элементу, который находится
    // на позиции pos
    // void sort(Comparator) – сортирует набор данных по правилу
    // subList(int start, int end) – получение набора данных от позиции start до end

    // clear() – очистка списка
    // toString() – «конвертация» списка в строку
    // Arrays.asList – преобразует массив в список
    // containsAll(col) – проверяет включение всех элементов из col
    // removeAll(col) – удаляет элементы, имеющиеся в col
    // retainAll(col) – оставляет элементы, имеющиеся в col
    // toArray() – конвертация списка в массив Object’ов
    // toArray(type array) – конвертация списка в массив type
    // List.copyOf(col) – возвращает копию списка на основе имеющегося
    // List.of(item1, item2,...) – возвращает неизменяемый список






