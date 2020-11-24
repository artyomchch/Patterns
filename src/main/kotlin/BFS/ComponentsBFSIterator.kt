package BFS

class ComponentsBFSIterator : IteratorBFS {
    var queueSec = mutableListOf<Int>()

    override fun hasNext(): Boolean {
        return queueSec.isNotEmpty()
    }

}