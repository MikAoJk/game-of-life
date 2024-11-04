package io.github.mikaojk

fun main() {
    val m = 10
    val n = 10

    val grid: Array<IntArray> = arrayOf(
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 1, 1, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 1, 1, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    )

    println("Original Generation")
    for (i in 0 until m) {
        for (j in 0 until n) {
            if (grid[i][j] == 0) print(".")
            else print("*")
        }
        println()
    }
    println()
    nextGeneration(grid, m, n)
}

fun nextGeneration(grid: Array<IntArray>, M: Int, n: Int) {
    val future: Array<IntArray> = Array(M) { IntArray(n) }

    for (l in 0 until M) {
        for (m in 0 until n) {
            var aliveNeighbours = 0
            for (i in -1..1) for (j in -1..1) if ((l + i in 0..<m) && (m + j in 0..<n)) aliveNeighbours += grid[l + i][m + j]


            aliveNeighbours -= grid[l][m]


            if ((grid[l][m] == 1) && (aliveNeighbours < 2)) future[l][m] = 0
            else if ((grid[l][m] == 1) && (aliveNeighbours > 3)) future[l][m] = 0
            else if ((grid[l][m] == 0) && (aliveNeighbours == 3)) future[l][m] = 1
            else future[l][m] = grid[l][m]
        }
    }

    println("Next Generation")
    for (i in 0 until M) {
        for (j in 0 until n) {
            if (future[i][j] == 0) print(".")
            else print("*")
        }
        println()
    }
}
