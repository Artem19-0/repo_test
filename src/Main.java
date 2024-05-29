import model.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static List<User> userList = new ArrayList<>();
    static {
        userList.add(new User(1, "Artur", 25, 12000, 'M'));
        userList.add(new User(2, "Alex", 10, 3000, 'M'));
        userList.add(new User(3, "Kate", 16, 5000, 'F'));
        userList.add(new User(4, "Artem", 40, 3500, 'M'));
        userList.add(new User(5, "Nikolay", 35, 400, 'M'));
        userList.add(new User(6, "Bob", 27, 1200, 'M'));
        userList.add(new User(6, "Bob", 27, 1200, 'M'));

    }



    public static void main(String[] args) {
//    String word = "шалаш";
//    int a = word.charAt(4);
//        System.out.println(a);
//        System.out.println((char) a);







        Collection<String> strings = Arrays.asList("A" ,"B", "C", "D", "D");
        strings.stream().distinct().forEach(System.out::println);



        Stream.of(1 , 2 , 3, 4 , 4 , 2).distinct().forEach(integer -> {
            System.out.println(integer);
        });




        System.out.println("--------------------------------------------------------------------- \n");




        Stream.of("one", "two", "three")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.length() <= 3;
                })
                .map(s1 -> {
                    System.out.println("map: " + s1);
                    return s1.toUpperCase();
                })
                .sorted()
                .forEach(x -> {
                    System.out.println("forEach: " + x);
                });




        System.out.println("--------------------------------------------------------------------- \n");




        Stream.of("one", "two", "three","three")
                .filter(s -> s.length() >= 3)
                .map(String::toUpperCase).distinct()
                .forEach(System.out::println);






        System.out.println("--------------------------------------------------------------------- \n");





        String str = "Hello";
        IntStream stream = str.chars();
        stream.forEach(System.out::println);






        System.out.println("--------------------------------------------------------------------- \n");




        List<String> words = Arrays.asList("apple", "banana", "orange", "peach");

        Stream<Integer> lengthsStream = words.stream()
                .map(String::length);

        lengthsStream.forEach(System.out::println);














    Stream<User> stream1 = sortByName("");
    stream1.forEach(System.out::println);

        System.out.println();



       List<User> users = sort();
       users.forEach(System.out::println);

        System.out.println("--------------------------------------------------------------------- \n");



        List<User> users1 = sortByAge();
        users1.forEach(System.out::println);

    }



    public static boolean isPalindrome(String word){
        int count = word.length() / 2;
        int j = word.length()-1;

        for (int i = 0; i < count; i++) {
          if (word.charAt(i) != word.charAt(j) ){
              return false;
          }
          j--;
        }

        return true;
    }




    // distinct = убирает дубликаты
    public static Stream<User> sortByName(String nameStartWith){
        List<User> users = userList;
        return users.stream().filter(user -> user.getAge() >= 16).distinct();


    }


    public static List<User> sort(){
        List<User> users = userList;
       return users.stream()
                 .filter(user -> user.getSalary() > 1000)
                 .sorted(Comparator.comparing(User::getSalary))
                 .collect(Collectors.toList());

    }


    public static List<User> sortByAge(){
        List<User> users = userList;
        return users.stream()
                .filter(user -> user.getAge() > 10 && user.getAge() < 38).distinct()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
    }



}


