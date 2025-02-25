abstract class Character(val name: String, var attackPower: Double, var health: Double) {

    abstract fun takeDamage(attacker: Character)

    fun attack(attacked: Character) {
        attacked.takeDamage(this)
    }

    fun isAlive(): Boolean {
        return health > 0
    }
}