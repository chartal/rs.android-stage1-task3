package subtask3

class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {

        //создаем лист на основе исходного, но содержащий только инты
        val chartalArray = itemsFromArray.filterIsInstance<Int>() as ArrayList<Int>

        val chartal = ArrayList<Int>()

        for(i in chartalArray.indices){
            chartal.add(chartalArray[i])
        }



        //если интов нету, то возвращаем ноль
        if(chartalArray.isEmpty()){return 0}



        // если входной параметр больше длины массива, то просто отдаем произведение
        if (numberOfItems > chartalArray.size) {
            var s = 1

            for(i in chartalArray.indices){
                s *= chartalArray[i]
            }

            return s}




        //создадим fun minusPoh()
        fun minusPoh(list: ArrayList<Int>):Boolean {
            var flag = 0

            for(i in list.indices){
                if(list[i]<0){flag++}
            }
            return flag>1
        }








        //функция вычисляющая маскимальное произведение  элементов
        fun myOperator(list: ArrayList<Int>): Int {
            val result = ArrayList<Int>()

            for(i in 1..numberOfItems) {
                result.add(list.max()!!)
                list.remove(list.max()!!)
            }
            //теперь вычисляем произведение этих чисел
            var s = 1
            for(i in result.indices){
                s *= result[i]
            }
            return s
        }




        //функция вычисляющая маскимальное произведение  элементов при наличии минусовых элементов
        fun myOperatorMinus(list: ArrayList<Int>): Int {

            val result = ArrayList<Int>()
            val minusMax = list.min()!!
            result.add(minusMax)
            list.remove(minusMax)

            val minusMaxAnother = list.min()!!
            result.add(minusMaxAnother)
            list.remove(minusMaxAnother)

            //получили минус с парой, теперь проходим остаток от 1 до numberOfItems - 2
            for(i in 1..numberOfItems-2) {
                result.add(list.max()!!)
                list.remove(list.max()!!)
            }
            //теперь вычисляем произведение этих чисел
            var s = 1
            for(i in result.indices){
                s *= result[i]
            }

            return s
        }







        if(minusPoh(chartal)){

            val a = myOperatorMinus(chartal)
            val b = myOperator(chartalArray)

            if(a>b){return a} else return b


        }else {
            return myOperator(chartal)
        }

    }

}
