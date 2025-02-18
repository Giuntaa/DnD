class Enemy(name: String, attackPower: Double) : Character(name, attackPower) {
    var flag: Boolean = false

    fun attack(hero: Hero){
        if(hero.defend())
    }