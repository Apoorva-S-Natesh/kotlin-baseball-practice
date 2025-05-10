package baseball

import camp.nextstep.edu.missionutils.Randoms

fun main() {
    val controller = Controller()
    controller.baseballNumbers()
}

class GameModel {
    private var computerNumber : List<Int> = generateComputerNumber()

    private fun generateComputerNumber() : List<Int> {
        val numbers = mutableSetOf<Int>()
        while(numbers.size < 3) {
            numbers.add(Randoms.pickNumberInRange(1, 9))
        }
        return numbers.toList()
    }
}

class Controller {
    private val model = GameModel()

    fun baseballNumbers() {
        println(model.computerNumber)
    }
}
