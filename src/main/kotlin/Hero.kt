import kotlin.random.Random

class Hero(name: String, attackPower: Double, health: Double) : Character(name, attackPower, health) {
    var test: Boolean = false
    var success: Boolean = false

    override fun takeDamage(attacker: Character) {
        if (test){
            if (success) {
                println("Ti sei difeso con successo e hai contrattaccato")
                attacker.takeDamage(Hero(name, attackPower/2, health))
            }
            else{
                this.health -= ((attacker.attackPower)/2)
                println("Ti sei difeso ma senza molto successo, ti restano ${this.health} hp")
            }
            test = false
            success = false
        }
        else{
            this.health -= attacker.attackPower
            println("Sei stato ferito, ti restano ${this.health} hp\n")
        }
    }

    fun defend(): Boolean {
        test = true
        success = Random.nextBoolean()
        return success
    }
}