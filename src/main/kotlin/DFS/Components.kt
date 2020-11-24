package DFS

class Components {

}


fun components(){
    var componentsListIterator = componentsListIterator
    var tmp = sc.readLine()
    var (v, e) = tmp.split(" ").map { it.toInt() }
    (0..v-1).forEach { vert.add(Color.WHITE) }
    (0..v-1).forEach { adj.add(mutableListOf()) }

    (0..v-1).forEach { vert[it] = Color.WHITE }
    (0..e-1).forEach {
        tmp = sc.readLine()
        val (tv, tw) = tmp.split(" ").map { it.toInt() }
        adj[tv].add(Pair(tw, 1))
        adj[tw].add(Pair(tv, 1))
    }

    var numComponents = 0

    (0..v-1).forEach {
        if (vert[it] == Color.WHITE) {
            print("Компонент ${++numComponents}:")
            componentsListIterator.adjSec = adj
            dfsIterator(it)
            println()
        }
    }
    println("Существуют $numComponents связанных компонентов")


}