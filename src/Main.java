import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int money = 0;
        int price = 0;
        List<String> myBuys = new ArrayList<String>();
        List<String> habType = new ArrayList<String>();
        List<Integer> streets = new ArrayList<Integer>();
        List<Integer> prices = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Random randomNumber = new Random();
        System.out.println("Скільки у вас грошей?");
        money = Integer.parseInt(scanner.nextLine());
        System.out.println("Пошук Житла");
        while (true) {
            System.out.println("1.Шукати по області");
            System.out.println("2.Шукати по містах");
            System.out.println("3.Подивитися мої покупки");
            System.out.println("4.Вийти");
            int resp = Integer.parseInt(scanner.nextLine());
            if (resp == 1) {
                for (int i = 0; i < SearchApartment.region.length; i++) {
                    System.out.println((i + 1) + "." + SearchApartment.region[i]);
                }
                int resp2 = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < SearchApartment.region.length; i++) {
                    if (resp2 == i + 1) {
                        System.out.println(SearchApartment.region[i]);
                        int randomN = randomNumber.nextInt(10);
                        for (int j = 0; j < randomN; j++) {
                            int habRand = random.nextInt(SearchApartment.habitationType.length);
                            count++;
                            String HabType = SearchApartment.habitationType[habRand];
                            int streetsRand = random.nextInt(SearchApartment.streets.length);
                            System.out.println("---" + count + "---");
                            System.out.println("Замовити " + HabType + " квартиру");
                            System.out.println("вул. " + SearchApartment.streets[streetsRand] + " буд." + random.nextInt(200) + " кв." + random.nextInt(60));
                            if (HabType.equals("Однокімнатну")) {
                                price = (int) (Math.random() * (101)) + 300;
                            } else if (HabType.equals("Двохкімнатну")) {
                                price = (int) (Math.random() * (101)) + 400;
                            } else {
                                price = (int) (Math.random() * (101)) + 500;
                            }
                            System.out.println("Ціна :" + price + "\n" +
                                    "-------------------------");
                            habType.add(HabType);
                            streets.add(streetsRand);
                            prices.add(price);
                        }
                        System.out.println("Що будете брати?");
                        int resp3 = Integer.parseInt(scanner.nextLine());
                        if (resp3 == 0) {
                        } else {
                            for (int j = 0; j < randomN; j++) {
                                if (resp == j + 1) {
                                    if (money >= price) {
                                        String phone = "+380"
                                                + random.nextInt(10) + random.nextInt(10) + "-"
                                                + random.nextInt(10) + random.nextInt(10) + random.nextInt(10) + "-"
                                                + random.nextInt(10) + random.nextInt(10) + random.nextInt(10) + random.nextInt(10);
                                        System.out.println("Ви замовили " + habType.get(j) + " квартиру, на вулиці " + SearchApartment.streets[streets.get(j)] + ", за " + prices.get(j));
                                        money = money - price;
                                        System.out.println("У вас залишилось " + money);
                                        myBuys.add(SearchApartment.region[i] + "\n" +
                                                "Ви замовили " + habType.get(j) + " квартиру, на вулиці " + SearchApartment.streets[streets.get(j)] + "\n"
                                                + "тел. " + phone);
                                        habType.clear();
                                        streets.clear();
                                    } else System.out.println("у вас недостатньо коштів");
                                }
                            }
                            count = 0;
                            scanner.nextLine();
                        }
                    }
                }
            } else if (resp == 2) {
                for (int i = 0; i < SearchApartment.towns.length; i++) {
                    System.out.println((i + 1) + "." + SearchApartment.towns[i]);
                }
                resp = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < SearchApartment.towns.length; i++) {
                    if (resp == i + 1) {
                        System.out.println(SearchApartment.towns[i]);
                        int randomN = randomNumber.nextInt(10);
                        for (int j = 0; j < randomN; j++) {
                            int habRand = random.nextInt(SearchApartment.habitationType.length);
                            count++;
                            String HabType = SearchApartment.habitationType[habRand];
                            int streetsRand = random.nextInt(SearchApartment.streets.length);
                            System.out.println("---" + count + "---");
                            System.out.println("Замовити " + HabType + " квартиру");
                            System.out.println("вул. " + SearchApartment.streets[streetsRand] + " буд." + random.nextInt(200) + " кв." + random.nextInt(60));
                            if (HabType.equals("Однокімнатну")) {
                                price = (int) (Math.random() * (101)) + 300;
                            } else if (HabType.equals("Двохкімнатну")) {
                                price = (int) (Math.random() * (101)) + 400;
                            } else {
                                price = (int) (Math.random() * (101)) + 500;
                            }
                            System.out.println("Ціна :" + price + "\n" +
                                    "-------------------------");
                            habType.add(HabType);
                            streets.add(streetsRand);
                            prices.add(price);
                        }
                        System.out.println("Що будете брати?");
                        int resp2 = Integer.parseInt(scanner.nextLine());
                        if (resp2 == 0) {
                        } else {
                            for (int j = 0; j < randomN; j++) {
                                if (resp == j + 1) {
                                    if (money >= price) {
                                        String phone = "+380"
                                                + random.nextInt(10) + random.nextInt(10) + "-"
                                                + random.nextInt(10) + random.nextInt(10) + random.nextInt(10) + "-"
                                                + random.nextInt(10) + random.nextInt(10) + random.nextInt(10) + random.nextInt(10);
                                        System.out.println("Ви замовили " + habType.get(j) + " квартиру, на вулиці " + SearchApartment.streets[streets.get(j)] + ", за " + prices.get(j));
                                        money = money - price;
                                        System.out.println("У вас залишилось " + money);
                                        myBuys.add(SearchApartment.towns[i] + "\n" +
                                                "Ви замовили " + habType.get(j) + " квартиру, на вулиці " + SearchApartment.streets[streets.get(j)] + "\n"
                                                + "тел. " + phone);
                                        habType.clear();
                                        streets.clear();
                                    } else System.out.println("у вас недостатньо коштів");
                                }
                            }
                            count = 0;
                            scanner.nextLine();
                        }
                    }
                }
            } else if (resp == 3) {
                System.out.println("У вас " + money);
                for (int i = 0; i < myBuys.size(); i++) {
                    System.out.println(myBuys.get(i));
                    System.out.println("-------");
                }
                scanner.nextLine();
            } else if (resp == 4) {
                break;
            }
        }
    }
}
