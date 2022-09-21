package src.Lesson1;

public class FirstHomeWork {

    public static void main(String[] args) {
        // 2. Создайте все известные примитивы по 1 экземпляру(кроме int и double) и
        // строку двумя разными способами.
        // Создайте 3 переменные int в одну строку и 3 переменные double в одну строку.
        byte firstVar = 120;
        short secondVar = 32500;
        long thirdVar = 2147483600L;
        float fourthVar = 2.5F;
        boolean logicVar = true;
        char symbol = 'c';
        String firstString = "First String";
        String secondString = new String("Second String");

        int firstInt, secondInt, thirdInt;
        double firstDouble, secondDouble, thirdDouble;

        // 3. С созданными переменными напишите 10 примеров с двумя любыми
        // арифметическими операциями
        // в каждом (5 дробных результата и 5 целочисленных) и выведите результаты.

        int integerDivision = secondVar / firstVar;
        System.out.println(integerDivision);

        int integerPlus = secondVar + firstVar;
        System.out.println(integerPlus);

        int integerDivisionWithLong = (int) thirdVar / secondVar;
        System.out.println(integerDivisionWithLong);

        int integerDivisionWithSecondLong = (int) thirdVar / firstVar;
        System.out.println(integerDivisionWithSecondLong);

        int integerMinusWithLong = (int) thirdVar - secondVar;
        System.out.println(integerMinusWithLong);

        System.out.println();

        float floatMult = fourthVar * firstVar;
        System.out.println(floatMult);

        float floatDiv = firstVar / fourthVar;
        System.out.println(floatDiv);

        float floatSecondDiv = thirdVar / fourthVar;
        System.out.println(floatSecondDiv);

        float floatthirdDiv = secondVar / fourthVar;
        System.out.println(floatthirdDiv);

        float floatfifthDiv = fourthVar / firstVar;
        System.out.println(floatfifthDiv);

        System.out.println();

        // 4. Напишите 10 примеров с арифметическими операциями с присвоением и выведите
        // результат.

        secondVar -= 500;
        System.out.println(secondVar);

        secondVar /= 2;
        System.out.println(secondVar);

        fourthVar *= 3.5;
        System.out.println(fourthVar);

        fourthVar /= 2.0;
        System.out.println(fourthVar);

        fourthVar *= 120;
        System.out.println(fourthVar);

        thirdVar /= 500;
        System.out.println(thirdVar);

        thirdVar /= thirdVar / 2;
        System.out.println(thirdVar);

        thirdVar -= 100000;
        System.out.println(thirdVar);

        firstVar /= 2;
        System.out.println(firstVar);

        secondVar += firstVar;
        System.out.println(secondVar);

        System.out.println();

        // 5. Напишите не менее 5 разных примеров используя логические операции с
        // выводом результатов
        // (несколько значений "true" & несколько значений "false").

        if (firstVar < secondVar) {
            logicVar = true;
        } else {
            logicVar = false;
        }
        System.out.println(logicVar);

        if (firstVar > secondVar) {
            logicVar = true;
        } else {
            logicVar = false;
        }
        System.out.println(logicVar);

        if (symbol == 'c') {
            logicVar = true;
        } else {
            logicVar = false;
        }
        System.out.println(logicVar);

        if (secondVar < firstVar) {
            logicVar = true;
        } else {
            logicVar = false;
        }
        System.out.println(logicVar);

        if (firstVar != secondVar) {
            logicVar = true;
        } else {
            logicVar = false;
        }
        System.out.println(logicVar);

        System.out.println();

        // 6. Создать переменную = 1 и используя инкремент и декремент
        // напечатать:1,0,1,1,1,2,1,1

        int checkVar = 1;
        System.out.println(checkVar--);
        System.out.println(checkVar++);
        System.out.println(checkVar);
        System.out.println(checkVar);
        System.out.println(checkVar++);
        System.out.println(checkVar--);
        System.out.println(checkVar);
        System.out.println(checkVar);

        // 7. Создать одномерный массив любого размера. Записать в него 10 примитивов

        int[] arr = null;
        for (int i = 0; i < 10; i++) {

            arr[i] = i;

        }

    }

}
