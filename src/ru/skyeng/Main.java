package ru.skyeng;

public class Main {

    public static void main(String[] args) {
     // write your code here
        byte cucumber = 5;
        System.out.println(cucumber);
        short tables = 10;
        System.out.println(tables);
        int ball = 100;
        System.out.println(ball);
        long pen = 10001;
        System.out.println(pen);

        float gram =  1.9f;
        System.out.println(gram);
        double water = 0.9098;
        System.out.println(water);
        char a = 'b';
        boolean flag = true;



        float boxer1 =  78.2f;
        float boxer2 = 82.7f;
        float difference = boxer2 - boxer1;
        System.out.println(" Разница в весе между двумя боксерами "+ difference + "кг!");
        float total = boxer1 + boxer2;
        System.out.println(" Общий вес боксеров " + total + " кг ");


        byte banana = 5;
        System.out.println(" Бананы " + banana + " кг ");
        int bananaWeight = banana * 80;
        System.out.println(" Общий вес бананов " + bananaWeight + " gr ");
        int milkWeight = 210;
        System.out.println(" Общий вес молока " + milkWeight  + " gr" );
        byte plombir = 2;
        System.out.println(" Брикета " + plombir + " шт ");
        int plombirWeight = plombir * 100;
        System.out.println( " Общий вес мороженого " + plombirWeight + " gr " );
        byte egg = 4;
        System.out.println(" Яйца " + egg + " шт ");
        int eggWeight = egg * 70;
        System.out.println(" Общий вес яиц " + eggWeight + " gr ");
        int productWeight = bananaWeight + milkWeight + plombirWeight + eggWeight;
        System.out.println(" Общий вес продуктов на завтрак " + productWeight  + " gr "  );


        byte excessWeight = 7;
        System.out.println(" Лишний вес " + excessWeight + "кг");
        float weight1 = 250;
        System.out.println(" Если скидывать в день по " + weight1 + " гр ");
        float weightLoss1 = weight1 / 1000;
        System.out.println(" Если скидывать в день по " + weightLoss1 + "кг");
        float weight2 = 500;
        System.out.println(" Если скидывать в день по " + weight2 + " гр ");
        float weightLoss2 = weight2 / 1000;
        System.out.println(" Если скидывать в день по " + weightLoss2 + "кг");
        float loseWeight1 =  excessWeight / weightLoss1;
        System.out.println(" За сколько дней сбросит вес если скидывать по 250г в сутки " + loseWeight1 + " дней ");
        float loseWeight2 =  excessWeight / weightLoss2;
        System.out.println(" За сколько дней сбросит вес если скидывать по 500г в сутки " + loseWeight2 + " дней ");
        float average =  (loseWeight1 +loseWeight2)/2f;
        System.out.println(" Среднее кол-во дней для достижения результата в весе " + average + " дней " );


        int salary = 67760;
        System.out.println(" Зарплата Маши до повышения в месяц " + salary + " рублей ");

        double percent = salary * 0.1;
        System.out.print(" Зарплату повысили на 10% " + percent + " рублей ");

        double raising =  salary + percent;
        System.out.print(" Зарплата после повышения " + raising + " рублей ");

        double annuaiSalary = salary * 12;
        System.out.println("Годовой доход у Маши был " + annuaiSalary + " рублей ");

        double annuaiSalarynew = raising * 12;
        System.out.println(" Новый годовой доход Маши стал " + annuaiSalarynew + " рублей ");

        double incomeDifference = annuaiSalarynew - annuaiSalary;
        System.out.println(" Разница годовых доходов у Маши " + incomeDifference + " рублей ");


        int salary1 = 83690;
        System.out.println(" Зарплата Денис до повышения в месяц " + salary1 + " рублей ");

        double percent1 = salary1 * 0.1;
        System.out.print(" Зарплату повысили на 10% " + percent1 + " рублей ");

        double raising1 =  salary1 + percent1;
        System.out.print(" Зарплата после повышения " + raising1 + " рублей ");

        double annuaiSalary1 = salary1 * 12;
        System.out.println("Годовой доход у Денса был " + annuaiSalary1 + " рублей ");

        double annuaiSalarynew1 = raising1 * 12;
        System.out.println(" Новый годовой доход Дениса стал " + annuaiSalarynew1 + " рублей ");

        double incomeDifference1 = annuaiSalarynew1 - annuaiSalary1;
        System.out.println(" Разница годовых доходов у Дениса " + incomeDifference1 + " рублей ");



        int salary2 = 78230;
        System.out.println(" Зарплата Крестины до повышения в месяц " + salary2 + " рублей ");

        double percent2 = salary2 * 0.1;
        System.out.print(" Зарплату повысили на 10% " + percent2 + " рублей ");

        double raising2 =  salary2 + percent2;
        System.out.print(" Зарплата после повышения " + raising2 + " рублей ");

        double annuaiSalary2 = salary2 * 12;
        System.out.println("Годовой доход у Крестины был " + annuaiSalary2 + " рублей ");

        double annuaiSalarynew2 = raising2 * 12;
        System.out.println(" Новый годовой доход Крестины стал " + annuaiSalarynew2 + " рублей ");

        double incomeDifference2 = annuaiSalarynew2 - annuaiSalary2;
        System.out.println(" Разница годовых доходов у Крестины " + incomeDifference2 + " рублей ");
    }
}
