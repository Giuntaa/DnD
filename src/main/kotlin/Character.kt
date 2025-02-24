abstract class Character(val name: String, val attackPower: Double) {
    var health : Double = 100.0


    abstract fun takeDamage(attacker: Character)

    fun attack(attacked: Character) {
        attacked.takeDamage(this)
    }

    fun isAlive(): Boolean {
        return health > 0
    }
}