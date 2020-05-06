package subtask4

class SquareDecomposer {


    fun decomposeNumber(number: Int): Array<Int>? {

        val list = ArrayList<Int>()


        if(number<5){return null}



        //метод индикатор строгого возрастания
        fun control(index: Int, area: Int): Boolean {

            var area1 = area

            for(i in index downTo 1) {
                val i1 = i.toLong()
                if(i1*i1 <= area1.toLong()) {

                    area1 = area1 - i*i
                }
            }
            return area1 == 0
        }


        var numberX = number.toLong()



        //первый элемент добавляем в список сразу(на единицу меньше исходного - закономерность)
        //на конкретном примере добавили 49
        list.add((number-1))

        //остаток площади
        var area = 2*number-1


        for(i in number-2 downTo 1) {

            val i1 = i.toLong()
            if ((i1*i1 <=area.toLong() ) &&(!list.contains(i))) {

                var k = i

                if(!control(i, area)) {k = i-1}


                    list.add(k)
                    area -= k * k


            }
        }

        println("Вот здесь надо посмотреть внимательно "+area)
        println(list.joinToString(" "))







        list.reverse()
        val exitList: Array<Int> = Array(list.size) {0}
        for(i in list.indices){
            exitList[i] = list[i]
        }


        return exitList

    }






}
