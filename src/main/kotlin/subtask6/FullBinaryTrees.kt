package subtask6

class FullBinaryTrees {



    fun stringForNodeCount (count: Int): String {

        var test = count



        class TreeNode(var x: Int) {

            var left: TreeNode? = null
            var right: TreeNode? = null



            override fun toString():String {


                if ((left==null)&&(right==null)){return "$x"}

               return "$x,$left,$right"

            }
        }


        //Полное двоичное дерево - это двоичное дерево, в котором
        // каждый узел имеет ровно 0 или 2 дочерних элемента.
        //значит наш count должен быть однозначно нечетным!

        if(count%2==0 || count==0){return "[]"}





        fun stringForNodeCountInside( count1: Int): ArrayList<TreeNode> {


            var n = count1


            val list = ArrayList<TreeNode>()
            if (n == 1) {
                list.add(TreeNode(0))
                return list

            }

            n -= 1

            for (i in 1 until n step 2) {

                var leftSubTree = stringForNodeCountInside(i)
                var rightSubTree = stringForNodeCountInside(n - i)

                for (left in leftSubTree) {

                    for (right in rightSubTree) {
                        var node = TreeNode(0)
                        node.left = left
                        node.right = right
                        println("Обратим пристальное внимание: $node")

                        list.add(node)

                    }
                }
            }




            return list

        }



        val list = stringForNodeCountInside(test)
        val exitList= ArrayList<String>()
        for(i in list.indices) {
            exitList.add("[${list[i]}]")
        }



        println("Вот здесь надо посмотреть внимательно: "+exitList.joinToString("\n"))





        return "[" +exitList.joinToString("\n")+"]"

    }






}
