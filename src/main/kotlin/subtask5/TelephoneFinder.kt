package subtask5

import kotlin.reflect.KClass

class TelephoneFinder {


    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {


        if (number[0] =='-') {return null}



        var globalList = ArrayList<String>()




        for(i in number.indices) {


            if (number[i] == '0') {


                globalList.add(number.replaceRange(i,i+1,"8"))

            }


            if (number[i] == '1') {

                globalList.add(number.replaceRange(i,i+1,"2") )
                globalList.add(number.replaceRange(i,i+1,"4") )


            }


            if (number[i] == '2') {

                globalList.add(number.replaceRange(i,i+1,"1") )
                globalList.add(number.replaceRange(i,i+1,"3") )
                globalList.add(number.replaceRange(i,i+1,"5") )


            }


            if (number[i] == '3') {

                globalList.add(number.replaceRange(i,i+1,"2") )
                globalList.add(number.replaceRange(i,i+1,"6") )


            }


            if (number[i] == '4') {

                globalList.add(number.replaceRange(i,i+1,"1") )
                globalList.add(number.replaceRange(i,i+1,"5") )
                globalList.add(number.replaceRange(i,i+1,"7") )

            }

            if (number[i] == '5') {

                globalList.add(number.replaceRange(i,i+1,"2") )
                globalList.add(number.replaceRange(i,i+1,"4") )
                globalList.add(number.replaceRange(i,i+1,"6") )
                globalList.add(number.replaceRange(i,i+1,"8") )

            }


            if (number[i] == '6') {

                globalList.add(number.replaceRange(i,i+1,"3") )
                globalList.add(number.replaceRange(i,i+1,"5") )
                globalList.add(number.replaceRange(i,i+1,"9") )

            }


            if (number[i] == '7') {

                globalList.add(number.replaceRange(i,i+1,"4") )
                globalList.add(number.replaceRange(i,i+1,"8") )


            }


            if (number[i] == '8') {

                globalList.add(number.replaceRange(i,i+1,"0") )
                globalList.add(number.replaceRange(i,i+1,"5") )
                globalList.add(number.replaceRange(i,i+1,"7") )
                globalList.add(number.replaceRange(i,i+1,"9") )

            }


            if (number[i] == '9') {

                globalList.add(number.replaceRange(i,i+1,"6") )
                globalList.add(number.replaceRange(i,i+1,"8") )


            }



        }




        val result = Array<String>(globalList.size){""}

        for (i in globalList.indices) {
            result[i] = globalList[i]
        }


        return result


    }









}
