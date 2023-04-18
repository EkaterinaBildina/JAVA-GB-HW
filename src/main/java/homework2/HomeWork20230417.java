package homework2;

import java.util.Arrays;

public class HomeWork20230417 {
    public static void run(String[] args) {
        task01();
    }

    public static void task01() {
        // 1. Дана строка sql-запроса "select * from students where ".
        // Сформируйте часть WHERE этого запроса, используя StringBuilder.
        // Данные для фильтрации приведены ниже в виде json-строки.
        // Если значение null, то параметр не должен попадать в запрос.
        // Пример 1:
        // Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
        // Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';

        // Пример 2:
        // Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}
        // Результат: SELECT * FROM USER;

        String[] sqlRequest = {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"};
        System.out.println(Arrays.toString(sqlRequest));

        StringBuilder selectWhere = new StringBuilder();

        String[] name = sqlRequest[0].split();
        System.out.println(Arrays.toString(name));

        String[] country = sqlRequest[1].split();
        System.out.println(Arrays.toString(country));

        String[] city = sqlRequest[2].split();
        System.out.println(Arrays.toString(city));

        String[] age = sqlRequest[3].split();
        System.out.println(Arrays.toString(age));

            //if (name[1] == "Ivanov") {
             //   selectWhere.append(name[1]);
            }
        }
        //System.out.println(selectWhere);


    }


}
