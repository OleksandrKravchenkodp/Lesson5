package src.Lesson2;

public class SecondTask {

    final char firstFinalVar;
    final int secondFinalVar;
    final double thirdFinalVar;

    public SecondTask () {
        this.firstFinalVar = 'c';
        this.secondFinalVar = 0;
        this.thirdFinalVar = 0.1;

    }


    public SecondTask (final char firstFinalVar, final int secondFinalVar, final double thirdFinalVar) {

        this.firstFinalVar = firstFinalVar;
        this.secondFinalVar = secondFinalVar;
        this.thirdFinalVar = thirdFinalVar;
    }

//Касательно "подвоха", то тут наверное имелось ввиду то, что переменные с модификатором final, а следовательно
//мы не можем сделать для них "сеттеры". Ведь мы не можем перезаписать финальную переменную.

    public char getFirstFinalVar() {
        return firstFinalVar;
    }


    public int getSecondFinalVar() {
        return secondFinalVar;
    }


    public double getThirdFinalVar() {
        return thirdFinalVar;
    }

}
