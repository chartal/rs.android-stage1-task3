package subtask1

import kotlin.math.absoluteValue

class PolynomialConverter {

    fun convertToStringFrom(numbers: Array<Int>): String? {


        //если входной массив пуст, то возвращаем null
        if (numbers.isEmpty()) { return null}


        var chartalArray: ArrayList<String> =ArrayList<String>()
        var count = numbers.size-1


        //обработка ситуации с нулевым элементом массива
        if(numbers[0]!=0){

            //обработать ситуацию с единицей
            if(numbers[0].absoluteValue != 1) {
                if(numbers[0]>0) {chartalArray.add((numbers[0]).toString()+"x^"+(count).toString())}
                if(numbers[0]<0) {chartalArray.add(" -" + numbers[0].absoluteValue.toString()+"x^"+(count).toString())}
            } else {
                if(numbers[0]>0) {chartalArray.add("x^"+(count).toString())}
                if(numbers[0]<0) {chartalArray.add(" -" + "x^"+(count).toString())}

            }
        }



        //обработка ситуации с внутренними элементами
        for (i in 1..numbers.size-3) {

            if(numbers[i]!=0){

                if(numbers[0].absoluteValue != 1) {
                    if(numbers[i]>0) {chartalArray.add(" + " + numbers[i].toString()+"x^"+(count-i).toString())}
                    if(numbers[i]<0) {chartalArray.add(" - " + numbers[i].absoluteValue.toString()+"x^"+(count-i).toString())}

                }else {
                    if(numbers[i]>0) {chartalArray.add(" + " + "x^"+(count-i).toString())}
                    if(numbers[i]<0) {chartalArray.add(" - " + "x^"+(count-i).toString())}

                }
            }
        }



        //обработка ситуации, где степень равна единице
        if(numbers[numbers.size-2]!=0){

            if(numbers[numbers.size-2].absoluteValue != 1){
                if(numbers[numbers.size-2]>0) {chartalArray.add(" + " + numbers[numbers.size-2].toString()+"x")}
                if(numbers[numbers.size-2]<0) {chartalArray.add(" - " + numbers[numbers.size-2].toString()+"x")}

            }else {
                if(numbers[numbers.size-2]>0) {chartalArray.add(" + " + "x")}
                if(numbers[numbers.size-2]<0) {chartalArray.add(" - " + "x")}
            }
        }





        //обработка ситуации с последним элементом массива
        if(numbers[numbers.size-1]!=0){
            if(numbers[numbers.size-1]>0) {chartalArray.add(" + " + (numbers[numbers.size-1]).toString())}
            if(numbers[numbers.size-1]<0) {chartalArray.add(" - " + numbers[numbers.size-1].absoluteValue.toString())}
        }





        return chartalArray.joinToString("")

    }

}
