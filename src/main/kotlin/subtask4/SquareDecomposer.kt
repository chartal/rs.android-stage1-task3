package subtask4

class SquareDecomposer {


    fun decomposeNumber(number: Int): Array<Int>? {


        if(number<5) {return null}


        // глобальный лист
        val list = ArrayList<Int>()


        //Теорема Ферма: первый элемент добавляем
        // в список сразу (на единицу меньше исходного - закономерность)
        //отсюда startIndex:

        val startIndex = number-1






        //согласно теореме Ферма остаток площади:
        var area = 2*number-1








        fun fornitInside(startIndex : Int, area: Int) : Boolean{


            for(i in startIndex-1 downTo 1){

                val i1 = i.toLong()


                if(area.toLong() == i1*i1){
                    list.add(i)
                    return true
                }


                if(i1*i1 < area.toLong()){


                    val flag = fornitInside(i, area - i * i)


                    if(flag) {
                        list.add(i)
                        return true
                    }

                }

            }
            return false

        }







        //вызов рекурсивного участка
        fornitInside(startIndex, area)




        //По теореме Ферма число меньшее на единицу - добавляем сразу
        list.add((number-1))



        //list.reverse()
        val exitList: Array<Int> = Array(list.size) {0}
        for(i in list.indices){
            exitList[i] = list[i]
        }


        return exitList



    }

















}
