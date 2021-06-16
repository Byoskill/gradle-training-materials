
tasks.register("Compile") {
    description="Compile task"
    group="Custom"
    doLast {
        println("Compile")
    }
}

tasks.register("Tests")  {
    description="Custom task"
    group="Custom"
    doLast {
        println("Tests")
    }
}

tasks.register("Packaging")  {
    description="Packaging task"
    group="Custom"
    doLast {
        println("Packaging")
    }
}

tasks.register("Publication")  {
    description="Publication task"
    group="Custom"
    doLast {
        println("Publication")
    }
}

tasks.register("Deploiement")  {
    description="Deploiement task"
    group="Custom"
    doLast {
        println("Déploiement")
    }
}
