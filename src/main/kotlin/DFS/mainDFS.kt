package DFS

import java.io.BufferedReader
import java.io.InputStreamReader

/**
Graph
9 7
0 1
1 2
1 3
2 3
3 4
6 7
6 8
**/

/**
Graph
9 8
0 1
0 4
0 8
1 2
2 3
4 5
4 7
5 6
8 9

 **/


var vert: MutableList<Color> = mutableListOf()
var adj: MutableList<MutableList<Pair<Int, Int>>> = mutableListOf()
val sc = BufferedReader(InputStreamReader(System.`in`))
var componentsListIterator = ComponentsListIterator()
fun main(args: Array<String>) {
    components()
}



//fun dfs(u: Int) {
//    vert[u] = Color.BLACK
//    print(" $u")
//    (0..adj[u].size-1).forEach {
//        val tv = adj[u][it]
//        if(vert[tv.first] == Color.WHITE)
//            dfs(tv.first)
//    }
//}

fun dfsIterator(u: Int) {
    componentsListIterator.index = 0
    vert[u] = Color.BLACK
    print(" $u")
    while (componentsListIterator.hasNext(u)){
        val tv = adj[u][componentsListIterator.next()]
        if(vert[tv.first] == Color.WHITE)
            dfsIterator(tv.first)
    }

}