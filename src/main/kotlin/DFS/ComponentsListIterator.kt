package DFS

class ComponentsListIterator(): IteratorDFS {
    var index = 0
    var adjSec: MutableList<MutableList<Pair<Int, Int>>> = mutableListOf()

    override fun hasNext(u: Int): Boolean {
        return index <  adjSec[u].size
    }

    override fun next(): Int {
        return index++

    }


}