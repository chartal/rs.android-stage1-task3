package subtask2

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {

        val binomialCoefficient: Long = array[0].toLong()  //количество плакатов
        val n = array[1] //количество цветов
        val list = ArrayList<Int>()

        if (array[0] == array[1]) {
            return 1
        }

        if (array[0] < array[1]) {
            return null
        } else {


            //функция факториал
            fun fact(n: Int): Long {
                val res: Long
                if (n == 1) {
                    return 1
                }
                res = fact(n - 1) * n
                return res
            }




            for (i in n - 1 downTo 1) {

                if ((fact(n) / (fact(i) * fact(n - i))) == binomialCoefficient) {
                    list.add(i)


                }

            }


            val result = list.min()




            return result
        }
    }





}
