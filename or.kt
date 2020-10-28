fun main() {
            val startMessage ="Starten des Kotlin."
            val printer =startMessage.toUpperCase()
            println("${printer}\n")


            var count:Int = 0
            println("count が宣言されました。\n 現在は ${count} です。\n")

            fun resetCount() { count = 0
                               println("カウントがリセットされました。\n 現在は ${count} です。\n") }

            fun infoCount() { println("count に ${count} が入力されました。\n 現在の count は ${count} です。\n") }
            fun setCount(num:Int) { count =num
                                    infoCount() }


            setCount(39)
                 if (count == 42) { println("人生、宇宙、すべての答えは42です。") }
            else if (count > 35)  { println("入力された数値は42ではないですが、35よりは大きいです。") }
            else                  { println("入力された数値は35よりも小さいです。ちなみに数値は ${count} です。")}


            setCount(42)
            val answerString:String =if (count == 42) { println("人生、宇宙、すべての答えは42です。") }
                                else if (count > 35)  { println("入力された数値は42ではないですが、35よりは大きいです。") }
                                else                  { println("入力された数値は35よりも小さいです。ちなみに数値は ${count} です。")}



}
