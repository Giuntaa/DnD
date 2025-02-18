abstract class Character(name: String, attackPower: Double) {
    val name = name
    var health : Double = 100.0
    var attackPower = attackPower

    fun takeDamage(damage: Double) {
        health -= damage
    }

    abstract fun attack(character: Character)

    fun isAlive(): Boolean {
        return health > 0
    }
}