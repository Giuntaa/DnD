import kotlin.random.Random

class Hero(name: String, attackPower: Double) : Character(name, attackPower) {

    fun attack(enemy: Enemy){
        enemy.takeDamage(this.attackPower)
    }

    fun defend(): Boolean {
        return Random.nextBoolean()
    }



}