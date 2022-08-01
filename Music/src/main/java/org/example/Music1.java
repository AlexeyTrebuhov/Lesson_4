package org.example;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Music1
{

    public static void main(String[] arg) {

        Map<String, Integer> map1 = new HashMap<String, Integer>(); // Создали map1 ( трек + рейтинг)
        map1.put("https://musify.club/track/dl/290843/fancy-flames-of-love.mp3", (int) (Math.random() * 1001) + 1);
        map1.put("https://musify.club/track/dl/287573/fancy-chinese-eyes.mp3", (int) (Math.random() * 1001) + 1);
        map1.put("https://musify.club/track/dl/290844/fancy-moscow-is-calling.mp3", (int) (Math.random() * 1001) + 1);
        map1.put("https://musify.club/track/dl/290668/fancy-bolero.mp3", (int) (Math.random() * 1001) + 1);
        map1.put("https://musify.club/track/dl/287572/fancy-slice-me-nice.mp3", (int) (Math.random() * 1001) + 1);
        map1.put("https://musify.club/track/dl/287570/fancy-get-your-kicks.mp3", (int) (Math.random() * 1001) + 1);
        map1.put("https://musify.club/track/dl/290846/fancy-whats-your-name.mp3", (int) (Math.random() * 1001) + 1);

        System.out.println("Music from Sleep (sorted) : ");
        map1.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println); // отсортировали двойную карту Music from Sleep и распечатали}
        System.out.println("");

        Map<String, Map<String, Integer>> direction1 = new HashMap<>(); //Создали пустую двойную map ( название жанра +  map1)

        direction1.put("Music from Sleep", map1); // наполнили двойную map в жанре Music from Sleep



        Map<String, Integer> map2 = new HashMap<String, Integer>(); // Создали map2 ( трек + рейтинг)
        map2.put("https://musify.club/track/dl/290851/fancy-china-blue.mp3", (int) (Math.random() * 1001) + 1);
        map2.put("https://musify.club/track/dl/290674/fancy-after-midnight.mp3", (int) (Math.random() * 1001) + 1);
        map2.put("https://musify.club/track/dl/290670/fancy-save-the-moment.mp3", (int) (Math.random() * 1001) + 1);
        map2.put("https://musify.club/track/dl/3810064/fancy-a-voice-in-the-dark.mp3", (int) (Math.random() * 1001) + 1);
        map2.put("https://musify.club/track/dl/291850/fancy-angel-eyes.mp3", (int) (Math.random() * 1001) + 1);
        map2.put("https://musify.club/track/dl/1086789/the-klf-america-what-time-is-love-uncensored-version.mp3", (int) (Math.random() * 1001) + 1);
        map2.put("https://musify.club/track/dl/3004550/the-klf-a-melody-from-a-past-life-keeps-pulling-me-back.mp3", (int) (Math.random() * 1001) + 1);

        System.out.println("Music from Rave (sorted) : ");
        map2.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println); // отсортировали двойную карту Music from Rave и распечатали}
        System.out.println("");

        Map<String, Map<String, Integer>> direction2 = new HashMap<>(); //Создали пустую двойную map ( название жанра +  map2)

        direction2.put("Music from Rave", map2); // наполнили двойную map в жанре Music from Rave



        Map<String, Integer> map3 = new HashMap<String, Integer>(); // Создали map3 ( трек + рейтинг)
        map3.put("https://musify.club/track/dl/3004549/the-klf-the-lights-of-baton-rouge-pass-by.mp3", (int) (Math.random() * 1001) + 1);
        map3.put("https://musify.club/track/dl/3066427/the-klf-america-what-time-is-love-uncensored.mp3", (int) (Math.random() * 1001) + 1);
        map3.put("https://musify.club/track/dl/1509938/the-klf-make-it-rain.mp3", (int) (Math.random() * 1001) + 1);
        map3.put("https://musify.club/track/dl/3066083/the-klf-down-town.mp3", (int) (Math.random() * 1001) + 1);
        map3.put("https://musify.club/track/dl/3080595/the-klf-top-of-the-pops.mp3", (int) (Math.random() * 1001) + 1);
        map3.put("https://musify.club/track/dl/3075052/the-klf-3-a-m-eternal-wayward-dub-version.mp3", (int) (Math.random() * 1001) + 1);
        map3.put("https://musify.club/track/dl/4475880/the-klf-jupiter.mp3", (int) (Math.random() * 1001) + 1);

        System.out.println("Music from Jump (sorted) : ");
        map3.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println); // отсортировали двойную карту Music from Jump и распечатали
        System.out.println("");

        Map<String, Map<String, Integer>> direction3 = new HashMap<>(); //Создали пустую двойную map ( название жанра +  map3)

        direction3.put("Music from Jump", map3); //  наполнили   двойную map в   жанре Music from Jump



        Map<String, Integer> map4 = new HashMap<String, Integer>();// Создали map4 ( трек + рейтинг)
        map4.put("https://musify.club/track/dl/1774145/the-klf-last-train-to-trancentral.mp3", (int) (Math.random() * 1001) + 1);
        map4.put("https://musify.club/track/dl/42954/the-klf-what-time-is-love-lp-mix.mp3", (int) (Math.random() * 1001) + 1);
        map4.put("https://musify.club/track/dl/42953/the-klf-make-it-rain.mp3", (int) (Math.random() * 1001) + 1);
        map4.put("https://musify.club/track/dl/42955/the-klf-the-white-room.mp3", (int) (Math.random() * 1001) + 1);
        map4.put("https://musify.club/track/dl/42950/the-klf-justified-and-ancient.mp3", (int) (Math.random() * 1001) + 1);
        map4.put("https://musify.club/track/dl/1321411/the-klf-hey-hey-we-are-not-the-monkee.mp3", (int) (Math.random() * 1001) + 1);
        map4.put("https://musify.club/track/dl/1321412/the-klf-dont-take-five.mp3", (int) (Math.random() * 1001) + 1);

        System.out.println("Music from Room (sorted) : ");
        map4.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println); // отсортировали двойную карту Music from Room и распечатали
        System.out.println("");

        Map<String, Map<String, Integer>> direction4 = new HashMap<>(); //Создали пустую двойную map ( название жанра +  map4)

        direction4.put("Music from Room", map4); // наполнили двойную map в жанре Music from Room



        Map<String, Integer> map5 = new HashMap<String, Integer>();/// Создали map5 ( трек + рейтинг)
        map5.put("https://musify.club/track/dl/1509936/the-klf-3-a-m-eternal-original.mp3", (int) (Math.random() * 1001) + 1);
        map5.put("https://musify.club/track/dl/2998619/the-klf-last-train-to-trancentral-live-from-the-lost-continent.mp3", (int) (Math.random() * 1001) + 1);
        map5.put("https://musify.club/track/dl/290666/fancy-reaving-queen.mp3", (int) (Math.random() * 1001) + 1);
        map5.put("https://musify.club/track/dl/641049/creedence-clearwater-revival-ramble-tamble.mp3", (int) (Math.random() * 1001) + 1);
        map5.put("https://musify.club/track/creedence-clearwater-revival-fortunate-son-31985", (int) (Math.random() * 1001) + 1);
        map5.put("https://musify.club/track/dl/641050/creedence-clearwater-revival-before-you-accuse-me.mp3", (int) (Math.random() * 1001) + 1);
        map5.put("https://musify.club/track/dl/20466/creedence-clearwater-revival-ooby-dooby.mp3", (int) (Math.random() * 1001) + 1);

        System.out.println("Music from House (sorted) : ");
        map5.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println); // отсортировали двойную карту Music from House и распечатали
        System.out.println("");

        Map<String, Map<String, Integer>> direction5 = new HashMap<>(); //Создали пустую двойную map (из имени жанра и map5)

        direction5.put("Music from House", map5); // наполнили двойную map в жанре Music from House




        Map<String, Map<String, Integer>> map = new HashMap<>(); // Собрали общую Map из пяти имеющихся
        map.putAll(direction1);
        map.putAll(direction2);
        map.putAll(direction3);
        map.putAll(direction4);
        map.putAll(direction5);
        //System.out.println("Map = " + map);


        String playlist11 = String.valueOf(map.get("Music from House"));
        String Playlist12 = String.valueOf(map.get("Music from Jump"));
        String PlayList1 = playlist11.concat(Playlist12);// собрали общий плейлист1 из двух жанров из двойной Map


        String Playlist13 = String.valueOf(map.get("Music from Sleep"));
        String Playlist14 = String.valueOf(map.get("Music from Rave"));
        String PlayList2 = Playlist13 + Playlist14;// собрали общий плейлист2 из двух жанров из двойной Map

        String Playlist15 = String.valueOf(map.get("Music from Room"));
        String Playlist16 = String.valueOf(map.get("Music from House"));
        String PlayList3 = Playlist15 + Playlist16;// собрали общий плейлист3 из двух жанров из двойной Map


        //System.out.println("PlayList1\n = " + PlayList1);// печатаем PlayList1 (несортированный)
        //System.out.println("PlayList2\n = " + PlayList2);
        //System.out.println("PlayList3\n = " + PlayList3);


        // меняем символ "{" в середине массива на запятую, для отделения цифры от гиперссылки
        String[] stringArray = PlayList1.split("[}]"); // разбиваем строку через "}"
        String[] stringArrayR = Arrays.toString(stringArray).split("="); // разбиваем полученную строку еще раз, через "="
        String[] stringArrayRR = Arrays.toString(stringArrayR).split(","); // разбиваем полученную строку еще раз, через ","
        //System.out.println("Playlist1 splitRR '='\n = " + Arrays.toString(stringArrayRR));// печатаем все разбитые строки

        String[] StringSort = new String[14]; // объявление массива cортированных треков на 10 записей
        String[] StringNumber = new String[14]; // объявление массива всех рейтингов на 14 записей ( два плейлиста по 7 треков)

        StringNumber[0]= Arrays.toString(new String[]{stringArrayRR[1]});
        StringNumber[1]= Arrays.toString(new String[]{stringArrayRR[3]});
        StringNumber[2]= Arrays.toString(new String[]{stringArrayRR[5]});
        StringNumber[3]= Arrays.toString(new String[]{stringArrayRR[7]});
        StringNumber[4]= Arrays.toString(new String[]{stringArrayRR[9]});
        StringNumber[5]= Arrays.toString(new String[]{stringArrayRR[11]});
        StringNumber[6]= Arrays.toString(new String[]{stringArrayRR[13]});
        StringNumber[7]= Arrays.toString(new String[]{stringArrayRR[15]});
        StringNumber[8]= Arrays.toString(new String[]{stringArrayRR[17]});
        StringNumber[9]= Arrays.toString(new String[]{stringArrayRR[19]});
        StringNumber[10]= Arrays.toString(new String[]{stringArrayRR[21]});
        StringNumber[11]= Arrays.toString(new String[]{stringArrayRR[23]});
        StringNumber[12]= Arrays.toString(new String[]{stringArrayRR[25]});
        StringNumber[13]= Arrays.toString(new String[]{stringArrayRR[27]});

        StringSort[0]= Arrays.toString(new String[]{stringArrayRR[0]});
        StringSort[1]= Arrays.toString(new String[]{stringArrayRR[2]});
        StringSort[2]= Arrays.toString(new String[]{stringArrayRR[4]});
        StringSort[3]= Arrays.toString(new String[]{stringArrayRR[6]});
        StringSort[4]= Arrays.toString(new String[]{stringArrayRR[8]});
        StringSort[5]= Arrays.toString(new String[]{stringArrayRR[10]});
        StringSort[6]= Arrays.toString(new String[]{stringArrayRR[12]});
        StringSort[7]= Arrays.toString(new String[]{stringArrayRR[14]});
        StringSort[8]= Arrays.toString(new String[]{stringArrayRR[16]});
        StringSort[9]= Arrays.toString(new String[]{stringArrayRR[18]});
        StringSort[10]= Arrays.toString(new String[]{stringArrayRR[20]});
        StringSort[11]= Arrays.toString(new String[]{stringArrayRR[22]});
        StringSort[12]= Arrays.toString(new String[]{stringArrayRR[24]});
        StringSort[13]= Arrays.toString(new String[]{stringArrayRR[26]});


        System.out.println("StringNumber PlayList1 full= " + Arrays.toString(StringNumber));

        String[] SortNumber = StringNumber; // Создали копию массива рейтингов
        Arrays.sort(SortNumber); // Сортируем эту копию во возрастанию
        System.out.println("SortNumber PlayList1 full sorted = " + Arrays.toString(SortNumber).replaceAll(" ", ""));
        System.out.println();
        System.out.println("StringTrack PlayList1 full = " + Arrays.toString(StringSort));

        String x = SortNumber[3];// определили нижнюю границу рейтинга для массива PlayList1
        System.out.println("Min rating = " + x);


        // Теперь нужно сравнивать. Если индекс рейтинга i больше Х, то
        // StringSort[i]= Arrays.toString(new String[]{stringArrayRR[i]}); (так, как уже собрано выше)
        // или второй вариант - из уже собранного массива
        // (см. выше) можно удалить элемент с индексом i, который меньше Х. В итоге получаем массив на 10 треков.
        // Потом выводим на печать
        //System.out.println("StringSort \n = " + Arrays.toString(StringSort));
        // Получаются гиперссылки без ключей. Файл загружвается с сайта и можно реально прослушать.

        }
}


 // Текущая проблема : не получается преобразовать в Integer  значение  типа  StringNumber[13]= Arrays.toString(new String[]{stringArrayRR[27]});
// Также квадратные скобки расплодились и почему-то пробел после скобки появляется.